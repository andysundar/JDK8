/**
 * @Author Anindya Bandopadhyay
 *
 * Java8Examples\com.jdk8.time.TemporalQueriesExample.java
 *
 * @Created on Feb 13, 2016  2:55:23 PM
 */

package com.jdk8.time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.TemporalQueries;

public class TemporalQueriesExample {

  public static void main(String[] args) {
    ZoneId zoneId = ZoneId.of("Europe/Amsterdam");
    ZonedDateTime localDateTime = ZonedDateTime.of(2016, 3, 23, 12, 39, 12, 34, zoneId);
    LocalDate localDate = localDateTime.query(TemporalQueries.localDate());
    LocalTime localTime = localDateTime.query(TemporalQueries.localTime());
    ZoneOffset zoneOffset = localDateTime.query(TemporalQueries.offset());
    zoneId = localDateTime.query(TemporalQueries.zone());
    
    System.out.println("Local Date  -> "+localDate);
    System.out.println("Local Time  -> "+localTime);
    System.out.println("Zone Offset -> "+zoneOffset);
    System.out.println("Zone Id     -> "+zoneId);

  }

}
