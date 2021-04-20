#!/bin/sh

JAVAC=${1:-${JAVAC:-javac}}
$JAVAC *.java
$JAVAC ppif_interfazexterna/*.java
