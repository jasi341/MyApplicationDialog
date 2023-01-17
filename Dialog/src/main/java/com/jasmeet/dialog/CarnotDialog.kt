package com.jasmeet.dialog

import android.app.Activity
import android.app.Dialog
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.jasmeet.dialog.databinding.CarnotDialogBinding


class CarnotDialog(
    private val context: Activity,
) {
    private val dialog: Dialog = Dialog(context)
    private var binding: CarnotDialogBinding = DataBindingUtil.inflate(
        LayoutInflater.from(context),
        R.layout.carnot_dialog,
        null,
        false
    )

    init {
        dialog.setContentView(binding.root)
        dialog.setCancelable(false)
    }


    fun showDialog() =
        dialog.show()

    fun closeDialog() =
        dialog.dismiss()

    fun setTitle(title: String) {
        binding.dialogTitle.text = title
    }

    fun setContainer(layout: View, layoutId: Int) {
        val inflater = LayoutInflater.from(context)
        val inflatedLayout = inflater.inflate(layoutId, layout as ViewGroup, false)
        binding.containerView.addView(inflatedLayout)
    }

    fun setPositiveBtn(title: String, clickListener: View.OnClickListener) {
        with(binding.negativeBtn) {
            text = title
            setOnClickListener(clickListener)
        }
    }

    fun setNegativeBtn(title: String, clickListener: View.OnClickListener) {
        with(binding.negativeBtn) {
            text = title
            setOnClickListener(clickListener)
        }
    }
}
