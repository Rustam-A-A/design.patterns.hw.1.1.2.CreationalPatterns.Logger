import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger<formatForDateNow> {
    protected int num = 1;
    private static Logger instance;
    String time;
    String msg;
    private static Logger logger;

    Date date = new Date();
    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private Logger() {
        this.time = dateFormat.format(date);
        this.num = num;
    }

    public static Logger getInstance() {
        if (instance == null) instance = new Logger();
        return instance;
    }

    public void log(String msg) {
        System.out.println( " [" + time + ", " + num++ + "] " + msg  );
    }

}
