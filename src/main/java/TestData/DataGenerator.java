package TestData;

import org.apache.commons.lang3.RandomStringUtils;

public class DataGenerator {

	public String firstNameGen(int length) {
		String allowedChars = "abcdefghijklmnopqrstuvwxyz";
		// String name = "";
		String temp = RandomStringUtils.random(length, allowedChars);
		String name = temp.substring(0, temp.length() - 5) + "webTestName";
		return name;

	}

	public String surnameGen(int length) {
		String allowedChars = "abcdefghijklmnopqrstuvwxyz";
		// String name = "";
		String temp = RandomStringUtils.random(length, allowedChars);
		String lastName = temp.substring(0, temp.length() - 5) + "webTestLastName";
		return lastName;

	}

	public String phoneNumberGen(int length) {
		String digits = "084";
		String other = RandomStringUtils.randomNumeric(length);
		String num = digits + other;
		return num;
	}

	public String emailGen(int length) {
		String allowedChars = "abcdefghijklmnopqrstuvwxyz" + // alphabets
				"1234567890";
		String email = "";
		String temp = RandomStringUtils.random(length, allowedChars);
		email = temp.substring(0, temp.length() - 5) + "@gktest.org";
		return email;

	}
	
	public String zipCodeGen(int length) {
		String zipCode = RandomStringUtils.randomNumeric(length);
		return zipCode;
	}

}