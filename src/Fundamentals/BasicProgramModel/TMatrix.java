package Fundamentals.BasicProgramModel;

/**
 * Created by x on 16-4-14.
 */
public class TMatrix {
    public static void printTMatrix(int m,int n){
        int[][] iniMatrix=new int[][]{{1,5,6},{10,5,45},{8,9,4},{5,0,3}};
        int maxLen=0;


        for(int i1=0;i1<iniMatrix.length;i1++){
            if(maxLen<iniMatrix[i1].length) maxLen=iniMatrix[i1].length;//行的最大长度
            //System.out.print(iniMatrix[i1].length);
        }


        int[][] tMatrix = new int[maxLen][iniMatrix.length];//创建结果矩阵


        for(int i1=0;i1<iniMatrix.length;i1++){
            for(int i2=0;i2<iniMatrix[i1].length;i2++){
                tMatrix[i2][i1]=iniMatrix[i1][i2];
            }
        }

        for(int i1=0;i1<tMatrix.length;i1++){
            for(int i2=0;i2<tMatrix[i1].length;i2++){
                System.out.print(tMatrix[i1][i2]+" ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args){
        printTMatrix(5,6);
    }
}
