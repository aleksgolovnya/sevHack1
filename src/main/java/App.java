import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class App {
    static ArrayList<String> rows = new ArrayList<String>();

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<InputData> data =new ArrayList<InputData>();
        rows = Reader.run();
        data = Reader.Scan(rows);
        System.out.println("---------------------");
        System.out.println(ErrorsHandling.checkUsers(data));
    }
}