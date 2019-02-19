import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtils {
    public Date findNextWorkingDay(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, 1);
        while (isDayOff(calendar)) {
            calendar.add(Calendar.DATE, 1);
        }
        return calendar.getTime();
    }

    //method that determines whether the input date is off or not

    public boolean isDayOff(Calendar calendar) {
        //weekends
        if ((Calendar.SATURDAY == calendar.get(calendar.DAY_OF_WEEK) || Calendar.SUNDAY == calendar.get(calendar.DAY_OF_WEEK))) {
            return true;
        }
        // first and second of January
        if (calendar.get(Calendar.MONTH) == Calendar.JANUARY
                && (calendar.get(Calendar.DAY_OF_MONTH) == 1 || calendar.get(Calendar.DAY_OF_MONTH) == 2)) {
            return true;
        }

        // 24th of January
        if (calendar.get(Calendar.MONTH) == Calendar.JANUARY
                && calendar.get(Calendar.DAY_OF_MONTH) == 24) {
            return true;
        }


        if (isEasterSunday(calendar)) {
            return true;
        }

        if (isEasterMonday(calendar)) {
            return true;
        }

        if (calendar.get(Calendar.MONTH) == Calendar.MAY
                && calendar.get(Calendar.DAY_OF_MONTH) == 1) {
            return true;
        }
        if (isWhitsuntideMonday(calendar)) {
            return true;
        }
        if (calendar.get(Calendar.MONTH) == Calendar.JUNE
                && calendar.get(Calendar.DAY_OF_MONTH) == 1) {
            return true;
        }
        if (calendar.get(Calendar.MONTH) == Calendar.AUGUST
                && calendar.get(Calendar.DAY_OF_MONTH) == 15) {
            return true;
        }
        if (calendar.get(Calendar.MONTH) == Calendar.NOVEMBER
                && calendar.get(Calendar.DAY_OF_MONTH) == 30) {
            return true;
        }
        if (calendar.get(Calendar.MONTH) == Calendar.DECEMBER
                && calendar.get(Calendar.DAY_OF_MONTH) == 1) {
            return true;
        }


        // check if Christmas
        if (calendar.get(Calendar.MONTH) == Calendar.DECEMBER
                && (calendar.get(Calendar.DAY_OF_MONTH) == 25) || calendar.get(Calendar.DAY_OF_MONTH) == 26) {
            return true;
        }

        return false;
    }
    //method that determines the date of a certain year for the Orthodox Easter
    public Calendar getOrthodoxEaster(int myear) {
        Calendar dof = Calendar.getInstance();

        int r1 = myear % 4;
        int r2 = myear % 7;
        int r3 = myear % 19;
        int r4 = (19 * r3 + 15) % 30;
        int r5 = (2 * r1 + 4 * r2 + 6 * r4 + 6) % 7;
        int mdays = r5 + r4 + 13;

        if (mdays > 39) {
            mdays = mdays - 39;
            dof.set(myear, 4, mdays);
        } else if (mdays > 9) {
            mdays = mdays - 9;
            dof.set(myear, 3, mdays);
        } else {
            mdays = mdays + 22;
            dof.set(myear, 2, mdays);
        }
        return dof;
    }

    public boolean isEasterSunday(Calendar calendar) {
        int year = calendar.get(Calendar.YEAR);
        Calendar orthodoxEaster = getOrthodoxEaster(year);
        if (calendar.get(calendar.DAY_OF_WEEK) == orthodoxEaster.get(orthodoxEaster.DAY_OF_WEEK)) {
            return true;
        }
        return false;
    }

    public boolean isEasterMonday(Calendar calendar) {
        int year = calendar.get(Calendar.YEAR);
        Calendar orthodoxEaster = getOrthodoxEaster(year);
        orthodoxEaster.add(Calendar.DATE, 1);
        if (calendar.get(calendar.DATE) == orthodoxEaster.get(orthodoxEaster.DATE)) {
            return true;
        }
        return false;
    }

    public boolean isWhitsuntideMonday(Calendar calendar) {
        int year = calendar.get(Calendar.YEAR);
        Calendar orthodoxEaster = getOrthodoxEaster(year);
        orthodoxEaster.add(Calendar.DATE, 50);
        if (calendar.get(calendar.DATE) == orthodoxEaster.get(orthodoxEaster.DATE)) {
            return true;
        }
        return false;
    }
}
