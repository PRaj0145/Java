package com.javafeatures;
import java.lang.Thread;
import java.lang.Runnable;

public class Main1 {
    public static void main(String[] args) {
        Runnable runnable = () ->{
            for(int i=0; i<=10; i++){
                System.out.println("Hello" + i);
            }
        };
        Thread thread = new Thread(runnable);
       thread.run();

    }

}
