/**
 * @Author Anindya Bandopadhyay
 *
 * Java8Examples\com.jdk8.time.DateTimeParsingExample.java
 *
 * @Created on Feb 15, 2016  3:12:32 PM
 */

package com.jdk8.time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateTimeParsingExample {

  public static void main(String[] args) {
    try {
      String dateStr = "Dec 20 2001 4 AD";
      LocalDate date = LocalDate.parse(dateStr, DateTimeFormatter.ofPattern("MMM dd yyyy Q G"));

      String timeStr = "11:23 PM";
      LocalTime time = LocalTime.parse(timeStr,DateTimeFormatter.ofPattern("hh:mm a"));

      System.out.println("Date parsing -> " + date + "\nTime parsing -> " + time);
    } catch (DateTimeParseException dtpe) {
      System.out.println("Fail to parse.");
    }
  }

}
