package Search;

import Copy.Std.StdOut;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 * binarySearch
 * Created by lord on 2015/10/31 0031.
 */
public class  BinarySearch {
    public static int binarySearch(int key, int[] a){
        int low=0,
            indent=0;//递归深度用的变量
        int high=a.length-1;
        while(low <=high){ // low<high

            //StdOut.printf("%s%-4d%d\n", repeat(4*indent++, ' '), low, high);//打印递归深度以及low和high。在模仿c语言？

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

    public static int binarySearch(int key, int[] a,String c){
        return 0;
    }

//    private static String repeat(int n, char c)//用来显示递归深度的函数，写法感觉好奇葩...
//    {
//        String s = "";
//        for (int i = 0; i < n; i++)
//            s += c;
//        return s;
//    }

    public static void main(String[] args){

        int[] list = new int[args.length];//输入的数字列表
//        for(int i=0;i<args.length;i++){
//            list[i] = Integer.parseInt(args[i]);
//            System.out.print(list[i]+" ");
//        }
        try {
            File file = new File("tinyW.txt");
            if(file.isFile()&&file.exists()) {
                InputStreamReader reader = new InputStreamReader(new FileInputStream(file), "utf-8");
                BufferedReader bufferedReader = new BufferedReader(reader);
                String lineTxt=null;

                while ((lineTxt=bufferedReader.readLine())!=null){
                    //把要查询的文件里的数字放进数组里
                }

                while ((lineTxt=bufferedReader.readLine())!=null){
                    int key=Integer.parseInt(lineTxt);
                    if(binarySearch(key,list)>=0){//binarySearch(key,list)>0
                        System.out.print(key+" ");
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
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
