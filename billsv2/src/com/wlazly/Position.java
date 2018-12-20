package com.wlazly;

public class Position {
    String nameposition;
    String price;
    String amount;
    String units;
    String vat;
    public Position(String nameposition, String price, String amount,
                    String units, String vat){
            this.nameposition = nameposition;
            this.price = price;
            this.amount = amount;
            this.units = units;
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

