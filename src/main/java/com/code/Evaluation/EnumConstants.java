package com.code.Evaluation;

//Class containing the Enum Constants
public class EnumConstants {

	// Enum for hundred values
	public enum hundreds {

		OneHundred("One Hundred"), TwoHundred("Two Hundred"), ThreeHundred("Three Hundred"),
		FourHundred("Four Hundred"), FiveHundred("Five Hundred"), SixHundred("Six Hundred"),
		SevenHundred("Seven Hundred"), EightHundred("Eight Hundred"), NineHundred("Nine Hundred");

		private final String name;

		/**
		 * @param name
		 */
		private hundreds(final String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}
	};

	// Enum for ten values
	public enum tens {
		Twenty, Thirty, Forty, Fifty, Sixty, Seventy, Eighty, Ninety
	};

	// Enum for unit values
	public enum ones {
		One, Two, Three, Four, Five, Six, Seven, Eight, Nine
	};

	// Enum for thousand , lacks, crores
	public enum denom {
		Thousand, Lakhs, Crores
	};

	// Enum for numbers 10 to 19 in words
	public enum splNums {
		Ten, Eleven, Twelve, Thirteen, Fourteen, Fifteen, Sixteen, Seventeen, Eighteen, Nineteen
	};
}
