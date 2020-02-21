import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExcpetions {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("c:\\abc.txt");
        FileReader fileReader= new FileReader(file);
        System.out.println(file);
    }
}
