public class Chap2_ex218 {
    public static void main(String[] args) {
        displayBox();
        displayOval();
        displayArrow();
        displayDiamond();
    }

    // Method to display a box
    public static void displayBox() {
        System.out.println("Box:");
        System.out.println("*********");
        System.out.println("*       *");
        System.out.println("*       *");
        System.out.println("*       *");
        System.out.println("*********");
        System.out.println();
    }

    // Method to display an oval
    public static void displayOval() {
        System.out.println("Oval:");
        System.out.println("  ***  ");
        System.out.println(" *   * ");
        System.out.println("*     *");
        System.out.println(" *   * ");
        System.out.println("  ***  ");
        System.out.println();
    }

    // Method to display an arrow
    public static void displayArrow() {
        System.out.println("Arrow:");
        System.out.println("   *   ");
        System.out.println("  ***  ");
        System.out.println(" ***** ");
        System.out.println("   *   ");
        System.out.println("   *   ");
        System.out.println();
    }

    // Method to display a diamond
    public static void displayDiamond() {
        System.out.println("Diamond:");
        System.out.println("    *    ");
        System.out.println("   ***   ");
        System.out.println("  *****  ");
        System.out.println(" ******* ");
        System.out.println("  *****  ");
        System.out.println("   ***   ");
        System.out.println("    *    ");
        System.out.println();
    }
}