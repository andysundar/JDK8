/**
 * @Author Anindya Bandopadhyay
 *
 * Java8Examples\com.jdk8.time.ClockExample.java
 *
 * @Created on Jan 26, 2016  6:31:55 PM
 */

package com.jdk8.time;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;

public class ClockExample {

  public static void main(String[] args) {
    Clock clock = Clock.systemDefaultZone();

    Instant timestamp1 = clock.instant();
    System.out.println("Get an Instant from clock object =>"+timestamp1);

    Instant timestamp2 = Instant.now(clock);
    System.out.println("Create an Instant from the reference of clock object  =>"+timestamp2);

    LocalDateTime localDateTime = LocalDateTime.now(clock);
    System.out.println("Create an LocalDateTime from the reference of clock object  =>"+localDateTime);

    ZonedDateTime zoneDateTime = ZonedDateTime.now(clock);
    System.out.println("Create an ZonedDateTime from the reference of clock object  =>"+zoneDateTime);
    
    OffsetDateTime offsetDateTime = OffsetDateTime.now(clock);
    System.out.println("Create an OffsetDateTime from the reference of clock object  =>"+offsetDateTime);
  }
}
