package templatemethod.bookreader;
import java.io.*;

public class ReadFromFile extends BookReader {
    private File bookFile = new File("prideprejudice.txt");
    private BufferedReader reader;

    @Override
    void initialize() {
        // Modify this method to open the file prideprejudice.txt (included with project)
        System.out.println("Open an input file");
        try{
            reader = new BufferedReader(new FileReader(bookFile));
        }catch (FileNotFoundException e)
        {
            System.out.println("Whoops, file not found");
        }
    }

    @Override
    void startReading() {
        // Modify this method to read lines from the file and print each line to standard output
        System.out.println("Loop writing out each record");
        try {
            String lines;
            while ((lines = reader.readLine()) !=null);
            {
                System.out.println(lines);
            }
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    @Override
    void stopReading() {
        // Modify this method to close the file
        System.out.println("Close input file");
        try
        {
            reader.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
