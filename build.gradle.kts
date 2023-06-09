group = "org.nicokosi"
version = "1.0-SNAPSHOT"
description = "A basic Java project with test libraries for katas"

plugins {
  id("com.adarshr.test-logger") version ("3.2.0")
  id("java")
  id("se.patrikerdes.use-latest-versions") version ("0.2.18")
  id("com.github.ben-manes.versions") version ("0.47.0")
}

java {
  toolchain {
    languageVersion.set(JavaLanguageVersion.of(19))
  }
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
  testImplementation("org.junit.jupiter:junit-jupiter:5.9.3")
  testImplementation("org.assertj", "assertj-core", "3.24.2")
  testImplementation("org.mockito", "mockito-core", "5.4.0")
  testImplementation("net.jqwik", "jqwik", "1.7.3")
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
