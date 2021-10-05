package com.jetbrains;

public class Card {
    private String palo,color,valor;

    public static String[] palos = {"Tréboles","Corazones","Picas","Diamantes"};
    public static String[] colores = {"Rojo","Negro"};
    public static String[] valores = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};

    Card(String palo,String color,String valor){
        this.palo = palo;
        this.color = color;
        this.valor = valor;
    }

    public String getPalo() {
        return palo;
    }

    public String getColor() {
        return color;
    }

    public String getValor() {
        return valor;
    }
}
