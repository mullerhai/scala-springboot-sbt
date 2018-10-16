name := "scala-spring"

version := "0.1"

scalaVersion := "2.11.7"

//import sbt._
//import com.typesafe.sbt.packager.universal.UniversalPlugin.autoImport._
//import com.typesafe.sbt.packager.MappingsHelper._
//
//lazy val root = project in file(".") enablePlugins(JavaAppPackaging) settings(net.virtualvoid.sbt.graph.Plugin.graphSettings: _*)
//
//organization := "com.github.fujohnwang"
publishMavenStyle := true

publishTo := Some(Resolver.file("local .m2 repository",  new File(Path.userHome.absolutePath+"/.m2/repository")))

resolvers += "Local Maven Repository" at "file://"+Path.userHome.absolutePath+"/.m2/repository"

resolvers += "Central Maven Repository" at "http://repo1.maven.org/maven2/"

scalacOptions := Seq("-deprecation", "-unchecked","-optimise")

javacOptions ++= Seq("-source", "1.8", "-target", "1.8")


libraryDependencies += "ch.qos.logback" % "logback-core" % "1.1.2"

libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.1.2"

libraryDependencies += "org.slf4j" % "jcl-over-slf4j" % "1.7.12"

libraryDependencies += "org.slf4j" % "log4j-over-slf4j" % "1.7.12"

libraryDependencies += "io.dropwizard.metrics" % "metrics-core" % "3.1.2"

libraryDependencies += "org.springframework" % "spring-core" % "4.1.6.RELEASE" exclude("commons-logging", "commons-logging")

libraryDependencies += "org.springframework.boot" % "spring-boot" % "2.0.5.RELEASE"

libraryDependencies += "org.springframework.boot" % "spring-boot-autoconfigure" % "2.0.5.RELEASE"

libraryDependencies += "org.springframework.boot" % "spring-boot-starter-logging" % "2.0.5.RELEASE"

libraryDependencies += "org.yaml" % "snakeyaml" % "1.14"

libraryDependencies += "org.springframework.boot" % "spring-boot-starter-actuator" % "2.0.5.RELEASE"

libraryDependencies += "org.springframework.boot" % "spring-boot-starter-web" % "2.0.5.RELEASE"

mainClass := Some("com.example.Hello")

//mappings in Universal += file("LICENSE") -> "LICENSE"
//
//mappings in Universal ++= directory("conf")