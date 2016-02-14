/**
 * @Author Anindya Bandopadhyay
 *
 * Java8Examples\com.jdk8.time.NonISODateExample.java
 *
 * @Created on Feb 13, 2016  8:44:36 AM
 */

package com.jdk8.time;

import java.time.LocalDateTime;
import java.time.chrono.HijrahDate;
import java.time.chrono.JapaneseDate;
import java.time.chrono.MinguoDate;
import java.time.chrono.ThaiBuddhistDate;

public class NonISODateExample {

  public static void main(String[] args) {
    LocalDateTime englishNewYear = LocalDateTime.of(2016, 1, 1, 1, 0);
    
    //Converting ISO date to NON-ISO date
    ThaiBuddhistDate thaiBusshistDate = ThaiBuddhistDate.from(englishNewYear);
    HijrahDate hijrahDate = HijrahDate.from(englishNewYear);
    JapaneseDate japaneseDate = JapaneseDate.from(englishNewYear);
    MinguoDate minguoDate = MinguoDate.from(englishNewYear);
    
    System.out.println(thaiBusshistDate);
    System.out.println(hijrahDate);
    System.out.println(japaneseDate);
    System.out.println(minguoDate);
    

  }

}
