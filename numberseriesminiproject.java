import java.util.Scanner;
public class AlternatingSquareNaturalSeriesGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;
        System.out.print("Series: ");
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(num + " ");
            } else {
                System.out.print((num + 1) * (num + 1) + " ");
                num++;
            }
        }
        sc.close();
    }
}
