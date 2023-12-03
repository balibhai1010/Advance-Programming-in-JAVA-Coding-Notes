package org.example._45_46_47_48_File_Handling;
import java.io.FileReader;
import java.io.*;
//src/main/java/org/example/rough/
public class _47_Java_FileReader_read_a_file {




        public static void main(String[] args) {

            // FileReader = read the contents of a file as a stream of characters.
            //              read() returns an int value which contains the byte value
            //              when read() returns -1, there is no more data to be read

            try {
                FileReader reader = new FileReader("src/main/java/org/example/rough/art.txt");
                int data = reader.read();
                while(data != -1) {
                    System.out.print((char)data);
                    data = reader.read();
                }
                reader.close();

            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }



