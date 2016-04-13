package Fundamentals.BasicProgramModel;

/**
 * Created by x on 2016/4/13.
 */
public class IsEqual {
    public static boolean isEqual(int a,int b,int c){
        if(a==b&&b==c){
            return true;
        }else {
            return  false;
        }
    }

    public static void main(String[] args){
        if(isEqual(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]))){
            System.out.print("equal");
        }else{
            System.out.print("not equal");
        }
    }
}
