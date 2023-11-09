package 자바함수공부.N8_함수형스타일프로그래밍의기초와디자인패턴.N167_람다요약;

@FunctionalInterface
interface BigNumber {
    int getBigNumber(int num1, int num2);
}

public class LamdaExample2 {
    public static void main(String[] args) {
        //람다 표현식을 변수에 담아서 사용함
        BigNumber bigNumber = (x, y) -> {
            if (x > y) {
                return x;
            } else {
                return y;
            }
        };

        int result = bigNumber.getBigNumber(2156, 12382);
        System.out.println(result);
    }
}
