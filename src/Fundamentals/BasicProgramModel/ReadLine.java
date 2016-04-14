package Fundamentals.BasicProgramModel;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

/**
 * Created by x on 16-4-14.
 */
public class ReadLine {
    public static void main(String[] args){
        try{
        File file = new File("/home/x/Documents/readLine.txt");
        if(file.isFile()&&file.exists()){
            InputStreamReader reader = new InputStreamReader(new FileInputStream(file),"utf-8");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String lineTxt=null;
            while((lineTxt = bufferedReader.readLine())!=null){
                String[] words = lineTxt.split(" ");
                for(int i=0;i<words.length;i++)
                    System.out.print(words[i]+" ");

                Double div=Double.parseDouble(words[1])/Double.parseDouble(words[2]);
                DecimalFormat    df   = new DecimalFormat("#0.00");
                String result=df.format(div);
                System.out.print(result);
                System.out.println();
            }
            reader.close();
        }else {
            System.out.println("找不到文件");
        }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
