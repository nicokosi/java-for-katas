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
  sourceCompatibility = JavaVersion.VERSION_14
  targetCompatibility = JavaVersion.VERSION_14
}

tasks.compileJava {
  options.compilerArgs.add("--enable-preview")
}

tasks.compileTestJava {
  options.compilerArgs.add("--enable-preview")
}

tasks.test {
  useJUnitPlatform()
  jvmArgs("--enable-preview")
}

repositories {
  mavenCentral()
  jcenter()
}

dependencies {
  testImplementation("org.junit.jupiter", "junit-jupiter-api", "5.6.0")
  testImplementation("org.junit.jupiter", "junit-jupiter-params", "5.6.0")
  testImplementation("org.junit.jupiter", "junit-jupiter-engine", "5.6.0")
  testImplementation("org.assertj", "assertj-core", "3.15.0")
  testImplementation("org.mockito", "mockito-core", "3.3.3")
  testImplementation("net.jqwik", "jqwik", "1.2.4")
}

tasks.withType<Test> {
  useJUnitPlatform()
}
