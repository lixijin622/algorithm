package Fundamentals.BasicProgramModel;

/**
 * Created by x on 16-4-13.
 */
public class BoolMatrix {
    public static void main(String[] args){
        boolean[][] bMatrix={{true,false,false,true},{true,false,false}};
        System.out.print("  ");
        for(int i=0;i<bMatrix.length;i++){
            System.out.print(i+" ");
        }
        System.out.println("");
        for(int i=0;i<bMatrix[i].length;i++){
            for(int j=0;j<bMatrix.length;j++){
                System.out.print(j+" ");
                if(bMatrix[j][i]){
                System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
                System.out.println("");
            }
        }
    }
}
