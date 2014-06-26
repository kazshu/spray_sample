organization  := "com.example"

version       := "0.2"

scalaVersion  := "2.10.4"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

libraryDependencies ++= {
  val akkaV = "2.3.3"
  val sprayV = "1.3.1"
  val specs2V = "2.3.12"
  Seq(
    "io.spray"            %   "spray-can"     % sprayV,
    "io.spray"            %   "spray-routing" % sprayV,
    "io.spray"            %   "spray-testkit" % sprayV  % "test",
    "com.typesafe.akka"   %%  "akka-actor"    % akkaV,
    "com.typesafe.akka"   %%  "akka-testkit"  % akkaV   % "test",
    "com.typesafe.akka"   %%  "akka-slf4j"    % akkaV,
    "org.specs2"          %%  "specs2"        % specs2V % "test"
  )
}

Revolver.settings

Twirl.settings