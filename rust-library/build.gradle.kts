plugins {
    id("fr.stardustenterprises.rust.wrapper") version "3.1.0"
}

rust {
    // you can also use tools like "cross"
    command.set("cargo")

    targets += defaultTarget()
    targets += "x86_64-pc-windows-gnu" to "test64.dll"
}