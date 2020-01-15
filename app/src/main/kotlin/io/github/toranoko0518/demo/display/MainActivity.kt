package io.github.toranoko0518.demo.display

import android.os.Bundle
import android.util.DisplayMetrics
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val metrics = DisplayMetrics()
        windowManager.defaultDisplay.getRealMetrics(metrics)

        val width = metrics.widthPixels
        val height = metrics.heightPixels

        val xdpi = metrics.xdpi
        val ydpi = metrics.ydpi

        val x = width / xdpi
        val y = height / ydpi
        val inch = sqrt((x * x) + (y * y))

        Log.d("Display", "Width: $width, Height: $height, Inch: $inch")
    }
}
