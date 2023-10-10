package 자바함수공부.N8_함수형스타일프로그래밍의기초와디자인패턴.N172_옵저버패턴구현;

public class N172_옵저버패턴구현 {
    public static void main(String[] args) {
        /*
        옵저버 패턴은 객체(대상(subject))를 하나 정의해 특정 이벤트가 발생하면
        그 객체의 구독자(옵저버(observer))에게 자동으로 알린다.
        예를 들어 소방 본부가 대상, 관내 소방서가 옵저버일 수 있다.
        불이 나면 소방본부는 관내 모든 소방서에 알리고 불이 난 지역의 주소를 보낸다.
        각 옵저버는 주소를 분석해 각자의 기준에 따라 불을 끄러 갈지 결정한다.
         */

        //1-1. 관내 소방서(옵저버) 셋을 소방 본부(대상)에 등록
        FireStation fireStation = new FireStation();
        fireStation.registerFireStation(new BrookhavenFireStation());
        fireStation.registerFireStation(new ViningsFireStation());
        fireStation.registerFireStation(new DecaturFireStation());

        //1-2.불이 나면 소방 본부는 등록된 모든 관내 소방서에 알린다
        fireStation.notifyFireStations(
                "Fire alert: WestHaven At Vinings 5901 Suffex Green Ln Atlanta"
        );
        //위 코드 역시 전형적인 보일러 플레이트 코드, 관내 소방서마다 새 클래스와 fire()메서드를
        //구현해야 한다. 하지만 람다를 이용해 수정할 수도 있다

        //2-1
        fireStation.registerFireStation((String address) -> {
            if (address.contains("")) {
                System.out.println(
                        "Brookhaven"
                );
            }
        });
    }

}
