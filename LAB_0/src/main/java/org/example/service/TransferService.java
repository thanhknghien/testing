package org.example.service;

import org.example.entity.Account;

public class TransferService {
    public String transfer(Account sender, Account receiver, int amount) {
        if (receiver == null || receiver.getAccountNumber() == null || receiver.getAccountNumber().isEmpty()) {
            return "Receiver account is invalid";
        }

        if (amount <= 0) {
            return "Amount must be greater than 0";
        }

        if (sender.getBalance() < amount) {
            return "Insufficient funds";
        }

        sender.setBalance(sender.getBalance() - amount);
        receiver.setBalance(receiver.getBalance() + amount);

        return "Transfer successful";
    }
}
