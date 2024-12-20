import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Console {

    public String readLn() {
        try{
            InputStreamReader streamReader = new InputStreamReader(System.in);
            BufferedReader buffer = new BufferedReader(streamReader);
            String line = buffer.readLine();

            return line;

        } catch (IOException e) {
            return "";
        }
    }

    public int readInt() {
        String line = readLn();
        try{
            int number = Integer.parseInt(line);
            return number;
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public void writeLn(String line) {
        System.out.println(line);
    }

    public void writeLn(long line) {
        System.out.println(line);
    }
}
