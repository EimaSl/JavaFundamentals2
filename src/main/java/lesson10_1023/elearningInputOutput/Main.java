package lesson10_1023.elearningInputOutput;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        writeFile();

        try {
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("C:\\Users\\vital\\OneDrive\\Desktop\\IOtest\\output-copy.txt"));

            BufferedReader bufferedReader = new BufferedReader(
                    new FileReader("C:\\Users\\vital\\OneDrive\\Desktop\\IOtest\\output.txt"));

                String s;

                while ((s = bufferedReader.readLine()) != null) {
                    if (!s.equals("chad")) {
                        bw.write(s + "\n");
                        System.out.println(s);
                    }
                }
                bufferedReader.close();
                bw.close();
            } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static void writeFile() {
        try {
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("C:\\Users\\vital\\OneDrive\\Desktop\\IOtest\\output.txt"));
            bw.write("Fun, Done\n");
            bw.write("chad\n");
            bw.write("becky\n");
            bw.close();
            System.out.println("done");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
