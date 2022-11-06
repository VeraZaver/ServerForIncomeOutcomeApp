package com.example.serverforincomeoutcomeapp.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table (name = "expense")
public class ExpenseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Column(name = "sum")
    private double sum;

    @Column(name = "time")
    private long time;

    @Column(name = "day")
    private int day;

    @Column(name = "month")
    private int month;

    @Column(name = "year")
    private int year;

    @ManyToOne
    UserModel userModel;
}
