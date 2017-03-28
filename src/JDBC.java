import java.sql.*;

/**
 * Created by Jacob on 28-03-2017.
 */
public class JDBC {
    private String userName = "sa";
    private String password = "";

    private String port = "1433";
    private String databaseName = "DB_March";

    private Connection con = null;

    private Statement stmt = null;
    private PreparedStatement ps = null;

    /**
     * Open the connection to the database
     */
    public void openConnection()  {
        // Step 1 connect
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:"+port+";databaseName="+databaseName,userName,password);
        } catch (SQLException | ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
    }

    /**
     * An example on how to insert with prepared statement. In the SQL code we set a ? as a placement, then afterwards
     * we use the prepared statement to set the ints and Strings. The code is more readable then if we wrote all of it
     * inside the SQL Code.
     * @param emoNo
     * @param empFirstName
     * @param empLastName
     * @param empHeight
     * @param empStart
     * @throws SQLException
     */
    public void insert(int emoNo, String empFirstName, String empLastName, double empHeight, java.sql.Date empStart) throws SQLException {
        ps = con.prepareStatement("INSERT INTO employee VALUES (?, ?, ?, ?, ?)");

        ps.setInt(1, emoNo);
        ps.setString(2, empFirstName);
        ps.setString(3, empLastName);
        ps.setDouble(4, empHeight);
        ps.setDate(5, empStart);

        int rows = ps.executeUpdate();
        System.out.println("Rows affected: " + rows);
        ps.close();
    }

    /**
     * Gets column names inside a table and the size of the column, this is using the ResultSet.
     * @throws SQLException
     */
    public void selectAll( ) throws SQLException{
        ps = con.prepareStatement("SELECT * FROM employee");
        ResultSet rs = ps.executeQuery();

        ResultSetMetaData rsmd = rs.getMetaData();

        // Headings

        for (int col = 1; col <= rsmd.getColumnCount(); col++) {
            String name = rsmd.getColumnName(col);
            System.out.print(name + " " + " Size: " + rsmd.getColumnDisplaySize(col));
            System.out.println();
        }

        System.out.println();

        System.out.println("Column size: " + rsmd.getColumnCount());

        System.out.println();

        ps.close();
    }
}
