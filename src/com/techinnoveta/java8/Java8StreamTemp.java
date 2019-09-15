package com.techinnoveta.java8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Java8StreamTemp {

	public static void main(String[] args) {
		List<TransactionDto> list = new ArrayList<TransactionDto>();
		list.add(new TransactionDto("WLMFRDGD", dateFormat("20/08/2018 12:45:33"),59.99, "Kwik-E-Mart", "PAYMENT", ""));
		list.add(new TransactionDto("YGXKOEIA", dateFormat("20/08/2018 12:46:17"),10.95, "Kwik-E-Mart", "PAYMENT", ""));
		list.add(new TransactionDto("LFVCTEYM", dateFormat("20/08/2018 12:50:02"),5.00, "MacLaren", "PAYMENT", ""));
		list.add(new TransactionDto("SUOVOISP", dateFormat("20/08/2018 13:12:22"),5.00, "Kwik-E-Mart", "PAYMENT", ""));
		list.add(new TransactionDto("AKNBVHMN", dateFormat("20/08/2018 13:14:11"),10.95, "Kwik-E-Mart", "REVERSAL", "YGXKOEIA"));
		list.add(new TransactionDto("JYAPKZFZ", dateFormat("20/08/2018 14:07:10"),99.50, "MacLaren", "PAYMENT", ""));

		Set<String> reversalLt = list.stream().map(TransactionDto::getRelatedTransaction).collect(Collectors.toSet());
		System.out.println("START TIME - " + java.time.LocalDateTime.now());
		List<Double> filteredLt = list.stream()
				.filter(dto -> {
					System.out.println("TEST IN FILTER 1 - " + dto.id);
					return !reversalLt.contains(dto.id);
						})
				.filter(dto ->  {
					System.out.println("TEST IN FILTER 2 - " + dto.id);
					return dto.getRelatedTransaction().equals("");
						})
				.filter(dto -> dto.getDate().compareTo(dateFormat("20/08/2018 12:00:00")) > 0)
				.filter(dto -> dto.getDate().compareTo(dateFormat("20/08/2018 13:00:00")) < 0)
				.map(dto -> {
					System.out.println("TEST IN MAP - " + dto.id);
					return dto.amount * 2;
					})
				.collect(Collectors.toList());

		for (Double double1 : filteredLt) {
			System.out.println("LOOPING - " + double1);
		}
		System.out.println("END TIME - " + java.time.LocalDateTime.now());
		
		System.out.println("START TIME - " + java.time.LocalDateTime.now());		
		List<Double> filteredLtP = list.parallelStream()
				.filter(dto -> {
					System.out.println("TEST IN PARALLEL FILTER 1 - " + dto.id);
					return !reversalLt.contains(dto.id);
						})
				.filter(dto ->  {
					System.out.println("TEST IN PARALLEL FILTER 2 - " + dto.id);
					return dto.getRelatedTransaction().equals("");
						})
				.filter(dto -> dto.getDate().compareTo(dateFormat("20/08/2018 12:00:00")) > 0)
				.filter(dto -> dto.getDate().compareTo(dateFormat("20/08/2018 13:00:00")) < 0)
				.map(dto -> {
					System.out.println("TEST IN PARALLEL MAP - " + dto.id);
					return dto.amount * 2;
					})
				.collect(Collectors.toList());

		for (Double double1 : filteredLtP) {
			System.out.println("LOOPING - " + double1);
		}
		System.out.println("END TIME - " + java.time.LocalDateTime.now());
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