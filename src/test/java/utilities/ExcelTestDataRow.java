package utilities;

public class ExcelTestDataRow {

    private String priceFrom;
    private String priceTo;

    public ExcelTestDataRow(String priceFrom, String priceTo) {
        this.priceFrom = priceFrom;
        this.priceTo = priceTo;
    }

    public String getPriceFrom() {
        return priceFrom;
    }

    public String getPriceTo() {
        return priceTo;
    }

}
