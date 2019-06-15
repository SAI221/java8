package com.bridgelabz.java8.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {

	public static void main(String[] args) {
		
//		LocalDate localDate = LocalDate.now();
//		LocalTime localTime = LocalTime.of(12, 20);
//		LocalDateTime localDateTime = LocalDateTime.now();
//		OffsetDateTime offsetDateTime = OffsetDateTime.now();
//		ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
//		
//		System.out.println(localDate);
//		System.out.println(localTime);
//		System.out.println(localDateTime);
//		System.out.println(offsetDateTime);
//		System.out.println(zonedDateTime);
	
		// Current Date
		LocalDate today = LocalDate.now();
		System.out.println("Current Date = " + today);
		 
		LocalDate todayNewYork = LocalDate.now(ZoneId.of("America/New_York"));
		System.out.println("Current Date in America = " + todayNewYork);
		 
		// Current Time
		LocalTime time = LocalTime.now();
		System.out.println("Current Time = " + time);
		 
		LocalTime timeNewYork = LocalTime.now(ZoneId.of("America/New_York"));
		System.out.println("Current Time in America = " + timeNewYork);
		 
		// Current Date
		LocalDateTime now = LocalDateTime.now();
		System.out.println("Current DateTime = " + now);
		 
		System.out.println(now.format(DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm:ss")));

		OffsetDateTime offsetDateTime = OffsetDateTime.now();
		System.out.println(offsetDateTime);
		ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		System.out.println("time in europe = "+zonedDateTime);
	
	}

}
