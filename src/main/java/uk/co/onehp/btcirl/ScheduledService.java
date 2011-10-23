package uk.co.onehp.btcirl;

import java.io.IOException;
import java.net.MalformedURLException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

public interface ScheduledService {

	void retrieveTransactions() throws MalformedURLException, IOException, KeyManagementException, NoSuchAlgorithmException;
}
