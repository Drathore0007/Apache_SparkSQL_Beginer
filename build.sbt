name := "sql-jar"

version := "0.1"

scalaVersion := "2.11.8"

//dependecies for spark jobserver project
resolvers += "Job Server Bintray" at "https://dl.bintray.com/spark-jobserver/maven"

libraryDependencies += "spark.jobserver" %% "job-server-api" % "0.8.0" % "provided"

libraryDependencies += "spark.jobserver" %% "job-server-extras" % "0.8.0" % "provided"


// https://mvnrepository.com/artifact/org.apache.spark/spark-core
libraryDependencies += "org.apache.spark" %% "spark-core" % "2.2.1"

// https://mvnrepository.com/artifact/org.apache.spark/spark-sql
libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.2.1"

// https://mvnrepository.com/artifact/org.apache.spark/spark-hive
libraryDependencies += "org.apache.spark" %% "spark-hive" % "2.2.1"

//libraryDependencies += "com.typesafe.play" % "play-json_2.11" % "2.5.5"
