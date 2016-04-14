package Fundamentals.BasicProgramModel;

/**
 * Created by x on 16-4-14.
 */
public class Fibonacci {
    //private static long[] fibonaccis=new long[100];
    public static long fibonacci(int N){
        if(N==0) return 0;
        if(N==1) return 1;
        return fibonacci(N-1)+fibonacci(N-2);//因为数据在堆栈里所以效率低？
    }

    public static long fib(int N)
    {
        long[] f = new long[N+1];
        //System.out.println(f.length);
        return fib(N, f);
    }

    public static long fib(int N, long[] f)
    {
        if (f[N] == 0)
        {
            if (N == 1)
                f[N] = 1;
            else if (N > 1)
                f[N] = fib(N-1, f) + fib(N-2, f);//要理解性能提升在哪儿了...然而并没有看懂
        }

        return f[N];
    }

    public static void main(String[] args){

        for(int i=0;i<100;i++){
            //fibonaccis[i]=fibonacci(i);
            //System.out.println(i+" "+fibonaccis[i]);
            System.out.println(i+" "+fib(i));
        }

        for(int i=0;i<100;i++){
            System.out.println(i+" "+fibonacci(i));
        }
    }
}
