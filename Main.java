import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		String message = "";
		
		do {
		System.out.print("\n\nInput message (or Q to quit): ");
		message=keyboard.nextLine();
		
		//Encrypt string
		Encrypt encrypt = new Encrypt(message);
		String encryptedMessage = encrypt.getEncryptedMsg();
		
		//Decrypt string
		Decrypt decrypt = new Decrypt(encryptedMessage, encrypt.sumOfAsciiValues, encrypt.chosenCharPosition, encrypt.chosenCharValue);
		String decryptedMessage = decrypt.getDecryptedMsg();
		
		//Outputting results
		//System.out.println("Message : " + message);
		System.out.println("Encrypted Message : " + encryptedMessage);
		System.out.println("Decrypted Message : " + decryptedMessage);
		
		//check if process was successful
		if(message.equals(decryptedMessage))
		{
			System.out.println("\nDecrypted successfully!");
		} else {
			System.out.println("\nDecryption failed!");
		}
		
		//loop
		}while (message !="Q");
	}
}
