package com.example.xtracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Add_Expenses extends AppCompatActivity {

    Button btn_add_expense;
    EditText expenseAmount, expenseCategory, expenseDate, expenseTime, expenseNote;

    Expense ex = new Expense();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add__expenses);

        btn_add_expense = findViewById(R.id.btn_add_expense);
        expenseAmount = findViewById(R.id.expenseAmount);
        expenseCategory = findViewById(R.id.expenseCategory);
        expenseDate = findViewById(R.id.expenseDate);
        expenseTime = findViewById(R.id.expenseTime);
        expenseNote = findViewById(R.id.expenseNote);

//        btn_add_expense.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                ExpensesModel expensesModel = new ExpensesModel(-1, Integer.parseInt(expenseAmount.getText().toString()), expenseCategory.getText().toString(), expenseDate.getText().toString(), expenseDate.getText().toString(),expenseNote.getText().toString());
//                Toast.makeText(Add_Expenses.this, expensesModel.toString(), Toast.LENGTH_SHORT).show();
//            }
//        });

        btn_add_expense.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(this,"Money Added", Toast.LENGTH_SHORT).show();
//                Intent intent2 = new Intent(this,MainActivity.class);
//                startActivity(intent2);
                String amount;
                amount=expenseAmount.getText().toString();
//                Toast.makeText(Add_Expenses.this,amount, Toast.LENGTH_SHORT).show();
                int amt;
                amt=Integer.parseInt(amount);
                ex.add(amt);
            }
        });

    }

}