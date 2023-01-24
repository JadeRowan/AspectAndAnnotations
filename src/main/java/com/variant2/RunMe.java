package com.variant2;

public class RunMe {
  public static void main(String[] args) {
    someMethod("> Making some cool encryption!");
  }

  @MyTracingAnnotation
  public static void someMethod(String s) {
    System.out.println(s);
  }
}