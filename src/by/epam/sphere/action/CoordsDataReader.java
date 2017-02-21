package by.epam.sphere.action;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CoordsDataReader {
	public static ArrayList<Double> readCoordsFromFile () throws FileNotFoundException {
		ArrayList<Double> coordinates = new ArrayList<>();
        final String DATA_PATH = "src/by/epam/sphere/data/Input.txt"; //coordinates input file
        final int COORDS_NMBR = 6; //6 coordinates for 2 points in 3 dimensions
        Scanner n = null;
       
		try {
        	n = new Scanner(new File(DATA_PATH));
            
            while(n.hasNext()){
                if(n.hasNextDouble()){
                    coordinates.add(n.nextDouble());
                } else {
                    n.next();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            n.close();
        }
        n = new Scanner(new File(DATA_PATH));

        while(n.hasNext()){
            if(n.hasNextDouble()){
                coordinates.add(n.nextDouble());
            } else {
                n.next();
            }
        }
        n.close();

		return coordinates;
	}

	public static void main (String[] args) throws FileNotFoundException {
	    readCoordsFromFile();
	    System.out.println(readCoordsFromFile().get(0));
    }

}
