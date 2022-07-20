package MainFunctions;

import Data.LineType;
import Data.Type;
import FileReader.ArtLevReader;
import FileReader.SESReader;

import java.util.*;

public class CheckLines
{
    private final ArtLevReader artLevReader = new ArtLevReader("E:\\Q-PAB\\artlev.txt");
    private final SESReader sesReader = new SESReader("E:\\Types.ses");

    public static ArrayList<LineType> linesFound = new ArrayList<>();

    private final ArrayList<Thread> threads = new ArrayList<>();;

    public void checkLines(){
        runThreads();

        filterArrays();

        System.out.println(linesFound);
    }

    public void filterArrays(){
        Set<LineType> set = new LinkedHashSet<>(linesFound);
        linesFound.clear();
        linesFound.addAll(set);
    }

    public void runThreads(){
        runDividedGroups(artLevReader.getData());
        int i = 0;
        for(Thread thread: threads){
            try {
                thread.join();
                i++;
            } catch (InterruptedException ignored) {}
        }
        System.out.println(i);
    }

    public void createThread(ArrayList<String[]> lines, ArrayList<Type> types){
        Thread thread = new Thread(() ->{
            ArrayList<String[]> linesThread = new ArrayList<>(lines);
            ArrayList<Type> typesThread = new ArrayList<>(types);
            ArrayList<LineType> linesFoundThread = new ArrayList<>();
            for(String[] line: linesThread){
                try
                {
                    for (Type type : typesThread)
                    {
                        if (line[3].contains(type.getTypeProperty()) & !type.getTypeProperty().equals("0"))
                        {
                            linesFoundThread.add(new LineType(line,type));
                        }
                    }
                } catch (Exception ignored) {}
            }
            linesFound.addAll(linesFoundThread);
        });
        threads.add(thread);
        thread.start();
    }

    public void runDividedGroups(ArrayList<String[]> lines){
        int begin = 0;
        int end = 500;
        int linesSize = lines.size();
        while (linesSize > 0){
            if(end > lines.size()){
                createThread(new ArrayList<>(lines.subList(begin, linesSize)), sesReader.getTypes());
                break;
            }
            createThread(new ArrayList<>(lines.subList(begin, end)), sesReader.getTypes());
            begin = end;
            end += 50000;
            linesSize = lines.size();
        }
    }

    public static ArrayList<LineType> getLinesFound()
    {
        return linesFound;
    }
}
