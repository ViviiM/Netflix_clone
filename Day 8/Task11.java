public class Task11 {
    public static void main(String[] args) {
        int n = 9;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j >= 4 || i == n - 1 && j <= 4 || i > 0 && i < n - 1 && i % 2 == 0 ) {
                    System.out.print("*" );
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
