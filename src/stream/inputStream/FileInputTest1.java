package stream.inputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputTest1 {

    public static void main(String[] args) {

        FileInputStream fileInputStream = null;

        try {
            fileInputStream = new FileInputStream("input.txt");
            int i;
            while ((i = fileInputStream.read()) != -1){
                System.out.print((char)i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        System.out.println("End");

    }
}
