package FileReader;


import Data.Type;

import java.sql.*;
import java.util.ArrayList;

public class SESReader
{
    private final String pathToTypes;

    private ArrayList<Type> types;

    public SESReader(String pathToTypes)
    {
        this.pathToTypes = pathToTypes;
        this.types = importFullChannel();
    }

    //imports full channel cell from a types.ses
    public ArrayList<Type> importFullChannel()
    {
        ArrayList<Type> types = new ArrayList<>();
        String databaseURL = "jdbc:ucanaccess://" + pathToTypes;
        try
        {
            Connection connection = DriverManager.getConnection(databaseURL);
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM TypeProperties WHERE TypeProperties.TypePropertyID = 13010010 ORDER BY TypeProperties.TypeCounter, TypeProperties.TypePropertyID";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next())
            {
                types.add(new Type(rs.getInt("TypeCounter"), rs.getInt("TypePropertyID"),rs.getString("TypeProperty")));
            }
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        return types;
    }

    public ArrayList<Type> getTypes()
    {
        return types;
    }
}
