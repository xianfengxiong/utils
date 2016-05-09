package com.caigin.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author xxf
 * @since 2016-04-29
 */
public class StreamTest {

  public static void main(String[] args) {

    Random r = new Random();

    long max = 10000000;

    List<Point> points = new ArrayList<>();
    for (int i = 0 ;i<max;i++){
      points.add(new Point(r.nextDouble(),r.nextDouble()));
    }

    long begin1 = System.currentTimeMillis();
    mapFor(points);
    long end1 = System.currentTimeMillis();
    System.out.println(String.format("time:%s", end1 - begin1));
    System.out.println();

    long begin2 = System.currentTimeMillis();
    mapStream(points);
    long end2 = System.currentTimeMillis();
    System.out.println(String.format("time:%s", end2 - begin2));
    System.out.println();

    long begin3 = System.currentTimeMillis();
    mapParaStream(points);
    long end3 = System.currentTimeMillis();
    System.out.println(String.format("time:%s", end3 - begin3));
    System.out.println();
  }

  public static void mapStream(List<Point> points){
    System.out.println("mapStream = " + points.stream().mapToDouble(Point::distence).sum());
  }

  public static void mapFor(List<Point> points){
    double sum = 0;
    for (Point p : points) {
      sum += p.distence();
    }
    System.out.println("mapFor = "+ sum);
  }

  public static void mapParaStream(List<Point> points){
    System.out.println("mapParaStream = " + points.parallelStream().mapToDouble(Point::distence).sum());
  }
}
