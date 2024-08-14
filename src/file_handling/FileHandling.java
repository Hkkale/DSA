package file_handling;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) throws IOException {


        File file = new File("file1.txt");
//        File f2 = new File("C:/Users/DELL/OneDrive/Desktop/Projects/BACK_END/DSA_TUF/src/hello");
//        f2.mkdir();
//        file.createNewFile();
//        System.out.println();
//
//        FileWriter fwr =new FileWriter("data.txt",true);
//        fwr.write(sc.nextLine());
//        fwr.close();

        Scanner sc = new Scanner(file);

        while(sc.hasNext()){
            String str= sc.nextLine();
            System.out.println(str);
        }

        sc.close();







    }
}
