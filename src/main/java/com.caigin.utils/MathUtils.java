package com.caigin.utils;

import java.math.BigDecimal;
import java.util.Arrays;

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

  public static int divideToIntegralValue(String s1,String s2){
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

  public static int compareTo(String s1,String s2){
    BigDecimal bigDecimal1 = new BigDecimal(s1);
    BigDecimal bigDecimal2 = new BigDecimal(s2);
    return bigDecimal1.compareTo(bigDecimal2);
  }

  public static void main(String[] args) {
    System.out.println(divideToIntegralValue("1", "3"));
    System.out.println(1.0/3);

    System.out.println(subtract("0.21","0.11"));
    System.out.println(0.21-0.11);

    System.out.println(subtract(multiply("0.011","10"),"0.1"));
    System.out.println(0.011*10-0.1);

    System.out.println(Arrays.toString(divideAndRemainder("10.00", "3")));

    System.out.println(remainder("10.10","3"));

    System.out.println(divideToIntegralValue("197846.23","1000"));

    System.out.println(compareTo("1.0","1"));
  }


}
