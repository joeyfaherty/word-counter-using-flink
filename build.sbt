name := "word-counter-using-flink"

version := "1.0"

organization := "com.home.joey"

scalaVersion := "2.11.7"

val flinkVersion = "1.2.0"

libraryDependencies ++= Seq(
  "org.apache.flink" %% "flink-scala" % flinkVersion,
  "org.apache.flink" %% "flink-streaming-scala" % flinkVersion
)