package uk.co.onehp.btcirl.domain;

import java.math.BigDecimal;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.joda.time.LocalDateTime;

public class Transaction {

	private final BigDecimal amount;
	private final BigDecimal priceAtTime;
	private final BigDecimal value;
	private final LocalDateTime dateTime;
	private String irl;

	public Transaction(String amount, String priceAtTime, String dateTime){
		this.amount = new BigDecimal(amount);
		this.priceAtTime = new BigDecimal(priceAtTime);
		this.value = this.amount.multiply(this.priceAtTime).setScale(0, BigDecimal.ROUND_UP);
		this.dateTime = new LocalDateTime(Long.parseLong(dateTime));
		this.irl = "";
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public BigDecimal getPriceAtTime() {
		return this.priceAtTime;
	}

	public BigDecimal getValue(){
		return this.value;
	}

	public void setIrl(String irl){
		this.irl = irl;
	}

	public String getIrl() {
		return this.irl;
	}

	public LocalDateTime getDateTime(){
		return this.dateTime;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
