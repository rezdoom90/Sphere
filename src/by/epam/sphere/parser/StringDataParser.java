package by.epam.sphere.parser;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.apache.logging.log4j.Level.INFO;


public class StringDataParser {
    static Logger logger = LogManager.getLogger();

    public static ArrayList<Double> getCoordinates (ArrayList<String> stringData) {
        ArrayList<Double> coordinates = new ArrayList<>();

        Pattern p = Pattern.compile("-?\\d+.\\d+");
        for (String s : stringData) {
            Matcher m = p.matcher(s);
            while (m.find()) {
                coordinates.add(Double.parseDouble(m.group()));
            }
        }

        logger.log(INFO, "File data parsing done. Coordinates received.");

        return coordinates;
    }
}
