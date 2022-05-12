lazy val baseSettings: Seq[Setting[_]] = Seq(
  scalaVersion := "2.13.8",
  scalacOptions ++= Seq(
    "-deprecation",
    "-encoding",
    "UTF-8",
    "-feature",
    "-language:higherKinds",
    "-language:implicitConversions",
    "-language:existentials",
    "-unchecked",
    "-Ywarn-numeric-widen",
    "-Ywarn-value-discard"
  ),
  resolvers += Resolver.sonatypeRepo("releases")
)

lazy val mdocModule: Seq[Setting[_]] = Seq(
    mdocIn := baseDirectory.value / "mdoc",
    mdocOut := baseDirectory.value / "./docs",
    watchSources ++= (mdocIn.value ** "*.html").get,
)

lazy val `decline-for-ciris` = project
  .in(file("decline-for-ciris"))
  .settings(moduleName := "decline-for-ciris")
  .settings(baseSettings: _*)
  .settings(mdocModule: _*)
  .settings(
    libraryDependencies ++= Seq(
      "com.beachape" %% "enumeratum" % "1.7.0",
      "com.monovore" %% "decline" % "2.2.0",
      "com.monovore" %% "decline-effect" % "2.2.0",
      "com.monovore" %% "decline-enumeratum" % "2.0.0",
      "is.cir" %% "ciris" % "2.3.2",
      "is.cir" %% "ciris-enumeratum" % "2.3.2",
      "org.typelevel" %% "cats-core" % "2.7.0"
    )
  )
  .enablePlugins(MdocPlugin)

lazy val `byo-web-token` = project
  .in(file("byo-web-token"))
  .settings(moduleName := "byo-web-token")
  .settings(baseSettings: _*)
  .settings(mdocModule: _*)
  .settings(
    libraryDependencies ++= Seq(

    )
  )
  .enablePlugins(MdocPlugin)