package 자바함수공부.N8_함수형스타일프로그래밍의기초와디자인패턴.N167_람다요약;

//FunctionalInterface : 구현해야할 추상 메소드가 1개인 인터페이스
@FunctionalInterface
interface Print{
    void print(int a, int b);
}

class Test {
    public void testMethod(Print print) {
        print.print(1, 2);
        System.out.println("콘솔 출력 실행문");
    }
}
public class LamdaExample1 {

    public static void main(String[] args) {
        Test noLamda = new Test();

        noLamda.testMethod(new Print() {
            @Override
            public void print(int a, int b){
                System.out.println("a와 b의 합은 " + (a + b));
                System.out.println("a와 b의 차는 " + (a - b));
            }
        });

        //위에 코드를 람다로 작성하면 4줄만에 끝난다.
        Test lamdaTest = new Test();
        lamdaTest.testMethod((a, b) -> {
            System.out.println("a와 b의 합은 " + (a + b));
            System.out.println("a와 b의 차는 " + (a - b));
        });
    }
}
