package Fundamentals.BasicProgramModel;

/**
 * Created by x on 16-4-14.
 */
public class Mystery {
    public static int mystery(int a,int b){//结果等于a*b
        if(b==0) return 0;
        if(b%2==0) return mystery(a+a,b/2);
        return mystery(a+a,b/2)+a;
    }

    public static int mysterys(int a,int b){
        if(b==0) return 1;
        if(b%2==0) return mystery(a*a,b/2);
        return mystery(a*a,b/2)*a;
    }

    public static void main(String[] args){
        System.out.println(mystery(2,25));
        System.out.println(mystery(3,11));

        System.out.println(mysterys(2,25));
        System.out.println(mysterys(3,11));
    }
}
