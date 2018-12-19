package com.wlazly;

public class Position {
    String nameposition;
    int price;
    int amount;
    String units;
    int vat;
    public Position(String nameposition, int price, int amount,
                    String units, int vat){
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

