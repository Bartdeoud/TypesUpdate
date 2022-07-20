package Data;

import java.util.ArrayList;
import java.util.Arrays;

import static Data.FormatAL.getLayout;

public class FormatType
{
    private static final ArrayList<LayoutType> layoutTypes = initiateLayoutTypes();

    public static ArrayList<LayoutType> initiateLayoutTypes(){
        ArrayList<LayoutType> layoutTypes = new ArrayList<>(Arrays.asList(
                new LayoutType(-1,"",getLayout(1)),
                new LayoutType(13010000,"article number",getLayout(2)),
                new LayoutType(-1,"",getLayout(3)),
                new LayoutType(13010010,"EAN number",getLayout(4)),
                new LayoutType(160040,"Type",getLayout(5)),
                new LayoutType(-1,"",getLayout(6)),
                new LayoutType(-1,"",getLayout(7)),
                new LayoutType(-1,"",getLayout(8)),
                new LayoutType(-1,"",getLayout(9)),
                new LayoutType(-1,"",getLayout(10)),
                new LayoutType(-1,"",getLayout(11)),
                new LayoutType(-1,"",getLayout(12)),
                new LayoutType(-1,"",getLayout(13)),
                new LayoutType(-1,"",getLayout(14)),
                new LayoutType(-1,"",getLayout(15)),
                new LayoutType(-1,"",getLayout(16)),
                new LayoutType(-1,"",getLayout(17)),
                new LayoutType(-1,"",getLayout(18)),
                new LayoutType(-1,"",getLayout(19)),
                new LayoutType(-1,"",getLayout(20)),
                new LayoutType(-1,"",getLayout(21)),
                new LayoutType(-1,"",getLayout(22)),
                new LayoutType(-1,"",getLayout(23)),
                new LayoutType(13010160,"mass (kg)",getLayout(24)),
                new LayoutType(-1,"",getLayout(25)),
                new LayoutType(13010120,"body length (mm)",getLayout(26)),
                new LayoutType(13010130,"body breadth (mm)",getLayout(27)),
                new LayoutType(13010140,"body height (mm)",getLayout(28)),
                new LayoutType(-1,"",getLayout(29)),
                new LayoutType(-1,"",getLayout(30)),
                new LayoutType(-1,"",getLayout(31)),
                new LayoutType(-1,"",getLayout(32)),
                new LayoutType(12000005,"Beschrijving",getLayout(33)),
                new LayoutType(12000011,"Datum aanmaak",getLayout(34)),
                new LayoutType(12000012,"Datum modficatie",getLayout(35)),
                new LayoutType(-1,"",getLayout(36))
        ));
        return layoutTypes;
    }

    public static ArrayList<LayoutType> getLayoutTypes(){
        return layoutTypes;
    }

}
