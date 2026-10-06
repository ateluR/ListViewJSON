package com.onaar.jsonnaocene;

import com.google.gson.annotations.SerializedName;

import java.util.Calendar;

public class Pytania {
    @SerializedName("tytul")
    private String tytul;
    @SerializedName("tresc")
    private String tresc;
    @SerializedName("data")
    private Calendar data;

    public Pytania(String tytul, String tresc, Calendar data) {
        this.tytul = tytul;
        this.tresc = tresc;
        this.data = data;
    }

    public String getTytul() {
        return tytul;
    }

    public String getTresc() {
        return tresc;
    }

    public Calendar getData() {
        return data;
    }
}