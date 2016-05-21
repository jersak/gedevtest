package com.company;

import static com.company.DataFetcher.retrieveData;

public class Main {

    public static void main(String[] args) {

        if (args.length == 1) {
            retrieveData(args[0]);
        } else {
            System.out.println("You must provide only one city name. If the city name has more than one word, enclose it in quotes.");
        }

    }
}
