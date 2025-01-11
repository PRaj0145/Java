package com.javafeatures;

public class Main {
    public static void main(String[] args) {
      Employee employee = () -> "Software Development Engineer";
        System.out.println(employee.GetName());
    }
}
