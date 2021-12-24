package stream.inputStream;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemTest {

    public static void main(String[] args) {
        System.out.println("입력");
        try {
            int i;
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            while ( (i = inputStreamReader.read()) != '끝')  {
                System.out.print((char)i);
            };
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
