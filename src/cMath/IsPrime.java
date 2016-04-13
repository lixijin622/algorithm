package cMath;

import java.util.Scanner;

/**
 * Created by x on 2016/4/12.
 */
public class IsPrime {
    public static boolean isPrime(int x){
        if(x<2) return false;
        for(int i = 2;i<x;i++)
            if(x%i==0){
                System.out.print(i+" ");
                return false;
            }
        return true;
    }

    public  static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int x = scanner.nextInt();
            System.out.println(isPrime(x));
        }
    }
}
