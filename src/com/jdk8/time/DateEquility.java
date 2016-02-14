/**
 * @Author Anindya Bandopadhyay
 *
 * Java8DateTime\com.jdk8.time.DateEquility.java
 *
 * @Created on Nov 26, 2015  2:02:01 PM
 */

package com.jdk8.time;

import java.sql.Timestamp;
import java.util.Date;

public class DateEquility {

  public static void main(String[] args) {
    Date utilDate = new Date();
    Timestamp timeStamp  = new Timestamp(utilDate.getTime());
      
    String str = utilDate.equals(timeStamp) == timeStamp.equals(utilDate)? "Equality do not break" : "Equality break";
    System.out.println(str);
    System.out.println("utilDate.equals(timeStamp) -> "+utilDate.equals(timeStamp));
    System.out.println("timeStamp.equals(utilDate) -> "+timeStamp.equals(utilDate));
  }

}
