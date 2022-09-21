import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.10"
    application
}

group = "gemsvido"
version = "0.1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.j2html", "j2html", "1.4.0")
    implementation("org.json", "json", "20160810")
    implementation("io.javalin", "javalin", "5.0.0.RC2")
    implementation("org.slf4j", "slf4j-simple", "2.0.1")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "16"
}

application {
    mainClass.set("MainKt")
}