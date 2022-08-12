package comcast.vtiger.genericUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class File_Utility 
{
	public String getFileKeyValue(String Key) throws Throwable
	{
		FileInputStream fis=new FileInputStream("./data.properties");
		Properties p=new Properties();
		p.load(fis);
		String value = p.getProperty(Key);
		return value;
	}

}
