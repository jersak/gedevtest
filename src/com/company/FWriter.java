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

    //writes the data into a CSV file
    public static void writeToCsvFile (List<CityInfo> cityList) {

        CSVWriter writer = null;
        try {
            System.out.println("Writing to file \"locationinfo.csv\" ...");
            writer = new CSVWriter(new FileWriter("locationinfo.csv"), ',');
            for (CityInfo currentCity: cityList) {
                writer.writeNext(currentCity.getData());
            }
            writer.close();
            System.out.println("Done.");
        } catch (IOException e) {
            System.out.println("Unable to create CSV file.");
        }
    }

}
