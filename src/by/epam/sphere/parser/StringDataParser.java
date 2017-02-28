package by.epam.sphere.parser;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
}
