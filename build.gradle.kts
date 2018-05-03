import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

group = "com.github.saadfarooq"
version = "1.0-SNAPSHOT"

buildscript {
    var kotlin_version: String by extra
    kotlin_version = "1.2.0"

    repositories {
        mavenCentral()
    }
    
    dependencies {
        classpath(kotlinModule("gradle-plugin", kotlin_version))
    }
    
}

apply {
    plugin("kotlin")
}

val kotlin_version: String by extra

repositories {
    mavenCentral()
}

dependencies {
    compile(kotlinModule("stdlib-jdk8", kotlin_version))
    compile("io.swagger:swagger-parser:1.0.35")
    compile("com.squareup:kotlinpoet:0.7.0")
    compile("com.squareup.retrofit2:retrofit:2.4.0")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

