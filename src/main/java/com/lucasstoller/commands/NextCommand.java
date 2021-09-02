package com.lucasstoller.commands;

import picocli.CommandLine.Command;

import java.util.Random;

import com.lucasstoller.models.Quote;

@Command
public class NextCommand implements Runnable {
    private Quote quotes[];

    public NextCommand(Quote[] quotes) {
        this.quotes = quotes;
    }

    private Quote getRandom() { 
        Random rand = new Random();
        int randomNumber = rand.nextInt(quotes.length);
        return quotes[randomNumber];
    }

    @Override
    public void run() {
        Quote quote = getRandom();
        System.out.printf("%s - %s (%s)", quote.phrase, quote.figure.name, quote.work.name);
    }
}
