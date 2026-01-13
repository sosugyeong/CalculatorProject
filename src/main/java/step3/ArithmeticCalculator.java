package step3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArithmeticCalculator<T extends Number> {
    private List<Double> list = new ArrayList<>();

    public ArithmeticCalculator(){
        this.list = list;
    }

    public double calculate(T num1, T num2, OperatorType operatorType){
        double result = 0;

        switch (operatorType) {
            case PLUS:
                result = num1.doubleValue() + num2.doubleValue();
                list.add(result);
                break;

            case MINUS:
                result = num1.doubleValue() - num2.doubleValue();
                list.add(result);
                break;

            case MULTIPLE:
                result = num1.doubleValue() * num2.doubleValue();
                list.add(result);
                break;

            case DIVIDE:
                result = num1.doubleValue() / num2.doubleValue();
                list.add(result);
                break;

            default:
                break;
        }
        return result;
    }

    public List<Double> getList() {
        return list;
    }

    public void setList(List<Double> list) {
        this.list = list;
    }

    public void removeResult(){ //가장 먼저 저장된 데이터를 삭제
        list.remove(0);
        System.out.println(getList());
    }

    //저장된 연산 결과들 중 Scanner로 입력받은 값보다 큰 결과값 들을 출력(Lambda & Stream)
    public void biggerNum(double num3){
        List<Double> list2;
        list2 = list.stream().filter(num->num > num3).collect(Collectors.toList());
        System.out.println(list2);
    }
}
