plugins {
    kotlin("jvm") version "1.6.10"
    application
}

application {
    this.mainClass.set("fr.stardustenterprises.rust.tests.Main")
}

dependencies {
    implementation("fr.stardustenterprises", "yanl", "0.4.0")
}