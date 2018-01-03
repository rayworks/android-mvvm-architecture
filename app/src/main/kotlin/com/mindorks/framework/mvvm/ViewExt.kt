package com.mindorks.framework.mvvm

import android.view.View
import android.view.animation.Animation
import android.view.animation.ScaleAnimation

/**
 * Created by Sean on 1/3/18.
 */
fun View.scaleAnimateView() {
    val animation = ScaleAnimation(1.15f, 1.0f, 1.15f, 1.0f,
            Animation.RELATIVE_TO_SELF, 0.5f,
            Animation.RELATIVE_TO_SELF, 0.5f)

    setAnimation(animation)
    animation.duration = 100
    animation.start()
}