organization in ThisBuild := "com.knoldus"

name := "scala-test-demo"

version := "1.0.0-SNAPSHOT"

scalaVersion := "2.12.6"

scapegoatVersion in ThisBuild := "1.3.8"

libraryDependencies ++= Seq("org.scalatest" %% "scalatest" % "3.0.4" % "test","org.mockito" % "mockito-core" % "3.2.4")



