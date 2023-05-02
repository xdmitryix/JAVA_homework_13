import java.io.FileWriter;
import java.io.IOException;
import java.text.Format;
import java.util.Date;

public class Logger implements Loggable{

    @Override
    public void log(String message, int a, String symbol, int b) {
        Date date = new Date();
        try(FileWriter writer = new FileWriter("Log.txt", true))
        {
            String text = message;
            writer.write(date.toString());
            writer.append('\n');
            writer.write(message + " ");
            writer.append(Integer.toString(a));
            writer.append(symbol);
            writer.append(Integer.toString(b));
            writer.append("i");
            writer.append('\n');
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
    
}
