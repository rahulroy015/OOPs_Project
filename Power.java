import java.util.Scanner;

public class Power {
    static long pow(int m, int power) {

        if (power == 0)
            return 1;

        if (power == 1)
            return m;
        long ans = pow(m, power / 2);

        if (power % 2 == 0)
            return ans * ans;

        else
            return m * ans * ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(pow(m, n));

    }
}
