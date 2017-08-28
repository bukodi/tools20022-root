package com.tools20022.repository.dict.codeset;


import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import com.tools20022.repository.dict.codeset.RTDataSetTypeCode;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Specifies the type of data set that is matched.
 */
public class RTDataSetTypeCode extends MMCodeSet {

	private final static AtomicReference<RTDataSetTypeCode> repoTypeRef = new AtomicReference<>();
	/**
	 * Data set is a baseline.
	 */
	public final MMCode codeBaseline = new MMCode() {
		{
			super.owner_lazy = () -> RTDataSetTypeCode.repoType();
			super.codeName = "BASE";
			super.name = "Baseline";
			super.definition = "Data set is a baseline.";
		}
	};
	/**
	 * Data set is a transport data set.
	 */
	public final MMCode codeTransportDataSet = new MMCode() {
		{
			super.owner_lazy = () -> RTDataSetTypeCode.repoType();
			super.codeName = "TRDS";
			super.name = "TransportDataSet";
			super.definition = "Data set is a transport data set.";
		}
	};
	/**
	 * Data set is a commercial data set.
	 */
	public final MMCode codeCommercialDataSet = new MMCode() {
		{
			super.owner_lazy = () -> RTDataSetTypeCode.repoType();
			super.codeName = "CODS";
			super.name = "CommercialDataSet";
			super.definition = "Data set is a commercial data set.";
		}
	};
	/**
	 * Data set is an insurance data set.
	 */
	public final MMCode codeInsuranceDataSet = new MMCode() {
		{
			super.owner_lazy = () -> RTDataSetTypeCode.repoType();
			super.codeName = "INDS";
			super.name = "InsuranceDataSet";
			super.definition = "Data set is an insurance data set.";
		}
	};
	/**
	 * Data set is a certificate data set.
	 */
	public final MMCode codeCertificateDataSet = new MMCode() {
		{
			super.owner_lazy = () -> RTDataSetTypeCode.repoType();
			super.codeName = "CEDS";
			super.name = "CertificateDataSet";
			super.definition = "Data set is a certificate data set.";
		}
	};
	/**
	 * Data set is an other special certificate data set.
	 */
	public final MMCode codeOtherCertificateDataSet = new MMCode() {
		{
			super.owner_lazy = () -> RTDataSetTypeCode.repoType();
			super.codeName = "OCDS";
			super.name = "OtherCertificateDataSet";
			super.definition = "Data set is an other special certificate data set.";
		}
	};

	public static RTDataSetTypeCode repoType() {
		repoTypeRef.compareAndSet(null, new RTDataSetTypeCode());
		return repoTypeRef.get();
	}

	private RTDataSetTypeCode() {
		super.code = Arrays.asList(codeBaseline, codeTransportDataSet,
				codeCommercialDataSet, codeInsuranceDataSet,
				codeCertificateDataSet, codeOtherCertificateDataSet);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "DataSetTypeCode";
		super.definition = "Specifies the type of data set that is matched.";
		super.example = Arrays.asList("BASE");
	} }