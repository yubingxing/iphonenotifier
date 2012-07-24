import sbt._
import sbt.Keys._

object IphonenotifierBuild extends Build {

  lazy val iphonenotifier = Project(
    id = "iphonenotifier",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "iphonenotifier",
      organization := "com.icestar",
      version := "0.1-SNAPSHOT",
      scalaVersion := "2.9.2",
      resolvers += "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases"
    )
  )
}
