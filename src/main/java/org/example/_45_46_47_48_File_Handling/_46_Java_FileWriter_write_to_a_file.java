package org.example._45_46_47_48_File_Handling;
import java.io.FileWriter;
import java.io.IOException;

public class _46_Java_FileWriter_write_to_a_file {

    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("src/main/java/org/example/rough/poem.txt");
            writer.write("Roses are red \nViolets are blue \nBooty booty booty booty \nRockin' everywhere!");
            writer.append("\n(A poem by Bro)");
            writer.close();
        }
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}