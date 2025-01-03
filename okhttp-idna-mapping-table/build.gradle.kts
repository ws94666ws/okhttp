plugins {
  kotlin("jvm")
  id("ru.vyarus.animalsniffer")
}

dependencies {
  api(libs.squareup.okio)
  api(libs.squareup.kotlinPoet)
  testImplementation(libs.assertk)
  testImplementation(libs.junit.jupiter.api)
  testImplementation(libs.junit.jupiter.params)

  testImplementation(rootProject.libs.junit.jupiter.engine)
}

animalsniffer {
  isIgnoreFailures = true
}
