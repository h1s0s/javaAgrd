package 자바함수공부.N8_함수형스타일프로그래밍의기초와디자인패턴.N172_옵저버패턴구현;

public class DecaturFireStation implements FireObserver {

    @Override
    public void fire(String address) {
        if (address.contains("Decatur")){
            System.out.println(
                    "Decatur fire station will go to this fire"
            );
        }
    }
}