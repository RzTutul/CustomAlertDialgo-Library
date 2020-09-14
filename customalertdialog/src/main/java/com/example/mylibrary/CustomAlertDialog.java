package com.example.mylibrary;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

public class CustomAlertDialog {

   public Button cadBtn;
   public CardView boxBackground;
   public LinearLayout titleBackground;
   public TextView titleText;
   public TextView boxMsgText;

    public void SetcustomAlertDialog(final Context context, String title, String boxMsg, String buttonText) {

        AlertDialog.Builder build = new AlertDialog.Builder(context);
        LayoutInflater mlLayoutInflater = LayoutInflater.from(context);
        final View dialView = mlLayoutInflater.inflate(R.layout.dilog_layout, null);
        build.setView(dialView);
        //init View content
        Button procedBtn = dialView.findViewById(R.id.procedBtn);
        TextView titleTV = dialView.findViewById(R.id.titleTextView);
        TextView boxTitleTV = dialView.findViewById(R.id.boxtextview);
        CardView boxBackground = dialView.findViewById(R.id.boxBackground);
        LinearLayout titleBackground = dialView.findViewById(R.id.titleBackground);
        this.cadBtn = procedBtn;
        this.boxBackground = boxBackground;
        this.titleBackground = titleBackground;
        this.titleText = titleTV;
        this.boxMsgText = boxTitleTV;
        titleTV.setText(title);
        boxTitleTV.setText(boxMsg);
        procedBtn.setText(buttonText);

        AlertDialog dialog_card = build.create();
        dialog_card.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog_card.show();
    }

}
