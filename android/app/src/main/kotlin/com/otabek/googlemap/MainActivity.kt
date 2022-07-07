package com.otabek.googlemap

import androidx.annotation.NonNull
import io.flutter.embedding.android.FlutterActivity
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.plugins.GeneratedPluginRegistrant
import com.yandex.mapkit.MapKitFactory

class MainActivity: FlutterActivity() {
  override fun configureFlutterEngine(@NonNull flutterEngine: FlutterEngine) {
    MapKitFactory.setLocale("YOUR_LOCALE") // Your preferred language. Not required, defaults to system language
    MapKitFactory.setApiKey("4807dbe1-0229-4a02-8361-ced2a730bc92") // Your generated API key
    super.configureFlutterEngine(flutterEngine)
  }
}