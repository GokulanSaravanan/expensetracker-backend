package com.expensetracker.service;

import com.expensetracker.DTO.request.ExpenseDTO;
import com.expensetracker.model.Expense;
import com.expensetracker.repository.ExpenseRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class ExpenseService {

    private final ExpenseRepository repository;

    public ExpenseService(ExpenseRepository repository) {
        this.repository = repository;
    }

    @Transactional(readOnly = true)
    public List<Expense> getAllExpenses() {
        return repository.findAll();
    }

    public Optional<Expense> getExpenseById(Long id) {
        return repository.findById(id);
    }

    public Expense addExpense(ExpenseDTO expenseDTO) {
        Expense expense = new Expense();
        expense.setTitle(expenseDTO.getTitle());
        expense.setAmount(expenseDTO.getAmount());
        expense.setCategory(expenseDTO.getCategory());
        expense.setDate(LocalDateTime.now().toLocalDate());
        return repository.save(expense);
    }



    public void deleteExpense(Long id) {
        repository.deleteById(id);
    }
}
