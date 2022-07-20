package Data;

public class LineType
{
    private String[] line;
    private Type type;

    public LineType(String[] line, Type type)
    {
        this.line = line;
        this.type = type;
    }

    public String[] getLine()
    {
        return line;
    }

    public Type getType()
    {
        return this.type;
    }
}
