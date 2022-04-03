@file:Suppress("DEPRECATION")

plugins {
    kotlin("jvm") version "1.6.10"
    application
    id("fr.stardustenterprises.rust.importer") version "3.2.0"
    id("com.github.johnrengelman.shadow") version "5.0.0"
}

val programMainClass = "fr.stardustenterprises.rust.tests.Main"

application {
    // deprecated, but needed for shadowJar (idk why either)
    this.mainClassName = programMainClass

    this.mainClass.set(programMainClass)
}

dependencies {
    implementation("fr.stardustenterprises", "yanl", "0.7.1")
    rust(project(":rust-library"))
}

rustImport {
    baseDir.set("/META-INF/natives")
    layout.set("hierarchical")
}

tasks {
    shadowJar {
        archiveClassifier.set("")
    }
}
