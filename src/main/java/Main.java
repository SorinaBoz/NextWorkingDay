import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.zip.ZipEntry;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("To find the next working day, enter a date using the following format: dd.MM.yyyy");
            String inputDate = scanner.next();

            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
            Date date = new Date();
            try {

                date = simpleDateFormat.parse(inputDate);
                System.out.println(simpleDateFormat.format(date));

            } catch (ParseException e) {
                e.printStackTrace();
            }


            DateUtils dateUtils = new DateUtils();
            Date nextWorkingDay = dateUtils.findNextWorkingDay(date);
            String strDate = simpleDateFormat.format(nextWorkingDay);
            System.out.println("Next working day is " + strDate);

        }
    }
}
