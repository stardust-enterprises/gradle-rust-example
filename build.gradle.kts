plugins {
    id("fr.stardustenterprises.rust.wrapper") version "3.2.4" apply false
}

subprojects {
    group = "fr.stardustenterprises.rust.example"
    version = "3.0.0"

    repositories {
        mavenLocal()
        mavenCentral()
    }
}
