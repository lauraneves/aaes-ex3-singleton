package src;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Gets the single transaction manager instance
        TransactionManager transactionManager = TransactionManager.getInstance();

        // Make some transactions
        transactionManager.addTransaction(new Transaction("Compra de $100", -100.0));
        transactionManager.addTransaction(new Transaction("Depósito de $500", 500.0));
        transactionManager.addTransaction(new Transaction("Retirada de $200", -200.0));

        // Get all transactions and print them
        List<Transaction> transactions = transactionManager.getAllTransactions();
        for (Transaction transaction : transactions) {
            System.out.println("Descrição: " + transaction.getDescription());
            System.out.println("Valor: " + transaction.getAmount());
            System.out.println();
        }
    }
}