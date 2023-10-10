package 자바함수공부.N8_함수형스타일프로그래밍의기초와디자인패턴;

public class Melon implements Fruit{
    private final String type;
    private final int weight;
    private final String origin;

    public Melon(String type, int weight, String origin){
        this.type = type;
        this.weight = weight;
        this.origin = origin;
    }

    public String getType() {
        return type;
    }

    public int getWeight() {
        return weight;
    }

    public String getOrigin() {
        return origin;
    }

    @Override
    public String toString() {
        return "Melon{" +
                "type='" + type + '\'' +
                ", weight=" + weight +
                ", origin='" + origin + '\'' +
                '}';
    }
}
