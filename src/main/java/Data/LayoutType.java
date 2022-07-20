package Data;

public class LayoutType
{
    private final int counter;
    private final String description;
    private final LayoutAL layoutAL;

    public LayoutType(int counter, String description, LayoutAL layoutAL)
    {
        this.counter = counter;
        this.description = description;
        this.layoutAL = layoutAL;
    }

    public int getCounter()
    {
        return counter;
    }

    public String getDescription()
    {
        return description;
    }

    public LayoutAL getLayoutAL()
    {
        return layoutAL;
    }
}
