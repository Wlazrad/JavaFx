package com.wlazly;

public class Position {
    String nameposition;
    String price;
    String amount;
    String units;
    String vat;

    public Position(String nameposition, String price, String amount,
                    String units, String vat) {
        this.nameposition = nameposition;
        this.price = price;
        this.amount = amount;
        this.units = units;
        this.vat = vat;

    }

    public String getNameposition() {
        return nameposition;
    }

    public void setNameposition(String nameposition) {
        this.nameposition = nameposition;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public String getVat() {
        return vat;
    }

    public void setVat(String vat) {
        this.vat = vat;
    }

    @Override
    public String toString() {
        return "Position{" +
                "nameposition='" + nameposition + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", units='" + units + '\'' +
                ", vat=" + vat +
                '}';
    }
}

