package com.sc.pointhub;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.firebase.auth.FirebaseAuth;

import pl.droidsonroids.gif.GifImageView;

public class MainActivity extends AppCompatActivity {


    private FirebaseAuth mAuth;
    private Button logout;


    CardView m1; //PlayPoint s1
    CardView m2;  //Discount Coupon s2 ডিস্কাউন্ট কুপন
    CardView m3;  //how to order
    CardView m4;  //Gmail Sell  s4 জিমেইল বিক্রি
    CardView m5;  //Withdraw
    CardView m6;  //Redeem Code  s6 রিডিম কোড বিক্রি

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        m1 = findViewById(R.id.m1); //PlayPoint
        m2 = findViewById(R.id.m2); //Discount Coupon
        m3 = findViewById(R.id.m3); //how to order
        m4 = findViewById(R.id.m4); //Gmail Sell
        m5 = findViewById(R.id.m5); //Withdraw
        m6 = findViewById(R.id.m6); //Comming soon

        mAuth = FirebaseAuth.getInstance();
        logout =findViewById(R.id.logout);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mAuth.signOut();
                Intent intent = new Intent(MainActivity.this,LoginActivity.class);
                startActivity(intent);
                finish();
                Toast.makeText(MainActivity.this, "Logout Succesful", Toast.LENGTH_SHORT).show();
            }
        });


        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this,PlayPointActivity.class);
                startActivity(intent1);
            }
        });

        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent intent1 = new Intent(MainActivity.this,DiscountCouponActivity.class);
                startActivity(intent1);
            }
        });

        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this,HowToOrder.class);
                startActivity(intent1);
            }
        });

        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent1 = new Intent(MainActivity.this,GmailSell.class);
                startActivity(intent1);
            }
        });

        m5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this,Withdraw.class);
                startActivity(intent1);
            }
        });


        m6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, Reedemcodesell.class);
                startActivity(intent);
            }
        });


    }
}