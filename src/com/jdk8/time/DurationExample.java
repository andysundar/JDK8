/**
 * @Author Anindya Bandopadhyay
 *
 * Java8Examples\com.jdk8.time.DurationExample.java
 *
 * @Created on Jan 17, 2016  7:08:37 PM
 */

package com.jdk8.time;

import java.time.Duration;
import java.time.LocalTime;

public class DurationExample {

  public static void main(String[] args) {
    LocalTime startInclusive = LocalTime.now();

    synchronized (DurationExample.class) {
      try {
        Thread.sleep(100L);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }

    LocalTime endExclusive = LocalTime.now();
    Duration duration = Duration.between(startInclusive, endExclusive);

    System.out.printf("\nDuration between two time : " + duration);

  }

}
