/**
 * @Author Anindya Bandopadhyay
 *
 * Java8Examples\com.jdk8.time.DateTimeFormatterExample.java
 *
 * @Created on Feb 1, 2016  12:27:34 PM
 */

package com.jdk8.time;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DateTimeFormatterExample {

  public static void main(String[] args) {
    LocalDateTime localDateTime = LocalDateTime.now();
    Instant instant = Instant.now();
    OffsetDateTime offsetDateTime = OffsetDateTime.now();
    ZonedDateTime zonedDateTime = ZonedDateTime.now();
    
    DateTimeFormatterExample dateTimeFormatterExample = new DateTimeFormatterExample();
    
    List<DateTimeFormatterExample.ValueObject<?>> dateTimeFormatterList = new ArrayList<DateTimeFormatterExample.ValueObject<?>>(13);
    
    dateTimeFormatterList.add(dateTimeFormatterExample.new ValueObject<LocalDateTime>(localDateTime, "BASIC_ISO_DATE", 
            DateTimeFormatter.BASIC_ISO_DATE));
    dateTimeFormatterList.add(dateTimeFormatterExample.new ValueObject<LocalDateTime>(localDateTime, "ISO_DATE", 
            DateTimeFormatter.ISO_DATE));
    dateTimeFormatterList.add(dateTimeFormatterExample.new ValueObject<LocalDateTime>(localDateTime, "ISO_TIME", 
            DateTimeFormatter.ISO_TIME));
    dateTimeFormatterList.add(dateTimeFormatterExample.new ValueObject<LocalDateTime>(localDateTime, "ISO_DATE_TIME", 
            DateTimeFormatter.ISO_DATE_TIME));
    dateTimeFormatterList.add(dateTimeFormatterExample.new ValueObject<LocalDateTime>(localDateTime, "ISO_LOCAL_DATE", 
            DateTimeFormatter.ISO_LOCAL_DATE));
    dateTimeFormatterList.add(dateTimeFormatterExample.new ValueObject<LocalDateTime>(localDateTime, "ISO_LOCAL_DATE_TIME", 
            DateTimeFormatter.ISO_LOCAL_DATE_TIME));
    dateTimeFormatterList.add(dateTimeFormatterExample.new ValueObject<LocalDateTime>(localDateTime, "ISO_LOCAL_TIME", 
            DateTimeFormatter.ISO_LOCAL_TIME));
    dateTimeFormatterList.add(dateTimeFormatterExample.new ValueObject<LocalDateTime>(localDateTime, "ISO_ORDINAL_DATE", 
            DateTimeFormatter.ISO_ORDINAL_DATE));
    dateTimeFormatterList.add(dateTimeFormatterExample.new ValueObject<LocalDateTime>(localDateTime, "ISO_WEEK_DATE", 
            DateTimeFormatter.ISO_WEEK_DATE));
    

    dateTimeFormatterList.add(dateTimeFormatterExample.new ValueObject<OffsetDateTime>(offsetDateTime, "ISO_OFFSET_DATE", 
            DateTimeFormatter.ISO_OFFSET_DATE));
    dateTimeFormatterList.add(dateTimeFormatterExample.new ValueObject<OffsetDateTime>(offsetDateTime, "ISO_OFFSET_DATE_TIME", 
            DateTimeFormatter.ISO_OFFSET_DATE_TIME));
    dateTimeFormatterList.add(dateTimeFormatterExample.new ValueObject<OffsetDateTime>(offsetDateTime, "ISO_OFFSET_TIME", 
            DateTimeFormatter.ISO_OFFSET_TIME));
    
    dateTimeFormatterList.add(dateTimeFormatterExample.new ValueObject<ZonedDateTime>(zonedDateTime, "RFC_1123_DATE_TIME", 
            DateTimeFormatter.ISO_DATE_TIME));
    dateTimeFormatterList.add(dateTimeFormatterExample.new ValueObject<ZonedDateTime>(zonedDateTime, "ISO_ZONED_DATE_TIME", 
            DateTimeFormatter.ISO_LOCAL_DATE));
    
    dateTimeFormatterList.add(dateTimeFormatterExample.new ValueObject<Instant>(instant, "ISO_INSTANT", 
            DateTimeFormatter.ISO_INSTANT));
    System.out.println("------------------------------------------------------------------------------------");
    System.out.printf("%-37s | %s\n","Formatter", " Example ");
    for(ValueObject<?> vo : dateTimeFormatterList){
      System.out.println("------------------------------------------------------------------------------------");
      System.out.printf("'%-35s' | '%s'\n",vo.getFormatterName(), vo.format());
      
    }
    System.out.println("------------------------------------------------------------------------------------");
  }

  private class ValueObject<T extends TemporalAccessor> {
    private T dateTimeInstant;
    private String formatterName;
    private DateTimeFormatter dateTimeFormatter;
    
    public ValueObject(T dateTimeInstant,String formatterName,DateTimeFormatter dateTimeFormatter){
      Objects.requireNonNull(dateTimeInstant, "Date Time instant is required.");
      Objects.requireNonNull(formatterName, "Date Time formatter name is required.");
      Objects.requireNonNull(dateTimeFormatter, "Date Time formatter is required.");
      this.dateTimeFormatter = dateTimeFormatter;
      this.dateTimeInstant = dateTimeInstant;
      this.formatterName = formatterName;
    }
   
    
    public String getFormatterName() {
      return formatterName;
    }
   
    public String format() {
      if(Objects.isNull(dateTimeFormatter)) {
        return "";
      }
      return dateTimeFormatter.format(dateTimeInstant);
    }
   
  }
}
