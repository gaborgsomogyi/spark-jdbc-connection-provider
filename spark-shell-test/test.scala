import org.apache.spark.sql.execution.datasources.jdbc.DriverRegistry
import org.apache.spark.sql.execution.datasources.jdbc.JDBCOptions
import org.apache.spark.sql.execution.datasources.jdbc.JdbcUtils

sc.setLogLevel("DEBUG")

val driverClass = "org.postgresql.Driver"

DriverRegistry.register(driverClass)

val options = new JDBCOptions(Map[String, String](
  JDBCOptions.JDBC_URL -> "jdbc:postgresql://localhost/postgres",
  JDBCOptions.JDBC_TABLE_NAME -> "table",
  JDBCOptions.JDBC_KEYTAB -> "keytab",
  JDBCOptions.JDBC_PRINCIPAL -> "principal",
  JDBCOptions.JDBC_DRIVER_CLASS -> driverClass
))

val getConnection = JdbcUtils.createConnectionFactory(options)
getConnection()
