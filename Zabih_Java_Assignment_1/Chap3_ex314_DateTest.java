public class Chap3_ex314_DateTest {
    private int month;
    private int day;
    private int year;

    // Constructor
    public Chap3_ex314_DateTest(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    // Month getter and Setter 
    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    //Day getter and Setter
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    // Year getter and Setter
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    public void displayDate() {
        System.out.printf("%d/%d/%d%n", month, day, year);
    }
}