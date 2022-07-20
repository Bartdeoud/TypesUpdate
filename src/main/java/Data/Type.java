package Data;

public class Type
{
    private final int typeCounter;
    private final int typePropertyID;
    private final String typeProperty;

    public Type(int typeCounter, int typePropertyID, String typeProperty)
    {
        this.typeCounter = typeCounter;
        this.typePropertyID = typePropertyID;
        this.typeProperty = typeProperty;
    }

    public int getTypeCounter()
    {
        return typeCounter;
    }

    public int getTypePropertyID()
    {
        return typePropertyID;
    }

    public String getTypeProperty()
    {
        return typeProperty;
    }
}
