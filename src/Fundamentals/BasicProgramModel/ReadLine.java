package Fundamentals.BasicProgramModel;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;

/**
 * Created by x on 16-4-14.
 */
public class ReadLine {
    public static void readLine(String filepath){
        try{
        File file = new File(filepath);
        if(file.isFile()&&file.exists()){
            InputStreamReader reader = new InputStreamReader(new FileInputStream(file),"utf-8");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String lineTxt=null;
            while((lineTxt = bufferedReader.readLine())!=null){//读行
                String[] words = lineTxt.split(" ");//分离一行中的单词
                for(int i=0;i<words.length;i++)//打印每一个单词
                    System.out.print(words[i]+" ");

                Double div=Double.parseDouble(words[1])/Double.parseDouble(words[2]);//取两位有效数字
                DecimalFormat df = new DecimalFormat("#0.00");
                String result=df.format(div);
                /*java保留两位小数的几种方法
                *  1.
                *  BigDecimal temp = new BigDecimal(div);
                *  div=temp.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue()
                *  这种方法无法处理infinity 和 NAN，如果第二位小数为0会不显示0
                *
                *  2.
                *  DecimalFormat df = new DecimalFormat("#0.00");
                *  String result=df.format(div);
                *
                *  3.
                *   String result = String.format("%.2f",div);
                *
                *  4.
                *   NumberFormat test = NumberFormat.getNumberInstance();
                *   test.setMaximumFractionDigits(2);
                *   String s = test.format(div);
                *   第二位小数是0不会显示
                * */

                System.out.print(result);
                System.out.println();
            }
            reader.close();
            bufferedReader.close();
        }else {
            System.out.println("找不到文件");
        }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        readLine("/home/x/Documents/readLine.txt");
    }
}
