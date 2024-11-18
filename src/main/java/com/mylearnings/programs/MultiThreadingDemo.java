package com.mylearnings.programs;

public class MultiThreadingDemo implements Runnable{

    Object object;

    public MultiThreadingDemo(Object object) {
        this.object = object;
    }

    private static int count = 0;
    @Override
    public void run() {

        while(count <=20){
            if(count%2==0 && Thread.currentThread().getName().equals("even")){
               synchronized (object){
                   System.out.println(Thread.currentThread().getName()+":"+count);
                   count++;
                   try {
                       object.wait();
                   } catch (InterruptedException e) {
                       throw new RuntimeException(e);
                   }
               }
            }

            if(count%2!=0 && Thread.currentThread().getName().equals("odd")){
                synchronized (object){

                    System.out.println(Thread.currentThread().getName()+":"+count);
                    count++;
                    object.notify();
                }
            }
        }
    }

    public static void main(String[] args) {
        Object object = new Object();
        Thread thread1 = new Thread(new MultiThreadingDemo(object),"even");
        Thread thread2 = new Thread(new MultiThreadingDemo(object) , "odd");
        thread1.start();
        thread2.start();
    }
}
