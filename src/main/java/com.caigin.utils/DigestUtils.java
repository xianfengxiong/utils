package com.caigin.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author xxf
 * @date 16/4/3
 */
public class DigestUtils {
  private DigestUtils(){}

  public static final String ALGORITHM_MD5 = "MD5";
  public static final String ALGORITHM_SHA = "SHA";
  public static final String ALGORITHM_SHA1="SHA-1";

  /**
   * md5 digest
   * @param text text you want to digest
   * @return digested text
   */
  public static String md5Hex(String text){
    return digest(text,ALGORITHM_MD5);
  }

  /**
   * sha1 digest
   * @param text text you want to digest
   * @return digested text
   */
  public static String sha1Hex(String text){
    return digest(text,ALGORITHM_SHA1);
  }

  /**
   * message digest
   * @param text the text you what to digest
   * @param algorithm algorithm of digest,such as MD5,SHA,SHA-1 ,and so on
   * @return null if the text is null.the digested text
   * @throws RuntimeException if the algorithm is not supported
   */
  private static String digest(String text,String algorithm){
    if (text==null){
      return null;
    }
    try {
      MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
      messageDigest.update(text.getBytes());
      byte[] bytes = messageDigest.digest();
      StringBuilder sb = new StringBuilder();
      for (byte aByte : bytes) {
        String tmp = Integer.toHexString(aByte & 0xff);
        if (tmp.length()<2){
          sb.append(0);
        }
        sb.append(tmp);
      }
      return sb.toString();
    }catch (NoSuchAlgorithmException e){
      throw new RuntimeException(e);
    }
  }
}
