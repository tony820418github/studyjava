package com.sh.zfc.arithmetic.digui;

/*
    递归实现8皇后问题解决
 */
public class EightQuee {
    static final int QueeNum = 8;
    int count = 0;

    public void start(){
        int[][] map = new int[QueeNum][QueeNum];
        getResult(0 , map);
    }

    private void getResult(int row , int[][] map) {
        //到了最后一行
        if (row == QueeNum -1) {
            for (int i = 0; i < QueeNum; i++) {
                if (map[row][i]==0){
                    count ++;
                    map[row][i]=1;
                    System.out.println("the xxx  = " + count);
                    printMap(map);
                }
            }
            return;
        }
        int[][] map_temp  = new int[QueeNum][QueeNum];//保存迭代过程中的改变后的map状态
        copy(map_temp , map);
        //没到最后一行
        for (int i = 0; i < QueeNum; i++) {
            copy(map,map_temp);  //每次进行下一个位置的探索时，先要恢复当前map状态
            if (map[row][i] == 0) {//位置为0 , 没有竞争，可以放queue
                setQuee(row , i , map);//设置quee,并更新map状态，把quee可以打击到的位置设置为2
                getResult(row+1 , map);  //进行下一行探索
            }
        }
    }

    private void copy(int[][] map_temp, int[][] map) {
        for (int i = 0; i < map.length; i++) {
            map_temp[i] = map[i].clone();
        }
    }

    private void setQuee(int row, int i, int[][] map) {
        for (int  j= 0;  j< QueeNum; j++) {//所有被攻击到的同一行，同一列位置设置为2
            map[row][j]=2;
            map[j][i]=2;
        }
        map[row][i]=1;//皇后所在的位置设置为1
        for (int j = 1; j < QueeNum-row; j++) {//被攻击到的右下与左下位置，设置为2
            if ((row+j)<QueeNum && (i-j>=0)) {
                map[row+j][i-j]=2;
            }
            if ((row+j)<QueeNum && (i+j<QueeNum)) {
                map[row+j][i+j]=2;
            }
        }
    }
    private void printMap(int[][] map) {
        for (int i = 0; i < QueeNum; i++) {
            for (int j = 0; j < QueeNum; j++) {
                System.out.print(map[i][j]);
            }
            System.out.print('\n');
        }
    }

    public static void main(String[] args) {
        EightQuee quee = new EightQuee();
        quee.start();
    }
}
