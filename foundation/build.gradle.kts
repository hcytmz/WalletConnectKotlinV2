import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("java-library")
    kotlin("jvm")
    id("com.google.devtools.ksp") version kspVersion
}

java {
    sourceCompatibility = jvmVersion
    targetCompatibility = jvmVersion
}

tasks.withType<KotlinCompile>() {
    kotlinOptions {
        jvmTarget = jvmVersion.toString()
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}

dependencies {
    scarlet()
    okhttp()
    koinJvm()
    moshi()
    moshiKsp()
    bouncyCastle()
    multibaseJava()
    restEasyJava()

    jUnit5()
    mockk()
}
