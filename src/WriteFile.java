import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
public class WriteFile {
    private String  path;
    private boolean append_to_file = false;
    public WriteFile (String file_path){
        path = file_path;
    }
    public WriteFile( String file_path , boolean append_value ) {

        path = file_path;
        append_to_file = append_value;

    }
    public WriteFile(){

    }
    public void writeToFile( String textLine ) throws IOException {
        FileWriter write = new FileWriter( path , append_to_file);
        PrintWriter print_line = new PrintWriter( write );
        print_line.printf( "%s"  , textLine);
        print_line.close();
    }
    public void writeToFileN( String textLine ) throws IOException {
        FileWriter write = new FileWriter( path , append_to_file);
        PrintWriter print_line = new PrintWriter( write );
        print_line.printf( "%s" + "%N" , textLine);
        print_line.close();
    }

    // CHANGE FILE LOCATION

    public  void generateGenome(){
        int a = 0;
        try {WriteFile data = new WriteFile( "C:\\Users\\xdobo\\IdeaProjects\\GEMS tester\\src\\Human.txt" , true );
            do{
                int x = (int) (4*Math.random());
                String b ="";
                if (x == 0) b ="A";
                if (x == 1) b ="T";
                if (x == 2) b ="C";
                if (x == 3) b ="G";

                data.writeToFile( b );
                a++;
            } while( a< 1000000);

            System.out.println( "Text File Written To Human" );

        } catch (IOException exception) {
            System.out.println("We Failed part 2!");

        }
    }



//    public static void main(String[] Args) {
//        File file = new File("C:\\Users\\mmacw\\IdeaProjects\\GEMS finder\\src\\txt.txt");
//
//        try {
//            System.out.println("asdf");
//            //File file = new File("C:\\Users\\mmacw\\IdeaProjects\\GEMS finder\\src\\txt.txt");
//            Scanner sc = new Scanner(file);
//            while (sc.hasNextLine()) {
//                System.out.println(sc.nextLine());
//            }
//        } catch (FileNotFoundException exception) {
//
//        }
//    }
//    WriteFile data = new WriteFile( file , true );
//        data.writeToFile( "This is another line of text" );
//        System.out.println( "Text File Written To" );
//


}
