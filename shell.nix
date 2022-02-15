with import <nixpkgs> { };

{ pkgs ? import <nixpkgs> { }, jdk ? pkgs.openjdk8 }:
let
  jdkOverrideSbt = sbt.override { jre = jdk; };
in
pkgs.mkShell {
  name = "sbt-slides";
  buildInputs = [
    jdkOverrideSbt
    jdk
    nodejs-14_x
  ];
}
