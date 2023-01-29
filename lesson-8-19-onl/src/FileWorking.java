import java.io.*;


public class FileWorking {


    public void FileReader(String nameFile) {
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

    public void FileWriter(String nameFile, String line) {
        try (FileWriter writer = new FileWriter(nameFile, true)) {
            // запись всей строки
            writer.write(line);
            writer.append('\n');
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
