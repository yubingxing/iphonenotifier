name := "iphonenotifier"

version := "1.0"

scalaVersion := "2.9.2"

resolvers ++= Seq(
	Classpaths.typesafeResolver,
	"Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"
)

libraryDependencies ++= Seq(
	"ch.qos.logback" % "logback-classic" % "1.0.0" % "runtime",
	"org.slf4j" % "slf4j-api" % "1.6.4",
	"com.typesafe.akka" % "akka-actor" % "2.0.2",
	"com.typesafe.akka" % "akka-remote" % "2.0.2",
	"com.rabbitmq" % "amqp-client" % "2.8.4",
	"org.codehaus.jackson" % "jackson-core-asl" % "1.9.8" % "compile",
	"org.codehaus.jackson" % "jackson-mapper-asl" % "1.9.8" % "compile",
	"org.functionaljava" % "functionaljava" % "3.1",
	"com.notnoop.apns" % "apns" % "0.1.6",
	"net.lag" % "configgy" % "2.0.0",
	"junit" % "junit" % "4.7" % "test",
	"org.scalatest" % "scalatest_2.9.0" % "1.8" % "test",
	"com.typesafe.akka" % "akka-testkit" % "2.0.2" % "test",
	"org.mockito" % "mockito-all" % "1.9.0" % "test"
)