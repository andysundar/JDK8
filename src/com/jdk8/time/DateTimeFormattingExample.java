/**
 * @Author Anindya Bandopadhyay
 *
 * Java8Examples\com.jdk8.time.DateTimeFormattingExample.java
 *
 * @Created on Feb 15, 2016  2:52:13 PM
 */

package com.jdk8.time;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormattingExample {

  public static void main(String[] args) {
    try {
      LocalDate date = LocalDate.of(2001, 12, 20);
      String dateStr = date.format(DateTimeFormatter.ofPattern("MMM dd yyyy Q G"));

      LocalTime time = LocalTime.of(23, 23);
      String timeStr = time.format(DateTimeFormatter.ofPattern("hh:mm a"));

      System.out.println("Date formatting -> " + dateStr + "\nTime formatting -> " + timeStr);
    } catch (DateTimeException dfe) {
      System.out.println("Fail to format.");
    }

  }

}
