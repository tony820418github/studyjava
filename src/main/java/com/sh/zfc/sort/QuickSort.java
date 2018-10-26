package com.sh.zfc.sort;

public class QuickSort {
    public <T extends Comparable<? super T>> void sort(T[] input){
        int inputLen = input.length;
        sort(input , 0 , inputLen);
    }

    public <T extends Comparable<? super T>> void sort(T[] input , int lo , int hi){
        if (lo>= hi-1) return;
        int index = zhengli(input  , lo , hi);
        sort(input, lo , index);
        sort(input  , index +1 , hi );
    }

    //切分算法实现1,
//    private <T extends Comparable<? super T>> int zhengli(T[] input, int lo, int hi) {
//        int personIndex = lo;
//        for (int i = lo , j=hi; i < j ; ) {
//            while (--j > i ){
//                if (input[j].compareTo(input[personIndex])<0){
//                    SortUtil.exchange(input , j , personIndex);
//                    personIndex = j;
//                    break;
//                }
//            }
//            while (j > ++i ){
//                if (input[i].compareTo(input[personIndex])>0){
//                    SortUtil.exchange(input , i , personIndex);
//                    personIndex = i;
//                    break;
//                }
//            }
//        }
//        return personIndex;
//    }

    //切分算法实现2
    private <T extends Comparable<? super T>> int zhengli(T[] input, int lo, int hi) {
        int personIndex = lo;
        T persion=input[personIndex];
        int i = lo ;
        int j = hi;
        while (true){
            while (input[++i].compareTo(persion)<0) if (i==(hi-1)) break;
            while (input[--j].compareTo(persion)>0) {}
            if(i>=j )break;
            SortUtil.exchange(input,i ,j );
        }
            SortUtil.exchange(input,lo ,j );
        return j;
    }
}
