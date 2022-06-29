package fr.stardustenterprises.rust.test

import fr.stardustenterprises.plat4k.EnumOperatingSystem
import fr.stardustenterprises.yanl.NativeLoader

object Main {
    private val loader = NativeLoader.Builder()
        .build()

    @JvmStatic
    fun main(args: Array<String>) {
        println("Hey from !!!!JVM!!!!")

        println("os.name: " + System.getProperty("os.name"))
        println("os: " + EnumOperatingSystem.currentOS)

        loader.loadLibrary("test")

        rustNative()
    }

    private external fun rustNative()
}
