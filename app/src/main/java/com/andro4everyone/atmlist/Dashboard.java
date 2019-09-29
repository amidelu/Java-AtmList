package com.andro4everyone.atmlist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.card.MaterialCardView;

public class Dashboard extends AppCompatActivity implements View.OnClickListener {
    Intent intent;
    MaterialCardView abBankCardView, ucbBankCardView, dbblBankCardView, bracBankCardView, primeBankCardView, bankasiaCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        abBankCardView = findViewById(R.id.abBankId);
        ucbBankCardView = findViewById(R.id.ucbBankId);
        dbblBankCardView = findViewById(R.id.dbblBankId);
        bracBankCardView = findViewById(R.id.bracBankId);
        primeBankCardView = findViewById(R.id.primeBankId);
        bankasiaCardView = findViewById(R.id.bankAsiaId);

        abBankCardView.setOnClickListener(this);
        ucbBankCardView.setOnClickListener(this);
        dbblBankCardView.setOnClickListener(this);
        bracBankCardView.setOnClickListener(this);
        primeBankCardView.setOnClickListener(this);
        bankasiaCardView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.abBankId:
                intent = new Intent(this, AbBankATM.class);
                startActivity(intent);
                break;
            case R.id.ucbBankId:
                intent = new Intent(this, UcbBankATM.class);
                startActivity(intent);
                break;
            case R.id.dbblBankId:
                intent = new Intent(this, DbblBankATM.class);
                startActivity(intent);
                break;
            case R.id.bracBankId:
                intent = new Intent(this, BracBankATM.class);
                startActivity(intent);
                break;
            case R.id.primeBankId:
                intent = new Intent(this, PrimeBankATM.class);
                startActivity(intent);
                break;
            case R.id.bankAsiaId:
                intent = new Intent(this, BankAsiaATM.class);
                startActivity(intent);
                break;
            default:
                    Toast.makeText(getApplicationContext(), "Please select an option", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
