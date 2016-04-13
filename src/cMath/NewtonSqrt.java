package CMath;

import java.util.Scanner;

/**
 * NewtonSqrt
 * Created by x on 2016/4/12.
 */
public class NewtonSqrt {
    public static double newtonSqrt(double x){  //newton iteration method
        if(x<0) return Double.NaN;
        double precision = 1e-15;
        double y=x;
        while (Math.abs(y-x/y)>precision){
            y=(x/y+y)/2.0;
        }
        return y;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            Double x = scanner.nextDouble();
        System.out.println(newtonSqrt(x));
        }
    }
}
