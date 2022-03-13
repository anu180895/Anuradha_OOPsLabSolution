package com.greatlearning.services;

import com.greatlearning.model.Employee;
import java.util.Random;

public class CredentialService {
	public String generatePassword() {
		String largeAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallAlphabet = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*_=+-/.?<>";

		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		int length = 2;
		int password;
		char randomString;
		for (int i = 0; i < length; i++) {
			password = random.nextInt(largeAlphabet.length());
			randomString = largeAlphabet.charAt(password);
			sb.append(randomString);

			password = random.nextInt(smallAlphabet.length());
			randomString = smallAlphabet.charAt(password);
			sb.append(randomString);

			password = random.nextInt(numbers.length());
			randomString = numbers.charAt(password);
			sb.append(randomString);

			password = random.nextInt(specialCharacters.length());
			randomString = specialCharacters.charAt(password);
			sb.append(randomString);
		}
		
		String randomPassword = sb.toString();
		return randomPassword;
	}

	public String generateEmailAddress(String firstName, String lastName, String dept) {
		String generatedEmail = firstName + lastName + "@" + dept + ".abc.com";
		return generatedEmail;
	}

	public void showCredentials(Employee employee, String email, String generatedPassword) {
		System.out.println("Hi " + employee.getFirstName() + " your generated credentials are as follows  ");
		System.out.println("Email is	:  " + email);
		System.out.println("Password is	:  " + generatedPassword.toString());
	}
}
