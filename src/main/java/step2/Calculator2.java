package step2;

import java.util.ArrayList;

public class Calculator2 {
    private ArrayList<Integer> list = new ArrayList<>();
    public int calculate(int num1, int num2, char sign){
        int result = 0;

        switch (sign) {
            case '+':
                result = num1+num2;
                list.add(result);
                break;

            case '-':
                result = num1-num2;
                list.add(result);
                break;

            case '*':
                result = num1*num2;
                list.add(result);
                break;

            case '/':
                result = num1/num2;
                list.add(result);
                break;

            default:
                break;
        }

        return result;
    }

    public ArrayList<Integer> getList() {
        return list;
    }

    public void setList(ArrayList<Integer> list) {
        this.list = list;
    }

    public void removeResult(){
        list.remove(0);
        System.out.println(getList());
    }
}
