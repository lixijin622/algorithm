package Search;

import java.util.Arrays;
import java.util.Scanner;

/**
 * binarySearch
 * Created by lord on 2015/10/31 0031.
 */
public class BinarySearch {
    public static int binarySearch(int key, int[] a){
        int low=0;
        int high=a.length-1;
        while(low <=high){ // low<high
            int mid = low + (high-low)/2;//int mid=(low+high)/2; rounding down
            //System.out.println(mid);
            if (a[mid]>key) {
                high=mid-1;//high=mid
            }else if(a[mid]<key) {
                low = mid+1;//low=mid
            }else{
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] list = new int[args.length];
        for(int i=0;i<args.length;i++){
            list[i] = Integer.parseInt(args[i]);
            System.out.print(list[i]+" ");
        }
        Arrays.sort(list);
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int key = scanner.nextInt();
            if(binarySearch(key,list)>=0){//binarySearch(key,list)>0
                System.out.print(key+" ");
            }
        }
    }
}
