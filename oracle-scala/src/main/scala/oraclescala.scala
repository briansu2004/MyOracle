import oracle.jdbc.datasource.impl.OracleDataSource

object oraclescala extends App {
  def read_data(): Unit = {
    val oracleUser = "system"
    val oraclePassword = "admin"
    val oracleURL = "jdbc:oracle:thin:@//localhost:1521/xe"
    val ods = new OracleDataSource()
    ods.setUser(oracleUser)
    ods.setURL(oracleURL)
    ods.setPassword(oraclePassword)
    val con = ods.getConnection()

    val query = "select 'Hello World' from dual"
    val statement = con.prepareStatement(query)
    val resultSet = statement.executeQuery(query)
    while (resultSet.next()) {
      System.out.println(resultSet.getString(1));
    }
  }

  read_data()
}
