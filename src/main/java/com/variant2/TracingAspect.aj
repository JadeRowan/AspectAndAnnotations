package com.variant2;

public aspect TracingAspect {
        pointcut methodExecuted() : execution(* *(..)) && @annotation(com.variant2.MyTracingAnnotation);

  Object around(): methodExecuted() {
          System.out.println("Starting span by TracingAspect");
          Object result = proceed();
          System.out.println("Ending span by TracingAspect");
          return result;
          }
}