package step2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculator2 c = new Calculator2();

        Scanner sc = new Scanner(System.in);
        boolean b = true;

        while(b){
            try {
                System.out.print("첫번째 숫자를 입력하세요: ");
                int num1 = sc.nextInt();
                System.out.print("두번째 숫자를 입력하세요: ");
                int num2 = sc.nextInt();

                System.out.print("사칙연산 기호를 입력하세요: ");
                char sign = sc.next().charAt(0);

                int cal = c.calculate(num1, num2, sign);
                System.out.print("결과: "+cal);

                System.out.print("값을 삭제하시겠습니까? (yes 입력시 삭제)>> ");
                String str2 = sc.next();
                if (str2.equals("yes")){
                    c.removeResult();
                }

                System.out.print("\n더 계산 하시겠습니까? (exit 입력시 종료)>> ");
                String str = sc.next();
                if (str.equals("exit"))b=false;

            } catch (ArithmeticException e){
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
            }
        }


    }
}
