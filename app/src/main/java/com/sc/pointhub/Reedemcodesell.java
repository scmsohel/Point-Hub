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

public class Reedemcodesell extends AppCompatActivity {

    EditText code,wantmoney11;
    Button sellreedemcde;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_reedemcodesell);

        code = findViewById(R.id.code);
        wantmoney11 = findViewById(R.id.wantmoney11);

        sellreedemcde = findViewById(R.id.sellreedemcde);

        sellreedemcde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String massage = code.getText().toString();
                String massage3 = wantmoney11.getText().toString();


                Intent intent = new Intent(Intent.ACTION_VIEW);

                intent.setData(Uri.parse("https://api.whatsapp.com/send?phone=" + "+8801700800054" +
                        "&text=আমার পয়েন্ট আছে: " + massage + "\r\n%20আমি চাই: ৳" + massage3 + "\r\n \r\n অনুগ্রহ করে জানান এবং আপনি কিনবেন কি না?"));
                startActivity(intent);

            }
        });
    }

}
