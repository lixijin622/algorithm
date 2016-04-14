package Fundamentals.BasicProgramModel;


/**
 * Created by x on 16-4-14.
 */
public class Histogram {
    public static int[] histogram(int[] a,int M) {
        int[] result = new int[M];
        System.out.println(result.length);
        //int count=0;

//        for (int i = 0; i < M; i++) {
//            for (int j = 0; j < a.length; j++) {
//                if (a[j] == i) result[i] += 1;
//            }
//        }

        for(int i=0;i<a.length;i++){
            if(a[i]<M) result[a[i]]++;
        }

        return result;
    }

    public static void main(String[] args){
        int[] a={1,2,50,0,9,1,1,2};
        int[] result=histogram(a,10);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}
