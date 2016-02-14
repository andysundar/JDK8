/**
 * @Author Anindya Bandopadhyay
 *
 * Java8Examples\com.jdk8.time.TemporalQueryExample.java
 *
 * @Created on Feb 13, 2016  1:34:20 PM
 */

package com.jdk8.time;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalQuery;

public class TemporalQueryExample {

  public static void main(String[] args) {
    Holiday holiday = new Holiday();
    LocalDate feb13_2016 = LocalDate.of(2016,Month.FEBRUARY,13);
    System.out.println("Is holiday ? -> "+holiday.queryFrom(feb13_2016));

  }

}

class Holiday implements TemporalQuery<Boolean> {

  public Boolean queryFrom(TemporalAccessor temporal) {
    LocalDate date = LocalDate.from(temporal);
    int value = date.get(ChronoField.DAY_OF_WEEK);
    return (value == 6 || value == 7);
  }

}
