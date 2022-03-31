package com.codegym;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {
   @Test
   @DisplayName("1/1/2021")
    void test1_1_2021(){
       int day = 1;
       int month = 1;
       int year = 2021;
       String result = NextDayCalculator.NextDay(day,month,year);
       String expected = "2/1/2021";
       assertEquals(expected,result);
   }

   @Test
   @DisplayName("31/1/2021")
   void test31_1_2018(){
      int day = 31;
      int month = 1;
      int year = 2021;
      String result = NextDayCalculator.NextDay(day,month,year);
      String expected = "1/2/2021";
      assertEquals(expected,result);
   }

   @Test
   @DisplayName("30/4/2021")
   void test30_4_2021(){
      int day = 30;
      int month = 4;
      int year = 2021;
      String result = NextDayCalculator.NextDay(day,month,year);
      String expected = "1/5/2021";
      assertEquals(expected,result);
   }

   @Test
   @DisplayName("28/2/2018")
   void test28_2_2018(){
      int day = 28;
      int month = 2;
      int year = 2018;
      String result = NextDayCalculator.NextDay(day,month,year);
      String expected = "1/3/2018";
      assertEquals(expected,result);
   }

   @Test
   @DisplayName("29/2/2020")
   void test29_2_2020(){
      int day = 29;
      int month = 2;
      int year = 2020;
      String result = NextDayCalculator.NextDay(day,month,year);
      String expected = "1/3/2020";
      assertEquals(expected,result);
   }

   @Test
   @DisplayName("31/12/2018")
   void test31_12_2018(){
      int day = 31;
      int month = 12;
      int year = 2018;
      String result = NextDayCalculator.NextDay(day,month,year);
      String expected = "1/1/2019";
      assertEquals(expected,result);
   }


}