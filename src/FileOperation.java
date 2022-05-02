import java.io.*;

public class FileOperation {
    public static void main(String[] args) throws IOException {
        System.out.println("\nFile Operation Testing.\n");
        String filePath = "D:/test.txt";
        File createFile = new File(filePath);
        if (!createFile.exists()) {
            createFile.createNewFile();
            System.out.println("File created successfully.");
            if (createFile.isDirectory())
                System.out.println("folder created");
            else
                System.out.println("File created");
        }

        // Writing on file
        // BufferedWriter write = new BufferedWriter(new FileWriter(filePath));
        FileWriter fileWriter = new FileWriter(filePath);
        BufferedWriter bw = new BufferedWriter(fileWriter);
        bw.write("Hi, how are you doing");
        bw.write("\nI am OK. What about you?");
        bw.close();

        // File Reading
        FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = bufferedReader.readLine();
        while (line != null) {
            System.out.println(line);
            line = bufferedReader.readLine();
        }
        bufferedReader.close();

        // To delete the file
        File deleteFile = new File(filePath);
        if (deleteFile.exists()) {
            deleteFile.delete();
            System.out.println("File deleted successfully");
        }
    }
}
