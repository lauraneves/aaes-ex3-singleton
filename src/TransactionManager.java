package src;

import java.util.ArrayList;
import java.util.List;

public class TransactionManager {
    private static TransactionManager instance;
    private final List<Transaction> transactionList;

    private TransactionManager() {
        transactionList = new ArrayList<>();
    }

    public static TransactionManager getInstance() {
        if (instance == null) {
            instance = new TransactionManager();
        }
        return instance;
    }

    public void addTransaction(Transaction transaction) {
        transactionList.add(transaction);
    }

    public List<Transaction> getAllTransactions() {
        return transactionList;
    }
}