

public class DateTest {
    public static void main(String[] args) {

        Chap3_ex314_DateTest date = new Chap3_ex314_DateTest(4, 12, 2024);

        System.out.print("Initial date: ");
        date.displayDate();
   
        date.setMonth(10);
        date.setDay(31);
        date.setYear(2025);

        System.out.print("Updated date: ");
        date.displayDate();
    }
}
