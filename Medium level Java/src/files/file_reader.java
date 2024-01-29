package files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class file_reader {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("src/files/peom");
            int data = reader.read();
            while(data!=-1){
                System.out.print((char)data);
                data = reader.read();
            }
            reader.close();
        }
        catch(FileNotFoundException e){
            System.out.println("No file found");
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
