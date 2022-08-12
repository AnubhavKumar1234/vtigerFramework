package comcast.vtiger.genericUtilities;

import java.util.Random;

public class Java_utility 
{
	public int getRandomNum()
	{
		Random ran=new Random();
		int RanNum=ran.nextInt();
		return RanNum;
	}

}
