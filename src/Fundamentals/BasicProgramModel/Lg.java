package Fundamentals.BasicProgramModel;

/**
 * Created by x on 16-4-14.
 */
public class Lg {
    public static int lg(int n){
        double precision = 1e-15;
        double result=0;
        while(result>precision){
            result=Math.log(n);//log2(n)=ln(2)/ln(n)   牛顿迭代法：ln(2)/ln(n)=init-(ln(2)/ln(n))/(ln(2)/(1/(x*x)))
        }
        return 0;
    }
}
