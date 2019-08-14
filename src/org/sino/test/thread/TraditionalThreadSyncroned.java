package org.sino.test.thread;

public class TraditionalThreadSyncroned {


    public static void main(String[] args) {
        new TraditionalThreadSyncroned().init("zhangxiaoxiang");
        new TraditionalThreadSyncroned().init("lihuoming");
    }

    private void init(String name){
        new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    while (true){
                        Thread.sleep(10);
                        Outputer outputer = new Outputer();
                        outputer.output(name);
                    }
                }catch (Exception e) {

                }

            }
        }).start();
    }


    class Outputer{

        public void output(String name){
            int lengh = name.length();
            for(int i=0;i<lengh;i++){
                System.out.print(name.charAt(i));
            }
            System.out.println();
        }
    }
}
