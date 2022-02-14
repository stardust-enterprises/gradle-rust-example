plugins {
    kotlin("jvm") version "1.6.10"
    application
    id("fr.stardustenterprises.rust.importer") version "3.0.0-SNAPSHOT"
    id("com.github.johnrengelman.shadow") version "5.0.0"
}

application {
    mainClassName = "fr.stardustenterprises.rust.tests.Main"
    this.mainClass.set(mainClassName)
}

dependencies {
    implementation("fr.stardustenterprises", "yanl", "0.7.0")
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