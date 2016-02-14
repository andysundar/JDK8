/**
 * @Author Anindya Bandopadhyay
 *
 * Java8Examples\com.jdk8.time.YearMonthExample.java
 *
 * @Created on Jan 17, 2016  10:25:21 PM
 */

package com.jdk8.time;

import java.time.YearMonth;

public class YearMonthExample {

  public static void main(String[] args) {
    YearMonth yearMonth = YearMonth.of(2019, 11);
    System.out.println("Credit Card expire date : " + yearMonth);

  }

}
