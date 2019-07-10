import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Set;

public class WriteFile {
    private String path;
    private boolean append_to_file = false;

    public WriteFile(String file_path) {
        path = file_path;
    }

    public WriteFile(String file_path, boolean append_value) {

        path = file_path;
        append_to_file = append_value;

    }
    public WriteFile() {

    }
// turns the given file's text into a string
    public static String txtToString(File a) {
        String cars = "";
        try {
            System.out.println("point 1");
            Scanner sc = new Scanner(a);
            cars += sc.nextLine();

        } catch (FileNotFoundException exception) {
            System.out.println("We Failed part 1!");
        }
        return cars;
    }



    //finds all possible sites
    public static Sequence[] PosSequences(String genome, WriteFile posSites, WriteFile posSiteSequences){

        try {
            System.out.println("point 2");

            WriteFile data = posSites;
            WriteFile data2 = posSiteSequences;

            ArrayList<Integer> posSite = new ArrayList<Integer>(20000);
            ArrayList<String> posSiteSQ = new ArrayList<String>(20000);

            //char[] yeet = genome.toCharArray();
            int len = genome.length();
            String[] fed = new String[len];
            int k = 21;
            for (int z = 0; z < len; z++) {
                fed[z] = genome.substring(z,z+1);
            }
            while (k < len-1) {
                if (genome.substring(k,k+2).equals("GG")) {
                        String sq = genome.substring(k - 20, k + 2);
                        posSiteSQ.add(sq);
                        posSite.add(k);
                        data.writeToFileN(Integer.toString(k));
                        data2.writeToFileN(sq);
                    }
                k++;
                }


            Sequence[] ret = new Sequence[posSite.size()];
            for(int v = 0; v< ret.length;v++){
                Sequence temp = new Sequence(posSite.get(v), posSiteSQ.get(v));
                ret[v] = (temp);

            }
            return ret;
        } catch (IOException exception) {
            Sequence[] ret = new Sequence[0];

            System.out.println("We Failed part 3!");

        }
        Sequence[] ret = new Sequence[0];

        return ret;
    }

    //Writes the text in a file
    public void writeToFile( String textLine ) throws IOException {
        FileWriter write = new FileWriter( path , append_to_file);
        PrintWriter print_line = new PrintWriter( write );
        print_line.printf( "%s"  , textLine);
        print_line.close();
    }
    //Writes on new line
    public void writeToFileN( String textLine ) throws IOException {
        FileWriter write = new FileWriter( path , append_to_file);
        PrintWriter print_line = new PrintWriter( write );
        print_line.printf( "%s" + "%n" , textLine);
        print_line.close();
    }



    //
    public static Sequence[] uniqueSites(Sequence[] ed){
        ArrayList<Sequence> ret = new ArrayList<Sequence>();
        ArrayList<String> notRet = new ArrayList<String>();

        String[] Mil = new String[ed.length];
        for(int k = 0; k < ed.length;k++){
            Mil[k] = ed[k].getSeq();
        }

       for(int k =0; k < Mil.length;k++){
           boolean repeat = false;
           boolean skip = false;
           String temp = Mil[k];
           //checking if it has shown up already
           for(int z =0; z < notRet.size();z++){
               if ( temp.equals(notRet.get(z))){
                   repeat = true;
                   skip = true;
               break;
               }
           }
           if(skip) continue;
           //checking all of ed for a repeat of the current sequence
           for(int z =0; z < Mil.length;z++){
               if (k != z && temp.equals(Mil[z])){
                   repeat = true;
                   notRet.add(ed[k].getSeq());
                   break;
               }
           }
           if(!repeat) ret.add(ed[k]);
       }
       Sequence[] rets = new Sequence[ret.size()];
       for(int k=0;k<ret.size();k++){
           rets[k] = ret.get(k);
       }
       return  rets;
    }









    // CHANGE FILE LOCATION

    //creates fake genome
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

// old code

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
