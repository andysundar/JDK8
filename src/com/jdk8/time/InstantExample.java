/**
 * @Author Anindya Bandopadhyay
 *
 * Java8DateTime\com.jdk8.time.InstantExample.java
 *
 * @Created on Nov 27, 2015  2:52:22 PM
 */

package com.jdk8.time;

import java.time.Instant;

public class InstantExample {

  public static void main(String[] args) { 
    Instant timestamp = Instant.now(); // Current time
    System.out.println("Get the time in Epoch seconds  : " + timestamp.getEpochSecond());
  }
}
