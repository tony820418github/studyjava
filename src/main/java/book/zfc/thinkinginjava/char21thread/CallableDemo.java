package book.zfc.thinkinginjava.char21thread;

import java.util.ArrayList;
import java.util.concurrent.*;

public class CallableDemo {
    public static void main(String[] args) {
        ExecutorService server = Executors.newCachedThreadPool();
        ArrayList<Future<String>> results = new ArrayList<Future<String>>();
        for (int i = 0; i < 10; i++) {
            results.add(server.submit(new TaskWithResult(i)));
        }

        for (Future<String> f: results) {
            try {
                System.out.println(f.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }finally {
                server.shutdown();
            }
        }
    }
}
