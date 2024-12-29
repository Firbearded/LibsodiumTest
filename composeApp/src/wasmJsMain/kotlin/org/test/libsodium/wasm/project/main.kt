package org.test.libsodium.wasm.project

import ext.libsodium._libsodiumPromise
import ext.libsodium.org.test.libsodium.wasm.project.getSodium
import ext.libsodium.sodium_init

//@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    _libsodiumPromise.then {
        sodium_init()
        println("1")
        println(getSodium().crypto_auth_keygen())
        null
    }
}