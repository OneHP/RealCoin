package uk.co.onehp.btcirl;

import java.util.List;

import uk.co.onehp.btcirl.domain.Transaction;


public interface Store {

	List<Transaction> getTransactions();

	void setTransactions(List<Transaction> transactions);
}
