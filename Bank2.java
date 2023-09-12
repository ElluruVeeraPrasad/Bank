import java.util.Scanner;
class Banking {
	int bal=500;
	void deposit(int amt) {
		bal=bal+amt;
	
	}
	void withDraw(int amt) {
		if(amt>bal) {
			System.out.println("no balance");
			
		}
		else {
			bal=bal-amt;
			}
	}
	void balance(){
		System.out.println("the balance is :"+bal);
	}
	}
public class Bank2{

	public static void main(String[] args) {
		int amt,count=3;
		int pin,cpin=1234;
		Scanner scan=new Scanner(System.in);
		Banking b1=new Banking();
		System.out.println("WELCOME TO THE BANK");
		System.out.println("ENTER THE PIN");
		pin=scan.nextInt();
		
			while(count>1 && pin!=cpin) {
				System.out.println("Enter the valid pin");
				pin=scan.nextInt();
				count--;
			}
		int choice=0;
		try {//also remove the try it will run
		if(pin==cpin) {
			while(choice<=3) {
			System.out.println("Select the choice");
			System.out.println("1:deposit	2:withdraw	3:balance	4:exit");
			choice=scan.nextInt();
			switch(choice) {
			case 1:{System.out.println("Enter the amount to deposit");
			amt=scan.nextInt();
			b1.deposit(amt);
			break;
			}
			case 2:{
				System.out.println("Enter the amount to withdraw");
				amt=scan.nextInt();
				b1.withDraw(amt);
				break;
			}
			case 3:{
				b1.balance();
				break;
			}
			}
		}
		}}
		catch(Exception e) {//else
			System.out.println("Contact the bank");
		}
		finally {
		System.out.println("THANK YOU");
		}
	}

}