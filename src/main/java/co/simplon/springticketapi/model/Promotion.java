package co.simplon.springticketapi.model;

public class Promotion {
    private int id;
    private String promotionName;

    public Promotion(int id, String promotionName) {
        this.id = id;
        this.promotionName = promotionName;
    }

    public int getId() {
        return id;
    }

    public String getPromotionName() {
        return promotionName;
    }

    @Override
    public String toString() {
        return "Promotion{" +
                "id=" + id +
                ", promotionName='" + promotionName + '\'' +
                '}';
    }
}
