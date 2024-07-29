import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "3.2.2"
	id("io.spring.dependency-management") version "1.0.8.RELEASE"
	kotlin("jvm") version "1.3.50"
	kotlin("plugin.spring") version "1.3.50"
	kotlin("plugin.jpa") version "1.3.50"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-actuator")
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.springframework.boot:spring-boot-starter-thymeleaf")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation("mysql:mysql-connector-java")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
	testImplementation("org.springframework.boot:spring-boot-starter-test") {
		exclude(group = "org.junit.vintage", module = "junit-vintage-engine")
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "1.8"
	}
}


//---
//
//buildscript {
//	ext {
//		kotlinVersion = '1.2.71'
//		springBootVersion = '2.2.0.RELEASE'
//	}
//	repositories {
//		mavenCentral()
//	}
//	dependencies {
//		classpath("org.springframework.boot:spring-boot-gradle-plugin:${springBootVersion}")
//		classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${kotlinVersion}")
//		classpath("org.jetbrains.kotlin:kotlin-allopen:${kotlinVersion}")
//	}
//}
//
//apply plugin: 'kotlin'
//apply plugin: 'kotlin-spring'
//apply plugin: 'eclipse'
//apply plugin: 'java'
//apply plugin: 'idea'
//apply plugin: 'org.springframework.boot'
//
//jar {
//	baseName = 'kotlin-jdbc'
//	version = '0.0.1-SNAPSHOT'
//}
//
//sourceCompatibility = 1.8
//
//repositories {
//	mavenCentral()
//}
//
//
//dependencies {
//	compile('org.springframework.boot:spring-boot-starter-data-jpa')
//	compile('org.springframework.boot:spring-boot-starter-thymeleaf')
//	compile('org.springframework.boot:spring-boot-starter-web')
//	compile("org.jetbrains.kotlin:kotlin-stdlib:${kotlinVersion}")
//	runtime('com.h2database:h2')
//	testCompile('org.springframework.boot:spring-boot-starter-test')
//
//	compile("org.springframework.boot:spring-boot-starter-web") {
//		exclude module: "spring-boot-starter-tomcat"
//	}
//	compile("org.springframework.boot:spring-boot-starter-jetty")
//	// end::jetty[]
//	// tag::actuator[]
//	compile("org.springframework.boot:spring-boot-starter-actuator")
//	// end::actuator[]
//	compile('org.springframework.boot:spring-boot-starter-data-jpa:1.4.3.RELEASE')
//
//	compile('mysql:mysql-connector-java:5.1.40')
//
//	testCompile("junit:junit")
//}
//
//
//task wrapper(type: Wrapper) {
//	gradleVersion = '2.3'
//}
