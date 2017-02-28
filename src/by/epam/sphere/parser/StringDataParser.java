package by.epam.sphere.parser;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

<<<<<<< HEAD
=======
/**
 * Created by Антон on 15.02.2017.
 */
>>>>>>> ed9f13f71a8419cf9f0eed10576e4ba38d590c6b
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
