package genericLibraries;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * this class contains reusable methods of java
 * @author dell
 */

public class JavaUtility {
 /**
  * this method generates random number within the limit
  * @param limit
  * @return
  */
public int generateRandomNum(int limt) {
	Random random = new Random();
	return random.nextInt(limt);
}

/**
 * this method gets system time in specifid format
 *@return
 */

public String getCurrentTime() {
	Date date = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("dd_mm_yy_hh_mm_sss");
	return sdf.format(date);
}
}
