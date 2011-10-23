package uk.co.onehp.btcirl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uk.co.onehp.btcirl.domain.Transaction;

import com.google.common.collect.Lists;


@Service("store")
public class StoreImpl implements Store{

	private static List<Transaction> TRANSACTIONS = Lists.newArrayList();

	@Autowired
	IrlService irlService;

	public List<Transaction> getTransactions() {
		return TRANSACTIONS;
	}

	public void setTransactions(List<Transaction> transactions) {
		TRANSACTIONS = transactions;
		for(int i = 0; i < TRANSACTIONS.size();i++){
			this.irlService.setIrl(TRANSACTIONS.get(i), i);
		}
	}


}
