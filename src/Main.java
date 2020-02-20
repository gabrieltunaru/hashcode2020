import java.io.*;

public class Main {

    public static String inputFile = "/home/tunarug/Downloads/a_example.txt";

    public static String outputFile = "b_output.txt";

    public static int noBooks, noLibraries, noDays;

    public static int booksScore;
    public static Book[] books;
    public static void writeOutputs(String st) throws Exception {
        BufferedWriter write = new BufferedWriter(new FileWriter(outputFile));
    }


    public static void main(String[] args) {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(inputFile));
            String line = reader.readLine();
            String[] numbers = line.split(" ");
            noBooks =Integer.parseInt(numbers[0]);
            noLibraries =Integer.parseInt(numbers[1]);
            noDays=Integer.parseInt(numbers[2]);
            for (int i=0;i<noBooks;i++) {
//                books[i]=new Book()
            }
            System.out.println(""+ noBooks + noLibraries +days);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}