name := "AkkaRad"

lazy val commonSettings = Seq(
  organization := "akka-rad",
  version := "0.1.0",
  scalaVersion := "2.12.6"
)

lazy val root = (project in file("."))
  .settings(
    commonSettings,
    name := "AkkaRad",
    description := "R&D using Akka HTTP, Actors and Stream",
    javacOptions ++= Seq("-source", "1.8", "-target", "1.8")
  )

libraryDependencies ++= {
  val akkaVersion = "2.5.14"
  val akkaHttpVersion = "10.1.3"
  Seq(
    "com.typesafe.akka" %% "akka-actor" % akkaVersion,
    "com.typesafe.akka" %% "akka-stream" % akkaVersion,
    "com.typesafe.akka" %% "akka-http" % akkaHttpVersion,
    "com.typesafe.akka" %% "akka-testkit" % akkaVersion % Test,
    "com.typesafe.akka" %% "akka-stream-testkit" % akkaVersion % Test,
    "com.typesafe.akka" %% "akka-http-testkit" % akkaHttpVersion % Test
  )
}