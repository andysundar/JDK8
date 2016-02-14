/**
 * @Author Anindya Bandopadhyay
 *
 * Java8DateTime\com.jdk8.time.DateExample.java
 *
 * @Created on Nov 25, 2015  2:53:46 PM
 */

package com.jdk8.time;

import static java.time.temporal.TemporalAdjusters.next;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;


public class LocalDateExample {

  public static final void main(String p[]) {
    LocalDate today = LocalDate.now();
    
    System.out.println("Today's Date : "+ today);
    System.out.println("Previous Date : "+ today.minusDays(1));
    System.out.println("Next Date : "+ today.plusDays(1));
    System.out.printf("%s days in %s \n",today.lengthOfYear(),today.getYear());
    System.out.printf("%s is leap year ? %s \n",today.get(ChronoField.YEAR),today.isLeapYear());
    System.out.printf("Next Friday %s \n",today.with(next(DayOfWeek.WEDNESDAY)));
    System.out.printf("Length of month %s \n",today.lengthOfMonth());
    
    
    LocalDate myVisaIssueDate = LocalDate.of(2016, 02, 12);
    System.out.printf("Visa issue date %s and it is valid for 3 years %s \n",myVisaIssueDate,myVisaIssueDate.plus(3,ChronoUnit.YEARS));
    
    System.out.printf("Next picnic date to %s \n",LocalDate.of(2016, Month.AUGUST, 13));
    
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
    LocalDate myPassportRenewDate = LocalDate.parse("Sep 12, 2022", dateTimeFormatter);
    System.out.printf("My passport renew date  %s ",myPassportRenewDate);
  }
}
