package YouTubeLessons;

import java.io.*;

public class WorkWithFiles {
    public static void main(String[] args) throws Exception {
        File file = new File("temp.txt");
            file.createNewFile();

        /*
        if (file.isDirectory()){
            System.out.println("directory");
        }if (file.isFile()){
            System.out.println("file");
        }
        */
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("str1\n");
        fileWriter.write("str2\n");
        fileWriter.flush();
        //fileWriter.close();

        FileReader fileReader = new FileReader(file);
//        char[] chars = new char[20];
//        fileReader.read(chars);
//        System.out.println(chars);

        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("str3");
        bufferedWriter.newLine();
        bufferedWriter.write("str4");
        bufferedWriter.flush();
        bufferedWriter.close();

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while (bufferedReader.ready()){
            System.out.println(bufferedReader.readLine());
        }
    }
}
