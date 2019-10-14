package com.squareup.egor.kt34319.backend

sealed class Event {
  data class Profile(val customerId: String) : Event()

  // To reproduce the issue:
  // - Ensure you have kotlin.build.report.enable=true and kotlin.build.report.verbose=true flags
  //   in any of the gradle.properties files
  // - Build the project with ./gradlew :app:assembleDebug
  // - Uncomment the code line below
  // - Build again with the same command
  // - Observe the compilation report and notice that :presenters has been fully recompiled

  // data class Id5(val id: Int) : Event()
}
