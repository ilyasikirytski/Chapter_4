package B_1;

//  - при наследовании переопредлеить (Override) какие-либо параметры
public class WildFlower extends Flower {

    public WildFlower(String name, int stemLength, int freshnessLevel, int price) {
        super(name, stemLength, freshnessLevel, price);
    }

    public int getFreshnessLevel() {
        return super.getFreshnessLevel();
    }

    public int getPrice() {
        return super.getPrice();
    }

    public String getName() {
        return super.getName();
    }

    public int getStemLength() {
        return super.getStemLength();
    }

    @Override
    public String toString() {
        String type = "Wild FLowers";
        return "WildFlower{" +
                "type='" + type + '\'' +
                ", name='" + super.getName() + '\'' +
                ", stemLength=" + super.getStemLength() +
                ", price=" + super.getPrice() +
                ", freshnessLevel=" + super.getFreshnessLevel() +
                '}';
    }

    @Override
    public int compareTo(Flower o1) {
        return (getFreshnessLevel() - o1.getFreshnessLevel());
    }
}