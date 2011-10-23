package uk.co.onehp.btcirl;

import uk.co.onehp.btcirl.domain.Transaction;

public interface IrlService {

	void setIrl(Transaction transaction, int place);
}
