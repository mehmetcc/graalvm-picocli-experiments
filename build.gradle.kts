plugins {
    java
    application
    id("org.graalvm.buildtools.native") version "0.9.28"
}

group = "org.mehmetcc"
version = "1.0"

repositories {
    mavenCentral()
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(22)) // Ensure compatibility with GraalVM
    }
}

application {
    mainClass.set("org.mehmetcc.Main")  // Adjust this to your actual Main class
}

dependencies {
    implementation("info.picocli:picocli:4.7.5")
    annotationProcessor("info.picocli:picocli-codegen:4.7.5") // Optional for reflection-free builds
}

graalvmNative {
    binaries {
        named("main") {
            fallback = false  // Set to true if missing native support for some dependencies
            verbose = true
        }
    }
}

tasks.withType<JavaCompile> {
    options.release.set(22)  // Match this with your GraalVM version
}
