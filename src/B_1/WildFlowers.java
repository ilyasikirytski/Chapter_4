package B_1;

// TODO - название должно быть как один цветок,
//  - наследование от цветка одного, а не от букета
//  - при наследовании переопредлеить (Override) какие-либо параметры
public class WildFlowers extends Flowers {
    private String type = "Wild FLowers";
    private String name;
    private int stemLength;
    private int price;
    private int freshnessLevel;

    public WildFlowers(String name, int stemLength, int freshnessLevel, int price) {
        this.name = name;
        this.stemLength = stemLength;
        this.price = price;
        this.freshnessLevel = freshnessLevel;
    }

    public int getFreshnessLevel() {
        return freshnessLevel;
    }

    public int getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getStemLength() {
        return stemLength;
    }

    @Override
    public String toString() {
        return "WildFlowers{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", stemLength=" + stemLength +
                ", price=" + price +
                ", freshnessLevel=" + freshnessLevel +
                '}';
    }
}