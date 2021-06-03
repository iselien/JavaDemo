import java.io.FileWriter;
import java.io.IOException;

/**
 * Create by yovelas in 6/3/21
 */
public class FileWriteDemo {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("file1");
        fw.write("hello");
        fw.close();
    }
}
