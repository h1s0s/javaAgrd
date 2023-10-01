package 자바함수공부.N5_배열_컬렉션_그리고데이터구조;

public class N099_Melon {
    String type;
    int weight;

    public N099_Melon() {
    }

    public N099_Melon(String type, int weight) {
        this.type = type;
        this.weight = weight;
    }

    public N099_Melon(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "N099_Melon{" +
                "type='" + type + '\'' +
                ", weight=" + weight +
                '}';
    }
}
