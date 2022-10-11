package currency;
import java.util.Scanner;
public class main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("latest USD currency.");
		double usd_currency = scan.nextDouble();
		System.out.println("choose your process \n"
				+ "1- USD to Turkish Lira\n"
				+ "2- Turkish Lira to USD\n");
		int input_process = scan.nextInt();
		
		if(input_process == 1) {
			System.out.println("you choosed process number 1\n");
			System.out.println("your USD in your bank account\n");
			double user_usd = scan.nextDouble();
			double tl_corresponding = user_usd * usd_currency;
			System.out.println("your USD which is in your bank worth to \n"+tl_corresponding+ "Turkish Liras");
		}else if(input_process == 2){
			System.out.println("you choosed process number 2\n");
			System.out.println("your Turkish Lira in your bank account");
			double user_tl = scan.nextDouble();
			double usd_corresponding = user_tl / usd_currency;
			System.out.println("your Turkish Lira which is in your bank worth to \n" + usd_corresponding + "USD");
		}else {
			System.out.println("you choosed neither of them process .");
			}
		}
	}