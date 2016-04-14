package Fundamentals.BasicProgramModel;

/**
 * Created by x on 16-4-14.
 */
public class LnNRecurse {
    public static double lnNRecurse(int N){
        if (N==1) return 0;//Math.log(1)=0
        return Math.log(N)+lnNRecurse(N-1);
    }
    public static double lnNRecurse2(int N){
        double[] lnN=new double[N+1];
        return lnNRecurse2(N,lnN);
    }

    public static double lnNRecurse2(int N , double[] lnN){
        if (lnN[N] == 0) {
            if (N == 1) lnN[N]=0;
            else lnN[N] = Math.log(N) + lnNRecurse2(N - 1, lnN);
        }
        return lnN[N];
    }

    public static void main(String[] args){
        long starTime=System.currentTimeMillis();
        System.out.println(lnNRecurse(3000)+"  ");
        long endTime=System.currentTimeMillis();

        System.out.println(endTime-starTime);

        long starTime2=System.currentTimeMillis();
        System.out.println(lnNRecurse2(3000));
        long endTime2=System.currentTimeMillis();

        System.out.println(endTime2-starTime2);
    }
}
