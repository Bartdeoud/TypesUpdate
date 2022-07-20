package FileReader;

import Data.LayoutAL;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import static Data.FormatAL.getLayouts;

public class ArtLevReader
{
    private final String location;

    public ArtLevReader(String location)
    {
        this.location = location;
    }

    //convert each line to data with an imported format
    public ArrayList<String[]> getData(){
        ArrayList<String[]> lines = new ArrayList<>();
        int errors = 0;
        try
        {
            for(String textLine: getTextFile()){
                String[] line = new String[36];
                int i = 0;
                for(LayoutAL layoutAL : getLayouts()){
                    if(layoutAL.getEind() - 1 > textLine.length()) break;
                    try
                    {
                        line[i++] = (textLine.substring(layoutAL.getBegin() - 1, layoutAL.getEind())).trim();
                    } catch (Exception e)
                    {
                      errors++;
                    }
                }
                lines.add(line);
            }
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        System.out.println("Errors : " + errors);
        return lines;
    }


    public ArrayList<String> getTextFile() throws IOException
    {
        ArrayList<String> lines = new ArrayList<>();
        FileInputStream inputStream = null;
        Scanner sc = null;
        try {
            inputStream = new FileInputStream(location);
            sc = new Scanner(inputStream, "UTF-8");
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                lines.add(line);
            }
            // note that Scanner suppresses exceptions
            if (sc.ioException() != null) {
                throw sc.ioException();
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (sc != null) {
                sc.close();
            }
        }
        return lines;
    }
}
