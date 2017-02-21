package by.epam.sphere.parser;

import by.epam.sphere.action.InputFileDataReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Антон on 21.02.2017.
 */
public class StringDataParser {
    public static ArrayList<Double> getCoordinates (ArrayList<String> stringData) {
        ArrayList<Double> coordinates = new ArrayList<>();

        Pattern p = Pattern.compile("-?\\d+.\\d+");
        for (String s : stringData) {
            Matcher m = p.matcher(s);
            while (m.find()) {
                coordinates.add(Double.parseDouble(m.group()));
            }
        }

        return coordinates;
    }

    public static void main (String[] args) throws IOException {
        ArrayList<Double> outp = getCoordinates(InputFileDataReader.getFileData());

        for (Double d : outp) {
            System.out.println(d);
        }
    }
}