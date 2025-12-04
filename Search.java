import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Search {
    
    public Search(){}

    public void findLines(String pattern, String fileName){
        File fileToRead = new File(fileName);
        try {
            int lineNbr = 0;
            Scanner scan  = new Scanner(fileToRead);
            while(scan.hasNextLine()){
                lineNbr +=1;
                String processLine = scan.nextLine();
                if(processLine.contains(pattern)){
                    System.out.println(String.valueOf(lineNbr) + " " + processLine);
                }
            }
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args){
        if (args.length < 2){
            System.out.println("invalid args");
            return;
        }
        Search search = new Search();
        search.findLines(args[0],args[1]);
    }
}
