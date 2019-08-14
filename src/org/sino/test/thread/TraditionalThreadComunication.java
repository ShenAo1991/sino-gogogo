package org.sino.test.thread;

/**
 * 线程通信
 * @author 沈奥
 */
public class TraditionalThreadComunication {



    public static void main(String[] args) {
        final Business business = new Business();
        new Thread(new Runnable() {
            @Override
            public  void run() {
                for(int i=1;i<=5;i++){
                    business.main(i);
                }
            }
        }).start();
        for (int i=1;i<=5;i++){
            business.sub(i);
        }

    }

    static class Business{

        public Business() {
        }

        public synchronized void sub(int i){
            for (int j=1;j<=10;j++){
                System.out.println("子线程第"+j+"次,第"+i+"轮");
            }
        }

        public synchronized void main(int i){
            for(int j=1;j<=10;j++){
                System.out.println("主线程第"+j+"次,第"+i+"轮");
            }
        }
    }
}
