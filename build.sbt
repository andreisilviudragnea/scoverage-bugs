inThisBuild(
  Seq(
    coverageFailOnMinimum := true,
    coverageMinimumStmtTotal := 100
  )
)

name := "scala-playground"

version := "0.1"

scalaVersion := "2.13.8"

inThisBuild(
  Seq(
    crossScalaVersions := Seq("2.13.8"),
    githubWorkflowPublishTargetBranches := Seq()
  )
)

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.2.12" % Test,
  "com.typesafe.scala-logging" %% "scala-logging" % "3.9.4"
)
