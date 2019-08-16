import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ecommerce {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		List<String[]> customers = new ArrayList<String[]>();
		List<String[]> products = new ArrayList<String[]>();
		List<String[]> orders = new ArrayList<String[]>();
		List<String[]> viewOrders = new ArrayList<String[]>();

		

		while (true) {
			System.out.println("1:Register\n2:Create Product\n3:Create Order\n4:View Orders\n5:Exit");
			System.out.println("Enter your choice");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				String cdetails[] = new String[2];
				System.out.println("Enter username");
				cdetails[0] = sc.next();
				System.out.println("Enter password");
				cdetails[1] = sc.next();
				customers.add(cdetails);
				break;
			case 2:
				String pdetails[] = new String[2];
				System.out.println("Enter product name");
				pdetails[0] = sc.next();
				System.out.println("Enter product price");
				pdetails[1] = sc.next();
				products.add(pdetails);
				break;
			case 3:
				String odetails[] = new String[4];
				System.out.println("Enter username");
				String uname = sc.next();
				System.out.println("Enter password");
				String password = sc.next();
				int f = 0;
				for (String cust[] : customers) {
					if ((cust[0].equals(uname)) && (cust[1].equals(password))) {
						f = 1;
					}
					/*
					 * for(int i=0;i<cust.length;i++) { if(cust[i]) }
					 */
				}
				int total = 0;
				
				if (f == 1) {
					
					odetails[0] = uname;
					
					for (String pr[] : products) {
						System.out.println("Name: " + pr[0]);
						System.out.println("Price: " + pr[1]);
						System.out.println("Do you like to select this?");
						String select = sc.next();
						if (select.equals("yes"))
						{
							int price = Integer.parseInt(pr[1]);
							total += price; 
						}
						odetails[1] = pr[0];
						odetails[2] = pr[1];
					}
					
					odetails[3] = String.valueOf(total);
					viewOrders.add(odetails);
					

					/*
					 * System.out.println("Do you like to select this?"); String select = sc.next();
					 * int selitems[] = new int[10];
					 * 
					 * if (select.equals("yes")) { total += }
					 */
					System.out.println();
					System.out.println("Total price is " + total);
					System.out.println();
				}

				break;
			case 4:
				for(String order[]:viewOrders)
				{
					System.out.println();
					System.out.println("Name: " + order[0]);
					System.out.println("Product: " + order[1]);
					System.out.println("Price: " + order[2]);
					System.out.println("Total: " + order[3]);
					System.out.println();
				}
				break;
			case 5:
				System.exit(0);
			default:
				System.out.println("Eneter the correct choice");
			}
		}

	}
}
