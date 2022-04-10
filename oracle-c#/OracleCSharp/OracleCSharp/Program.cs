
// Connection string format: User Id=[username];Password=[password];Data Source=[hostname]:[port]/[DB service name];
using Oracle.ManagedDataAccess.Client;

try
{
    String myConnectionString = "User Id=system;Password=admin;Data Source=localhost:1521/xe";
    OracleConnection con = new OracleConnection();
    con.ConnectionString = myConnectionString;
    con.Open();
    OracleCommand cmd = con.CreateCommand();
    cmd.CommandText = "SELECT \'Hello World!\' FROM dual";

    OracleDataReader reader = cmd.ExecuteReader();
    reader.Read();
    Console.WriteLine(reader.GetString(0));
} catch (Exception ex)
{
    Console.WriteLine("Error: " + ex.Message);
}