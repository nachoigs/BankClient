package es.upm.dit.cnvr;

import java.util.Scanner;

public class ClientApp {

	public ClientApp() {
		// TODO Auto-generated constructor stub
	}

	
	public static void main(String[] args) { //throws Exception{
		System.out.println("|****************************************************|");
		System.out.println("|Welcome to the administration system of Eclipse Bank|");
		System.out.println("|****************************************************|");
		showOptions();		
	}
	
	public BankClient getAccount(int accountId){
		return null;
		
	}
	
	public static void showOptions(){
		//Set true or false debug 
		boolean debug = true;
		System.out.println("|       These are the operations you can do:         |");
		System.out.println("|1. Create a client                                  |");
		System.out.println("|   - Usage: CREATE [ClientName] [Balance]           |");
		System.out.println("|2. Read a client account                            |");
		System.out.println("|   - Usage: READ [Account ID]                       |");
		System.out.println("|3. Update balance of a client account               |");
		System.out.println("|   - Usage: UPDATE [Account ID] [New Balance]       |");
		System.out.println("|4. Delete a client account                          |");
		//ClientName for security purposes
		System.out.println("|   - Usage: DELETE [Account ID] [ClientName]        |");
		System.out.println("|5. Show these options again                         |");
		System.out.println("|   - Usage: OPTIONS                                 |");
		while (true){
			System.out.println("|----------------------------------------------------|");
			System.out.println("|Enter an operation                                  |");
			Scanner keyboard = new Scanner(System.in);
		    String input = keyboard.nextLine();
		    String[] input_parts = input.split(" ");
		    boolean result = false;
        	//Variables for method
        	OperationEnum op;
        	int accountId = 0;
        	String clientName = "";
        	Double balance = 0.0;
		        switch (input_parts[0]) {
		            case "CREATE":
		            	//Variables for method
		            	op = OperationEnum.CREATE_CLIENT;
		            	clientName = input_parts[1];
		            	balance = Double.parseDouble(input_parts[2]);
		            	//Send
		            	result = operateAndSend(op,accountId,clientName,balance);		       
		                break;
		            case "READ":		            
		            	//Variables for method
		            	op = OperationEnum.READ_CLIENT;
		            	accountId = Integer.parseInt(input_parts[1]);
		            	//Send
		            	result = operateAndSend(op,accountId,clientName,balance);		       
		            	break;
		            case "UPDATE":
		            	//Variables for method
		            	op = OperationEnum.UPDATE_CLIENT;
		            	accountId = Integer.parseInt(input_parts[1]);
		            	balance = Double.parseDouble(input_parts[2]);
		            	//Send
		            	result = operateAndSend(op,accountId,clientName,balance);		       
		            	break;
		            case "DELETE":
		            	//Variables for method
		            	op = OperationEnum.DELETE_CLIENT;
		            	accountId = Integer.parseInt(input_parts[1]);
		                clientName = input_parts[2];
		            	//Send
		            	result = operateAndSend(op,accountId,clientName,balance);
		                break;
		            case "OPTIONS":
		                showOptions();
		                break;
		            default:
		        		System.out.println("This is not an available operation.");
		            	showOptions();
		   }
		        if(result){
		        	System.out.println("Successful operation");
		        } else{
		        	System.out.println("Unsuccessful operation");
		        }
		}
	}
	
	public static boolean operateAndSend(OperationEnum operation, int accountId,String clientName, double quantity){
		return true;
		
	}

	
}
