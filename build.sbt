version in ThisBuild := "0.1.0-SNAPSHOT"

scalaVersion in ThisBuild := "2.11.7"

lazy val root = (project in file("."))
  .settings(
    name := "GitHelloScala"
  )
