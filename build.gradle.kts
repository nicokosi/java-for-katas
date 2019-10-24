group = "org.nicokosi"
version = "1.0-SNAPSHOT"
description = "A basic Java project with test libraries for katas"

plugins {
  id("com.adarshr.test-logger") version ("2.0.0")
  id("java")
  id("se.patrikerdes.use-latest-versions") version ("0.2.12")
  id("com.github.ben-manes.versions") version ("0.27.0")
}

java {
  sourceCompatibility = JavaVersion.VERSION_11
  targetCompatibility = JavaVersion.VERSION_11
}

repositories {
  mavenCentral()
  jcenter()
}

dependencies {
  testImplementation("org.junit.jupiter", "junit-jupiter-api", "5.5.2")
  testImplementation("org.junit.jupiter", "junit-jupiter-params", "5.5.2")
  testImplementation("org.junit.jupiter", "junit-jupiter-engine", "5.5.2")
  testImplementation("org.assertj", "assertj-core", "3.13.2")
  testImplementation("org.mockito", "mockito-core", "3.1.0")
  testImplementation("net.jqwik", "jqwik", "1.2.0")
}

tasks.withType<Test> {
  useJUnitPlatform()
}
