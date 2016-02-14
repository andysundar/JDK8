/**
 * @Author Anindya Bandopadhyay
 *
 * Java8Examples\com.jdk8.time.MonthDayExample.java
 *
 * @Created on Jan 17, 2016  10:33:16 PM
 */

package com.jdk8.time;

import java.time.MonthDay;

public class MonthDayExample {

  public static void main(String[] args) {
    MonthDay monthDay = MonthDay.of(2, 22);
    System.out.println("AMEX Card billing cycle : "+ monthDay);

  }

}
