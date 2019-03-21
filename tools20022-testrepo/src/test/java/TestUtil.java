import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class TestUtil {


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
