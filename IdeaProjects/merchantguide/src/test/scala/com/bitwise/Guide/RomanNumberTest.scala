package com.bitwise.Guide

import org.junit.{Assert, Test}

/**
  * Created by akankshag on 8/5/2016.
  */
class RomanNumberTest {
  @Test
  def RomanNumberShouldGiveTheCorrectValue(): Unit ={
    //given
    val romannumber = new RomanNumber("I")
    val valueOfRomanNumber = romannumber.getValueOfRomanNumber("I")
    //when
    //then
    Assert.assertEquals(1,romannumber.getValueOfRomanNumber("I"))

  }


  @Test(expected = classOf[InValidRomanNumberException])
 def RomanNumberExceptIVXLCDMIsNotValid(): Unit ={
   //given
   val romanNumber =  RomanNumber("U")
   //when

   //then

 }
@Test(expected = classOf[InValidRomanNumberException])
  def ICannotBeRepeatedMoreThen3(): Unit ={
    //given
  val romanNumber =  RomanNumber("")
  val romanNumber1= RomanNumber("IIII")
    //when
    //then

  }

  @Test(expected = classOf[InValidRomanNumberException])
  def XCannotBeRepeatedMoreThen3(): Unit ={
    //given
    val romanNumber =  RomanNumber("")
    val romanNumber1= RomanNumber("XXXX")
    //when
    //then

  }




}
