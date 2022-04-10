# MyOracle

My Oracle

Oracle is still used in lots of places.

How to make it work well with Cloud is a common question.

## Oracle XE 21c

https://www.oracle.com/il-en/database/technologies/appdev/xe/quickstart.html

### Install Oracle XE 21c at local

### Connect Oracle XE 21c with SQL Developer

![](image/README/oracle_sqldeveloper.png)

### Connect Oracle XE 21c with Java and ojdbc8.jar

download ojdbc8.jar

manually add to maven

![](image/README/oracle_java.png)

### Connect Oracle XE 21c with NodeJS

npm i oracledb

![](image/README/oracle_nodejs.png)

### Connect Oracle XE 21c with Python

pip install cx-Oracle

![](image/README/oracle_python.png)

### Connect Oracle XE 21c with C#

nuget OracleAccess

![](image/README/oracle_csharp.png)

### Connect Oracle XE 21c with Scala

sbt

```
// https://mvnrepository.com/artifact/com.oracle.database.jdbc/ojdbc8
libraryDependencies += "com.oracle.database.jdbc" % "ojdbc8" % "21.3.0.0"

// https://mvnrepository.com/artifact/com.oracle.ojdbc/orai18n
libraryDependencies += "com.oracle.ojdbc" % "orai18n" %  "19.3.0.0"
```

![](image/README/oracle_scala.png)
