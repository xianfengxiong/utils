package com.caigin.utils;

import java.math.BigDecimal;

/**
 * @author xxf
 * @since 2016-05-09
 */
public class Main {

  public static void main(String[] args) {
//    double d = 0.21-0.11;
//    System.out.println(Double.toString(d));

    BigDecimal d1= new BigDecimal("3.50");
    BigDecimal d2 = new BigDecimal("1.50");
    System.out.println(d1.subtract(d2).toPlainString());
  }
}
