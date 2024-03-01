package generic_LibraryorUtility;

import java.util.Random;
/**
 * this class is used to access the java related properties
 * @author praveen
 *
 */
public class JavaUtility {
	/**
	 * this method will help to generate Random number
	 * @return
	 */
public int getRandomNumber()
{
	Random number=new Random();
	int num=number.nextInt(10000);
	return num;
}
}
