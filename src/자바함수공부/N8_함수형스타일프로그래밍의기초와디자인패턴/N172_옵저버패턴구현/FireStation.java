package 자바함수공부.N8_함수형스타일프로그래밍의기초와디자인패턴.N172_옵저버패턴구현;

import javafx.beans.NamedArg;

import java.util.ArrayList;
import java.util.List;

public class FireStation implements FireStationRegister{

    private final List<FireObserver> fireObservers = new ArrayList<>();

    @Override
    public void registerFireStation(FireObserver fo) {
        if (fo != null){
            fireObservers.add(fo);
        }
    }

    @Override
    public void notifyFireStations(String address) {
        if (address != null){
            for (FireObserver fireObserver: fireObservers) {
                fireObserver.fire(address);
            }
        }
    }
}
