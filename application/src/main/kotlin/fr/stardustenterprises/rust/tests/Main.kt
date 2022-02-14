package fr.stardustenterprises.rust.tests

import fr.stardustenterprises.yanl.NativeLoader

object Main {
    private val nativeLoader = NativeLoader.Builder()
        .build()

    @JvmStatic
    fun main(args: Array<String>) {
        println("Hey from JVM!")

        nativeLoader.loadLibrary("test")

        rustNative()
    }

    private external fun rustNative()
}
