package Beans;

import java.util.ArrayList;
import java.util.Arrays;

public class Format
{
    private static final ArrayList<FormatLayout> layouts = initiateLayouts();

    public static ArrayList<FormatLayout> initiateLayouts(){
        ArrayList<FormatLayout> layouts = new ArrayList<>();
        layouts.addAll(Arrays.asList(
                new FormatLayout(1,"Mutatiecode",1, 1, "1=toegevoegd, 2=verwijderd, 3=gewijzigd"),
                new FormatLayout(2,"Artikelcode Leverancier",2, 21," indien er geen artikelcodebestaat, dit veld vullen met \"EAN code artikel\""),
                new FormatLayout(3,"EAN Adrescode",22, 34),
                new FormatLayout(4, "EAN Code Artikel", 35, 48),
                new FormatLayout(5, "Productcode fabrikant", 49, 68),
                new FormatLayout(6, "EAN adrescode fabrikant", 69, 81),
                new FormatLayout(7, "Artikelcode vervanger", 82, 101),
                new FormatLayout(8, "EAN code vervanger", 102, 115),
                new FormatLayout(9, "Artikelcode voorganger", 116, 135),
                new FormatLayout(10, "EAN code voorganger", 136, 149),
                new FormatLayout(11, "Verwerkbaar", 150, 151, "SU=verwerkbaar, NS=niet verwerkbaar"),
                new FormatLayout(12, "Bestelbaar", 152, 153, "TU=bestelbaar, NO=niet bestelbaar"),
                new FormatLayout(13, "Aantal gebruikseenheden", 154, 163, "1=default waarde"),
                new FormatLayout(14, "Gebruikseenheid", 164, 166, "Codelijst 6411 EANCOM"),
                new FormatLayout(15, "Omrekenfactor prijsnaar besteleenheid", 167, 176),
                new FormatLayout(16, "Besteleenheid", 177, 179, "Codelijst 6411 EANCOM(PCE=default)"),
                new FormatLayout(17, "Minimum afname", 180, 189),
                new FormatLayout(18, "Stapgrootte afname", 190, 199),
                new FormatLayout(19, "Eenheid afname", 200, 202, "Gelijk aan Besteleenheid"),
                new FormatLayout(20, "Code kortingsgroep", 203, 222),
                new FormatLayout(21, "Levertijd", 223, 232),
                new FormatLayout(22, "Levertijdeenheid", 233, 235, "803=Week, 804=Dag, 805=Uur"),
                new FormatLayout(23, "Afnamegroep", 236, 245),
                new FormatLayout(24, "Bruto gewicht", 246, 255),
                new FormatLayout(25, "Gewichtseenheid", 256, 258, "Codelijst 6411 EANCOM"),
                new FormatLayout(26, "Verpakkingscode", 259, 261),
                new FormatLayout(27, "Lengte verpakking", 262, 271),
                new FormatLayout(28, "Breedte verpakking", 272, 281),
                new FormatLayout(29, "Hoogte verpakking", 282, 291),
                new FormatLayout(30, "Eenheid afmeting", 292, 294, "MMT=millimeter, CMT=centimeter, MTR=meter"),
                new FormatLayout(31, "Stauscode", 295, 297, "84E=inlopend, 94E=Uitlopend"),
                new FormatLayout(32, "CBS-code", 298, 309),
                new FormatLayout(33, "Leveranciersomschrijving", 310, 359),
                new FormatLayout(34, "Ingangsdatum artikel", 360, 367, "Datum effectief (EEJJMMDD)"),
                new FormatLayout(35, "Mutatiedatum", 368, 375, "Datum van mutatie (EEJJMMDD) vervalt bij aan te leveren bestanden"),
                new FormatLayout(36, "n.v.t.", 376, 377, "Verplicht CR/LF  ACSII code: carriage return/Line feed")
        ));
        return layouts;
    }

    public static ArrayList<FormatLayout> getLayouts()
    {
        return layouts;
    }
}
