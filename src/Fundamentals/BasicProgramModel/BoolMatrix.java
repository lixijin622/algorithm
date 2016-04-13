package Fundamentals.BasicProgramModel;

/**
 * Created by x on 16-4-13.
 */
public class BoolMatrix {
    public static void main(String[] args){
        boolean[][] bMatrix={{true,false,false,true},{true,false,false}};
        for(int i=0;i<bMatrix.length;i++){
            System.out.println(i);
            for(int j=0;j<bMatrix[i].length;j++){
                System.out.print(j+" ");
                if(bMatrix[i][j]){
                System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
        }
    }
}
