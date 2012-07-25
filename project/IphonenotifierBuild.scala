import sbt._
import sbt.Keys._
import Keys._

object IphonenotifierBuild extends Build {

  lazy val copyDependencies = TaskKey[Unit]("pack")

  def copyDepTask = copyDependencies <<= (update, crossTarget, scalaVersion) map {
    (updateReport, out, scalaVer) =>
      updateReport.allFiles foreach {
        srcPath =>
          val destPath = out / "lib" / srcPath.getName
          IO.copyFile(srcPath, destPath, preserveLastModified = true)
      }
  }

  lazy val iphonenotifier = Project(
    id = "iphonenotifier",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      copyDepTask,
      name := "iphonenotifier",
      organization := "com.icestar",
      version := "0.1-SNAPSHOT",
      scalaVersion := "2.9.2",
      resolvers += "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases"))
}
