package book.zfc.thinkinginjava.char21thread.voltalie;

public class ReorderExample {
    int a = 0;
    boolean flag = false;



    public static void main(String[] args) {

        for (int i = 0; i < 10000; i++) {
            ReorderExample re = new ReorderExample();


            int finalI = i;
            Thread a2 = new Thread(new Runnable() {
                @Override
                public void run() {
                   if (re.flag){
                       System.out.println( Thread.currentThread().getName() + ":"+re.a*re.a);
                   }else {
                      // System.out.println( Thread.currentThread().getName() + " false :"+ re.a*re.a);
                   }
                }
            },"id = " + i);
            a2.start();

            Thread a1 = new Thread(new Runnable() {
                @Override
                public void run() {

                    re.flag = true;
                    re.a = 1;

                }
            });
            a1.start();

        }







    }
}
