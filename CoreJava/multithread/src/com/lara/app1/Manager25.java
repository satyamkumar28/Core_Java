
package com.lara.app1;

public class Manager25{

    public static void main(String args[]){

        Thread t1=new Thread(new Runnable(){

            public void run(){

                for(int i=0;i<1000;i++){

                    System.out.println(i);
                }
            }
        });
        t1.start();

        for(int i=1000;i<2000;i++){

            System.out.println(i);
        }

    }
}