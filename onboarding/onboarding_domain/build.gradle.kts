apply {
    from("$rootDir/gradle/script/base-module.gradle")
}

dependencies {
    "implementation"(project(Modules.core))
}