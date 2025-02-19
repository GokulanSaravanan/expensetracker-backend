package com.expensetracker.DTO.request;

public class ExpenseDTO {
    String title;
    int amount;
    String category;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "ExpenseDTO{" +
                "title='" + title + '\'' +
                ", amount=" + amount +
                ", category='" + category + '\'' +
                '}';
    }
}
