package Data;

public class DataTableRow
{
    private int kolom;
    private String veldnaam;
    private String toelichting;
    private int typePropertyID;

    public DataTableRow(int kolom, String veldnaam, String toelichting, int typePropertyID)
    {
        this.kolom = kolom;
        this.veldnaam = veldnaam;
        this.toelichting = toelichting;
        this.typePropertyID = typePropertyID;
    }

    public int getKolom()
    {
        return kolom;
    }

    public String getVeldnaam()
    {
        return veldnaam;
    }

    public String getToelichting()
    {
        return toelichting;
    }

    public int getTypePropertyID()
    {
        return typePropertyID;
    }

}
