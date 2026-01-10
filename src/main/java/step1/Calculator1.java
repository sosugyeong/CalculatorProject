package step1;

import java.util.Scanner;

public class Calculator1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean b = true;

        while (b) {
            try {
                System.out.print("첫번째 숫자를 입력하세요: ");
                int firstNum = sc.nextInt();
                System.out.print("두번째 숫자를 입력하세요: ");
                int secondNum = sc.nextInt();

                System.out.print("사칙연산 기호를 입력하세요: ");
                char sign = sc.next().charAt(0);

                int result = 0;

                switch (sign) {
                    case '+':
                        result = firstNum + secondNum;
                        break;

                    case '-':
                        result = firstNum - secondNum;
                        break;

                    case '*':
                        result = firstNum * secondNum;
                        break;

                    case '/':
                        result = firstNum / secondNum;
                        break;

                    default:
                        break;
                }
                System.out.println("결과: "+result);

            } catch (ArithmeticException e){
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
            }

            String str = " ";
            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료) >>");
            str = sc.next();
            if (str.equals("exit")){
                b = false;
            }

        }
    }
}
