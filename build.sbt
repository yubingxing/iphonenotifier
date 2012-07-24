name := "iphonenotifier"

version := "1.0"

scalaVersion := "2.9.2"

libraryDependencies ++= Seq(
	"org.slf4j" % "slf4j-api" % "1.6.4",
	"com.typesafe.akka" % "akka-actor" % "2.0.2",
	"org.scalatest" % "scalatest_2.9.0" % "1.8",
	"com.typesafe.akka" % "akka-testkit" % "2.0.2" % "test",
	"com.rabbitmq" % "amqp-client" % "2.8.2",
	"junit" % "junit" % "4.7" % "test",
	"org.mockito" % "mockito-all" % "1.9.0" % "test"
)