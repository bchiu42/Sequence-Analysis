import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("start");
        WriteFile ted = new WriteFile();
        ted.generateGenome();

        System.out.println("Hello World!");
        String cars = "";

        try {
            System.out.println("point 1");
            File file = new File("C:\\Users\\xdobo\\IdeaProjects\\GEMS tester\\src\\Human.txt");
            Scanner sc = new Scanner(file);
                  cars += sc.nextLine();

        } catch (FileNotFoundException exception) {
            System.out.println("We Failed part 1!");
        }
        try {
            WriteFile data = new WriteFile("C:\\Users\\xdobo\\IdeaProjects\\GEMS tester\\src\\Human.txt", true);
            WriteFile data2 = new WriteFile("C:\\Users\\xdobo\\IdeaProjects\\GEMS tester\\src\\posSiteSequence.txt", true);

            ArrayList<String> posSiteSQ = new ArrayList<String>();
            ArrayList<Integer> posSite = new ArrayList<Integer>();

            char[] yeet = cars.toCharArray();
            String[] fed = new String[yeet.length];
            int k = 20;
            for (int z = 0; z < yeet.length; z++) {
                fed[z] = Character.toString(yeet[z]);
            }
            while (k < cars.length()-1) {
                if (fed[k].equals("G")) {
                    if (fed[k + 1].equals("G")) {
                        posSiteSQ.add(cars.substring(k - 20, k + 2));
                        posSite.add(k);
                        String temp = Integer.toString(k);
                        data.writeToFileN(temp);
                        data2.writeToFileN(cars.substring(k - 20, k + 2));
                    }
                }
                k++;
            }
        System.out.println("we made it?");
        } catch (IOException exception) {
            System.out.println("We Failed part 3!");

        }

    }
}
