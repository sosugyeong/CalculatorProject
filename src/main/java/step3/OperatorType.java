package step3;

public enum OperatorType {
    PLUS('+'),
    MINUS('-'),
    DIVIDE('/'),
    MULTIPLE('*');

    private final char sign;

    //생성자
    OperatorType(char sign){
        this.sign = sign;
    }

    public char getSign(){
        return sign;
    }

    public static OperatorType matchSign(char sign){
        for(OperatorType type : step3.OperatorType.values()){
            if (type.getSign() == sign){
                return type;
            }
        }
        throw new IllegalArgumentException(sign+"는 사칙연산 기호가 아닙니다.");
    }
}
