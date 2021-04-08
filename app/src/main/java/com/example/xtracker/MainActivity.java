package com.example.xtracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openAddIncome(View view){
        Toast.makeText(this, "Opening Add Income", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Add_Income.class);
        startActivity(intent);
    }
    public void openAddExpenses(View view){
        Toast.makeText(this, "Opening Add Expenses", Toast.LENGTH_SHORT).show();
        Intent intent1 = new Intent(this, Add_Expenses.class);
        startActivity(intent1);
    }
}