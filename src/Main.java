import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("start");
        WriteFile ted = new WriteFile();
//        ted.generateGenome();

        System.out.println("Hello World!");
        File bc = new File("C:\\Users\\xdobo\\IdeaProjects\\GEMS tester\\src\\Human.txt");
        String cars = ted.txtToString(bc);
System.out.println("start");

        WriteFile d1 = new WriteFile("C:\\Users\\xdobo\\IdeaProjects\\GEMS tester\\src\\posSite.txt", true);
        WriteFile d2 = new WriteFile("C:\\Users\\xdobo\\IdeaProjects\\GEMS tester\\src\\posSiteSequence.txt", true);

        WriteFile data = new WriteFile("C:\\Users\\xdobo\\IdeaProjects\\GEMS tester\\src\\posSite.txt", true);
        WriteFile data2 = new WriteFile("C:\\Users\\xdobo\\IdeaProjects\\GEMS tester\\src\\posSiteSequence.txt", true);
        //creates posSite and posSiteSQ
        Sequence[] posSites = ted.PosSequences(cars, d1, d2);
     System.out.println("end");
//        Sequence[] GEMS = ted.uniqueSites(posSites);
//    System.out.println("I need to sleep");
//System.out.println(GEMS.length);
//System.out.println(GEMS);
    }
}
