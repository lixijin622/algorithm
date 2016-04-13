package Fundamentals.BasicProgramModel;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

/**
 * Created by x on 2016/4/13.
 */
public class Between0_1 {
    public static boolean between0_1(double x,double y){
        if(x>0 && x<1&&y>0&&y<1){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args){

            System.out.print(between0_1(Double.parseDouble(args[0]),Double.parseDouble(args[1])));

    }
}
