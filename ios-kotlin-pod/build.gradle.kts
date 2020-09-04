import org.jetbrains.kotlin.gradle.plugin.cocoapods.CocoapodsExtension

plugins {
    kotlin("multiplatform")
    kotlin("native.cocoapods")
}
// CocoaPods requires the podspec to have a version.
version = "1.0"

kotlin {
    iosX64("iOS")
    cocoapods() {
        ios.deploymentTarget = "13.0"
        ios.name//read only
        summary = "solution-bonus-app-di module"
        homepage = "homepage placeholder"
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                api(project(":solution-bonus-impl"))
                api(project(":solution-bonus-api"))
                api(project(":solution-ab-api"))
                api(project(":lib-basic"))
                api(project(":entity-ticket"))
                api(project(":app-di"))
            }
        }
    }
}
