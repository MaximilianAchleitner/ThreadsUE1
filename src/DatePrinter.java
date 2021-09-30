import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePrinter implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i<2000; i++)
        {
            SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
            Date date = new Date(System.currentTimeMillis());
            System.out.println(formatter.format(date));
        }
    }
}
