package Models;

public class Apples {
    private int id;
    private Double weightinLbs;
    private String ripeness;
    private Double pricePerLb;
    private int amount;

    public void setId(int id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Double getPricePerLb() {
        return pricePerLb;
    }

    public void setPricePerLb(Double pricePerLb) {
        this.pricePerLb = pricePerLb;
    }

    public Double getWeightinLbs() {
        return weightinLbs;
    }

    public void setWeightinLbs(Double weightinLbs) {
        this.weightinLbs = weightinLbs;
    }

    public int getId() {
        return id;
    }

    public void setRipeness(String ripeness) {
        this.ripeness = ripeness;
    }

    public String getRipeness() {
        return this.ripeness;
    }
}
