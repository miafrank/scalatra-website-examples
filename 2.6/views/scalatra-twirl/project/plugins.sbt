addSbtPlugin("org.scalatra.sbt" % "sbt-scalatra" % "1.0.0")
addSbtPlugin("com.typesafe.sbt" % "sbt-twirl"    % "1.3.7")

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature")
