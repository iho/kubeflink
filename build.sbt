ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.12.20"

lazy val root = (project in file("."))
  .settings(
    name := "kubeflink"
  )
val flinkVersion = "1.20.0" // Replace with your Flink version

libraryDependencies ++= Seq(
  "org.apache.flink" %% "flink-scala" % flinkVersion % "provided",
  "org.apache.flink" %% "flink-streaming-scala" % flinkVersion % "provided"
  // Add other Flink dependencies as needed (e.g., connectors)
)

// For creating an executable JAR (uber-jar)
assembly / mainClass := Some("Hell.scala") // Replace with your main class
assembly / assemblyMergeStrategy := {
  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case x => MergeStrategy.first
}
