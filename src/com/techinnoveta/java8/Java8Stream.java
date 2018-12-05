package com.techinnoveta.java8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Java8Stream {

	public static void main(String[] args) {
		List<TransactionDto> list = new ArrayList<TransactionDto>();
		list.add(new TransactionDto("WLMFRDGD", dateFormat("20/08/2018 12:45:33"),59.99, "Kwik-E-Mart", "PAYMENT", ""));
		list.add(new TransactionDto("YGXKOEIA", dateFormat("20/08/2018 12:46:17"),10.95, "Kwik-E-Mart", "PAYMENT", ""));
		list.add(new TransactionDto("LFVCTEYM", dateFormat("20/08/2018 12:50:02"),5.00, "MacLaren", "PAYMENT", ""));
		list.add(new TransactionDto("SUOVOISP", dateFormat("20/08/2018 13:12:22"),5.00, "Kwik-E-Mart", "PAYMENT", ""));
		list.add(new TransactionDto("AKNBVHMN", dateFormat("20/08/2018 13:14:11"),10.95, "Kwik-E-Mart", "REVERSAL", "YGXKOEIA"));
		list.add(new TransactionDto("JYAPKZFZ", dateFormat("20/08/2018 14:07:10"),99.50, "MacLaren", "PAYMENT", ""));

		Set<String> reversalLt = list.stream().map(TransactionDto::getRelatedTransaction).collect(Collectors.toSet());
		List<TransactionDto> filteredLt = list.stream()
				.filter(dto -> !reversalLt.contains(dto.id))
				.filter(dto -> dto.getRelatedTransaction().equals(""))
				.filter(dto -> dto.getDate().compareTo(dateFormat("20/08/2018 12:00:00")) > 0)
				.filter(dto -> dto.getDate().compareTo(dateFormat("20/08/2018 13:00:00")) < 0)
				.collect(Collectors.toList());
		for (TransactionDto transactionDto : filteredLt) {
			new TransactionDto().printDto(transactionDto);
		}
		double avg = filteredLt.stream().mapToDouble(i -> i.amount).sum();
		System.out.println(avg/filteredLt.size());
		
	}
	
	public static Date dateFormat(String date) {
		try {
			return new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
}


class TransactionDto {
	String id;
	Date date;
	Double amount;
	String merchant;
	String type;
	String relatedTransaction;

	public TransactionDto(String id, Date date, Double amount, String merchant, String type,
			String relatedTransaction) {
		super();
		this.id = id;
		this.date = date;
		this.amount = amount;
		this.merchant = merchant;
		this.type = type;
		this.relatedTransaction = relatedTransaction;
	}

	public TransactionDto() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getMerchant() {
		return merchant;
	}

	public void setMerchant(String merchant) {
		this.merchant = merchant;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRelatedTransaction() {
		return relatedTransaction;
	}

	public void setRelatedTransaction(String relatedTransaction) {
		this.relatedTransaction = relatedTransaction;
	}
	
	public void printDto(TransactionDto dto){
		System.out.println(dto.getId() + ", " + dto.getDate() + ", " + dto.getAmount() + ", " + dto.getType() + ", " + dto.getRelatedTransaction() );
	}

}