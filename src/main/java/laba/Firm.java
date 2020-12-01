package laba;

public class Firm {

    private String month;
    private int profitOfMonth;

    public Firm() {
    }

    public Firm(String month, int profitOfMonth) {
        this.month = month;
        this.profitOfMonth = profitOfMonth;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getProfitOfMonth() {
        return profitOfMonth;
    }

    public void setProfitOfMonth(int profitOfMonth) {
        this.profitOfMonth = profitOfMonth;
    }

    @Override
    public String toString() {
        return "laba.Firm{" +
                "month='" + month + '\'' +
                ", profitOfMonth=" + profitOfMonth +
                '}';
    }
}
