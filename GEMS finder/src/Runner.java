import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Runner {
    public static void main(String[] Args) {
        try {
            System.out.println("asdf");
            File file = new File("C:\\Users\\mmacw\\IdeaProjects\\GEMS finder\\src\\txt.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException exception) {

        }
    }
}
