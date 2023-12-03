package org.example._45_46_47_48_File_Handling;
import java.io.File;
//src/main/java/org/example/rough/

public class _45_Java_File_class {
    public static void main(String[] args) {

        // file = An abstract representation of file and directory pathnames

        File file = new File("src/main/java/org/example/rough/roughsecret_message.txt");

        if(file.exists()) {
            System.out.println("That file exists! :O!");
            System.out.println(file.getPath()); //GET PATH
            System.out.println(file.getAbsolutePath()); //GET ABSOLUTE PATH
            System.out.println(file.isFile()); //VERIFY FILE
            file.delete(); //DELETE FILE
            //TO STUDY OTHERS ,WRITE ONLY FUNC. NAME AND IDE WILL SHOW MENU ....
            //eg: file.
        }
        else {
            System.out.println("That file doesn't exist :(");
        }
    }
}
