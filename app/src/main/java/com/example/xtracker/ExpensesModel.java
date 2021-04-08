package com.example.xtracker;

public class ExpensesModel {
    private int id;
    private String name;
    private int amount;
    private String note;
    private String Category;


    public ExpensesModel(int id, String name, int amount, String note, String category) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.note = note;
        Category = category;
    }

    public ExpensesModel(int i, String s, String toString, int parseInt, int anInt, String string) {
    }

    @Override
    public String toString() {
        return "ExpensesModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                ", note='" + note + '\'' +
                ", Category='" + Category + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }
}

