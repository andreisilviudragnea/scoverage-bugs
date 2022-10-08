import sbt.Keys.startYear

name := "scala-playground"

version := "0.1"

scalaVersion := "2.13.10"

inThisBuild(
  Seq(
    crossScalaVersions := Seq("2.13.8"),
    tlBaseVersion := "0.1",
    organization := "io,dragnea",
    organizationName := "Andrei Silviu Dragnea",
    startYear := Some(2022),
    githubWorkflowJavaVersions := Seq(JavaSpec.temurin("17")),
    tlJdkRelease := Some(17),
    coverageFailOnMinimum := true,
    coverageMinimumStmtTotal := 100
  )
)

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.2.14" % Test,
  "com.typesafe.scala-logging" %% "scala-logging" % "3.9.5"
)
