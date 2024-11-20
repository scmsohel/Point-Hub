package com.sc.pointhub;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DiscountCouponActivity extends AppCompatActivity {

    CardView disk1;
    CardView disk2;
    CardView disk3;
    CardView disk4;
    CardView disk5;
    CardView disk6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_discount_coupon);

        disk1 = findViewById(R.id.disk1); //
        disk2 = findViewById(R.id.disk2);
        disk3 = findViewById(R.id.disk3);
        disk4 = findViewById(R.id.disk4);
        disk5 = findViewById(R.id.disk5);
        disk6 = findViewById(R.id.disk6);


        disk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DiscountCouponActivity.this,"Comming Soon The Discount",Toast.LENGTH_SHORT).show();
            }
        });
    }
}