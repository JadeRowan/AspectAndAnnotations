package com;

public class RunMe {
  public static void main(String[] args) {
    someMethod("> Making some cool encryption!");
  }

  @MyTracingAnnotation
  private static void someMethod(String s) {
    System.out.println(s);
  }
}