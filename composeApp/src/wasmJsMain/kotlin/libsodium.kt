@file:JsModule("libsodium-sumo")
package ext.libsodium

import kotlin.js.Promise

@JsName("ready")
external val _libsodiumPromise : Promise<JsAny>

@JsName("_sodium_init")
external fun sodium_init() : Int
