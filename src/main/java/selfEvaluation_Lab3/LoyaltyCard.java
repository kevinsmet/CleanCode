package selfEvaluation_Lab3;


public class LoyaltyCard {
    private int barcode;
    private int bonuspoints;


    public LoyaltyCard(int barcode, int bonuspoints) {
        this.barcode = barcode;
        this.bonuspoints = bonuspoints;
    }

    public int getBarcode() {
        return barcode;
    }

    public int getBonuspoints() {
        return bonuspoints;
    }
}
