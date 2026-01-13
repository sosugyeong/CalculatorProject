package step3;

public enum OperatorType {
    PLUS('+'),
    MINUS('-'),
    DIVIDE('/'),
    MULTIPLE('*');

    //사칙연산 기호를 저장할 필드
    private final char sign;

    //생성자
    OperatorType(char sign){
        this.sign = sign;
    }

    public char getSign(){
        return sign;
    }

    public static OperatorType matchSign(char sign){
        for(OperatorType type : values()){
            if (type.getSign() == sign){
                return type;
            }
        }
        throw new IllegalArgumentException(sign+"은 사칙연산 기호가 아닙니다.");
    }
}
