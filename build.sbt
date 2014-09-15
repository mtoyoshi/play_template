name := """play_template"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.2"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws
)

// Defaultではmain.stylのみコンパイルされるとのことなので全て許可
includeFilter in (Assets, StylusKeys.stylus) := "*.styl"
