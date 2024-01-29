package files;

import java.io.FileWriter;

public class file_writer {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("src/files/peom");
            writer.write("Roses are red\n Sky is Blue \nChupi chupi chapa chapa");
            writer.append("\nMewwww");
            writer.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }


    }
}
