/**
 * @Author Anindya Bandopadhyay
 *
 * Java8Examples\com.jdk8.time.TemporalAdjusterExample.java
 *
 * @Created on Feb 13, 2016  11:37:30 AM
 */

package com.jdk8.time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjusterExample {

  public static void main(String[] args) {
    NextSunday customAdjuster = new NextSunday();

    System.out.println(customAdjuster.adjustInto(LocalDate.of(2016,Month.FEBRUARY,23)));
  }

}

class NextSunday implements TemporalAdjuster {

  public Temporal adjustInto(Temporal temporal) {
    LocalDate date = LocalDate.from(temporal);
    LocalDate nextSunday = date.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
    return nextSunday;
  }

}
