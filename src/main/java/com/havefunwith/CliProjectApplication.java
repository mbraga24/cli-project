package com.havefunwith;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.havefunwith.actions.Actions;
import com.havefunwith.utils.SetupData;

/**
 * Notes when done:
 *
 * 1) Fix BigDecimal: 89.00 instead of 89.0
 * 2) Able to create and delete a user - must delete all CarBookings associated with the user first
 * 3) Generate user ID on user creation
 */
@SpringBootApplication
public class CliProjectApplication {

	private static String userInput = "";

	public static void main(String[] args) {
		SetupData.initialize();
		do {
			userInput = Actions.collectUserInput();
			Actions.triggerOption(userInput);
		} while (!userInput.equals("7"));
	}

}
