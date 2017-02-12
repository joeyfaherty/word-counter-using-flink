name := "word-counter-using-flink"

version := "1.0"

organization := "com.home.joey"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "org.apache.flink" %% "flink-scala" % "1.1.3",
  "org.apache.flink" %% "flink-streaming-scala" % "1.1.3"
)