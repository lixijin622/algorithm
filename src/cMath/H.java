package CMath;

import java.util.Scanner;

/**
 * Created by x on 2016/4/12.
 */
public class H {
    public static Double h(int n){
        Double sum=0.0;
        for(int i=1;i<=n;i++){
            sum += 1.0/i;//sum=sum+1/i
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print(h(scanner.nextInt()));
    }
}
