package step3;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator<T extends Number> {
    private List<Double> list = new ArrayList<>();

    public double calculate(double num1, double num2, OperatorType operatorType){
        double result = 0;

        switch (operatorType) {
            case PLUS:
                result = num1 + num2;
                list.add(result);
                break;

            case MINUS:
                result = num1 - num2;
                list.add(result);
                break;

            case MULTIPLE:
                result = num1 * num2;
                list.add(result);
                break;

            case DIVIDE:
                result = num1 / num2;
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

    public void removeResult(){ //삭제
        list.remove(0);
        System.out.println(getList());
    }

}
