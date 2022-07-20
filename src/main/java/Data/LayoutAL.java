package Data;

public class LayoutAL
{
    private final int kolom;
    private final String veldnaam;
    private final int begin;
    private final int eind;
    private String toelichting;

    //the layout for the format artlev
    public LayoutAL(int kolom, String veldnaam, int begin, int eind, String toelichting)
    {
        this.kolom = kolom;
        this.veldnaam = veldnaam;
        this.begin = begin;
        this.eind = eind;
        this.toelichting = toelichting;
    }

    public LayoutAL(int kolom, String veldnaam, int begin, int eind)
    {
        this.kolom = kolom;
        this.veldnaam = veldnaam;
        this.begin = begin;
        this.eind = eind;
    }

    public int getKolom()
    {
        return kolom;
    }

    public String getVeldnaam()
    {
        return veldnaam;
    }

    public int getBegin()
    {
        return begin;
    }

    public int getEind()
    {
        return eind;
    }

    public String getToelichting()
    {
        return toelichting;
    }
}
