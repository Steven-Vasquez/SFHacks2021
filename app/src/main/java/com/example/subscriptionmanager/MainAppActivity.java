package com.example.subscriptionmanager;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import android.text.Html;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView;

public class MainAppActivity extends AppCompatActivity {
    DecimalFormat money = new DecimalFormat("$0.00");
    private int totalPrice=400;
    private int totalSubscriptions=50;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_app);

    }
    @Override
    protected void onStart() {
        super.onStart();
        updateViews();
    }
    public void updateViews(){
        TextView totalPriceView = (TextView) findViewById(R.id.totalPrice);
        totalPriceView.setText(money.format(totalPrice));
        TextView totalSubscriptionsView = (TextView) findViewById(R.id.totalSubscriptions);
        totalSubscriptionsView.setText("for "+ totalSubscriptions+" subscriptions.");
    }
    public void addNewSubscription(View v) {
        Intent intent = new Intent(this, AddSubscriptionActivity.class);
        this.startActivity(intent);
    }
}