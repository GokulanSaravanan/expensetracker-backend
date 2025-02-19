package com.expensetracker.controller;

import com.expensetracker.DTO.request.ExpenseDTO;
import com.expensetracker.model.Expense;
import com.expensetracker.service.ExpenseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/expenses")
public class ExpenseController {

    private final ExpenseService service;

    public ExpenseController(ExpenseService service) {
        this.service = service;
    }

    @GetMapping
    public List<Expense> getAllExpenses() {
        return service.getAllExpenses();
    }

    @PostMapping
    public Expense addExpense(@RequestBody ExpenseDTO expenseDTO) {
        System.err.println(expenseDTO);
        return service.addExpense(expenseDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteExpense(@PathVariable Long id) {
        service.deleteExpense(id);
        return ResponseEntity.ok().build();
    }
}
