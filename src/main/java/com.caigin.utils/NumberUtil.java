package com.caigin.utils;

import java.math.BigDecimal;

/**
 * @author xxf
 * @date 16/4/3
 */
public class NumberUtil{
  private NumberUtil(){}

  /**
   * convert a number to string by discard
   * @param number greater than zero,recommend
   * @param digit decimal places
   * @return string format
   */
  public static String plainStringWithRoundDown(double number,int digit){
    return plainString(number,digit,BigDecimal.ROUND_DOWN);
  }

  /**
   * convert a number to string by special round mode
   * @param number number
   * @param digit decimal places
   * @param roundMode mode to be apply
   * @return the string format
   */
  private static String plainString(double number,int digit,int roundMode){
    BigDecimal bigDecimal = new BigDecimal(number);
    bigDecimal = bigDecimal.setScale(digit,roundMode);
    return bigDecimal.toPlainString();
  }

}
