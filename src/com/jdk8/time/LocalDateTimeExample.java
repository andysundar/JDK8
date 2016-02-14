/**
 * @Author Anindya Bandopadhyay
 *
 * Java8Examples\com.jdk8.time.LocalDateTimeExample.java
 *
 * @Created on Jan 13, 2016  1:35:41 PM
 */

package com.jdk8.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeExample {

  public static void main(String[] args) {
    LocalDate day = LocalDate.now();
    LocalTime timeNow = LocalTime.now();
    
    LocalDateTime mergeDateTime = LocalDateTime.of(day, timeNow);

    System.out.println("Today's date-time : "+mergeDateTime);
    
    LocalDateTime timestampNow = LocalDateTime.now();
    
    System.out.printf("\nIs %s before %s ? %s",mergeDateTime,timestampNow,mergeDateTime.isBefore(timestampNow));
    System.out.printf("\nIs %s  after %s ? %s",mergeDateTime,timestampNow,mergeDateTime.isAfter(timestampNow));
    System.out.printf("\nIs %s  equal %s ? %s",mergeDateTime,timestampNow,mergeDateTime.isEqual(timestampNow));
    
  }

}
