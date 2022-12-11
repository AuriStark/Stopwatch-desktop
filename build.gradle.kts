import org.jetbrains.compose.compose
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    val kotlinVersion = "1.7.10"
    kotlin("jvm") version kotlinVersion
    kotlin("kapt") version kotlinVersion
    id("org.jetbrains.compose") version "1.2.0"
    id("dev.hydraulic.conveyor") version "1.2"
}

group = "auristark.github.io/Stopwatch-desktop/"
version = "2.2.0"

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

// region Work around temporary Compose bugs.
configurations.all {
    attributes {
        // https://github.com/JetBrains/compose-jb/issues/1404#issuecomment-1146894731
        attribute(Attribute.of("ui", String::class.java), "awt")
    }
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "17"
}

repositories {
    jcenter()
    mavenCentral()
    google()
    maven { url = uri("https://jitpack.io") }
    maven { url = uri("https://maven.pkg.jetbrains.space/public/p/compose/dev") }
}

configurations.all {
    attributes {
        // https://github.com/JetBrains/compose-jb/issues/1404#issuecomment-1146894731
        attribute(Attribute.of("ui", String::class.java), "awt")
    }
}

val daggerVersion by extra("2.44")

dependencies {
    linuxAmd64(compose.desktop.linux_x64)
    macAmd64(compose.desktop.macos_x64)
    macAarch64(compose.desktop.macos_arm64)
    //windowsAmd64(compose.desktop.windows_x64)

    // Material Icons extended
    implementation("org.jetbrains.compose.material:material-icons-extended-desktop:1.1.1")

    // Accompanist: Flow Row
    // implementation("com.google.accompanist:accompanist-flowlayout:0.22.0-rc")

    // Dagger : A fast dependency injector for Android and Java.
    kapt("com.google.dagger:dagger-compiler:$daggerVersion")
    kaptTest("com.google.dagger:dagger-compiler:$daggerVersion")

    // Cyclone : https://github.com/theapache64/cyclone
    implementation("com.theapache64:cyclone:1.0.0-alpha01")

    // Decompose : Decompose
    val decomposeVersion = "0.2.5"
    implementation("com.arkivanov.decompose:decompose-jvm:$decomposeVersion")
    implementation("com.arkivanov.decompose:extensions-compose-jetbrains-jvm:$decomposeVersion")

    // Force override the Kotlin stdlib version used by Compose to 1.7, as otherwise we can end up with a mix of 1.6 and 1.7 on our classpath.  

    val v = "1.7.10"
    for (m in setOf("linuxAmd64", "macAmd64", "macAarch64", "windowsAmd64")) {
        m("org.jetbrains.kotlin:kotlin-stdlib:$v")
        m("org.jetbrains.kotlin:kotlin-stdlib-jdk8:$v")
        m("org.jetbrains.kotlin:kotlin-stdlib-jdk7:$v")
    }
}

compose.desktop {
    application {
        mainClass = "MainKt"
    }
}