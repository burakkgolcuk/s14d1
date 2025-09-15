package com.workintech.pool;

import java.util.Locale;

public class Rectangle {
    static {
        Locale tr = new Locale("tr", "TR");
        Locale.setDefault(tr);
        // ÖNEMLİ: String.format/NumberFormat için FORMAT kategorisini özel olarak ayarla
        Locale.setDefault(Locale.Category.FORMAT, tr);
    }

    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = (width < 0) ? 0 : width;
        this.length = (length < 0) ? 0 : length;
    }

    public double getWidth() { return width; }
    public double getLength() { return length; }
    public double getArea() { return width * length; }
}
