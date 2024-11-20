package com.sc.pointhub;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class GmailSell extends AppCompatActivity {

    EditText gmailstatus,hpoint,gsmoney,wantmoney;
    Button sellmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_gmail_sell);

        gmailstatus = findViewById(R.id.gmailstatus);
        hpoint= findViewById(R.id.hpoint);
        gsmoney = findViewById(R.id.gsmoney);
        wantmoney = findViewById(R.id.wantmoney);
        sellmail = findViewById(R.id.sellmail);

        sellmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String massage = gmailstatus.getText().toString();
                String massage1 = hpoint.getText().toString();
                String massage2 = gsmoney.getText().toString();
                String massage3 = wantmoney.getText().toString();


                Intent intent = new Intent(Intent.ACTION_VIEW);

                intent.setData(Uri.parse("https://api.whatsapp.com/send?phone=" + "+8801700800054"+
                        "&text=হেলো \r\n \r\nআমার জিমেইল লেভেল: " + massage + "\r\nপয়েন্ট আছে: " + massage1 + "\r\n%20$ আছে: " +massage2 + "\r\n%20আমি চাই: ৳" +massage3 +"\r\n \r\n অনুগ্রহ করে জানান এবং আপনি কিনবেন কি না?"));
                startActivity(intent);

            }
        });
    }


}