name := """lens-test"""

version := "1.0"

//scalaVersion := "2.11.7"

libraryDependencies += "org.scalatest" %% "scalatest" % "2.1.7" % "test"


//resolvers += Resolver.sonatypeRepo("releases")

//resolvers += Resolver.sonatypeRepo("snapshots")

scalaVersion := "2.11.8"    // or "2.10.6"

val libraryVersion = "1.2.2"     // or "1.3.0-SNAPSHOT"

libraryDependencies ++= Seq(
  "com.github.julien-truffaut"  %%  "monocle-core"    % libraryVersion,
  "com.github.julien-truffaut"  %%  "monocle-generic" % libraryVersion,
  "com.github.julien-truffaut"  %%  "monocle-macro"   % libraryVersion,        
  "com.github.julien-truffaut"  %%  "monocle-state"   % libraryVersion,     
  "com.github.julien-truffaut"  %%  "monocle-refined" % libraryVersion,
  "com.github.julien-truffaut"  %%  "monocle-law"     % libraryVersion % "test" 
)

// for @Lenses macro support
addCompilerPlugin("org.scalamacros" %% "paradise" % "2.1.0" cross CrossVersion.full)

