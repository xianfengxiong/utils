package com.caigin.utils;

/**
 * @author xxf
 * @since 2016-04-29
 */
public class Point {
  private double x;
  private double y;

  public Point(double x,double y){
    this.x = x;
    this.y = y;
  }

  public double getX(){
    return x;
  }

  public void setX(double x){
    this.x = x;
  }

  public double getY(){
    return y;
  }

  public void setY(double y){
    this.y = y;
  }

  public double distence(){
    return Math.sqrt(Math.pow(this.x,2)+Math.pow(this.y,2));
  }

}
