package uk.co.onehp.btcirl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import uk.co.onehp.btcirl.domain.Transaction;

import com.google.common.collect.Lists;
import com.google.gson.Gson;


@Service("scheduledService")
public class ScheduledServiceImpl implements ScheduledService {

	@Autowired
	Store store;

	@Scheduled(cron="0 * * * * *")
	public void retrieveTransactions() throws IOException, KeyManagementException, NoSuchAlgorithmException {

		TrustManager[] trustAllCerts = new TrustManager[]{
				new X509TrustManager() {
					public java.security.cert.X509Certificate[] getAcceptedIssuers() {
						return null;
					}
					public void checkClientTrusted(
							java.security.cert.X509Certificate[] certs, String authType) {
					}
					public void checkServerTrusted(
							java.security.cert.X509Certificate[] certs, String authType) {
					}
				}
		};

		SSLContext sc = SSLContext.getInstance("SSL");
		sc.init(null, trustAllCerts, new java.security.SecureRandom());
		HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());

		URL url = new URL("https://mtgox.com/code/data/getTrades.php");
		URLConnection urlConnection = url.openConnection();
		BufferedReader in = new BufferedReader(
				new InputStreamReader(
						urlConnection.getInputStream()));
		StringBuffer response = new StringBuffer();
		String inputLine;
		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();

		MtGoxTransaction [] mtgoxTransactions = new Gson().fromJson(response.toString(), MtGoxTransaction[].class);

		List<Transaction> transactions = Lists.newArrayList();
		for(int i = 0; i < mtgoxTransactions.length && i < 5; i++){
			transactions.add(new Transaction(mtgoxTransactions[i].getAmount(), mtgoxTransactions[i].getPrice(), mtgoxTransactions[i].getDate()));
		}

		this.store.setTransactions(transactions);
	}

	protected static class MtGoxTransaction{

		protected MtGoxTransaction(){

		}

		String date;
		String price;
		String amount;
		String price_int;
		String amount_int;
		String tid;

		public String getDate() {
			return this.date;
		}
		public void setDate(String date) {
			this.date = date;
		}
		public String getPrice() {
			return this.price;
		}
		public void setPrice(String price) {
			this.price = price;
		}
		public String getAmount() {
			return this.amount;
		}
		public void setAmount(String amount) {
			this.amount = amount;
		}
		public String getPrice_int() {
			return this.price_int;
		}
		public void setPrice_int(String price_int) {
			this.price_int = price_int;
		}
		public String getAmount_int() {
			return this.amount_int;
		}
		public void setAmount_int(String amount_int) {
			this.amount_int = amount_int;
		}
		public String getTid() {
			return this.tid;
		}
		public void setTid(String tid) {
			this.tid = tid;
		}
	}


}

