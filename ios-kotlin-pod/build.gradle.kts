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
        summary = "solution-bonus-sample module"
        homepage = "homepage placeholder"
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(project(":sample-di"))
            }
        }
    }
}
