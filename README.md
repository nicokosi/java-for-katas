# Java for katas [![Build Status](https://travis-ci.org/nicokosi/java-for-katas.svg?branch=master)](https://travis-ci.org/nicokosi/java-for-katas)

A basic Java setup for [code katas](http://wiki.c2.com/?CodeKata).

## Usage

Pre-requisites:

- Java Development Kit 15 minimum ([SDKMAN!](https://sdkman.io/) can be used for JDK installation)
- Integrated Development Environment compatible with this JDK version (for instance, [IntelliJ IDEA](https://www.jetbrains.com/idea/))

Either use your favorite IDE with [`Gradle`](https://gradle.org/) integration (for instance, [`IntelliJ IDEA`](https://www.jetbrains.com/idea/)) or run:

```sh
./gradlew test
```

## Suggested katas

- [Coffee machine](http://simcap.github.io/coffeemachine)

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
