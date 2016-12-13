
package com.lara.app1;

public class Manager22{

    public static void main(String args[]){

        Thread th=new Thread(){

            public void run(){

                for(int i=0;i<1000;i++){

                    System.out.println(i);
                }
            }
        };
        th.start();

        for(int i=1000;i<2000;i++){

            System.out.println(i);
        }
    }
}