package com.javafeatures;
@FunctionalInterface
public interface MyInterface {
public void SayHello();
 default void SayBye(){

 };

 public static void Display(){

 };

}

