package stream.outputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputTest2 {

    public static void main(String[] args) {

        byte[] bs = new byte[26];
        byte data = 65;
        for(int i = 0 ; i < bs.length ; i++) {
            bs[i] = data;
            data++;
        }

        try(
                FileOutputStream fileOutputStream = new FileOutputStream("output.txt", true);
                FileInputStream fileInputStream = new FileInputStream("alpha.txt")
                ) {
            fileOutputStream.write(bs);
            int ch;
            while( (ch = fileInputStream.read()) != -1) {
                System.out.println((char)ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
