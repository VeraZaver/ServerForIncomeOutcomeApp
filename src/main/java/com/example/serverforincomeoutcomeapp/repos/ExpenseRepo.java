package com.example.serverforincomeoutcomeapp.repos;

import com.example.serverforincomeoutcomeapp.models.ExpenseModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepo extends JpaRepository<ExpenseModel, Long> {

}
