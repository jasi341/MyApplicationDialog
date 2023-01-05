package com.jasmeet.dialog

import android.app.Activity
import android.app.Dialog
import android.content.DialogInterface
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView


class CarnotDialog(
    context: Activity,
    layout :Int,
    DialogTitle: String,
    PositiveButtonText:String,
    PositiveBtnClick: DialogInterface.OnClickListener,
    NegativeBtnText:String,
    NegativeBtnClick: DialogInterface.OnClickListener)
    : Dialog(context) {

    init {
        val dialog = Dialog(context)

        dialog.setContentView(R.layout.carnot_dialog)


        val dialogTitle = dialog.findViewById<TextView>(R.id.dialogTitle)
        dialogTitle.text = DialogTitle


        dialog.setTitle(DialogTitle)

        val relativeLayout = dialog.findViewById<RelativeLayout>(R.id.container)

        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(layout,null)

        val inflatedLayout = inflater.inflate(layout,view as ViewGroup,false)
        relativeLayout.addView(inflatedLayout)


        val positiveButton =dialog.findViewById<Button>(R.id.PositiveButton)

        positiveButton.text = PositiveButtonText

        positiveButton.setOnClickListener {
            PositiveBtnClick.onClick(dialog,1)
        }

        val negativeButton = dialog.findViewById<Button>(R.id.NegativeButton)

        negativeButton.text = NegativeBtnText

        negativeButton.setOnClickListener {
            NegativeBtnClick.onClick(dialog,1)
        }

        dialog.show()

    }
}