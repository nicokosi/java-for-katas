# Java for katas [![Build Status](https://github.com/nicokosi/java-for-katas/actions/workflows/ci.yml/badge.svg)](https://github.com/nicokosi/java-for-katas/actions/workflows/ci.yml)

A basic Java setup for [code katas](http://wiki.c2.com/?CodeKata).

## Usage

Pre-requisites:

- Java Development Kit 18 minimum ([SDKMAN!](https://sdkman.io/) can be used for JDK installation)
- Integrated Development Environment compatible with this JDK version (for instance, [IntelliJ IDEA](https://www.jetbrains.com/idea/))

Either use your favorite IDE with [`Gradle`](https://gradle.org/) integration (for instance, [`IntelliJ IDEA`](https://www.jetbrains.com/idea/)) or run:

```sh
./gradlew test
```

## Suggested katas

- [Coffee machine](http://simcap.github.io/coffeemachine)
- [FizzBuzz](https://codingdojo.org/kata/FizzBuzz/)

## Development tasks

### Upgrade the dependencies

```sh
./gradlew useLatestVersions
```

### Upgrade the build system

Check the current version in [the `Gradle` documentation](https://docs.gradle.org) and run
the following command with the correct value for `GRADLE_VERSION`:

```sh
export GRADLE_VERSION="x.y" \
  ./gradlew wrapper --gradle-version $GRADLE_VERSION
```
