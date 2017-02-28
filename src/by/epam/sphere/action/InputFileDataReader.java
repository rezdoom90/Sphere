package by.epam.sphere.action;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class InputFileDataReader {
	public static ArrayList<String> getFileData (String path) throws IOException {
		ArrayList<String> stringData = new ArrayList<>();
        	final String DATA_PATH = "src/by/epam/sphere/data/Input.txt"; //coordinates input file path

		if (path.isEmpty()) {
			Files.lines(Paths.get(DATA_PATH), StandardCharsets.UTF_8).forEach(stringData::add);
		} else {
			Files.lines(Paths.get(path), StandardCharsets.UTF_8).forEach(stringData::add);
		}

		return stringData;
	}
}
