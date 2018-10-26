package com.sh.zfc.sort;

public  class  HeapSort{
    public <T extends Comparable<? super T>>  void sort(T[] input){
        buildHeap(input);
        for (int i = input.length -1; i >1 ; i--) {
            SortUtil.exchange(input , 1 , i);
            down(input , i-1  , 1);
        }
    }

    private <T extends Comparable<? super T>>  void buildHeap(T[] input) {
        int startIndex = (input.length-1)/2;
        for (int i = startIndex; i >= 1 ; i--) {
            down(input , input.length-1 , i);
        }
    }


    public <T extends Comparable<? super T>>  void up(T[] input  , int len , int startIndex){
    }

    public <T extends Comparable<? super T>>  void down(T[] input,int len , int startIndex){
        if (startIndex * 2 > len)
            return;
        int maxChildIndex = getMaxChild(input , len , startIndex);
        if (input[startIndex].compareTo(input[maxChildIndex])<0){
            SortUtil.exchange(input,startIndex,maxChildIndex);
        }
        down(input,len , maxChildIndex);
    }

    private <T extends Comparable<? super T>> int getMaxChild(T[] input, int len, int startIndex) {
        if( (startIndex*2+1)> len) {
            return startIndex*2;
        }
        if (input[startIndex*2].compareTo(input[startIndex*2+1])<0){
            return startIndex*2+1;
        }
        return startIndex*2;

    }

}
