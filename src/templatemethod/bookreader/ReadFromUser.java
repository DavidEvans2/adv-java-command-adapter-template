package templatemethod.bookreader;

import java.util.Scanner;

public class ReadFromUser  extends BookReader{
    private Scanner keyboard = new Scanner(System.in);
    private String writings;

    @Override
    void initialize(){
        System.out.println("So, you wanna become a writer huh?\n" +
                "Well, let's get started, best of luck!");
        writings = keyboard.nextLine();
    }

    @Override
    void startReading(){
        System.out.println("Wanna take a look at what you wrote? Here ya go!\n");

        System.out.println( "*"+ writings + "*");
    }
    @Override
    void stopReading(){
    }
}
