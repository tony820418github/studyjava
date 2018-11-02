package com.sh.zfc.thread.forkjoin;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RecursiveTask;

public class CountTask extends RecursiveTask<Long> {
    public static final int THREADHOLD = 100;
    private int start;
    private int end;

    public CountTask(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected Long compute() {
        long sum = 0;
        boolean canCompute = (end - start)<=THREADHOLD;
        if (canCompute) {
            for (int i = start; i <= end; i++) {
                sum +=i;
            }
        }else {
            int middle = (start+end)/2;
            CountTask leftTask=new CountTask(start,middle);
            CountTask rightTask=new CountTask(middle+1 , end);
            leftTask.fork();
            rightTask.fork();

            long leftR=leftTask.join();
            long rightR=rightTask.join();
            sum= leftR+rightR;
        }
        return sum;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ForkJoinPool poo = new ForkJoinPool();
        CountTask task=new CountTask(1,1000000000);
        Future<Long> result = poo.submit(task);
        System.out.println(result.get());

        long sum = 0;
        for (long i = 0; i <=1000000000 ; i++) {
            sum +=i;
        }
        System.out.println(sum);

    }

}
