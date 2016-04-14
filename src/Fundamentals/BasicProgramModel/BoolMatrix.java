package Fundamentals.BasicProgramModel;

/**
 *
 * Created by x on 16-4-13.
 */
public class BoolMatrix {
    public static void main(String[] args){
        int maxLen=0;
        boolean[][] bMatrix={{true,false,true,false},{true,true,true},{false,true,true,true,false}};
        //数组长宽说是固定，但是这种方法初始化的话，每一行的长度并不一样，如果每一行长度一样就可以不用获取maxLen了，直接嵌套循环


        System.out.print("  ");
        System.out.println("");


        for(int i1=0;i1<bMatrix.length;i1++){//打印布尔数组以及行号

            System.out.print(i1+" ");//打印行号

            for(int i2=0;i2<bMatrix[i1].length;i2++){

                if(bMatrix[i1].length>maxLen)//找到最长的行的长度
                    maxLen=bMatrix[i1].length;

                if(bMatrix[i1][i2]){//判断布尔值打印内容
                System.out.print("* ");//真
                }else {
                    System.out.print("f ");//假
                }

            }

            System.out.println("");
        }


        System.out.print("  ");


        for(int i2=0;i2<maxLen;i2++){//打印列号
            System.out.print(i2+" ");
        }

    }
}
