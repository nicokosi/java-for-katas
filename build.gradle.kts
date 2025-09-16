group = "org.nicokosi"
version = "1.0-SNAPSHOT"
description = "A basic Java project with test libraries for katas"

plugins {
  id("java")
  alias(libs.plugins.ben.manes.versions)
  alias(libs.plugins.test.logger)
  alias(libs.plugins.use.latest.versions)
}

java {
  toolchain {
    languageVersion.set(JavaLanguageVersion.of(25))
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
  testImplementation(libs.assertj.core)
  testImplementation(libs.jqwik)
  testImplementation(libs.junit.jupiter)
  testImplementation(libs.mockito.core)
  testImplementation(platform(libs.junit.bom))
  testRuntimeOnly(libs.junit.platform.launcher)
}

tasks.withType<Test> {
  useJUnitPlatform()
}

fun isNonStable(version: String): Boolean {
  val stableKeyword = listOf("RELEASE", "FINAL", "GA").any { version.uppercase().contains(it) }
  val regex = "^[0-9,.v-]+(-r)?$".toRegex()
  val isStable = stableKeyword || regex.matches(version)
  return isStable.not()
}

tasks.withType<com.github.benmanes.gradle.versions.updates.DependencyUpdatesTask> {
  rejectVersionIf {
    isNonStable(candidate.version)
  }
}
