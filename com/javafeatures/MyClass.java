package com.javafeatures;


interface Parent {

     default  void Sumof(int a, int b){
         System.out.println("Sum is " + (a+b));
     }
}

 class Child implements Parent{
     public void SayHello(){
         System.out.println("Hello Dharwad");
     }
}

public class MyClass {
    public static void main(String[] args) {
        Child c = new Child();
        c.Sumof(8,10);
        c.SayHello();
    }
}
