package com.dangminhphuc.gs.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/accounts")
public class AccountController {
    @Autowired
    private AccountRepo accountRepo;

    @GetMapping("/")
    public List<Account> all() {
        return this.accountRepo.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Account> get(@PathVariable Long id) {
        Account account = this.accountRepo
                .findById(id)
                .orElseThrow(() -> new RuntimeException("User not found!!!"));
        return ResponseEntity.ok(account);
    }

    @PostMapping("/")
    public ResponseEntity<Account> register(@RequestBody Account account) {
        Account a = accountRepo.save(account);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(a);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Account> update(@PathVariable Long id, @RequestBody Account account) {
        Account accountRetrieving = this.accountRepo
                .findById(id)
                .orElseThrow(() -> new RuntimeException("User not found!!!"));
        accountRetrieving.setEmail(account.getEmail());

        this.accountRepo.save(accountRetrieving);

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(accountRetrieving);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        Account account = this.accountRepo
                .findById(id)
                .orElseThrow(() -> new RuntimeException("User not found!!!"));

        this.accountRepo.deleteById(account.getId());
        return ResponseEntity.noContent().build();
    }
}
