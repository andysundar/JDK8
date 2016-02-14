/**
 * @Author Anindya Bandopadhyay
 *
 * Java8Examples\com.jdk8.time.PeriodExample.java
 *
 * @Created on Jan 17, 2016  5:40:18 PM
 */

package com.jdk8.time;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoField;

public class PeriodExample {

  public static void main(String[] args) {
    LocalDate startDateInclusive = LocalDate.of(2016, 1, 1);
    LocalDate endDateExclusive = LocalDate.now();
    Period period = Period.between(startDateInclusive, endDateExclusive);

    System.out.printf("\nHow many days passed after taken %s new year resolution ? \n%s\n",startDateInclusive.get(ChronoField.YEAR),period);
  }

}
