package 자바함수공부.N8_함수형스타일프로그래밍의기초와디자인패턴.N172_옵저버패턴구현;

public class BrookhavenFireStation implements FireObserver {

    @Override
    public void fire(String address) {
        if (address.contains("Brookhaven")){
            System.out.println(
                    "Brookhaven fire station will go to this fire"
            );
        }
    }
}
