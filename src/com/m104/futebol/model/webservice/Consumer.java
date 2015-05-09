package com.m104.futebol.model.webservice;

import java.util.List;

public class Consumer {
	
	public static void main(String[] args) {
		TimesWSService timesWSService = new TimesWSService();
		TimesWS timesWS = timesWSService.getTimesWSPort();
		
		List<Time> times = timesWS.buscarTodos();
		
		for(Time time : times){
			System.out.println(time.getNome());
		}
	}
	
}
