group = "org.nicokosi"
version = "1.0-SNAPSHOT"
description = "A basic Java project with test libraries for katas"

plugins {
  id("com.adarshr.test-logger") version ("2.0.0")
  id("java")
  id("se.patrikerdes.use-latest-versions") version ("0.2.17")
  id("com.github.ben-manes.versions") version ("0.39.0")
}

java {
  sourceCompatibility = JavaVersion.VERSION_17
  targetCompatibility = JavaVersion.VERSION_17
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
}

dependencies {
  testImplementation("org.junit.jupiter", "junit-jupiter-api", "5.8.2")
  testImplementation("org.junit.jupiter", "junit-jupiter-params", "5.8.2")
  testImplementation("org.junit.jupiter", "junit-jupiter-engine", "5.8.2")
  testImplementation("org.assertj", "assertj-core", "3.22.0")
  testImplementation("org.mockito", "mockito-core", "4.3.1")
  testImplementation("net.jqwik", "jqwik", "1.6.5")
}

tasks.withType<Test> {
  useJUnitPlatform()
}

fun isNonStable(version: String): Boolean {
    val stableKeyword = listOf("RELEASE", "FINAL", "GA").any { version.toUpperCase().contains(it) }
    val regex = "^[0-9,.v-]+(-r)?$".toRegex()
    val isStable = stableKeyword || regex.matches(version)
    return isStable.not()
}

tasks.withType<com.github.benmanes.gradle.versions.updates.DependencyUpdatesTask> {
  rejectVersionIf {
    isNonStable(candidate.version)
  }
}
