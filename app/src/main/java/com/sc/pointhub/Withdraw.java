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

public class Withdraw extends AppCompatActivity {

    EditText name, bkash, gpa, dollerammount;
    Button withdraw;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_withdraw);
        name = findViewById(R.id.name);
        bkash = findViewById(R.id.bkash);
        gpa = findViewById(R.id.gpa);
        dollerammount = findViewById(R.id.dollerammount);
        withdraw = findViewById(R.id.withdrawButton);


        withdraw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String massage = name.getText().toString();
                String massage1 = bkash.getText().toString();
                String massage2 = gpa.getText().toString();
                String massage3 = dollerammount.getText().toString();


                Intent intent = new Intent(Intent.ACTION_VIEW);

                intent.setData(Uri.parse("https://api.whatsapp.com/send?phone=" + "+8801700800054" +
                        "&text=আমার নাম: " + massage + "\r\n%20বিকাশ নাম্বার: " + massage1 + "\r\n%20GPA: " + massage2 + "\r\n%20পরিমান: $" + massage3 + "\r\n \r\n অনুগ্রহ করে চেক করুন"));
                startActivity(intent);

            }
        });
    }


}