/**
 * @Author Anindya Bandopadhyay
 *
 * Java8Examples\com.jdk8.time.YearExample.java
 *
 * @Created on Jan 17, 2016  10:16:35 PM
 */

package com.jdk8.time;

import java.time.Year;

public class YearExample {

  public static void main(String[] args) {
    Year year = Year.now();
    
    System.out.println("Which year is this ? \n"+year);

  }

}
