package com.mindorks.framework.mvvm

import android.app.ProgressDialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.support.v4.app.FragmentActivity
import android.util.DisplayMetrics
import android.view.WindowManager

/**
 * Created by Sean on 1/3/18.
 */
fun FragmentActivity.getScreenWidth(): Int {
    return displayMetrics().widthPixels
}

private fun FragmentActivity.displayMetrics(): DisplayMetrics {
    val windowManager =
            getSystemService(Context.WINDOW_SERVICE) as WindowManager
    val dm = DisplayMetrics()
    windowManager.defaultDisplay.getMetrics(dm)
    return dm
}

fun FragmentActivity.getScreenHeight(): Int {
    return displayMetrics().heightPixels
}

fun FragmentActivity.showLoadingDialog(): ProgressDialog {
    val progressDialog: ProgressDialog = ProgressDialog(this)
    progressDialog.show()

    progressDialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
    progressDialog.setContentView(R.layout.progress_dialog)
    progressDialog.isIndeterminate = true
    progressDialog.setCancelable (false)
    progressDialog.setCanceledOnTouchOutside(false)

    return progressDialog
}