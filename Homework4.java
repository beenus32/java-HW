import java.util.Scanner;

public class Homework4 {
    public static int gcd(int a, int b) {
        if (a == b) {
            return a;
        } else if (a > b) {
            return gcd(a - b, b);
        } else {
            return gcd(a, b - a);
        }
    }
    int alg(int m, int n) {
        if (n == 0) {return m;}
        if (m < n) {
            int temp = m;
        m = n;
        n = temp;}
        int num = m%2;
        n = gcd(m, num);
        return n;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("두 수를 입력하세요: \n");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int result = gcd(a,b);
        System.out.printf("두 수의 최대공약수는 %d입니다.", result);
    }
}
