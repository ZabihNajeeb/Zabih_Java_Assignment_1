public class Chap2_ex229 {
    public static void main(String[] args) {
        firstMethod();
        secondMethod();
    }

    public static void firstMethod() {
        System.out.printf("%c = %d%n", 'A', ((int) 'A'));
        System.out.printf("%c = %d%n", 'B', ((int) 'B'));
        System.out.printf("%c = %d%n", 'C', ((int) 'C'));
        System.out.println();
        System.out.printf("%c = %d%n", 'a', ((int) 'a'));
        System.out.printf("%c = %d%n", 'b', ((int) 'b'));
        System.out.printf("%c = %d%n", 'c', ((int) 'c'));
        System.out.println();
        System.out.printf("%c = %d%n", '0', ((int) '0'));
        System.out.printf("%c = %d%n", '1', ((int) '1'));
        System.out.printf("%c = %d%n", '2', ((int) '2'));
        System.out.println();
    }

    public static void secondMethod() {
        char capitalChar = 'A';
        char smallChar = 'a';
        char numbers = '0';
        int asciiValue;

        for (int i = 0; i < 3; i++) {
            asciiValue = (int) capitalChar;
            System.out.printf("%c = %d, ", capitalChar, asciiValue);
            capitalChar++;
        }
        System.out.println();

        for (int i = 0; i < 3; i++) {
            asciiValue = (int) smallChar;
            System.out.printf("%c = %d, ", smallChar, asciiValue);
            smallChar++;
        }
        System.out.println();

        for (int i = 0; i < 3; i++) {
            asciiValue = (int) numbers;
            System.out.printf("%c = %d, ", numbers, asciiValue);
            numbers++;
        }
        
    }
    
}
