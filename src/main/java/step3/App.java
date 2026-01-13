package step3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArithmeticCalculator<Double> ac = new ArithmeticCalculator<>();

        Scanner sc = new Scanner(System.in);
        boolean b = true;

        while(b){
            try {
                System.out.print("첫번째 숫자를 입력하세요: ");
                double num1 = sc.nextDouble();
                System.out.print("두번째 숫자를 입력하세요: ");
                double num2 = sc.nextDouble();

                OperatorType type;
                System.out.print("사칙연산 기호(+, -, /, *)를 입력하세요: ");
                String sign = sc.next();
                type = OperatorType.matchSign(sign.charAt(0));

                double cal = ac.calculate(num1, num2, type);
                if (Double.isInfinite(cal) || Double.isNaN(cal)){
                    System.out.println("나눗셈 연산에서 두번째 수에 0이 입력 될 수 없습니다. 계산을 다시 시작합니다.\n");
                    continue;
                }
                System.out.print("결과: "+cal);

                System.out.print("\n\n첫번째 값을 삭제하시겠습니까? (yes 입력시 삭제)>> ");
                String str2 = sc.next();
                if (str2.equals("yes")){
                    ac.removeResult();
                }

                System.out.print("\n입력 값보다 큰 값 찾기 (수 입력)>>");
                double num3 = sc.nextDouble();
                ac.biggerNum(num3);

                System.out.print("\n더 계산 하시겠습니까? (exit 입력시 종료)>> ");
                String str = sc.next();
                if (str.equals("exit"))b=false;

            } catch (ArithmeticException e){
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
            }
        }
    }
}
