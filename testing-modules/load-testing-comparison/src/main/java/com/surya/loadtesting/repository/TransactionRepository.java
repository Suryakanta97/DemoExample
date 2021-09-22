package com.surya.loadtesting.repository;

import com.surya.loadtesting.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {

    List<Transaction> findByCustomerRewardsId(Integer rewardsId);
}
