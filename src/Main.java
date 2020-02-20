import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.stream.Stream;

public class Main {

    public static String inputFile= "b_read_on.txt";

    public static String outputFile = "b_output.txt";

    public static Stream<String> getFileInputs() throws Exception{
        return new BufferedReader(new FileReader(inputFile)).lines();
    }

    public static void writeOutputs(String st) throws Exception{
        BufferedWriter write = new BufferedWriter(new FileWriter(outputFile));
    }


    public static void main(String[] args){

    }
}