package com.caigin.utils;

import java.math.BigDecimal;

/**
 * @author xxf
 * @date 16/4/12
 */
public class MathUtils {
  private MathUtils(){

  }

  public static String add(String s1,String s2){
    BigDecimal bigDecimal1 = new BigDecimal(s1);
    BigDecimal bigDecimal2 = new BigDecimal(s2);
    return bigDecimal1.add(bigDecimal2).toPlainString();
  }

  public static String subtract(String s1,String s2){
    BigDecimal bigDecimal1 = new BigDecimal(s1);
    BigDecimal bigDecimal2 = new BigDecimal(s2);
    return bigDecimal1.subtract(bigDecimal2).toPlainString();
  }

  public static String multiply(String s1,String s2){
    BigDecimal bigDecimal1 = new BigDecimal(s1);
    BigDecimal bigDecimal2 = new BigDecimal(s2);
    return bigDecimal1.multiply(bigDecimal2).toPlainString();
  }

  public static int divideToIntegralValue(String s1, String s2){
    BigDecimal bigDecimal1 = new BigDecimal(s1);
    BigDecimal bigDecimal2 = new BigDecimal(s2);
    return bigDecimal1.divideToIntegralValue(bigDecimal2).intValueExact();
  }

  public static String[] divideAndRemainder(String s1,String s2){
    BigDecimal bigDecimal1 = new BigDecimal(s1);
    BigDecimal bigDecimal2 = new BigDecimal(s2);
    BigDecimal[] divideAndRemainder = bigDecimal1.divideAndRemainder(bigDecimal2);
    return new String[]{
        divideAndRemainder[0].toPlainString(),
        divideAndRemainder[1].toPlainString()
    };
  }

  public static String remainder(String s1,String s2){
    BigDecimal bigDecimal1 = new BigDecimal(s1);
    BigDecimal bigDecimal2 = new BigDecimal(s2);
    return bigDecimal1.remainder(bigDecimal2).toPlainString();
  }


  /**
   * greater than
   *
   * @param left
   * @param right
   * @return true if left > right
   */
  public static boolean gt(BigDecimal left,BigDecimal right){
    return left.compareTo(right) > 0 ;
  }

  /**
   * greater than
   *
   * @param left
   * @param right
   * @return true if left > right
   * @throws NumberFormatException if the string is not a number
   */
  public static boolean gt(String left,String right){
    return gt(new BigDecimal(left),new BigDecimal(right));
  }

  /**
   * less than
   *
   * @param left
   * @param right
   * @return true if left < right
   */
  public static boolean lt(BigDecimal left,BigDecimal right) {
    return left.compareTo(right) < 0 ;
  }

  /**
   * less than
   *
   * @param left
   * @param right
   * @return true if left < right
   * @throws NumberFormatException if the string is not a number
   */
  public static boolean lt(String left,String right) {
    return lt(new BigDecimal(left),new BigDecimal(right));
  }

  /**
   * less than or equal
   *
   * @param left
   * @param right
   * @return true if left <= right
   */
  public static boolean le(BigDecimal left,BigDecimal right) {
    return !gt(left,right);
  }

  /**
   * less than or equal
   *
   * @param left
   * @param right
   * @return true if left <= right
   * @throws NumberFormatException if the string is not a number
   */
  public static boolean le(String left,String right) {
    return le(new BigDecimal(left),new BigDecimal(right));
  }

  /**
   * greater than or equal
   *
   * @param left
   * @param right
   * @return true if left >= right
   */
  public static boolean ge(BigDecimal left,BigDecimal right) {
    return !lt(left,right);
  }

  /**
   * greater than or equal
   *
   * @param left
   * @param right
   * @return true if left >= right
   * @throws NumberFormatException if the string is not a number
   */
  public static boolean ge(String left,String right) {
    return ge(new BigDecimal(left), new BigDecimal(right));
  }

  /**
   * equal
   *
   * @param left
   * @param right
   * @return true if left equal right in math
   */
  public static boolean eq(BigDecimal left,BigDecimal right) {
    return left.compareTo(right) == 0;
  }

  /**
   * equal
   *
   * @param left
   * @param right
   * @return true if left equal right in math
   * @throws NumberFormatException if the string is not a number
   */
  public static boolean eq(String left,String right) {
    return eq(new BigDecimal(left),new BigDecimal(right));
  }

}
