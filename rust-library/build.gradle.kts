plugins {
    id("fr.stardustenterprises.rust.wrapper") version "3.2.0"
}

rust {
    // Setting the global "default" vars
    release.set(true)

    // you can also use tools like "cross"
    command.set("cross")

    // this will make cargo install automatically the required targets
    // `rustup targets add x86_32-pc-windows-gnu`
    cargoInstallTargets.set(true)

    // Adding a simple target with default options
    targets += target("i686-pc-windows-gnu", "test.dll")

    // Defining per-targets
    targets {
        // Adds the default target
        this += defaultTarget().apply {
            command = "cargo"
        }

        // Creates a target with a custom file output
        create("win64") {
            target = "x86_64-pc-windows-gnu"
            outputName = "test64.dll"
        }

        // Custom target with different params than default
//        create("macOS") {
//            target = "x86_64-apple-darwin"
//            outputName = "libtest64.dylib"
//
//            release = false
//
//            // Fallback to cargo
//            command = "cargo"
//        }
    }
}
