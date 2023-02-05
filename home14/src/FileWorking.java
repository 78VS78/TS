import java.io.*;
//import java.nio.*;
public class FileWorking {


    public void fileReader(String nameFile) {
        File file = new File(nameFile);
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void fileWriter(String nameFile, String line) {
        try (FileWriter writer = new FileWriter(nameFile, true)) {
            // запись всей строки
            writer.write(line);
            writer.append('\n');
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void fileInfo(String nameFile) {
        File file = new File(nameFile);
        if (file.exists()) {
            System.out.println("файл находится: ");
            System.out.println(file.getAbsolutePath());
            System.out.println("Размер файла в байт:");
            System.out.println(file.length());
           } else {
            System.out.println("файл не найден");
        }
    }
}