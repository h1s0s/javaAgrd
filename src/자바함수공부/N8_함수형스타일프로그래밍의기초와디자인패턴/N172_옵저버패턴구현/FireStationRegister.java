package 자바함수공부.N8_함수형스타일프로그래밍의기초와디자인패턴.N172_옵저버패턴구현;

public interface FireStationRegister {
    void registerFireStation(FireObserver fo);
    void notifyFireStations(String address);
}
