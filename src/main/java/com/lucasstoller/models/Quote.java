package com.lucasstoller.models;

public class Quote {
    public Work work;
    public Figure figure;
    public String phrase;

    public Quote(Work work, Figure figure, String phrase) {
        this.work = work;
        this.figure = figure;
        this.phrase = phrase;
    }
}
