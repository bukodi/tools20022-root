import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;

import javax.xml.bind.JAXBContext;

import com.test.camt030.NotificationOfCaseAssignmentV04;
import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.core.metamodel.RuntimeInstanceAware;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV02;

public class TestUtil {

	public static JAXBContext createJaxbContext() throws Exception {
		Map<MetamodelType<?>, Set<GeneratedMetamodelBean>> mmBeansByType = new HashMap<>();
		collectContents(GeneratedRepository.mmObject(), mmBeansByType);

		Set<Class<?>> classes = new HashSet<>();
		for (Entry<MetamodelType<?>, Set<GeneratedMetamodelBean>> e : mmBeansByType.entrySet()) {
			if (!RuntimeInstanceAware.class.isAssignableFrom(e.getKey().getBeanClass()))
				continue;

			for (GeneratedMetamodelBean mmBean : e.getValue()) {
				RuntimeInstanceAware x = (RuntimeInstanceAware) mmBean;
				Class instanceClazz = x.getInstanceClass();
				classes.add(instanceClazz);
			}
		}
		classes.add(FIToFICustomerCreditTransferV02.Document.class);

		// mmBeansByType.get(MMMessageComponent.metaType()).forEach(mmBean->
		// classes.add( mmBean.getMetamodel().getBeanClass() ) );

		JAXBContext ctx = JAXBContext.newInstance(classes.toArray(new Class[classes.size()]));
		return ctx;
	}

	private static void collectContents(GeneratedMetamodelBean mmBean,
			Map<MetamodelType<?>, Set<GeneratedMetamodelBean>> mmBeansByType) {
		MetamodelType<? extends GeneratedMetamodelBean> mmType = mmBean.getMetamodel();
		mmBeansByType.computeIfAbsent(mmType, x -> new LinkedHashSet<>()).add(mmBean);

		for (MetamodelAttribute<?, ?> attr : mmBean.getMetamodel().getAllAttributes()) {
			if (!attr.isContainment())
				continue;
			if (attr.getReferencedType() != null) {
				Object wrappedValue = attr.get(mmBean);
				if (wrappedValue instanceof Optional<?>) {
					((Optional<?>) wrappedValue).ifPresent(v -> {
						collectContents((GeneratedMetamodelBean) v, mmBeansByType);
					});
				} else if (wrappedValue instanceof List<?>) {
					((List<?>) wrappedValue).forEach(v -> {
						collectContents((GeneratedMetamodelBean) v, mmBeansByType);
					});
				} else {
					collectContents((GeneratedMetamodelBean) wrappedValue, mmBeansByType);
				}
			}
		}
	}

	public static byte[] readFully(InputStream is) throws IOException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		byte buff[] = new byte[1024];
		for (;;) {
			int readedBytes = is.read(buff);
			if (readedBytes == -1)
				break;
			baos.write(buff, 0, readedBytes);
		}
		return baos.toByteArray();
	}
	

}
