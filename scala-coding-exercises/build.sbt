import sbt.Keys.libraryDependencies

ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.5"

lazy val root = (project in file("."))
  .settings(
    name := "scala-coding-exercises",
//    libraryDependencies += "org.scalameta" %% "munit" % "1.1.0" % Test
    libraryDependencies ++= Seq(
      "org.scalameta" %% "munit" % "1.1.0" % Test, 
      "org.creativescala" %% "doodle" % "0.28.0"
    )
  )


