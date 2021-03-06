name := "datomisca-accounts-sample"

organization := "pellucidanalytics"

version := "0.1"

scalaVersion := "2.11.8"
crossScalaVersions := Seq("2.11.8","2.12.1")

fork in test := true

resolvers += "clojars" at "https://clojars.org/repo"

libraryDependencies ++= Seq(
  "llc.flyingwalrus" %% "datomisca-core" % "0.7.1-SNAPSHOT",
  "com.datomic" % "datomic-free" % "0.9.5544"
)
