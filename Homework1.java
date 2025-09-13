import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        int result = 0;
        Scanner sc = new Scanner(System.in);
        System.out.printf("정수를 입력하세요: ");
        int num1 = sc.nextInt();
        result += num1;
        System.out.printf("현재까지 입력된 정수의 합은 %d입니다.\n", result);
        System.out.printf("정수를 입력하세요: ");
        int num2 = sc.nextInt();
        result += num2;
        System.out.printf("현재까지 입력된 정수의 합은 %d입니다.\n", result);
        System.out.printf("정수를 입력하세요: ");
        int num3 = sc.nextInt();
        result += num3;
        System.out.printf("현재까지 입력된 정수의 합은 %d입니다.\n", result);
        System.out.printf("정수를 입력하세요: ");
        int num4 = sc.nextInt();
        result += num4;
        System.out.printf("현재까지 입력된 정수의 합은 %d입니다.\n", result);
        System.out.printf("정수를 입력하세요: ");
        int num5 = sc.nextInt();
        result += num5;
        System.out.printf("현재까지 입력된 정수의 합은 %d입니다.\n", result);

    }
}