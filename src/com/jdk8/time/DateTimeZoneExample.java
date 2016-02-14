/**
 * @Author Anindya Bandopadhyay
 *
 * Java8Examples\com.jdk8.time.DateTimeZoneExample.java
 *
 * @Created on Jan 14, 2016  4:37:08 PM
 */

package com.jdk8.time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Set;

public class DateTimeZoneExample {

  public static void main(String[] args) {
    Set<String> zoneIds = ZoneId.getAvailableZoneIds();
    LocalDateTime dt = LocalDateTime.now();
    
    for(String zoneId : zoneIds) {
      ZoneId zone = ZoneId.of(zoneId);
      ZonedDateTime zdt = dt.atZone(zone);
      ZoneOffset offset = zdt.getOffset();
      int secondsOfHour = offset.getTotalSeconds() % (60 * 60);
      String out = String.format("%35s %10s%n", zone, offset);

      // Write only time zones that do not have a whole hour offset
      // to standard out.
      if (secondsOfHour != 0) {
          System.out.printf(out);
      }
    }

  }

}
