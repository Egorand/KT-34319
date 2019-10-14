package com.squareup.egor.kt34319

import android.app.Application
import android.util.Log
import com.squareup.egor.kt34319.backend.Event
import com.squareup.egor.kt34319.backend.Event.Profile

class MyApplication : Application() {
  override fun onCreate() {
    super.onCreate()

    val event: Event = Profile(customerId = "customer1")
    Log.d("KT-34319", event.toString())
  }
}
