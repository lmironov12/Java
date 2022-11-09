import java.io.File;
import java.io.PrintWriter;

public class Writer {
    public static void main(String[] args) {
        try {
            File file = new File("MyfirstJavaProject/src/com/company/Leonid.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            PrintWriter pw = new PrintWriter(file);
            pw.println("Hello world my name is Leonid");
            pw.close();
        }catch(Exception e){
                System.out.println(e);

            }
        }
    }


