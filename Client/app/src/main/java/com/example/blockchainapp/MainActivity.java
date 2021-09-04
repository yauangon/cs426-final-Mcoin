package com.example.blockchainapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.blockchainapp.Account.AccountActivity;
import com.example.blockchainapp.Auth.LoginActivity;
import com.example.blockchainapp.Auth.RegisterActivity;
import com.example.blockchainapp.Log.HistoryActivity;
import com.example.blockchainapp.Transaction.TransactionActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (!Constants.SESSION_ACTIVE) {
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
        }

    }

    public void TransactionTab(View view) {
        Intent intent = new Intent(this, TransactionActivity.class);
        startActivity(intent);
    }

    public void AccountTab(View view) {
        Intent intent = new Intent(this, AccountActivity.class);
        startActivity(intent);
    }

    public void HistoryTab(View view) {
        Intent intent = new Intent(this, HistoryActivity.class);
        startActivity(intent);
    }
}