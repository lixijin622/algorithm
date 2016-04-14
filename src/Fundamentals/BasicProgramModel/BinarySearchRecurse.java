package Fundamentals.BasicProgramModel;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by x on 16-4-14.
 */
public class BinarySearchRecurse {
    public static int binarySearchRecurse(int key,int[] a){
        return binarySearchRecurse(key,a,0,a.length-1,0);
    }

    public static int binarySearchRecurse(int key,int[] a,int low,int high,int tag){
        tag++;
        //System.out.print(" "+tag+" ");
        for(int i=tag;i>0;i--){
            System.out.print("    ");
        }
        System.out.println(low+" "+high);
        if(low>high) return -1;
        int mid=low+(high-low)/2;
        if(key<a[mid]) return binarySearchRecurse(key,a,low,mid-1,tag);
        else if(key>a[mid]) return  binarySearchRecurse(key,a,mid+1,high,tag);
        else return mid;
    }

    public static void main(String[] args){
        int[] list = new int[args.length];
        for(int i=0;i<args.length;i++){
            list[i] = Integer.parseInt(args[i]);
        }
        Arrays.sort(list);
        for(int i=0;i<args.length;i++) {
            System.out.print(list[i] + " ");
        }
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int key = scanner.nextInt();
            if(binarySearchRecurse(key,list)>=0){//binarySearch(key,list)>0
                System.out.print(key+" ");
            }
        }
    }

}
