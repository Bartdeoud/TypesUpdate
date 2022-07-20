package Data;

import java.util.ArrayList;
import java.util.Arrays;

public class FormatAL
{
    private static final ArrayList<LayoutAL> layouts = initiateLayouts();

    //all the data for the format
    public static ArrayList<LayoutAL> initiateLayouts(){
        ArrayList<LayoutAL> layouts = new ArrayList<>();
        layouts.addAll(Arrays.asList(
                new LayoutAL(1,"Mutatiecode",1, 1, "1=toegevoegd, 2=verwijderd, 3=gewijzigd"),
                new LayoutAL(2,"Artikelcode Leverancier",2, 21," indien er geen artikelcodebestaat, dit veld vullen met \"EAN code artikel\""),
                new LayoutAL(3,"EAN Adrescode",22, 33),
                new LayoutAL(4, "EAN Code Artikel", 35, 48),
                new LayoutAL(5, "Productcode fabrikant", 49, 68),
                new LayoutAL(6, "EAN adrescode fabrikant", 69, 81),
                new LayoutAL(7, "Artikelcode vervanger", 82, 101),
                new LayoutAL(8, "EAN code vervanger", 102, 115),
                new LayoutAL(9, "Artikelcode voorganger", 116, 135),
                new LayoutAL(10, "EAN code voorganger", 136, 149),
                new LayoutAL(11, "Verwerkbaar", 150, 151, "SU=verwerkbaar, NS=niet verwerkbaar"),
                new LayoutAL(12, "Bestelbaar", 152, 153, "TU=bestelbaar, NO=niet bestelbaar"),
                new LayoutAL(13, "Aantal gebruikseenheden", 154, 163, "1=default waarde"),
                new LayoutAL(14, "Gebruikseenheid", 164, 166, "Codelijst 6411 EANCOM"),
                new LayoutAL(15, "Omrekenfactor prijs naar besteleenheid", 167, 176),
                new LayoutAL(16, "Besteleenheid", 177, 179, "Codelijst 6411 EANCOM(PCE=default)"),
                new LayoutAL(17, "Minimum afname", 180, 189),
                new LayoutAL(18, "Stapgrootte afname", 190, 199),
                new LayoutAL(19, "Eenheid afname", 200, 202, "Gelijk aan Besteleenheid"),
                new LayoutAL(20, "Code kortingsgroep", 203, 222),
                new LayoutAL(21, "Levertijd", 223, 232),
                new LayoutAL(22, "Levertijdeenheid", 233, 235, "803=Week, 804=Dag, 805=Uur"),
                new LayoutAL(23, "Afnamegroep", 236, 245),
                new LayoutAL(24, "Bruto gewicht", 246, 255),
                new LayoutAL(25, "Gewichtseenheid", 256, 258, "Codelijst 6411 EANCOM"),
                new LayoutAL(26, "Verpakkingscode", 259, 261),
                new LayoutAL(27, "Lengte verpakking", 262, 271),
                new LayoutAL(28, "Breedte verpakking", 272, 281),
                new LayoutAL(29, "Hoogte verpakking", 282, 291),
                new LayoutAL(30, "Eenheid afmeting", 292, 294, "MMT=millimeter, CMT=centimeter, MTR=meter"),
                new LayoutAL(31, "Stauscode", 295, 297, "84E=inlopend, 94E=Uitlopend"),
                new LayoutAL(32, "CBS-code", 298, 309),
                new LayoutAL(33, "Leveranciersomschrijving", 310, 359),
                new LayoutAL(34, "Ingangsdatum artikel", 360, 367, "Datum effectief (EEJJMMDD)"),
                new LayoutAL(35, "Mutatiedatum", 368, 375, "Datum van mutatie (EEJJMMDD) vervalt bij aan te leveren bestanden"),
                new LayoutAL(36, "n.v.t.", 376, 377, "Verplicht CR/LF  ACSII code: carriage return/Line feed")
        ));
        return layouts;
    }

    public static ArrayList<LayoutAL> getLayouts()
    {
        return layouts;
    }

    public static LayoutAL getLayout(int i){
        return layouts.get((i - 1));
    }
}
