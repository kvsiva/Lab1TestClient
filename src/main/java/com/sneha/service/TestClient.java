package com.sneha.service;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.Scanner;

import javax.xml.rpc.ServiceException;

public class TestClient {

	public static void main(String[] args) throws MalformedURLException,
			ServiceException, RemoteException {
		// TODO Auto-generated method stub
		CalServiceServiceLocator serviceLocator = new CalServiceServiceLocator();
		CalService calService = serviceLocator.getCalService(new URL(
				"http://localhost:8080/Lab1/services/CalService"));
		CalServiceSoapBindingStub calStub = (CalServiceSoapBindingStub) calService;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter input1 for Add Operation:");
		int input1 = scanner.nextInt();
		System.out.println("Enter input2 for Add Operation:");
		int input2 = scanner.nextInt();
		int addResponse = calStub.add(input1, input2);
		System.out.println("Add Respnse:" + addResponse);

	}
}