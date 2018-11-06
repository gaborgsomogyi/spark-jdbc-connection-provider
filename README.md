spark-jdbc-connection-provider
==============================

### Introduction
Example Spark JDBC connection provider.

### Build the app
To build, you need Scala 2.12, git and maven on the box.
Do a git clone of this repo and then run:
```
cd spark-jdbc-connection-provider
mvn clean package
```

### Load it from spark-shell
```
cd spark
./bin/spark-shell
...
scala> :require ../spark-jdbc-connection-provider/target/spark-jdbc-connection-provider-1.0-SNAPSHOT-jar-with-dependencies.jar
scala> :load ../spark-jdbc-connection-provider/spark-shell-test/test.scala
```

### Example log
```
[gaborsomogyi:~/spark] SPARK-32001+ ± ./bin/spark-shell
20/09/29 11:35:35 WARN NativeCodeLoader: Unable to load native-hadoop library for your platform... using builtin-java classes where applicable
Using Spark's default log4j profile: org/apache/spark/log4j-defaults.properties
Setting default log level to "WARN".
To adjust logging level use sc.setLogLevel(newLevel). For SparkR, use setLogLevel(newLevel).
Spark context Web UI available at http://192.168.0.189:4040
Spark context available as 'sc' (master = local[*], app id = local-1601372139155).
Spark session available as 'spark'.
Welcome to
      ____              __
     / __/__  ___ _____/ /__
    _\ \/ _ \/ _ `/ __/  '_/
   /___/ .__/\_,_/_/ /_/\_\   version 3.1.0-SNAPSHOT
      /_/
         
Using Scala version 2.12.10 (OpenJDK 64-Bit Server VM, Java 1.8.0_265)
Type in expressions to have them evaluated.
Type :help for more information.

scala> :require ../spark-jdbc-connection-provider/target/spark-jdbc-connection-provider-1.0-SNAPSHOT-jar-with-dependencies.jar
Added '/Users/gaborsomogyi/spark/../spark-jdbc-connection-provider/target/spark-jdbc-connection-provider-1.0-SNAPSHOT-jar-with-dependencies.jar' to classpath.

scala> :load ../spark-jdbc-connection-provider/spark-shell-test/test.scala
Loading ../spark-jdbc-connection-provider/spark-shell-test/test.scala...
import org.apache.spark.sql.execution.datasources.jdbc.DriverRegistry
import org.apache.spark.sql.execution.datasources.jdbc.JDBCOptions
import org.apache.spark.sql.execution.datasources.jdbc.JdbcUtils
driverClass: String = org.postgresql.Driver
20/09/29 11:36:12 DEBUG JDBCOptions: Keytab path not found, assuming --files, file name used on executor: /private/var/folders/jd/35_sh46s7zq0qc6khfw8hc800000gn/T/spark-ebf9e149-2c70-4d01-b696-12b5dc05ea1f/userFiles-4a3baa3b-3750-4dad-9260-8a367a2aff19/keytab
options: org.apache.spark.sql.execution.datasources.jdbc.JDBCOptions = org.apache.spark.sql.execution.datasources.jdbc.JDBCOptions@faca8e8
getConnection: () => java.sql.Connection = org.apache.spark.sql.execution.datasources.jdbc.JdbcUtils$$$Lambda$1997/273743103@bcfe4ba
20/09/29 11:36:12 DEBUG ConnectionProvider: Loaded built in provider: org.apache.spark.sql.execution.datasources.jdbc.connection.BasicConnectionProvider@612a0d49
20/09/29 11:36:12 DEBUG ConnectionProvider: Loaded built in provider: org.apache.spark.sql.execution.datasources.jdbc.connection.DB2ConnectionProvider@12bd61b4
20/09/29 11:36:12 DEBUG ConnectionProvider: Loaded built in provider: org.apache.spark.sql.execution.datasources.jdbc.connection.MariaDBConnectionProvider@44d8e130
20/09/29 11:36:12 DEBUG ConnectionProvider: Loaded built in provider: org.apache.spark.sql.execution.datasources.jdbc.connection.MSSQLConnectionProvider@6ba4d5ff
20/09/29 11:36:12 DEBUG ConnectionProvider: Loaded built in provider: org.apache.spark.sql.execution.datasources.jdbc.connection.PostgresConnectionProvider@1268dff4
20/09/29 11:36:12 DEBUG ConnectionProvider: Loaded built in provider: org.apache.spark.sql.execution.datasources.jdbc.connection.OracleConnectionProvider@5bd9615c
20/09/29 11:36:12 INFO ExampleJdbcConnectionProvider: ExampleJdbcConnectionProvider instantiated
20/09/29 11:36:12 DEBUG ConnectionProvider: Loaded built in provider: com.spark.ExampleJdbcConnectionProvider@7cb95c36
20/09/29 11:36:12 DEBUG JDBCOptions: Keytab path not found, assuming --files, file name used on executor: /private/var/folders/jd/35_sh46s7zq0qc6khfw8hc800000gn/T/spark-ebf9e149-2c70-4d01-b696-12b5dc05ea1f/userFiles-4a3baa3b-3750-4dad-9260-8a367a2aff19/keytab
20/09/29 11:36:12 DEBUG JDBCOptions: Keytab path not found, assuming --files, file name used on executor: /private/var/folders/jd/35_sh46s7zq0qc6khfw8hc800000gn/T/spark-ebf9e149-2c70-4d01-b696-12b5dc05ea1f/userFiles-4a3baa3b-3750-4dad-9260-8a367a2aff19/keytab
20/09/29 11:36:12 DEBUG JDBCOptions: Keytab path not found, assuming --files, file name used on executor: /private/var/folders/jd/35_sh46s7zq0qc6khfw8hc800000gn/T/spark-ebf9e149-2c70-4d01-b696-12b5dc05ea1f/userFiles-4a3baa3b-3750-4dad-9260-8a367a2aff19/keytab
20/09/29 11:36:12 DEBUG JDBCOptions: Keytab path not found, assuming --files, file name used on executor: /private/var/folders/jd/35_sh46s7zq0qc6khfw8hc800000gn/T/spark-ebf9e149-2c70-4d01-b696-12b5dc05ea1f/userFiles-4a3baa3b-3750-4dad-9260-8a367a2aff19/keytab
20/09/29 11:36:12 DEBUG JDBCOptions: Keytab path not found, assuming --files, file name used on executor: /private/var/folders/jd/35_sh46s7zq0qc6khfw8hc800000gn/T/spark-ebf9e149-2c70-4d01-b696-12b5dc05ea1f/userFiles-4a3baa3b-3750-4dad-9260-8a367a2aff19/keytab
20/09/29 11:36:12 DEBUG JDBCOptions: Keytab path not found, assuming --files, file name used on executor: /private/var/folders/jd/35_sh46s7zq0qc6khfw8hc800000gn/T/spark-ebf9e149-2c70-4d01-b696-12b5dc05ea1f/userFiles-4a3baa3b-3750-4dad-9260-8a367a2aff19/keytab
java.lang.IllegalArgumentException: requirement failed: JDBC connection initiated but not exactly one connection provider found which can handle it. Found active providers: org.apache.spark.sql.execution.datasources.jdbc.connection.PostgresConnectionProvider@1268dff4, com.spark.ExampleJdbcConnectionProvider@7cb95c36
  at scala.Predef$.require(Predef.scala:281)
  at org.apache.spark.sql.execution.datasources.jdbc.connection.ConnectionProvider$.create(ConnectionProvider.scala:56)
  at org.apache.spark.sql.execution.datasources.jdbc.JdbcUtils$.$anonfun$createConnectionFactory$1(JdbcUtils.scala:66)
  ... 71 elided

scala> 
```
