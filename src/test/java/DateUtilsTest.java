import org.junit.Assert;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static junit.framework.TestCase.assertTrue;

public class DateUtilsTest {
    DateUtils dateUtils = new DateUtils();
    @Test
    public void findNextWorkingDayTest(){
        //given
        Date date = new GregorianCalendar(2018, Calendar.DECEMBER, 7).getTime();
        Date actualDate = new GregorianCalendar(2018, Calendar.DECEMBER, 10).getTime();
        //when
        Date nextWorkingDay = dateUtils.findNextWorkingDay(date);
        Assert.assertEquals(actualDate, nextWorkingDay);
    }

    @Test
    public void isEasterSundayTest(){
        //given
        Date date = new GregorianCalendar(2018, Calendar.APRIL, 9).getTime();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        //when
        boolean isEasterSunday = dateUtils.isEasterSunday(calendar);
        //then
        assertTrue(isEasterSunday);
    }
    @Test
    public void isEasterMondayTest(){
        //given
        Date date = new GregorianCalendar(2018, Calendar.APRIL, 8).getTime();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        //when
        boolean isEasterMonday = dateUtils.isEasterMonday(calendar);
        //then
        assertTrue(isEasterMonday);
    }

    @Test
    public void isWhitsuntideMondayTest(){
        //given
        Date date = new GregorianCalendar(2018, Calendar.MAY, 28).getTime();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        //when
        boolean isWhitsuntideMonday = dateUtils.isWhitsuntideMonday(calendar);
        //then
        assertTrue(isWhitsuntideMonday);
    }

    @Test
    public void isSaturdayTest(){
        //given
        Date date = new GregorianCalendar(2018, Calendar.DECEMBER, 8).getTime();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        //when
        boolean isSaturday = dateUtils.isDayOff(calendar);
        //then
        assertTrue(isSaturday);
    }
    @Test
    public void isSundayTest(){
        //given
        Date date = new GregorianCalendar(2018, Calendar.DECEMBER, 9).getTime();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        //when
        boolean isSunday = dateUtils.isDayOff(calendar);
        //then
        assertTrue(isSunday);
    }
    @Test
    public void isJanuaryFirstTest(){
        //given
        Date date = new GregorianCalendar(2018, Calendar.JANUARY, 1).getTime();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        //when
        boolean isJanuaryFirst = dateUtils.isDayOff(calendar);
        //then
        assertTrue(isJanuaryFirst);
    }

    @Test
    public void isJanuarySecondTest(){
        //given
        Date date = new GregorianCalendar(2018, Calendar.JANUARY, 2).getTime();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        //when
        boolean isJanuarySecond = dateUtils.isDayOff(calendar);
        //then
        assertTrue(isJanuarySecond);
    }

    @Test
    public void isJanuaryTwentyForthTest(){
        //given
        Date date = new GregorianCalendar(2018, Calendar.JANUARY, 24).getTime();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        //when
        boolean isJanuaryTwentyForth = dateUtils.isDayOff(calendar);
        //then
        assertTrue(isJanuaryTwentyForth);
    }

    @Test
    public void isMayFirstTest(){
        //given
        Date date = new GregorianCalendar(2018, Calendar.MAY, 1).getTime();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        //when
        boolean isMayFirst = dateUtils.isDayOff(calendar);
        //then
        assertTrue(isMayFirst);
    }

    @Test
    public void isJuneFirstTest(){
        //given
        Date date = new GregorianCalendar(2018, Calendar.JUNE, 1).getTime();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        //when
        boolean isJuneFirst = dateUtils.isDayOff(calendar);
        //then
        assertTrue(isJuneFirst);
    }

    @Test
    public void isAugustFifteenthTest(){
        //given
        Date date = new GregorianCalendar(2018, Calendar.AUGUST, 15).getTime();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        //when
        boolean isAugustFifteenth = dateUtils.isDayOff(calendar);
        //then
        assertTrue(isAugustFifteenth);
    }

    @Test
    public void isNovemberThirtiethTest(){
        //given
        Date date = new GregorianCalendar(2018, Calendar.NOVEMBER, 30).getTime();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        //when
        boolean isNovemberThirtieth = dateUtils.isDayOff(calendar);
        //then
        assertTrue(isNovemberThirtieth);
    }

    @Test
    public void isDecemberFirstTest(){
        //given
        Date date = new GregorianCalendar(2018, Calendar.NOVEMBER, 30).getTime();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        //when
        boolean isNovemberThirtieth = dateUtils.isDayOff(calendar);
        //then
        assertTrue(isNovemberThirtieth);
    }

    @Test
    public void isChristmasTest(){
        //given
        Date date = new GregorianCalendar(2018, Calendar.DECEMBER, 25).getTime();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        //when
        boolean isChristmas = dateUtils.isDayOff(calendar);
        //then
        assertTrue(isChristmas);
    }
    @Test
    public void isDecemberTwentysixTest(){
        //given
        Date date = new GregorianCalendar(2018, Calendar.DECEMBER, 26).getTime();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        //when
        boolean decemberTwentysix = dateUtils.isDayOff(calendar);
        //then
        assertTrue(decemberTwentysix);
    }
}
