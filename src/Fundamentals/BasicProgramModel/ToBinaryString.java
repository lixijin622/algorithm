package Fundamentals.BasicProgramModel;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

/**
 * Created by x on 16-4-13.
 */
public class ToBinaryString {
    public static String toBinaryString(int x){
        String s="";//String s =Integer.toBinaryString(x);
        for(int i=x;x>0;x/=2){
            s=(x%2)+s;
        }
        return s;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            System.out.print(toBinaryString(scanner.nextInt())+" ");
        }
    }
}
