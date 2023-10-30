public class NestedLoops {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++ ) {

            for (int j = 1; j <= i; j++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for (int x = 5; x >= 0; x--) {
            for (int y = 1; y <= x; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for (int x = 4; x >= 0; x--) {
            for (int y = 1; y <= 5; y++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}