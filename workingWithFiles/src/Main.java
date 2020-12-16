import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        createFile();
        writeFile();
        readFile();
        //getFileInfo();
    }

    public static void  createFile(){
        File file =new File("C:\\Users\\Emre\\Desktop\\test.txt");
        try {
            if (file.createNewFile()){
                System.out.println("File created.");
            }else{
                System.out.println("The file already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void  getFileInfo(){
        File file =new File("C:\\Users\\Emre\\Desktop\\test.txt");
        if(file.exists()){
            System.out.println("File name: " + file.getName());
            System.out.println("File path: " + file.getAbsolutePath());
            System.out.println("Can the file be written: " + file.canWrite());
            System.out.println("Is the file readable: " + file.canRead());
            System.out.println("File size(byte): " + file.length());
        }
    }

    public static void readFile(){
        File file =new File("C:\\Users\\Emre\\Desktop\\test.txt");
        System.out.print("Data in file:");
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()){
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void writeFile(){
        try {
            BufferedWriter writer =new BufferedWriter(new FileWriter("C:\\Users\\Emre\\Desktop\\test.txt",true));
            writer.newLine();
            writer.write("Emre");
            System.out.println("Writed to the file.");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
