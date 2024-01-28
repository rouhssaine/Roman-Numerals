plugins {
    kotlin("jvm") version "1.9.21"
}

group = "org.codingdojo"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("org.junit.jupiter:junit-jupiter-params")
    testImplementation("org.amshove.kluent:kluent:1.73")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}
