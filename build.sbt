inThisBuild(
  Seq(
    coverageFailOnMinimum := true,
    coverageMinimumStmtTotal := 100
  )
)

name := "scala-playground"

version := "0.1"

scalaVersion := "2.13.7"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.2.10" % Test,
  "com.typesafe.scala-logging" %% "scala-logging" % "3.9.4"
)
