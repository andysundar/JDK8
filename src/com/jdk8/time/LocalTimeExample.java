/**
 * @Author Anindya Bandopadhyay
 *
 * Java8DateTime\com.jdk8.time.LocalTimeExample.java
 *
 * @Created on Dec 2, 2015  5:53:12 PM
 */

package com.jdk8.time;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;


public class LocalTimeExample {
  
  public static final void main(String p[]) {
    LocalTime timeNow = LocalTime.now();
    
    System.out.println("Time now : "+ timeNow);
    System.out.printf("%s : %s : %s \n",timeNow.getHour(),timeNow.getMinute(),timeNow.get(ChronoField.SECOND_OF_MINUTE));
    
    System.out.println("Meeting in next hour : "+ timeNow.plus(1, ChronoUnit.HOURS));
    
    LocalTime myAppointment = LocalTime.of(9,30);
    System.out.printf("My appointment is at %s and my next appointment is at %s \n",myAppointment,myAppointment.plusHours(4));
    
    LocalTime followUpAppointment = LocalTime.parse("17:57:34", DateTimeFormatter.ISO_LOCAL_TIME);
    System.out.printf("My follow up appointment is at %s \n",followUpAppointment);
    
    System.out.println("Only upto minutes : "+followUpAppointment.truncatedTo(ChronoUnit.MINUTES));
  }
}
