package B_1;

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
}