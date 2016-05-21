package com.company;

import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jersak on 19/05/2016.
 */
public class FWriter {

    //extracts the data from the CityInfo objects and places it into a string array
    private static List<String> extractData (List<CityInfo> citylist){

        List<String> precsv = new ArrayList<String>();

        for (CityInfo currentcity : citylist){
            precsv.add(String.valueOf(currentcity.getmId()));
            precsv.add(currentcity.getmName());
            precsv.add(currentcity.getmType());
            precsv.add(String.valueOf(currentcity.getmGeo().getLat()));
            precsv.add(String.valueOf(currentcity.getmGeo().getLon()));
        }

        return precsv;
    }

    //writes the data into a CSV file
    private static void writeToCsvFile (List<String> values) {

        String[] csvvalues = new String[values.size()];
        values.toArray(csvvalues);

        CSVWriter writer = null;
        try {
            System.out.println("Writing to file \"locationinfo.csv\" ...");
            writer = new CSVWriter(new FileWriter("locationinfo.csv"), ',');
            writer.writeNext(csvvalues);
            writer.close();
            System.out.println("Done.");
            System.exit(0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Calls the methods for extracting data and creating the CSV file, for convenience
    public static void createcsvfile (List<CityInfo> citylist){
        List<String> precsv = new ArrayList<String>();

        precsv = extractData(citylist);
        writeToCsvFile(precsv);
    }




}
