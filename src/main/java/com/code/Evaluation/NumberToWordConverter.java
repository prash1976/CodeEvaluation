package com.code.Evaluation;

import java.util.Scanner;

class NumberToWordConverter {

	// The word format of the entered number
	public static String wordFormatOfNumber = "";

	public static void main(String[] args) {
		NumberToWordConverter numberToString = new NumberToWordConverter();
		numberToString.initiateConversion();
	}

	// Method to validate the input as number and return boolean
	public boolean validateInput(Scanner input) {
		boolean isValid = false;
		if (input.hasNextInt()) {
			isValid = true;
		} else if (input.hasNext()) {
			isValid = false;
		}
		return isValid;
	}

	// Method to initiate the number to convert application, call covertNumberToWord
	// if the input is number
	public void initiateConversion() {
		System.out.println("Enter Number to convert into words:");
		Scanner input = new Scanner(System.in);
		if (validateInput(input)) {
			convertNumberToWord(input);

		} else {
			System.out.println("Please restart the app and enter only a number < 999999999");
		}

	}

	// Method to convert the number to word
	public void convertNumberToWord(Scanner input) {
		long num = input.nextInt();
		int rem = 0;
		int i = 0;
		while (num > 0) {
			if (i == 0) {
				rem = (int) (num % 1000);
				printWordFormatOfNumber(rem);
				num = num / 1000;
				i++;
			} else if (num > 0) {
				rem = (int) (num % 100);
				if (rem > 0)
					wordFormatOfNumber = EnumConstants.denom.values()[i - 1] + " " + wordFormatOfNumber;
				printWordFormatOfNumber(rem);
				num = num / 100;
				i++;
			}
		}
		wordFormatOfNumber = (i > 0) ? wordFormatOfNumber : "Zero";
		System.out.println(wordFormatOfNumber);
	}

	// method to calculate the units, tens , hundreds, thousands. lacks, crores
	// position of the inpt number
	public static void printWordFormatOfNumber(int num) {
		if (!(num > 9 && num < 19)) {
			if (num % 10 > 0)
				getOnes(num % 10);

			num = num / 10;
			if (num % 10 > 0)
				getTens(num % 10);

			num = num / 10;
			if (num > 0)
				getHundreds(num);
		} else {
			getSplNums(num % 10);
		}
	}

	// method to format the thousands, lacks and crores values
	public static void getSplNums(int num) {
		wordFormatOfNumber = EnumConstants.splNums.values()[num] + " " + wordFormatOfNumber;
	}

	// method to format the hundred values
	public static void getHundreds(int num) {
		wordFormatOfNumber = EnumConstants.hundreds.values()[num - 1].getName() + " " + wordFormatOfNumber;
	}

	// method to format the tens values
	public static void getTens(int num) {
		wordFormatOfNumber = EnumConstants.tens.values()[num - 2] + " " + wordFormatOfNumber;
	}

	// method to format the unit values
	public static void getOnes(int num) {
		wordFormatOfNumber = EnumConstants.ones.values()[num - 1] + " " + wordFormatOfNumber;
	}
}
