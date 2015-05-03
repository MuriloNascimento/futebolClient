package com.m104.futebol.model.webservice;

import java.util.List;

public class Consumer {

	public static void main(String[] args) {
		EnviaTimeService enviaTimeService = new EnviaTimeService();
		EnviaTime enviaTime = enviaTimeService.getEnviaTimePort();
		List<Time> times = enviaTime.enviar();
		
		for (Time time : times) {
			System.out.println(time.getNome());
		}

	}

}
