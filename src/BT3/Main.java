package BT3;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nBT3 - Date SimpleDateFormat & GregorianCalendar - Date Manipulator - To Vinh Tien - 22521474.");
        DateManipulator dm = new DateManipulator();
        dm.checkLeapYearAndFirstDay();
        dm.printCurrentDateFormats();
        dm.checkDayOfWeek();
        dm.getFirstAndLastDayOfMonth();
    }
}