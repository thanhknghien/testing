package org.example.entity;

import lombok.*;

@Data @AllArgsConstructor @NoArgsConstructor
public class Account {
    private String accountNumber;
    private int balance;
}