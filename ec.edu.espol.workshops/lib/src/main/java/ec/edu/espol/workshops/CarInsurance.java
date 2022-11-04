package ec.edu.espol.workshops;

import  java.util.InputMismatchException;

import java.util.Scanner;

/**
 * Class Car Insurance
 * @author JMaci
 * Class principal
 * 
 */
public class CarInsurance {
	
	/**
	 * Class principal
	 * @param args
	 * @throws InputMismatchException
	 */
	public static void main(String [ ] args) throws InputMismatchException {
		Scanner input = new Scanner(System.in);
		try {
			System.out.println("Write the customer's age:");
			int basePremium = 500;
			int age = input.nextInt();
			if(!(age >= 18 && age <= 80)){
				throw new InputMismatchException();
			}
			input.nextLine();
			
			System.out.println("Write the customer's sex (F/M):");
			String sex = input.nextLine();
			System.out.println(sex);
			if(!(sex.equals("F") || sex.equals("M"))){
				throw new InputMismatchException();
			}
			
			System.out.println("Is the customer married? (Y/N):");
			String married = input.nextLine();
			if(!(married.equals("Y") || married.equals("N"))) {
				throw new InputMismatchException();
			}
			
			//We assume the verification of the license is made by the user
			System.out.println("Is the customer's license valid? (Y/N):");
			String validLicense = input.nextLine();
			if(!(validLicense.equals("Y") || validLicense.equals("N"))){
				throw new InputMismatchException();
			}
			if(validLicense.equals("N")) {
				throw new InputMismatchException();
			}
			
			if(age<25 && sex.equals("M") && married.equals("N")){
				basePremium += 1500;
			}
			
			if(sex.equals("F") || married.equals("Y")){
				basePremium -= 200;
			}
			
			if(age>=45 && age<65){
				basePremium -= 100;
			}
			
			if(basePremium < 0){
				throw new InputMismatchException();
			}
			System.out.println("The customer base premium is: "+basePremium);
			}
		catch(InputMismatchException e){
			System.out.println(-1);
		}
		}
	}
