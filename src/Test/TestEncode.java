package Test;

import java.io.UnsupportedEncodingException;

/**
 * Created by x on 2016/4/22.
 */
public class TestEncode {
    public static void main(String[] args){
        try {
            String s = "你好";//编码是什么??
            byte[] bytes = s.getBytes();//编码字符串转换成一个使用给定字符集的字节序列，默认转换成UTF-8编码
            for (byte b : bytes) {
                System.out.print(b + "  ");
            }
            System.out.println();

            byte[] bytes2 = s.getBytes("GBK");//将s原本的编码map为GBK
            for (byte b : bytes2) {
                System.out.print(b + "  ");
            }
            String sBytes = new String(bytes2, "GBK");//字节数组是GBK编码格式，new String按给定编码读取字节数组
            System.out.print(sBytes);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
