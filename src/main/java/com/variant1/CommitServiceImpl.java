package com.variant1;


public class CommitServiceImpl{

    public static void main(String[] args) {
        new CommitServiceImpl().process(null);
    }

    @CommitServiceAdvice
    public Object process(Object mfa){
        System.out.println("this is process");
        return null;
    }
}