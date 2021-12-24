package stream.reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReaderTest {

    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream("reader.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        int i;
        while ( (i = inputStreamReader.read()) != -1) {
            System.out.print((char)i);
        }

        inputStreamReader.close();
    }
}
