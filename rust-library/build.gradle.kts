plugins {
    id("fr.stardustenterprises.rust.wrapper") version "3.2.0"
}

rust {
    // Setting the global "default" vars
    release.set(true)

    // you can also use tools like "cross"
    command.set("cross")

    // Adding a simple target with default options
    target("x86_32-pc-windows-gnu" to "test.dll")

    // Defining per-targets
    targets {
        // Adds the default target
        this += defaultTarget()

        // Creates a target with a custom file output
        create("win32") {
            target = "x86_64-pc-windows-gnu"
            outputName = "test64.dll"
        }

        // Custom target with different params than default
        create("macOS") {
            target = "x86_64-apple-darwin"
            outputName = "libtest64.dylib"

            release = false

            // Fallback to cargo
            command = "cargo"
        }
    }
}
