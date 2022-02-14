plugins {
    id("fr.stardustenterprises.rust.wrapper") version "3.0.0-SNAPSHOT"
}

rust {
    command.set("cargo")

    targets += defaultTarget()
}