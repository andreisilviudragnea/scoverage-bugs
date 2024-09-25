import sbt.Keys.startYear

name := "scala-playground"

version := "0.1"

scalaVersion := "2.13.15"

inThisBuild(
  Seq(
    crossScalaVersions := Seq("2.13.11"),
    tlBaseVersion := "0.1",
    organization := "io,dragnea",
    organizationName := "Andrei Silviu Dragnea",
    startYear := Some(2022),
    githubWorkflowJavaVersions := Seq(JavaSpec.oracle("20")),
    tlJdkRelease := Some(20),
    coverageFailOnMinimum := true,
    coverageMinimumStmtTotal := 100
  )
)

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.2.19" % Test,
  "com.typesafe.scala-logging" %% "scala-logging" % "3.9.5"
)
