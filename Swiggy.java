import java.util.*;

class Swiggy
{
	static Scanner sc = new Scanner (System.in);
	static int otp = (int) (Math.random()*9999+9999);
	static int u_otp;
	static int hot;
	static int cost;
	static int quan;
	static double total;
	static int pay;
	static double u_total;

	public static void main(String [] args) throws Exception
	{
		System.out.println("\t\t\t******************* Welcome To Swiggy *******************\n");
		System.out.println("Lazy to Dine-in, We take your and deliver at your door step, \nOrder Here...."+(char)1+(char)1+"\n");
		Thread.sleep(2000);
		System.out.println("Please Select the Resturant \n1.Burger King \n2.KFC \n3.McDonald's \n4.Dominos");
		Thread.sleep(1000);
		System.out.print("\nEnter the Hotel S.No.(1-4) = ");
		hot = sc.nextInt();

		switch (hot)
		{
		case 1:
			{//Burger King
			System.out.println("\t\t\t*******Welcome to Burger King*******\n");
			Thread.sleep(2000);
			System.out.println("Please select your Food From Below List\n");
			System.out.println("      Food                                          Cost      ");
			System.out.println("--------------------------------------------------------------");
			System.out.println("1.Chicken Whopper                                  Rs. 199   ");
			System.out.println("2.Crispy Chicken Burger                            Rs.  99   ");
			System.out.println("3.Chicken Whopper Double Patty                     Rs. 259   ");
			System.out.println("4.Chicken Tandoori Burger                          Rs. 209   ");
			Thread.sleep(2000);
			System.out.print("\nSelect the Food By Entering (1-4) = ");
			int food = sc.nextInt();

			switch (food)
			{
			case 1://Chicken Whopper
				{
				 System.out.println("\nYou have Selected Chicken Whooper\n");
				 cost = 199;
				 Thread.sleep(2000);
				 System.out.print("Please Enter the Quantity of the Food : ");
				 quan = sc.nextInt();
				 total = (double)(cost*quan);
				 System.out.println("\nThe Total Cost of the Food = "+ total);
				 Thread.sleep(2000);
				 System.out.println("\n\t\tPlease Select the Payment Method \n1.Google Pay \n2.Phone Pay");
				 System.out.print("\nSelect the Payment Method by Entering (1 or 2) = ");
				 pay = sc.nextInt();
				 Thread.sleep(2000);
				 System.out.println("\nPlease wait We are connecting to the Payment Gateway.");

				 switch (pay)
				 {
				 case 1://Google Pay
					{System.out.println("\n\t\t\t----- Google Pay -----\n");
				 	 System.out.print("Enter the Total Amount you need to Pay : ");
					 u_total = sc.nextDouble();

					 if(u_total == total)
						{
							System.out.println("\nPlease wait we are generating OTP \n");
							Thread.sleep(3000);
							System.out.println("****** "+otp+" ******");
							System.out.print("Enter the OTP you received : ");
							u_otp = sc.nextInt();
							Thread.sleep(2000);
							

							if(u_otp == otp)
							{
								System.out.println("\t\t\tOTP Verified Successfully");
								Thread.sleep(2000);
								System.out.println("\nProcessing Payment.........");
								Thread.sleep(2000);
								System.out.println("Payment Done Successfully\n");
								Thread.sleep(3000);
								System.out.println("Order Received Successfully...... \nThank You for Choosing us....");
								Thread.sleep(1000);
								System.out.println("\nYour Order will be Delivered in 30 minutes........");
							}
							else
							{
								System.out.println("\t\t*********Payment Failed*********\n\t\t\tOTP Verification Failed");
							}
						}

						else
						{
							System.out.println("\t\t*********Payment Failed*********\n\t\t\tTotal Amount that you have entered is wrong");
						}
					 break;}

				case 2: // Phone Pay
					{System.out.println("\n\t\t\t----- Phone Pay -----\n");
				 	 System.out.print("Enter the Total Amount you need to Pay : ");
					 u_total = sc.nextDouble();

					 if(u_total == total)
						{
							System.out.println("\nPlease wait we are generating OTP \n");
							Thread.sleep(3000);
							System.out.println("****** "+otp+" ******");
							System.out.print("Enter the OTP you received : ");
							u_otp = sc.nextInt();
							Thread.sleep(2000);
							

							if(u_otp == otp)
							{
								System.out.println("\t\t\tOTP Verified Successfully");
								Thread.sleep(2000);
								System.out.println("\nProcessing Payment.........");
								Thread.sleep(2000);
								System.out.println("Payment Done Successfully\n");
								Thread.sleep(3000);
								System.out.println("Order Received Successfully...... \nThank You for Choosing us....");
								Thread.sleep(1000);
								System.out.println("\nYour Order will be Delivered in 30 minutes........");
							}
							else
							{
								System.out.println("\t\t*********Payment Failed*********\n\t\t\tOTP Verification Failed");
							}
						}

						else
						{
							System.out.println("\t\t*********Payment Failed*********\n\t\t\tTotal Amount that you have entered is wrong");
						}
					 break;}

				 
				 }
				
				break;}
			
			case 2: // Crispy Chicken Burger
				{ 
				 System.out.println("\nYou have Selected Crispy Chicken Burger\n");
				 cost = 99;
				 Thread.sleep(2000);
				 System.out.print("Please Enter the Quantity of the Food : ");
				 quan = sc.nextInt();
				 total = (double)(cost*quan);
				 System.out.println("\nThe Total Cost of the Food = "+ total);
				 Thread.sleep(2000);
				 System.out.println("\n\t\tPlease Select the Payment Method \n1.Google Pay \n2.Phone Pay");
				 System.out.print("\nSelect the Payment Method by Entering (1 or 2) = ");
				 pay = sc.nextInt();
				 Thread.sleep(2000);
				 System.out.println("\nPlease wait We are connecting to the Payment Gateway.");

				 switch (pay)
				 {
				 case 1: // Google Pay
					{System.out.println("\n\t\t\t----- Google Pay -----\n");
				 	 System.out.print("Enter the Total Amount you need to Pay : ");
					 u_total = sc.nextDouble();

					 if(u_total == total)
						{
							System.out.println("\nPlease wait we are generating OTP \n");
							Thread.sleep(3000);
							System.out.println("****** "+otp+" ******");
							System.out.print("Enter the OTP you received : ");
							u_otp = sc.nextInt();
							Thread.sleep(2000);
							

							if(u_otp == otp)
							{
								System.out.println("\t\t\tOTP Verified Successfully");
								Thread.sleep(2000);
								System.out.println("\nProcessing Payment.........");
								Thread.sleep(2000);
								System.out.println("Payment Done Successfully\n");
								Thread.sleep(3000);
								System.out.println("Order Received Successfully...... \nThank You for Choosing us....");
								Thread.sleep(1000);
								System.out.println("\nYour Order will be Delivered in 30 minutes........");
							}
							else
							{
								System.out.println("\t\t*********Payment Failed*********\n\t\t\tOTP Verification Failed");
							}
						}

						else
						{
							System.out.println("\t\t*********Payment Failed*********\n\t\t\tTotal Amount that you have entered is wrong");
						}
					 break;}

				case 2: // Phone Pay
					{System.out.println("\n\t\t\t----- Phone Pay -----\n");
				 	 System.out.print("Enter the Total Amount you need to Pay : ");
					 u_total = sc.nextDouble();

					 if(u_total == total)
						{
							System.out.println("\nPlease wait we are generating OTP \n");
							Thread.sleep(3000);
							System.out.println("****** "+otp+" ******");
							System.out.print("Enter the OTP you received : ");
							u_otp = sc.nextInt();
							Thread.sleep(2000);
							

							if(u_otp == otp)
							{
								System.out.println("\t\t\tOTP Verified Successfully");
								Thread.sleep(2000);
								System.out.println("\nProcessing Payment.........");
								Thread.sleep(2000);
								System.out.println("Payment Done Successfully\n");
								Thread.sleep(3000);
								System.out.println("Order Received Successfully...... \nThank You for Choosing us....");
								Thread.sleep(1000);
								System.out.println("\nYour Order will be Delivered in 30 minutes........");
							}
							else
							{
								System.out.println("\t\t*********Payment Failed*********\n\t\t\tOTP Verification Failed");
							}
						}

						else
						{
							System.out.println("\t\t*********Payment Failed*********\n\t\t\tTotal Amount that you have entered is wrong");
						}
					 break;}

				 
				 }
				
				break;}
			
			case 3: // Chicken Whopper Double Patty
				{ 
				 System.out.println("\nYou have Selected Chicken Whopper Double Patty\n");
				 cost = 259;
				 Thread.sleep(2000);
				 System.out.print("Please Enter the Quantity of the Food : ");
				 quan = sc.nextInt();
				 total = (double)(cost*quan);
				 System.out.println("\nThe Total Cost of the Food = "+ total);
				 Thread.sleep(2000);
				 System.out.println("\n\t\tPlease Select the Payment Method \n1.Google Pay \n2.Phone Pay");
				 System.out.print("\nSelect the Payment Method by Entering (1 or 2) = ");
				 pay = sc.nextInt();
				 Thread.sleep(2000);
				 System.out.println("\nPlease wait We are connecting to the Payment Gateway.");

				 switch (pay)
				 {
				 case 1: // Google Pay
					{System.out.println("\n\t\t\t----- Google Pay -----\n");
				 	 System.out.print("Enter the Total Amount you need to Pay : ");
					 u_total = sc.nextDouble();

					 if(u_total == total)
						{
							System.out.println("\nPlease wait we are generating OTP \n");
							Thread.sleep(3000);
							System.out.println("****** "+otp+" ******");
							System.out.print("Enter the OTP you received : ");
							u_otp = sc.nextInt();
							Thread.sleep(2000);
							

							if(u_otp == otp)
							{
								System.out.println("\t\t\tOTP Verified Successfully");
								Thread.sleep(2000);
								System.out.println("\nProcessing Payment.........");
								Thread.sleep(2000);
								System.out.println("Payment Done Successfully\n");
								Thread.sleep(3000);
								System.out.println("Order Received Successfully...... \nThank You for Choosing us....");
								Thread.sleep(1000);
								System.out.println("\nYour Order will be Delivered in 30 minutes........");
							}
							else
							{
								System.out.println("\t\t*********Payment Failed*********\n\t\t\tOTP Verification Failed");
							}
						}

						else
						{
							System.out.println("\t\t*********Payment Failed*********\n\t\t\tTotal Amount that you have entered is wrong");
						}
					 break;}

				case 2:  // Phone Pay
					{System.out.println("\n\t\t\t----- Phone Pay -----\n");
				 	 System.out.print("Enter the Total Amount you need to Pay : ");
					 u_total = sc.nextDouble();

					 if(u_total == total)
						{
							System.out.println("\nPlease wait we are generating OTP \n");
							Thread.sleep(3000);
							System.out.println("****** "+otp+" ******");
							System.out.print("Enter the OTP you received : ");
							u_otp = sc.nextInt();
							Thread.sleep(2000);
							

							if(u_otp == otp)
							{
								System.out.println("\t\t\tOTP Verified Successfully");
								Thread.sleep(2000);
								System.out.println("\nProcessing Payment.........");
								Thread.sleep(2000);
								System.out.println("Payment Done Successfully\n");
								Thread.sleep(3000);
								System.out.println("Order Received Successfully...... \nThank You for Choosing us....");
								Thread.sleep(1000);
								System.out.println("\nYour Order will be Delivered in 30 minutes........");
							}
							else
							{
								System.out.println("\t\t*********Payment Failed*********\n\t\t\tOTP Verification Failed");
							}
						}

						else
						{
							System.out.println("\t\t*********Payment Failed*********\n\t\t\tTotal Amount that you have entered is wrong");
						}
					 break;}

				 
				 }
				
				break;}
			
			case 4:  // Chicken Tandoori Burger
				{
				 System.out.println("\nYou have Selected Chicken Tandoori Burger\n");
				 cost = 209;
				 Thread.sleep(2000);
				 System.out.print("Please Enter the Quantity of the Food : ");
				 quan = sc.nextInt();
				 total = (double)(cost*quan);
				 System.out.println("\nThe Total Cost of the Food = "+ total);
				 Thread.sleep(2000);
				 System.out.println("\n\t\tPlease Select the Payment Method \n1.Google Pay \n2.Phone Pay");
				 System.out.print("\nSelect the Payment Method by Entering (1 or 2) = ");
				 pay = sc.nextInt();
				 Thread.sleep(2000);
				 System.out.println("\nPlease wait We are connecting to the Payment Gateway.");

				 switch (pay)
				 {
				 case 1: // Google Pay
					{System.out.println("\n\t\t\t----- Google Pay -----\n");
				 	 System.out.print("Enter the Total Amount you need to Pay : ");
					 u_total = sc.nextDouble();

					 if(u_total == total)
						{
							System.out.println("\nPlease wait we are generating OTP \n");
							Thread.sleep(3000);
							System.out.println("****** "+otp+" ******");
							System.out.print("Enter the OTP you received : ");
							u_otp = sc.nextInt();
							Thread.sleep(2000);
							

							if(u_otp == otp)
							{
								System.out.println("\t\t\tOTP Verified Successfully");
								Thread.sleep(2000);
								System.out.println("\nProcessing Payment.........");
								Thread.sleep(2000);
								System.out.println("Payment Done Successfully\n");
								Thread.sleep(3000);
								System.out.println("Order Received Successfully...... \nThank You for Choosing us....");
								Thread.sleep(1000);
								System.out.println("\nYour Order will be Delivered in 30 minutes........");
							}
							else
							{
								System.out.println("\t\t*********Payment Failed*********\n\t\t\tOTP Verification Failed");
							}
						}

						else
						{
							System.out.println("\t\t*********Payment Failed*********\n\t\t\tTotal Amount that you have entered is wrong");
						}
					 break;}

				case 2:  // Phone Pay
					{System.out.println("\n\t\t\t----- Phone Pay -----\n");
				 	 System.out.print("Enter the Total Amount you need to Pay : ");
					 u_total = sc.nextDouble();

					 if(u_total == total)
						{
							System.out.println("\nPlease wait we are generating OTP \n");
							Thread.sleep(3000);
							System.out.println("****** "+otp+" ******");
							System.out.print("Enter the OTP you received : ");
							u_otp = sc.nextInt();
							Thread.sleep(2000);
							

							if(u_otp == otp)
							{
								System.out.println("\t\t\tOTP Verified Successfully");
								Thread.sleep(2000);
								System.out.println("\nProcessing Payment.........");
								Thread.sleep(2000);
								System.out.println("Payment Done Successfully\n");
								Thread.sleep(3000);
								System.out.println("Order Received Successfully...... \nThank You for Choosing us....");
								Thread.sleep(1000);
								System.out.println("\nYour Order will be Delivered in 30 minutes........");
							}
							else
							{
								System.out.println("\t\t*********Payment Failed*********\n\t\t\tOTP Verification Failed");
							}
						}

						else
						{
							System.out.println("\t\t*********Payment Failed*********\n\t\t\tTotal Amount that you have entered is wrong");
						}
					 break;}

				 
				 }
				
				break;}
			}
			
			
			break;}
		
		case 2:
			{//Burger King
			System.out.println("\t\t\t*******Welcome to KFC *******\n");
			Thread.sleep(2000);
			System.out.println("Please select your Food From Below List\n");
			System.out.println("      Food                                          Cost     ");
			System.out.println("-------------------------------------------------------------");
			System.out.println("1.Grilled Chicken Bucket                           Rs. 459   ");
			System.out.println("2.Hot & Crispy Bucket                              Rs. 559   ");
			System.out.println("3.Chicken Zinger Burger                            Rs. 189   ");
			System.out.println("4.Veg Burger                                       Rs. 129   ");
			Thread.sleep(2000);
			System.out.print("\nSelect the Food By Entering (1-4) = ");
			int food = sc.nextInt();

			switch (food)
			{
			case 1://Grilled Chicken Bucket
				{
				 System.out.println("\nYou have Selected Grilled Chicken Bucket\n");
				 cost = 459;
				 Thread.sleep(2000);
				 System.out.print("Please Enter the Quantity of the Food : ");
				 quan = sc.nextInt();
				 total = (double)(cost*quan);
				 System.out.println("\nThe Total Cost of the Food = "+ total);
				 Thread.sleep(2000);
				 System.out.println("\n\t\tPlease Select the Payment Method \n1.Google Pay \n2.Phone Pay");
				 System.out.print("\nSelect the Payment Method by Entering (1 or 2) = ");
				 pay = sc.nextInt();
				 Thread.sleep(2000);
				 System.out.println("\nPlease wait We are connecting to the Payment Gateway.");

				 switch (pay)
				 {
				 case 1://Google Pay
					{System.out.println("\n\t\t\t----- Google Pay -----\n");
				 	 System.out.print("Enter the Total Amount you need to Pay : ");
					 u_total = sc.nextDouble();

					 if(u_total == total)
						{
							System.out.println("\nPlease wait we are generating OTP \n");
							Thread.sleep(3000);
							System.out.println("****** "+otp+" ******");
							System.out.print("Enter the OTP you received : ");
							u_otp = sc.nextInt();
							Thread.sleep(2000);
							

							if(u_otp == otp)
							{
								System.out.println("\t\t\tOTP Verified Successfully");
								Thread.sleep(2000);
								System.out.println("\nProcessing Payment.........");
								Thread.sleep(2000);
								System.out.println("Payment Done Successfully\n");
								Thread.sleep(3000);
								System.out.println("Order Received Successfully...... \nThank You for Choosing us....");
								Thread.sleep(1000);
								System.out.println("\nYour Order will be Delivered in 30 minutes........");
							}
							else
							{
								System.out.println("\t\t*********Payment Failed*********\n\t\t\tOTP Verification Failed");
							}
						}

						else
						{
							System.out.println("\t\t*********Payment Failed*********\n\t\t\tTotal Amount that you have entered is wrong");
						}
					 break;}

				case 2: // Phone Pay
					{System.out.println("\n\t\t\t----- Phone Pay -----\n");
				 	 System.out.print("Enter the Total Amount you need to Pay : ");
					 u_total = sc.nextDouble();

					 if(u_total == total)
						{
							System.out.println("\nPlease wait we are generating OTP \n");
							Thread.sleep(3000);
							System.out.println("****** "+otp+" ******");
							System.out.print("Enter the OTP you received : ");
							u_otp = sc.nextInt();
							Thread.sleep(2000);
							

							if(u_otp == otp)
							{
								System.out.println("\t\t\tOTP Verified Successfully");
								Thread.sleep(2000);
								System.out.println("\nProcessing Payment.........");
								Thread.sleep(2000);
								System.out.println("Payment Done Successfully\n");
								Thread.sleep(3000);
								System.out.println("Order Received Successfully...... \nThank You for Choosing us....");
								Thread.sleep(1000);
								System.out.println("\nYour Order will be Delivered in 30 minutes........");
							}
							else
							{
								System.out.println("\t\t*********Payment Failed*********\n\t\t\tOTP Verification Failed");
							}
						}

						else
						{
							System.out.println("\t\t*********Payment Failed*********\n\t\t\tTotal Amount that you have entered is wrong");
						}
					 break;}

				 
				 }
				
				break;}
			
			case 2: // Hot & Crispy Bucket
				{ 
				 System.out.println("\nYou have Selected Hot & Crispy Bucket\n");
				 cost = 559;
				 Thread.sleep(2000);
				 System.out.print("Please Enter the Quantity of the Food : ");
				 quan = sc.nextInt();
				 total = (double)(cost*quan);
				 System.out.println("\nThe Total Cost of the Food = "+ total);
				 Thread.sleep(2000);
				 System.out.println("\n\t\tPlease Select the Payment Method \n1.Google Pay \n2.Phone Pay");
				 System.out.print("\nSelect the Payment Method by Entering (1 or 2) = ");
				 pay = sc.nextInt();
				 Thread.sleep(2000);
				 System.out.println("\nPlease wait We are connecting to the Payment Gateway.");

				 switch (pay)
				 {
				 case 1: // Google Pay
					{System.out.println("\n\t\t\t----- Google Pay -----\n");
				 	 System.out.print("Enter the Total Amount you need to Pay : ");
					 u_total = sc.nextDouble();

					 if(u_total == total)
						{
							System.out.println("\nPlease wait we are generating OTP \n");
							Thread.sleep(3000);
							System.out.println("****** "+otp+" ******");
							System.out.print("Enter the OTP you received : ");
							u_otp = sc.nextInt();
							Thread.sleep(2000);
							

							if(u_otp == otp)
							{
								System.out.println("\t\t\tOTP Verified Successfully");
								Thread.sleep(2000);
								System.out.println("\nProcessing Payment.........");
								Thread.sleep(2000);
								System.out.println("Payment Done Successfully\n");
								Thread.sleep(3000);
								System.out.println("Order Received Successfully...... \nThank You for Choosing us....");
								Thread.sleep(1000);
								System.out.println("\nYour Order will be Delivered in 30 minutes........");
							}
							else
							{
								System.out.println("\t\t*********Payment Failed*********\n\t\t\tOTP Verification Failed");
							}
						}

						else
						{
							System.out.println("\t\t*********Payment Failed*********\n\t\t\tTotal Amount that you have entered is wrong");
						}
					 break;}

				case 2: // Phone Pay
					{System.out.println("\n\t\t\t----- Phone Pay -----\n");
				 	 System.out.print("Enter the Total Amount you need to Pay : ");
					 u_total = sc.nextDouble();

					 if(u_total == total)
						{
							System.out.println("\nPlease wait we are generating OTP \n");
							Thread.sleep(3000);
							System.out.println("****** "+otp+" ******");
							System.out.print("Enter the OTP you received : ");
							u_otp = sc.nextInt();
							Thread.sleep(2000);
							

							if(u_otp == otp)
							{
								System.out.println("\t\t\tOTP Verified Successfully");
								Thread.sleep(2000);
								System.out.println("\nProcessing Payment.........");
								Thread.sleep(2000);
								System.out.println("Payment Done Successfully\n");
								Thread.sleep(3000);
								System.out.println("Order Received Successfully...... \nThank You for Choosing us....");
								Thread.sleep(1000);
								System.out.println("\nYour Order will be Delivered in 30 minutes........");
							}
							else
							{
								System.out.println("\t\t*********Payment Failed*********\n\t\t\tOTP Verification Failed");
							}
						}

						else
						{
							System.out.println("\t\t*********Payment Failed*********\n\t\t\tTotal Amount that you have entered is wrong");
						}
					 break;}

				 
				 }
				
				break;}
			
			case 3: // Chicken Zinger Burger
				{ 
				 System.out.println("\nYou have Selected Chicken Zinger Burger\n");
				 cost = 189;
				 Thread.sleep(2000);
				 System.out.print("Please Enter the Quantity of the Food : ");
				 quan = sc.nextInt();
				 total = (double)(cost*quan);
				 System.out.println("\nThe Total Cost of the Food = "+ total);
				 Thread.sleep(2000);
				 System.out.println("\n\t\tPlease Select the Payment Method \n1.Google Pay \n2.Phone Pay");
				 System.out.print("\nSelect the Payment Method by Entering (1 or 2) = ");
				 pay = sc.nextInt();
				 Thread.sleep(2000);
				 System.out.println("\nPlease wait We are connecting to the Payment Gateway.");

				 switch (pay)
				 {
				 case 1: // Google Pay
					{System.out.println("\n\t\t\t----- Google Pay -----\n");
				 	 System.out.print("Enter the Total Amount you need to Pay : ");
					 u_total = sc.nextDouble();

					 if(u_total == total)
						{
							System.out.println("\nPlease wait we are generating OTP \n");
							Thread.sleep(3000);
							System.out.println("****** "+otp+" ******");
							System.out.print("Enter the OTP you received : ");
							u_otp = sc.nextInt();
							Thread.sleep(2000);
							

							if(u_otp == otp)
							{
								System.out.println("\t\t\tOTP Verified Successfully");
								Thread.sleep(2000);
								System.out.println("\nProcessing Payment.........");
								Thread.sleep(2000);
								System.out.println("Payment Done Successfully\n");
								Thread.sleep(3000);
								System.out.println("Order Received Successfully...... \nThank You for Choosing us....");
								Thread.sleep(1000);
								System.out.println("\nYour Order will be Delivered in 30 minutes........");
							}
							else
							{
								System.out.println("\t\t*********Payment Failed*********\n\t\t\tOTP Verification Failed");
							}
						}

						else
						{
							System.out.println("\t\t*********Payment Failed*********\n\t\t\tTotal Amount that you have entered is wrong");
						}
					 break;}

				case 2:  // Phone Pay
					{System.out.println("\n\t\t\t----- Phone Pay -----\n");
				 	 System.out.print("Enter the Total Amount you need to Pay : ");
					 u_total = sc.nextDouble();

					 if(u_total == total)
						{
							System.out.println("\nPlease wait we are generating OTP \n");
							Thread.sleep(3000);
							System.out.println("****** "+otp+" ******");
							System.out.print("Enter the OTP you received : ");
							u_otp = sc.nextInt();
							Thread.sleep(2000);
							

							if(u_otp == otp)
							{
								System.out.println("\t\t\tOTP Verified Successfully");
								Thread.sleep(2000);
								System.out.println("\nProcessing Payment.........");
								Thread.sleep(2000);
								System.out.println("Payment Done Successfully\n");
								Thread.sleep(3000);
								System.out.println("Order Received Successfully...... \nThank You for Choosing us....");
								Thread.sleep(1000);
								System.out.println("\nYour Order will be Delivered in 30 minutes........");
							}
							else
							{
								System.out.println("\t\t*********Payment Failed*********\n\t\t\tOTP Verification Failed");
							}
						}

						else
						{
							System.out.println("\t\t*********Payment Failed*********\n\t\t\tTotal Amount that you have entered is wrong");
						}
					 break;}

				 
				 }
				
				break;}
			
			case 4:  // Veg Burger
				{
				 System.out.println("\nYou have Selected Veg Burger\n");
				 cost = 129;
				 Thread.sleep(2000);
				 System.out.print("Please Enter the Quantity of the Food : ");
				 quan = sc.nextInt();
				 total = (double)(cost*quan);
				 System.out.println("\nThe Total Cost of the Food = "+ total);
				 Thread.sleep(2000);
				 System.out.println("\n\t\tPlease Select the Payment Method \n1.Google Pay \n2.Phone Pay");
				 System.out.print("\nSelect the Payment Method by Entering (1 or 2) = ");
				 pay = sc.nextInt();
				 Thread.sleep(2000);
				 System.out.println("\nPlease wait We are connecting to the Payment Gateway.");

				 switch (pay)
				 {
				 case 1: // Google Pay
					{System.out.println("\n\t\t\t----- Google Pay -----\n");
				 	 System.out.print("Enter the Total Amount you need to Pay : ");
					 u_total = sc.nextDouble();

					 if(u_total == total)
						{
							System.out.println("\nPlease wait we are generating OTP \n");
							Thread.sleep(3000);
							System.out.println("****** "+otp+" ******");
							System.out.print("Enter the OTP you received : ");
							u_otp = sc.nextInt();
							Thread.sleep(2000);
							

							if(u_otp == otp)
							{
								System.out.println("\t\t\tOTP Verified Successfully");
								Thread.sleep(2000);
								System.out.println("\nProcessing Payment.........");
								Thread.sleep(2000);
								System.out.println("Payment Done Successfully\n");
								Thread.sleep(3000);
								System.out.println("Order Received Successfully...... \nThank You for Choosing us....");
								Thread.sleep(1000);
								System.out.println("\nYour Order will be Delivered in 30 minutes........");
							}
							else
							{
								System.out.println("\t\t*********Payment Failed*********\n\t\t\tOTP Verification Failed");
							}
						}

						else
						{
							System.out.println("\t\t*********Payment Failed*********\n\t\t\tTotal Amount that you have entered is wrong");
						}
					 break;}

				case 2:  // Phone Pay
					{System.out.println("\n\t\t\t----- Phone Pay -----\n");
				 	 System.out.print("Enter the Total Amount you need to Pay : ");
					 u_total = sc.nextDouble();

					 if(u_total == total)
						{
							System.out.println("\nPlease wait we are generating OTP \n");
							Thread.sleep(3000);
							System.out.println("****** "+otp+" ******");
							System.out.print("Enter the OTP you received : ");
							u_otp = sc.nextInt();
							Thread.sleep(2000);
							

							if(u_otp == otp)
							{
								System.out.println("\t\t\tOTP Verified Successfully");
								Thread.sleep(2000);
								System.out.println("\nProcessing Payment.........");
								Thread.sleep(2000);
								System.out.println("Payment Done Successfully\n");
								Thread.sleep(3000);
								System.out.println("Order Received Successfully...... \nThank You for Choosing us....");
								Thread.sleep(1000);
								System.out.println("\nYour Order will be Delivered in 30 minutes........");
							}
							else
							{
								System.out.println("\t\t*********Payment Failed*********\n\t\t\tOTP Verification Failed");
							}
						}

						else
						{
							System.out.println("\t\t*********Payment Failed*********\n\t\t\tTotal Amount that you have entered is wrong");
						}
					 break;}

				 
				 }
				
				break;}
			}
			
			
			break;}
		
		case 3:
			{//Burger King
			System.out.println("\t\t\t*******Welcome to Mc Donald's *******\n");
			Thread.sleep(2000);
			System.out.println("Please select your Food From Below List\n");
			System.out.println("      Food                                          Cost     ");
			System.out.println("-------------------------------------------------------------");
			System.out.println("1.Chicken Big Mac                                 Rs. 255   ");
			System.out.println("2.Chicken Maharaja Mac                            Rs. 235   ");
			System.out.println("3.Chicken Kebab Burger                            Rs. 105   ");
			System.out.println("4.McSpicy Chicken Burger                          Rs. 185   ");
			Thread.sleep(2000);
			System.out.print("\nSelect the Food By Entering (1-4) = ");
			int food = sc.nextInt();

			switch (food)
			{
			case 1://Chicken Big Mac
				{
				 System.out.println("\nYou have Selected Chicken Big Mac\n");
				 cost = 255;
				 Thread.sleep(2000);
				 System.out.print("Please Enter the Quantity of the Food : ");
				 quan = sc.nextInt();
				 total = (double)(cost*quan);
				 System.out.println("\nThe Total Cost of the Food = "+ total);
				 Thread.sleep(2000);
				 System.out.println("\n\t\tPlease Select the Payment Method \n1.Google Pay \n2.Phone Pay");
				 System.out.print("\nSelect the Payment Method by Entering (1 or 2) = ");
				 pay = sc.nextInt();
				 Thread.sleep(2000);
				 System.out.println("\nPlease wait We are connecting to the Payment Gateway.");

				 switch (pay)
				 {
				 case 1://Google Pay
					{System.out.println("\n\t\t\t----- Google Pay -----\n");
				 	 System.out.print("Enter the Total Amount you need to Pay : ");
					 u_total = sc.nextDouble();

					 if(u_total == total)
						{
							System.out.println("\nPlease wait we are generating OTP \n");
							Thread.sleep(3000);
							System.out.println("****** "+otp+" ******");
							System.out.print("Enter the OTP you received : ");
							u_otp = sc.nextInt();
							Thread.sleep(2000);
							

							if(u_otp == otp)
							{
								System.out.println("\t\t\tOTP Verified Successfully");
								Thread.sleep(2000);
								System.out.println("\nProcessing Payment.........");
								Thread.sleep(2000);
								System.out.println("Payment Done Successfully\n");
								Thread.sleep(3000);
								System.out.println("Order Received Successfully...... \nThank You for Choosing us....");
								Thread.sleep(1000);
								System.out.println("\nYour Order will be Delivered in 30 minutes........");
							}
							else
							{
								System.out.println("\t\t*********Payment Failed*********\n\t\t\tOTP Verification Failed");
							}
						}

						else
						{
							System.out.println("\t\t*********Payment Failed*********\n\t\t\tTotal Amount that you have entered is wrong");
						}
					 break;}

				case 2: // Phone Pay
					{System.out.println("\n\t\t\t----- Phone Pay -----\n");
				 	 System.out.print("Enter the Total Amount you need to Pay : ");
					 u_total = sc.nextDouble();

					 if(u_total == total)
						{
							System.out.println("\nPlease wait we are generating OTP \n");
							Thread.sleep(3000);
							System.out.println("****** "+otp+" ******");
							System.out.print("Enter the OTP you received : ");
							u_otp = sc.nextInt();
							Thread.sleep(2000);
							

							if(u_otp == otp)
							{
								System.out.println("\t\t\tOTP Verified Successfully");
								Thread.sleep(2000);
								System.out.println("\nProcessing Payment.........");
								Thread.sleep(2000);
								System.out.println("Payment Done Successfully\n");
								Thread.sleep(3000);
								System.out.println("Order Received Successfully...... \nThank You for Choosing us....");
								Thread.sleep(1000);
								System.out.println("\nYour Order will be Delivered in 30 minutes........");
							}
							else
							{
								System.out.println("\t\t*********Payment Failed*********\n\t\t\tOTP Verification Failed");
							}
						}

						else
						{
							System.out.println("\t\t*********Payment Failed*********\n\t\t\tTotal Amount that you have entered is wrong");
						}
					 break;}

				 
				 }
				
				break;}
			
			case 2: // Chicken Maharaja Mac
				{ 
				 System.out.println("\nYou have Selected Chicken Maharaja Mac\n");
				 cost = 235;
				 Thread.sleep(2000);
				 System.out.print("Please Enter the Quantity of the Food : ");
				 quan = sc.nextInt();
				 total = (double)(cost*quan);
				 System.out.println("\nThe Total Cost of the Food = "+ total);
				 Thread.sleep(2000);
				 System.out.println("\n\t\tPlease Select the Payment Method \n1.Google Pay \n2.Phone Pay");
				 System.out.print("\nSelect the Payment Method by Entering (1 or 2) = ");
				 pay = sc.nextInt();
				 Thread.sleep(2000);
				 System.out.println("\nPlease wait We are connecting to the Payment Gateway.");

				 switch (pay)
				 {
				 case 1: // Google Pay
					{System.out.println("\n\t\t\t----- Google Pay -----\n");
				 	 System.out.print("Enter the Total Amount you need to Pay : ");
					 u_total = sc.nextDouble();

					 if(u_total == total)
						{
							System.out.println("\nPlease wait we are generating OTP \n");
							Thread.sleep(3000);
							System.out.println("****** "+otp+" ******");
							System.out.print("Enter the OTP you received : ");
							u_otp = sc.nextInt();
							Thread.sleep(2000);
							

							if(u_otp == otp)
							{
								System.out.println("\t\t\tOTP Verified Successfully");
								Thread.sleep(2000);
								System.out.println("\nProcessing Payment.........");
								Thread.sleep(2000);
								System.out.println("Payment Done Successfully\n");
								Thread.sleep(3000);
								System.out.println("Order Received Successfully...... \nThank You for Choosing us....");
								Thread.sleep(1000);
								System.out.println("\nYour Order will be Delivered in 30 minutes........");
							}
							else
							{
								System.out.println("\t\t*********Payment Failed*********\n\t\t\tOTP Verification Failed");
							}
						}

						else
						{
							System.out.println("\t\t*********Payment Failed*********\n\t\t\tTotal Amount that you have entered is wrong");
						}
					 break;}

				case 2: // Phone Pay
					{System.out.println("\n\t\t\t----- Phone Pay -----\n");
				 	 System.out.print("Enter the Total Amount you need to Pay : ");
					 u_total = sc.nextDouble();

					 if(u_total == total)
						{
							System.out.println("\nPlease wait we are generating OTP \n");
							Thread.sleep(3000);
							System.out.println("****** "+otp+" ******");
							System.out.print("Enter the OTP you received : ");
							u_otp = sc.nextInt();
							Thread.sleep(2000);
							

							if(u_otp == otp)
							{
								System.out.println("\t\t\tOTP Verified Successfully");
								Thread.sleep(2000);
								System.out.println("\nProcessing Payment.........");
								Thread.sleep(2000);
								System.out.println("Payment Done Successfully\n");
								Thread.sleep(3000);
								System.out.println("Order Received Successfully...... \nThank You for Choosing us....");
								Thread.sleep(1000);
								System.out.println("\nYour Order will be Delivered in 30 minutes........");
							}
							else
							{
								System.out.println("\t\t*********Payment Failed*********\n\t\t\tOTP Verification Failed");
							}
						}

						else
						{
							System.out.println("\t\t*********Payment Failed*********\n\t\t\tTotal Amount that you have entered is wrong");
						}
					 break;}

				 
				 }
				
				break;}
			
			case 3: // Chicken Kebab Burger
				{ 
				 System.out.println("\nYou have Selected Chicken Kebab Burger\n");
				 cost = 105;
				 Thread.sleep(2000);
				 System.out.print("Please Enter the Quantity of the Food : ");
				 quan = sc.nextInt();
				 total = (double)(cost*quan);
				 System.out.println("\nThe Total Cost of the Food = "+ total);
				 Thread.sleep(2000);
				 System.out.println("\n\t\tPlease Select the Payment Method \n1.Google Pay \n2.Phone Pay");
				 System.out.print("\nSelect the Payment Method by Entering (1 or 2) = ");
				 pay = sc.nextInt();
				 Thread.sleep(2000);
				 System.out.println("\nPlease wait We are connecting to the Payment Gateway.");

				 switch (pay)
				 {
				 case 1: // Google Pay
					{System.out.println("\n\t\t\t----- Google Pay -----\n");
				 	 System.out.print("Enter the Total Amount you need to Pay : ");
					 u_total = sc.nextDouble();

					 if(u_total == total)
						{
							System.out.println("\nPlease wait we are generating OTP \n");
							Thread.sleep(3000);
							System.out.println("****** "+otp+" ******");
							System.out.print("Enter the OTP you received : ");
							u_otp = sc.nextInt();
							Thread.sleep(2000);
							

							if(u_otp == otp)
							{
								System.out.println("\t\t\tOTP Verified Successfully");
								Thread.sleep(2000);
								System.out.println("\nProcessing Payment.........");
								Thread.sleep(2000);
								System.out.println("Payment Done Successfully\n");
								Thread.sleep(3000);
								System.out.println("Order Received Successfully...... \nThank You for Choosing us....");
								Thread.sleep(1000);
								System.out.println("\nYour Order will be Delivered in 30 minutes........");
							}
							else
							{
								System.out.println("\t\t*********Payment Failed*********\n\t\t\tOTP Verification Failed");
							}
						}

						else
						{
							System.out.println("\t\t*********Payment Failed*********\n\t\t\tTotal Amount that you have entered is wrong");
						}
					 break;}

				case 2:  // Phone Pay
					{System.out.println("\n\t\t\t----- Phone Pay -----\n");
				 	 System.out.print("Enter the Total Amount you need to Pay : ");
					 u_total = sc.nextDouble();

					 if(u_total == total)
						{
							System.out.println("\nPlease wait we are generating OTP \n");
							Thread.sleep(3000);
							System.out.println("****** "+otp+" ******");
							System.out.print("Enter the OTP you received : ");
							u_otp = sc.nextInt();
							Thread.sleep(2000);
							

							if(u_otp == otp)
							{
								System.out.println("\t\t\tOTP Verified Successfully");
								Thread.sleep(2000);
								System.out.println("\nProcessing Payment.........");
								Thread.sleep(2000);
								System.out.println("Payment Done Successfully\n");
								Thread.sleep(3000);
								System.out.println("Order Received Successfully...... \nThank You for Choosing us....");
								Thread.sleep(1000);
								System.out.println("\nYour Order will be Delivered in 30 minutes........");
							}
							else
							{
								System.out.println("\t\t*********Payment Failed*********\n\t\t\tOTP Verification Failed");
							}
						}

						else
						{
							System.out.println("\t\t*********Payment Failed*********\n\t\t\tTotal Amount that you have entered is wrong");
						}
					 break;}

				 
				 }
				
				break;}
			
			case 4:  // McSpicy Chicken Burger
				{
				 System.out.println("\nYou have Selected McSpicy Chicken Burger\n");
				 cost = 185;
				 Thread.sleep(2000);
				 System.out.print("Please Enter the Quantity of the Food : ");
				 quan = sc.nextInt();
				 total = (double)(cost*quan);
				 System.out.println("\nThe Total Cost of the Food = "+ total);
				 Thread.sleep(2000);
				 System.out.println("\n\t\tPlease Select the Payment Method \n1.Google Pay \n2.Phone Pay");
				 System.out.print("\nSelect the Payment Method by Entering (1 or 2) = ");
				 pay = sc.nextInt();
				 Thread.sleep(2000);
				 System.out.println("\nPlease wait We are connecting to the Payment Gateway.");

				 switch (pay)
				 {
				 case 1: // Google Pay
					{System.out.println("\n\t\t\t----- Google Pay -----\n");
				 	 System.out.print("Enter the Total Amount you need to Pay : ");
					 u_total = sc.nextDouble();

					 if(u_total == total)
						{
							System.out.println("\nPlease wait we are generating OTP \n");
							Thread.sleep(3000);
							System.out.println("****** "+otp+" ******");
							System.out.print("Enter the OTP you received : ");
							u_otp = sc.nextInt();
							Thread.sleep(2000);
							

							if(u_otp == otp)
							{
								System.out.println("\t\t\tOTP Verified Successfully");
								Thread.sleep(2000);
								System.out.println("\nProcessing Payment.........");
								Thread.sleep(2000);
								System.out.println("Payment Done Successfully\n");
								Thread.sleep(3000);
								System.out.println("Order Received Successfully...... \nThank You for Choosing us....");
								Thread.sleep(1000);
								System.out.println("\nYour Order will be Delivered in 30 minutes........");
							}
							else
							{
								System.out.println("\t\t*********Payment Failed*********\n\t\t\tOTP Verification Failed");
							}
						}

						else
						{
							System.out.println("\t\t*********Payment Failed*********\n\t\t\tTotal Amount that you have entered is wrong");
						}
					 break;}

				case 2:  // Phone Pay
					{System.out.println("\n\t\t\t----- Phone Pay -----\n");
				 	 System.out.print("Enter the Total Amount you need to Pay : ");
					 u_total = sc.nextDouble();

					 if(u_total == total)
						{
							System.out.println("\nPlease wait we are generating OTP \n");
							Thread.sleep(3000);
							System.out.println("****** "+otp+" ******");
							System.out.print("Enter the OTP you received : ");
							u_otp = sc.nextInt();
							Thread.sleep(2000);
							

							if(u_otp == otp)
							{
								System.out.println("\t\t\tOTP Verified Successfully");
								Thread.sleep(2000);
								System.out.println("\nProcessing Payment.........");
								Thread.sleep(2000);
								System.out.println("Payment Done Successfully\n");
								Thread.sleep(3000);
								System.out.println("Order Received Successfully...... \nThank You for Choosing us....");
								Thread.sleep(1000);
								System.out.println("\nYour Order will be Delivered in 30 minutes........");
							}
							else
							{
								System.out.println("\t\t*********Payment Failed*********\n\t\t\tOTP Verification Failed");
							}
						}

						else
						{
							System.out.println("\t\t*********Payment Failed*********\n\t\t\tTotal Amount that you have entered is wrong");
						}
					 break;}

				 
				 }
				
				break;}
			}
			
			
			break;}
		
		case 4:
			{//Dominos
			System.out.println("\t\t\t*******Welcome to Dominos*******\n");
			Thread.sleep(2000);
			System.out.println("Please select your Food From Below List\n");
			System.out.println("      Food                                          Cost     ");
			System.out.println("-------------------------------------------------------------");
			System.out.println("1.Chicken Dominator Pizza                         Rs. 369   ");
			System.out.println("2.Pepper Barbecue Chicken Pizza                   Rs. 259   ");
			System.out.println("3.Spiced Double Chicken                           Rs. 309   ");
			System.out.println("4.Chicken Maximus                                 Rs. 399   ");
			Thread.sleep(2000);
			System.out.print("\nSelect the Food By Entering (1-4) = ");
			int food = sc.nextInt();

			switch (food)
			{
			case 1://Chicken Dominator Pizza 
				{
				 System.out.println("\nYou have Selected Chicken Dominator Pizza \n");
				 cost = 369;
				 Thread.sleep(2000);
				 System.out.print("Please Enter the Quantity of the Food : ");
				 quan = sc.nextInt();
				 total = (double)(cost*quan);
				 System.out.println("\nThe Total Cost of the Food = "+ total);
				 Thread.sleep(2000);
				 System.out.println("\n\t\tPlease Select the Payment Method \n1.Google Pay \n2.Phone Pay");
				 System.out.print("\nSelect the Payment Method by Entering (1 or 2) = ");
				 pay = sc.nextInt();
				 Thread.sleep(2000);
				 System.out.println("\nPlease wait We are connecting to the Payment Gateway.");

				 switch (pay)
				 {
				 case 1://Google Pay
					{System.out.println("\n\t\t\t----- Google Pay -----\n");
				 	 System.out.print("Enter the Total Amount you need to Pay : ");
					 u_total = sc.nextDouble();

					 if(u_total == total)
						{
							System.out.println("\nPlease wait we are generating OTP \n");
							Thread.sleep(3000);
							System.out.println("****** "+otp+" ******");
							System.out.print("Enter the OTP you received : ");
							u_otp = sc.nextInt();
							Thread.sleep(2000);
							

							if(u_otp == otp)
							{
								System.out.println("\t\t\tOTP Verified Successfully");
								Thread.sleep(2000);
								System.out.println("\nProcessing Payment.........");
								Thread.sleep(2000);
								System.out.println("Payment Done Successfully\n");
								Thread.sleep(3000);
								System.out.println("Order Received Successfully...... \nThank You for Choosing us....");
								Thread.sleep(1000);
								System.out.println("\nYour Order will be Delivered in 30 minutes........");
							}
							else
							{
								System.out.println("\t\t*********Payment Failed*********\n\t\t\tOTP Verification Failed");
							}
						}

						else
						{
							System.out.println("\t\t*********Payment Failed*********\n\t\t\tTotal Amount that you have entered is wrong");
						}
					 break;}

				case 2: // Phone Pay
					{System.out.println("\n\t\t\t----- Phone Pay -----\n");
				 	 System.out.print("Enter the Total Amount you need to Pay : ");
					 u_total = sc.nextDouble();

					 if(u_total == total)
						{
							System.out.println("\nPlease wait we are generating OTP \n");
							Thread.sleep(3000);
							System.out.println("****** "+otp+" ******");
							System.out.print("Enter the OTP you received : ");
							u_otp = sc.nextInt();
							Thread.sleep(2000);
							

							if(u_otp == otp)
							{
								System.out.println("\t\t\tOTP Verified Successfully");
								Thread.sleep(2000);
								System.out.println("\nProcessing Payment.........");
								Thread.sleep(2000);
								System.out.println("Payment Done Successfully\n");
								Thread.sleep(3000);
								System.out.println("Order Received Successfully...... \nThank You for Choosing us....");
								Thread.sleep(1000);
								System.out.println("\nYour Order will be Delivered in 30 minutes........");
							}
							else
							{
								System.out.println("\t\t*********Payment Failed*********\n\t\t\tOTP Verification Failed");
							}
						}

						else
						{
							System.out.println("\t\t*********Payment Failed*********\n\t\t\tTotal Amount that you have entered is wrong");
						}
					 break;}

				 
				 }
				
				break;}
			
			case 2: // Pepper Barbecue Chicken Pizza
				{ 
				 System.out.println("\nYou have Selected Pepper Barbecue Chicken Pizza\n");
				 cost = 259;
				 Thread.sleep(2000);
				 System.out.print("Please Enter the Quantity of the Food : ");
				 quan = sc.nextInt();
				 total = (double)(cost*quan);
				 System.out.println("\nThe Total Cost of the Food = "+ total);
				 Thread.sleep(2000);
				 System.out.println("\n\t\tPlease Select the Payment Method \n1.Google Pay \n2.Phone Pay");
				 System.out.print("\nSelect the Payment Method by Entering (1 or 2) = ");
				 pay = sc.nextInt();
				 Thread.sleep(2000);
				 System.out.println("\nPlease wait We are connecting to the Payment Gateway.");

				 switch (pay)
				 {
				 case 1: // Google Pay
					{System.out.println("\n\t\t\t----- Google Pay -----\n");
				 	 System.out.print("Enter the Total Amount you need to Pay : ");
					 u_total = sc.nextDouble();

					 if(u_total == total)
						{
							System.out.println("\nPlease wait we are generating OTP \n");
							Thread.sleep(3000);
							System.out.println("****** "+otp+" ******");
							System.out.print("Enter the OTP you received : ");
							u_otp = sc.nextInt();
							Thread.sleep(2000);
							

							if(u_otp == otp)
							{
								System.out.println("\t\t\tOTP Verified Successfully");
								Thread.sleep(2000);
								System.out.println("\nProcessing Payment.........");
								Thread.sleep(2000);
								System.out.println("Payment Done Successfully\n");
								Thread.sleep(3000);
								System.out.println("Order Received Successfully...... \nThank You for Choosing us....");
								Thread.sleep(1000);
								System.out.println("\nYour Order will be Delivered in 30 minutes........");
							}
							else
							{
								System.out.println("\t\t*********Payment Failed*********\n\t\t\tOTP Verification Failed");
							}
						}

						else
						{
							System.out.println("\t\t*********Payment Failed*********\n\t\t\tTotal Amount that you have entered is wrong");
						}
					 break;}

				case 2: // Phone Pay
					{System.out.println("\n\t\t\t----- Phone Pay -----\n");
				 	 System.out.print("Enter the Total Amount you need to Pay : ");
					 u_total = sc.nextDouble();

					 if(u_total == total)
						{
							System.out.println("\nPlease wait we are generating OTP \n");
							Thread.sleep(3000);
							System.out.println("****** "+otp+" ******");
							System.out.print("Enter the OTP you received : ");
							u_otp = sc.nextInt();
							Thread.sleep(2000);
							

							if(u_otp == otp)
							{
								System.out.println("\t\t\tOTP Verified Successfully");
								Thread.sleep(2000);
								System.out.println("\nProcessing Payment.........");
								Thread.sleep(2000);
								System.out.println("Payment Done Successfully\n");
								Thread.sleep(3000);
								System.out.println("Order Received Successfully...... \nThank You for Choosing us....");
								Thread.sleep(1000);
								System.out.println("\nYour Order will be Delivered in 30 minutes........");
							}
							else
							{
								System.out.println("\t\t*********Payment Failed*********\n\t\t\tOTP Verification Failed");
							}
						}

						else
						{
							System.out.println("\t\t*********Payment Failed*********\n\t\t\tTotal Amount that you have entered is wrong");
						}
					 break;}

				 
				 }
				
				break;}
			
			case 3: // Spiced Double Chicken
				{ 
				 System.out.println("\nYou have Selected Spiced Double Chicken\n");
				 cost = 309;
				 Thread.sleep(2000);
				 System.out.print("Please Enter the Quantity of the Food : ");
				 quan = sc.nextInt();
				 total = (double)(cost*quan);
				 System.out.println("\nThe Total Cost of the Food = "+ total);
				 Thread.sleep(2000);
				 System.out.println("\n\t\tPlease Select the Payment Method \n1.Google Pay \n2.Phone Pay");
				 System.out.print("\nSelect the Payment Method by Entering (1 or 2) = ");
				 pay = sc.nextInt();
				 Thread.sleep(2000);
				 System.out.println("\nPlease wait We are connecting to the Payment Gateway.");

				 switch (pay)
				 {
				 case 1: // Google Pay
					{System.out.println("\n\t\t\t----- Google Pay -----\n");
				 	 System.out.print("Enter the Total Amount you need to Pay : ");
					 u_total = sc.nextDouble();

					 if(u_total == total)
						{
							System.out.println("\nPlease wait we are generating OTP \n");
							Thread.sleep(3000);
							System.out.println("****** "+otp+" ******");
							System.out.print("Enter the OTP you received : ");
							u_otp = sc.nextInt();
							Thread.sleep(2000);
							

							if(u_otp == otp)
							{
								System.out.println("\t\t\tOTP Verified Successfully");
								Thread.sleep(2000);
								System.out.println("\nProcessing Payment.........");
								Thread.sleep(2000);
								System.out.println("Payment Done Successfully\n");
								Thread.sleep(3000);
								System.out.println("Order Received Successfully...... \nThank You for Choosing us....");
								Thread.sleep(1000);
								System.out.println("\nYour Order will be Delivered in 30 minutes........");
							}
							else
							{
								System.out.println("\t\t*********Payment Failed*********\n\t\t\tOTP Verification Failed");
							}
						}

						else
						{
							System.out.println("\t\t*********Payment Failed*********\n\t\t\tTotal Amount that you have entered is wrong");
						}
					 break;}

				case 2:  // Phone Pay
					{System.out.println("\n\t\t\t----- Phone Pay -----\n");
				 	 System.out.print("Enter the Total Amount you need to Pay : ");
					 u_total = sc.nextDouble();

					 if(u_total == total)
						{
							System.out.println("\nPlease wait we are generating OTP \n");
							Thread.sleep(3000);
							System.out.println("****** "+otp+" ******");
							System.out.print("Enter the OTP you received : ");
							u_otp = sc.nextInt();
							Thread.sleep(2000);
							

							if(u_otp == otp)
							{
								System.out.println("\t\t\tOTP Verified Successfully");
								Thread.sleep(2000);
								System.out.println("\nProcessing Payment.........");
								Thread.sleep(2000);
								System.out.println("Payment Done Successfully\n");
								Thread.sleep(3000);
								System.out.println("Order Received Successfully...... \nThank You for Choosing us....");
								Thread.sleep(1000);
								System.out.println("\nYour Order will be Delivered in 30 minutes........");
							}
							else
							{
								System.out.println("\t\t*********Payment Failed*********\n\t\t\tOTP Verification Failed");
							}
						}

						else
						{
							System.out.println("\t\t*********Payment Failed*********\n\t\t\tTotal Amount that you have entered is wrong");
						}
					 break;}

				 
				 }
				
				break;}
			
			case 4:  // Chicken Maximus
				{
				 System.out.println("\nYou have Selected Chicken Maximus\n");
				 cost = 399;
				 Thread.sleep(2000);
				 System.out.print("Please Enter the Quantity of the Food : ");
				 quan = sc.nextInt();
				 total = (double)(cost*quan);
				 System.out.println("\nThe Total Cost of the Food = "+ total);
				 Thread.sleep(2000);
				 System.out.println("\n\t\tPlease Select the Payment Method \n1.Google Pay \n2.Phone Pay");
				 System.out.print("\nSelect the Payment Method by Entering (1 or 2) = ");
				 pay = sc.nextInt();
				 Thread.sleep(2000);
				 System.out.println("\nPlease wait We are connecting to the Payment Gateway.");

				 switch (pay)
				 {
				 case 1: // Google Pay
					{System.out.println("\n\t\t\t----- Google Pay -----\n");
				 	 System.out.print("Enter the Total Amount you need to Pay : ");
					 u_total = sc.nextDouble();

					 if(u_total == total)
						{
							System.out.println("\nPlease wait we are generating OTP \n");
							Thread.sleep(3000);
							System.out.println("****** "+otp+" ******");
							System.out.print("Enter the OTP you received : ");
							u_otp = sc.nextInt();
							Thread.sleep(2000);
							

							if(u_otp == otp)
							{
								System.out.println("\t\t\tOTP Verified Successfully");
								Thread.sleep(2000);
								System.out.println("\nProcessing Payment.........");
								Thread.sleep(2000);
								System.out.println("Payment Done Successfully\n");
								Thread.sleep(3000);
								System.out.println("Order Received Successfully...... \nThank You for Choosing us....");
								Thread.sleep(1000);
								System.out.println("\nYour Order will be Delivered in 30 minutes........");
							}
							else
							{
								System.out.println("\t\t*********Payment Failed*********\n\t\t\tOTP Verification Failed");
							}
						}

						else
						{
							System.out.println("\t\t*********Payment Failed*********\n\t\t\tTotal Amount that you have entered is wrong");
						}
					 break;}

				case 2:  // Phone Pay
					{System.out.println("\n\t\t\t----- Phone Pay -----\n");
				 	 System.out.print("Enter the Total Amount you need to Pay : ");
					 u_total = sc.nextDouble();

					 if(u_total == total)
						{
							System.out.println("\nPlease wait we are generating OTP \n");
							Thread.sleep(3000);
							System.out.println("****** "+otp+" ******");
							System.out.print("Enter the OTP you received : ");
							u_otp = sc.nextInt();
							Thread.sleep(2000);
							

							if(u_otp == otp)
							{
								System.out.println("\t\t\tOTP Verified Successfully");
								Thread.sleep(2000);
								System.out.println("\nProcessing Payment.........");
								Thread.sleep(2000);
								System.out.println("Payment Done Successfully\n");
								Thread.sleep(3000);
								System.out.println("Order Received Successfully...... \nThank You for Choosing us....");
								Thread.sleep(1000);
								System.out.println("\nYour Order will be Delivered in 30 minutes........");
							}
							else
							{
								System.out.println("\t\t*********Payment Failed*********\n\t\t\tOTP Verification Failed");
							}
						}

						else
						{
							System.out.println("\t\t*********Payment Failed*********\n\t\t\tTotal Amount that you have entered is wrong");
						}
					 break;}

				 
				 }
				
				break;}
			}
			
			
			break;}
		
		}

	}
}