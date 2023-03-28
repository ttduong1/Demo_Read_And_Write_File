import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    List<String> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {
//        readFile();
//        writeFile();
//        String sourcePath = "D:\\Java10f\\module3\\Demo_Read_And_Write_File\\src\\read.txt";
//        String destinationPath = "D:\\Java10f\\module3\\Demo_Read_And_Write_File\\src\\copy.txt";
//        copyFile(sourcePath, destinationPath);
        copyFile();
    }
    public static void writeFile() throws IOException {
        FileWriter fileWriter = new FileWriter("D:\\Java10f\\module3\\Demo_Read_And_Write_File\\src\\demo.txt",true);
        fileWriter.write("Con chó cắn con mèo");
        fileWriter.close();
    }
    public static void readFile() throws IOException {
        FileReader fileReader = new FileReader("D:\\Java10f\\module3\\Demo_Read_And_Write_File\\src\\read.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String lind = "";
        while ((lind = bufferedReader.readLine()) != null){
            System.out.println(lind);
        }
    }
//    public static void copyFile(String sourcePath, String destinationPath) throws IOException {
//        FileInputStream inputStream = new FileInputStream(sourcePath);
//        FileOutputStream outputStream = new FileOutputStream(destinationPath);
//        byte[] buffer = new byte[1024];
//        int length;
//        while ((length = inputStream.read(buffer)) > 0) {
//            outputStream.write(buffer, 0, length);
//        }
//        inputStream.close();
//        outputStream.close();
//    }
    public static void copyFile() throws IOException{
        FileReader fileReader = new FileReader("D:\\Java10f\\module3\\Demo_Read_And_Write_File\\src\\demo.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        FileWriter fileWriter = new FileWriter("D:\\Java10f\\module3\\Demo_Read_And_Write_File\\src\\copy.txt",true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String line = "";
        while ((line = bufferedReader.readLine()) != null){
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
    }
}