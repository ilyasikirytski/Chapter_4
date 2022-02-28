package B_1;

abstract class Flower implements Comparable<Flower> {
    private final String name;
    private final int stemLength;
    private final int price;
    private final int freshnessLevel;

    public Flower(String name, int stemLength, int price, int freshnessLevel) {
        this.name = name;
        this.stemLength = stemLength;
        this.price = price;
        this.freshnessLevel = freshnessLevel;
    }

    public String getName() {
        return this.name;
    }

    public int getStemLength() {
        return this.stemLength;
    }

    public int getPrice() {
        return this.price;
    }

    public int getFreshnessLevel() {
        return this.freshnessLevel;
    }
}
