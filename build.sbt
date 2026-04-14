val zioVersion = "2.1.25"

ThisBuild / name := "temp-scala-security-vulns-watcher"
ThisBuild / organization := "rorschach"
ThisBuild / version := "0.0.1"
ThisBuild / scalaVersion := "3.7.3"

lazy val root = project
  .in(file("."))
  .settings(
    libraryDependencies ++= Seq(
      "dev.zio" %% "zio"               % zioVersion,
      "dev.zio" %% "zio-http"          % "3.10.1",
      "io.getquill" %% "quill-zio"     % "4.8.6",
      "dev.zio" %% "zio-s3"            % "0.4.4",
//      "dev.zio" %% "zio-aws-core" % "7.42.33.1",
      "dev.zio" %% "zio-redis" % "1.2.1",
      "dev.zio" %% "zio-rocksdb" % "0.4.4",
      "dev.zio" %% "zio-dynamodb" % "1.0.0-RC24",
      "dev.zio" %% "zio-kafka" % "3.3.0",
      "dev.zio" %% "zio-json" % "0.9.1",
      "dev.zio" %% "zio-ftp" % "0.5.3",
      "dev.zio" %% "zio-test"          % zioVersion % Test,
      "dev.zio" %% "zio-test-sbt"      % zioVersion % Test,
      "dev.zio" %% "zio-test-magnolia" % zioVersion % Test
    ),
    testFrameworks := Seq(new TestFramework("zio.test.sbt.ZTestFramework"))
  )
