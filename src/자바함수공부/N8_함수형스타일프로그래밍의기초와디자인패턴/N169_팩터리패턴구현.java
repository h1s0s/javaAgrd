package 자바함수공부.N8_함수형스타일프로그래밍의기초와디자인패턴;

public class N169_팩터리패턴구현 {
    /*
     * 팩터리 패턴은 호출자에게 인스턴스 생성 프로세스를 제공하지 않고도 여러 종류의 객체를
     * 생성하게 해주는 패턴이다. 이로써 복잡하고(하거나) 민감한 객체 생성 프로세스는 감추면서
     * 직관적이고 사용하기 쉬운 객체 팩터리를 호출자에게 제공할 수 있다.
     */
    public static void main(String[] args) {

    }

    @FunctionalInterface
    public interface TriFunction<T, U, V, R> {
        R apply(T t, U u, V v);
    }
}
