//pluginManagement {
//    repositories {
//        mavenLocal()
//        gradlePluginPortal()
//        jcenter()
//        mavenCentral()
//        maven { setUrl("https://dl.bintray.com/kotlin/kotlinx") }
//        maven { setUrl("https://dl.bintray.com/kotlin/kotlin-eap") }
//        maven { setUrl("https://dl.bintray.com/kotlin/kotlin-dev") }
//    }
//
////  resolutionStrategy {
////    eachPlugin {
////      when (requested.id.id) {
//////        "kotlin-dce-js" -> useModule("org.jetbrains.kotlin:kotlin-gradle-plugin:${requested.version}")
//////        "kotlinx-serialization" -> useModule("org.jetbrains.kotlin:kotlin-serialization:${requested.version}")
//////        "org.jetbrains.kotlin.multiplatform" -> useModule("org.jetbrains.kotlin:kotlin-gradle-plugin:${target.version}")
////      }
////    }
////  }
//}

rootProject.name = "solution-bonus-sample"
include("solution-bonus-impl")
include("sample-android")
include("solution-bonus-api")
include("solution-ab-api")
include("lib-basic")
include("entity-ticket")
include("sample-di")
include("ios-kotlin-pod")
