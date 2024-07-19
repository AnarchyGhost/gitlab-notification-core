val ktor_version: String by project
val kotlin_version: String by project
val logback_version: String by project
val mockk_version: String by project

plugins {
    kotlin("jvm") version "1.9.23"
    id("io.ktor.plugin") version "2.3.9"
    id("org.jetbrains.kotlin.plugin.serialization") version "1.9.23"
    id("maven-publish")
}

group = "com.anarchyghost"
version = "0.0.3"

application {
    mainClass.set("com.anarchyghost.ApplicationKt")

    val isDevelopment: Boolean = project.ext.has("development")
    applicationDefaultJvmArgs = listOf("-Dio.ktor.development=$isDevelopment")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("ch.qos.logback:logback-classic:$logback_version")
    testImplementation("io.mockk:mockk:$mockk_version")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.3")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

val githubPackagesUsername: String by project
val githubPackagesToken: String by project

publishing {
    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/anarchyghost/gitlab-notification-core")
            credentials {
                username = githubPackagesUsername
                password = githubPackagesToken
            }
        }
    }
    publications {
        register<MavenPublication>("gpr") {
            from(components["java"])
        }
    }
}
