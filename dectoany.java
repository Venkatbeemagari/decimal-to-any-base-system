# decimal-to-any-base-system
#convert decimal base to any base system
import java.util.Scanner;

public class dectoanybase {
    public static void main(String args[]) {
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();
        int b = src.nextInt();
        src.close();
        int dn = getvalueinbase(n, b);
        System.out.println(dn);
    }

    public static int getvalueinbase(int n, int b) {
        int res = 0;
        int rem;
        int pow = 0;
        while (n > 0) {
            rem = n % b;
            res += rem * Math.pow(10, pow);
            n = n / b;
            pow += 1;
        }
        return res;
    }
}

