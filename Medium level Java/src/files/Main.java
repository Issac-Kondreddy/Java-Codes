package files;

import java.io.File;

public class Main {
    //file - an abstract representation of file and directory
    public static void main(String[] args) {
        File file = new File("src/files/message");
        if(file.exists()){
            System.out.println("Yes!!Exists :)");
            System.out.println(file.getPath());
            System.out.println(file.getAbsoluteFile());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            //System.out.println(file.delete());
            System.out.println(file.getName());
            System.out.println(file.length());
        }
        else{
            System.out.println("No!!It doesnt exists :(");
        }
    }
}
