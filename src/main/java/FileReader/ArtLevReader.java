package FileReader;

import Beans.FormatLayout;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static Beans.Format.getLayouts;

public class ArtLevReader
{
    private final String location;

    public ArtLevReader(String location)
    {
        this.location = location;
    }

    public ArrayList<String[]> getData(){
        ArrayList<String[]> lines = new ArrayList<>();
        for(String textLine: getTextFile()){
            String[] line = new String[36];
            int i = 0;
            for(FormatLayout formatLayout: getLayouts()){
                if(formatLayout.getEind() - 1 > textLine.length()) break;
                line[i++] = (textLine.substring(formatLayout.getBegin() - 1,formatLayout.getEind() - 1));
            }
            lines.add(line);
        }
        return lines;
    }

    public ArrayList<String> getTextFile(){
        ArrayList<String> fileLines = new ArrayList<>();
        try {
            File myObj = new File(location);
            Scanner reader = new Scanner(myObj);
            while (reader.hasNextLine()) {
                fileLines.add(reader.nextLine());
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return fileLines;
    }

}
