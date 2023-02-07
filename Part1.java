import java.util.*;

class Part1 {
	static Scanner sc = new Scanner (System.in);
	static double total;

	//Main Method
	public static void main(String[] args) throws Exception {
		boolean b = true;
		do{
			System.out.println("\t\t\t ********** Welcome to Part I Application ********");
			System.out.println("Select the Choice \n-----------------------------");
			System.out.println("1.Number Programming\n2.Pattern Programming\n3.Zepto\n4.About Developer\n5.Exit");
			System.out.println("-----------------------------");
			System.out.print("Please enter the Input = ");
			int input = sc.nextInt();

			switch (input)
			{
			case 1:{
				numberProgram();
				break;}
			case 2:{
				pattern();
				break;}
			case 3:{
				zepto();
				break;}
			case 4:{
				creator();
				break;}
			case 5:{
				System.out.println("\t\t\t--------ThankYou-------");
				b= false;
				break;}
			default:{
				System.out.println("The Entered Input is mismatched please kindly enter the correct Input");
				}
			}
			
		}while(b);
	}
	
	//Number Program
	public static void numberProgram(){
		boolean b = true;
		do{
			System.out.println("\t\t\t*********** Welcome to Number Program ***********");
			System.out.println("Select the Program\n---------------------------------");
			System.out.println("1.Prime Number\n2.Fibonacci Number\n3.Pallindrome Number\n4.Armstrong Number\n5.Xylem Number\n6.Strong Number\n7.Adams Number\n8.Perfect Number\n9.Factors\n10.Factorial\n11.Exit");
			System.out.println("---------------------------------");
			System.out.print("Please enter the Input = ");
			int input = sc.nextInt();

			switch (input){

				//Prime
			case 1:{
				System.out.println("\t\t######### Welcome to Prime or Composite Number #########\n");
				System.out.print("Enter the Number = ");
				if(prime(sc.nextInt()))
					System.out.println("\nThe Entered number is Prime Number\n");
				else
					System.out.println("\nThe Entered number is Composite Number\n");
				break;}

				//Fibonacci
			case 2:{
				System.out.println("\t\t######### Welcome to Fibonacci Series #########");
				fabino();			
				break;}

				//Pallindrome
			case 3:{
				System.out.println("\t\t######### Welcome to Pallindrome Number #########");
				System.out.print("Enter the Number = ");
				if(pallindrome(sc.nextInt()))
					System.out.println("\nThe Entered number is Pallindrome Number\n");
				else
					System.out.println("\nThe Entered number is not a Pallindrome Number\n");
				break;}

				//Armstrong Number
			case 4:{
				System.out.println("\t\t######### Welcome to Armstrong Number #########");
				System.out.print("Enter the Number = ");
				if(armstrong(sc.nextInt()))
					System.out.println("\nThe Entered number is an Armstrong Number\n");
				else
					System.out.println("\nThe Entered number is not an Armstrong Number\n");
				
				break;}

				//Xylem Number
			case 5:{
				System.out.println("\t\t######### Welcome to Xylem or Phloem Number #########");
				System.out.print("Enter the Number = ");
				if(xylem(sc.nextInt()))
					System.out.println("\nThe Entered number is an Xylem Number\n");
				else
					System.out.println("\nThe Entered number is an Phloem Number\n");
				break;}

				//Strong Number
			case 6:{
				System.out.println("\t\t######### Welcome to Strong Number #########");
				System.out.print("Enter the Number = ");
				if(strong(sc.nextInt()))
					System.out.println("\nThe Entered number is a Strong Number\n");
				else
					System.out.println("\nThe Entered number is not a Strong Number\n");
				break;}

				//Adams Number
			case 7:{
				System.out.println("\t\t######### Welcome to Adams Number #########");
				System.out.print("Enter the Number = ");
				if(adams(sc.nextInt()))
					System.out.println("\nThe Entered Number is an Adams Number\n");
				else
					System.out.println("\nThe Entered Number is not an Adams Number\n");
				break;}

				//Perfect Number
			case 8 :{
				System.out.println("\t\t######### Welcome to Perfect Number #########");
				System.out.print("Enter the Number = ");
				if(perfect(sc.nextInt()))
					System.out.println("\nThe Entered number is a Perfect Number\n");
				else
					System.out.println("\nThe Entered number is not an Perfect Number\n");
				break;}

				//Factors of the Number
			case 9:{
				System.out.println("\t\t######### Welcome to Factors Number #########");
				factors();
				break;}

				//Factorial of the Number
			case 10:{
				System.out.println("\t\t######### Welcome to Factorial of the Number #########");
				System.out.print("Enter the Number = ");
				int res = factorial(sc.nextInt());
				System.out.println("\nThe Factorial of the entered number is " +res+"\n");

				break;}

				//Exit
			case 11:{
				System.out.println("\t\t************** Exiting Number Program **************\n");
				b=false;
				break;}


			default :{
				System.out.println("Input mismatch Please Enter the Correct Input");
			}
			}

		}while(b);
		
	}

	//Prime Number--
	public static boolean prime(int num){
		int count=0;
		for(int i= 1; i<=num; i++){
			if(num%i == 0)
				count++;
		}
		boolean res = (count == 2)? true : false;
		return res;
	}
	
	//Fibonacci--
	public static void fabino(){
		System.out.print("Enter the First Number = ");
		int n1 = sc.nextInt();
		System.out.print("Enter the Second Number = ");
		int n2 = sc.nextInt();
		int n3=0;

		System.out.print(n1+" "+n2);
		for(int i=1; i<=8; i++){
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
	}
	

	//Factorial
	public static int factorial(int n){
	
		int fact = 1;

		for(int i=n; i>=1; i--)
		{
			fact = fact*i;
		}
		return fact;
	}

	

	//Armstrong--
	public static boolean armstrong(int n){
		//counting
		int count=0;
		for(int i=n; i>0; i/=10){
			count++;
		}
		
		int prod=1;
		int sum = 0;
		for(int num = n; num>0; num/=10){
			for(int j=1; j<=count; j++){
				prod*=num%10;
			}
			sum+=prod;
			prod=1;
		}
		boolean res = (sum==n)? true : false;
		return res;
	}

	//Pallindrome--
	public static boolean pallindrome(int n){		
		int rev = 0;
		for(int i=n; i>0; i/=10){
			rev*=10;
			rev+=i%10;
		}
		boolean res = (rev==n)?true:false;
		return res;
		
	}

	//Factors--
	public static void factors(){
		System.out.print("\nEnter the Number : ");
		int n = sc.nextInt();
		int count=0;
	
		System.out.println("\nThe Factors of the Given Numbers Are = ");
		for(int i=1; i<n; i++){
			if(n%i == 0){
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println("\n\nThe Total Factors present in the entered number is = "+count);
		System.out.println("\n");
	}

	//Perfect Number--
	public static boolean perfect(int n){
		
		int sum=0;
		for(int i=1; i<n; i++){
			if(n%i==0)
				sum+=i;
		}
		boolean res = (sum == n)?true:false;

		return res;	
	}

	//Strong Number--
	public static boolean strong(int n){		
		int sum=0;
		for(int i=n; i>0; i/=10){
			int fact=1;
			for(int j=1; j<=i%10; j++){
				fact*=j;
			}
			sum+=fact;
		}
		boolean res =(sum == n)?true:false;
		 
		return res;
	}

	//Xylem Number--
	public static boolean xylem(int n){
		int s1=0,s2=0;

		for(int i=n; i>0; i/=10){
			if(i==n || i<=9)
				s1+=i%10;
			else 
				s2+=i%10;
				
		}
		boolean res = (s1==s2)? true:false;
		return res;
	}

	//Adams Number
	public static boolean adams(int n){

		int rev = 1;
		int sq = n*n;

		for (int i=n ; i>0 ;i/=10)
		{
			if(i==n)
				rev*=(i%10);
			else{
				rev*=10;
				rev+=(i%10);
				}
		}

		int rev_sq = rev*rev;
		int rr_sq = 1;

		for (int j=rev_sq; j>0 ; j/=10 )
		{
			if(j==rev_sq)
				rr_sq = (j%10);
			else{
				rr_sq*=10;
				rr_sq+=(j%10);
			}
				
		}
		boolean res =(sq == rr_sq)?true:false;
		
		return res;
	}
	//Pattern Program
	public static void pattern(){
		boolean b = true;
		do{
			System.out.println("\t\t\t ********** Welcome to Pattern Programming ********");
			System.out.println("Select the Choice \n-----------------------------");
			System.out.println("1.Square Pattern\n2.Triangle Pattern\n3.Pascal Triangles\n4.Diamond Pattern\n5.Exit");
			System.out.println("-----------------------------");
			System.out.print("Please enter the Input = ");
			int input = sc.nextInt();

			switch (input)
			{
			case 1:{
				square();
				break;}
			case 2:{
				triangle();
				break;}
			case 3:{
				pascal();
				break;}
			case 4:{
				diamond();
				break;}
			case 5:{
				System.out.println("\t\t\t--------Exiting Pattern Program-------\n");
				b= false;
				break;}
			default:{
				System.out.println("The Entered Input is mismatched please kindly enter the correct Input");
				}
			}
			
		}while(b);
		
	}

	//Triangle Pattern
	public static void triangle(){
		boolean b = true;
		do{

			System.out.println("\t\t\t ********** Welcome to Triangle Pattern ********");
			System.out.println("Select the Choice \n-----------------------------");
			System.out.println("1.Forward Facing Increasing Triangle\n2.Forward Facing Decreasing Triangle\n3.Backward Facing Increasing Triangle\n4.Backward Facing Decreasing Triangle\n5.Exit");
			System.out.println("-----------------------------");
			System.out.print("Please enter the Input = ");
			int input = sc.nextInt();

			switch (input)
			{
			case 1:{
				System.out.println("\t\t\t ********** Forward Facing Increasing Triangle ********\n");
				System.out.print("Enter the size of the matrix = ");
				ffit(sc.nextInt());
				break;}
			case 2:{
				System.out.println("\t\t\t ********** Forward Facing Decreasing Triangle ********\n");
				System.out.print("Enter the size of the matrix = ");
				ffdt(sc.nextInt());
				break;}
			case 3:{
				System.out.println("\t\t\t ********** Backward Facing Increasing Triangle ********\n");
				System.out.print("Enter the size of the matrix = ");
				bfit(sc.nextInt());
				break;}
			case 4:{
				System.out.println("\t\t\t ********** Backward Facing Decreasing Triangle ********\n");
				System.out.print("Enter the size of the matrix = ");
				bfdt(sc.nextInt());
				break;}
			case 5:{
				System.out.println("\t\t\t--------Exiting Triangle Pattern-------\n");
				b= false;
				break;}
			default:{
				System.out.println("The Entered Input is mismatched please kindly enter the correct Input");
				}
			}
			
		}while(b);
	}
		
	

	//Forward Facing Increasing Triangle
	public static void ffit(int n){
		for(int i = 0; i<n; i++){
				for(int j=0; j<n; j++){
					if(i+j>=n-1)
						System.out.print("* ");
					else 
						System.out.print("  ");
				}
				System.out.println();

			}

		
	}

	//Forward Facing Decreasing Triangle
	public static void ffdt(int n){

		for(int i = 0; i<n; i++){
				for(int j=0; j<n; j++){
					if(i+j<=n-1)
						System.out.print("* ");
					else 
						System.out.print("  ");
				}
				System.out.println();
			}
	}

	//Backward Facing Increasing Triangle
	public static void bfit(int n){
		
		for(int i = 0; i<n; i++){
				for(int j=0; j<n; j++){
					if(i>=j)
						System.out.print("* ");
					else 
						System.out.print("  ");
				}
				System.out.println();
			}
	}

	//Backward Facing Decreasing Triangle
	public static void bfdt(int n){

		for(int i = 0; i<n; i++){
				for(int j=0; j<n; j++){
					if(i<=j)
						System.out.print("* ");
					else 
						System.out.print("  ");
				}
				System.out.println();
			}
	}


	//Pascal Triangle
	public static void pascal(){
		boolean b = true;
	do{
			System.out.println("\t\t\t ********** Welcome to Pascal Triangle Program ********");
			System.out.println("Select the Choice \n-----------------------------");
			System.out.println("1.Normal Triangle\n2.Inverted Triangle\n3.Left Triangle\n4.Right Triangle\n5.Exit");
			System.out.println("-----------------------------");
			System.out.print("Please enter the Input = ");
			int input = sc.nextInt();

			switch (input)
			{
			case 1:{
				System.out.println("\t\tWelcome to Normal Triangle");
				System.out.print("Enter the Number : ");
				normalTriangle(sc.nextInt());
				break;}
			case 2:{
				System.out.print("Enter the Number : ");
				invertedTriangle(sc.nextInt());
				break;}
			case 3:{
				System.out.print("Enter the Number : ");
				leftTriangle(sc.nextInt());
				break;}
			case 4:{
				System.out.print("Enter the Number : ");
				rightTriangle(sc.nextInt());
				break;}
			case 5:{
				System.out.println("\t\t\t--------Exiting Pascal Triangle Program-------\n");
				b= false;
				break;}
			default:{
				System.out.println("The Entered Input is mismatched please kindly enter the correct Input");
				}
			}
			
		}while(b);
	}

	//Normal Triangle
	public static void normalTriangle(int n){
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(i>=n/2 && (i>=j && i+j>=n-1) )
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	//Inverted Triangle
	public static void invertedTriangle(int n){
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(i<=n/2 && (i<=j && i+j<=n-1))
					System.out.print("* ");				
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	//Left Triangle
	public static void leftTriangle(int n){
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(j<=n/2 && (i>=j && i+j<=n-1) )
					System.out.print("* ");				
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	//Right Triangle
	public static void rightTriangle(int n){
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(j>=n/2 && (i<=j && i+j>=n-1) )
					System.out.print("* ");				
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	//Diamond Pattern
	public static void diamond(){
		boolean b=true;
	do{
			System.out.println("\t\t\t ********** Welcome to Diamond Pattern ********");
			System.out.println("Select the Choice \n-----------------------------");
			System.out.println("1.Shadded Diamond\n2.Hollow Diamond\n3.Exit");
			System.out.println("-----------------------------");
			System.out.print("Please enter the Input = ");
			int input = sc.nextInt();

			switch (input)
			{
			case 1:{
				System.out.print("Enter the Number : ");
				shaddedDiamond(sc.nextInt());
				break;}
			case 2:{
				System.out.print("Enter the Number : ");
				hollowDiamond(sc.nextInt());
				break;}
			case 3:{
				System.out.println("\t\t\t--------Exiting Diamond Pattern-------\n");
				b= false;
				break;}
			default:{
				System.out.println("The Entered Input is mismatched please kindly enter the correct Input");
				}
			}
			
		}while(b);
	}

	//Shadded Diamond
	public static void shaddedDiamond(int n){
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(i>=j-n/2 && i+j<=(n-1)+(n/2) && i<=j+n/2 && i+j>=n/2 )
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	//Hollow Diamond
	public static void hollowDiamond(int n){
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(i==j-n/2 || i+j==(n-1)+(n/2) || i==j+n/2 || i+j==n/2 )
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	//Square Pattern
	public static void square(){
			System.out.println("\t\t\t ********** Welcome to Square Pattern ********\n");
			System.out.print("Enter the size of the matrix = ");
			int n = sc.nextInt();

			for(int i = 0; i<n; i++){
				for(int j=0; j<n; j++){
					if(i==0 || i==n-1 || j==0 || j==n-1)
						System.out.print("* ");
					else 
						System.out.print("  ");
				}
				System.out.println();
			}
	}

	//Zepto
	public static void zepto() throws Exception {
		System.out.println("\t\t\t******************* Welcome To Zepto *******************\n");
		System.out.println("Lazy to Dine-in, We take your and deliver at your door step, \nOrder Here...."+(char)1+(char)1+"\n");
		Thread.sleep(2000);
		System.out.println("Please Select the Resturant \n1.Burger King \n2.KFC \n3.McDonald's \n4.Dominos");
		Thread.sleep(1000);
		System.out.print("\nEnter the Hotel S.No.(1-4) = ");
		int hot = sc.nextInt();

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
				//Chicken Whopper
			case 1:{
				 System.out.println("\nYou have Selected Chicken Whooper\n");
				 int cost = 199;
				 Thread.sleep(2000);
				 System.out.print("Please Enter the Quantity of the Food : ");
				 int quan = sc.nextInt();
				 total = (double)(cost*quan);
				 System.out.println("\nThe Total Cost of the Food = "+ total);
				 Thread.sleep(2000);


				 System.out.println("\n\t\tPlease Select the Payment Method \n1.Google Pay \n2.Phone Pay");
				 System.out.print("\nSelect the Payment Method by Entering (1 or 2) = ");

				 payment(sc.nextInt());
				 
				 break;}
			
			case 2: // Crispy Chicken Burger
				{ 
				 System.out.println("\nYou have Selected Crispy Chicken Burger\n");
				 int cost = 99;
				 Thread.sleep(2000);
				 System.out.print("Please Enter the Quantity of the Food : ");
				 int quan = sc.nextInt();
				 total = (double)(cost*quan);
				 System.out.println("\nThe Total Cost of the Food = "+ total);
				 Thread.sleep(2000);
				 System.out.println("\n\t\tPlease Select the Payment Method \n1.Google Pay \n2.Phone Pay");
				 System.out.print("\nSelect the Payment Method by Entering (1 or 2) = ");

				 payment(sc.nextInt());
				
				break;}
			
			case 3: // Chicken Whopper Double Patty
				{ 
				 System.out.println("\nYou have Selected Chicken Whopper Double Patty\n");
				 int cost = 259;
				 Thread.sleep(2000);
				 System.out.print("Please Enter the Quantity of the Food : ");
				 int quan = sc.nextInt();
				 total = (double)(cost*quan);
				 System.out.println("\nThe Total Cost of the Food = "+ total);
				 Thread.sleep(2000);
				 System.out.println("\n\t\tPlease Select the Payment Method \n1.Google Pay \n2.Phone Pay");
				 System.out.print("\nSelect the Payment Method by Entering (1 or 2) = ");

				 payment(sc.nextInt());
				
				break;}
			
			case 4:  // Chicken Tandoori Burger
				{
				 System.out.println("\nYou have Selected Chicken Tandoori Burger\n");
				 int cost = 209;
				 Thread.sleep(2000);
				 System.out.print("Please Enter the Quantity of the Food : ");
				 int quan = sc.nextInt();
				 total = (double)(cost*quan);
				 System.out.println("\nThe Total Cost of the Food = "+ total);
				 Thread.sleep(2000);
				 System.out.println("\n\t\tPlease Select the Payment Method \n1.Google Pay \n2.Phone Pay");
				 System.out.print("\nSelect the Payment Method by Entering (1 or 2) = ");

				 payment(sc.nextInt());

				 break;}
			}
			}
		case 2:
			{//KFC
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
				 int cost = 459;
				 Thread.sleep(2000);
				 System.out.print("Please Enter the Quantity of the Food : ");
				 int quan = sc.nextInt();
				 total = (double)(cost*quan);
				 System.out.println("\nThe Total Cost of the Food = "+ total);
				 Thread.sleep(2000);
				 System.out.println("\n\t\tPlease Select the Payment Method \n1.Google Pay \n2.Phone Pay");
				 System.out.print("\nSelect the Payment Method by Entering (1 or 2) = ");

				 payment(sc.nextInt());
				 
				 break;}
			
			case 2: // Hot & Crispy Bucket
				{ 
				 System.out.println("\nYou have Selected Hot & Crispy Bucket\n");
				 int cost = 559;
				 Thread.sleep(2000);
				 System.out.print("Please Enter the Quantity of the Food : ");
				 int quan = sc.nextInt();
				 total = (double)(cost*quan);
				 System.out.println("\nThe Total Cost of the Food = "+ total);
				 Thread.sleep(2000);
				 System.out.println("\n\t\tPlease Select the Payment Method \n1.Google Pay \n2.Phone Pay");
				 System.out.print("\nSelect the Payment Method by Entering (1 or 2) = ");
				 
				 payment(sc.nextInt());
				 
				 break;}
			
			case 3: // Chicken Zinger Burger
				{ 
				 System.out.println("\nYou have Selected Chicken Zinger Burger\n");
				 int cost = 189;
				 Thread.sleep(2000);
				 System.out.print("Please Enter the Quantity of the Food : ");
				 int quan = sc.nextInt();
				 total = (double)(cost*quan);
				 System.out.println("\nThe Total Cost of the Food = "+ total);
				 Thread.sleep(2000);
				 System.out.println("\n\t\tPlease Select the Payment Method \n1.Google Pay \n2.Phone Pay");
				 System.out.print("\nSelect the Payment Method by Entering (1 or 2) = ");
				 
				 payment(sc.nextInt());
				 
				 break;}
			
			case 4:  // Veg Burger
				{
				 System.out.println("\nYou have Selected Veg Burger\n");
				 int cost = 129;
				 Thread.sleep(2000);
				 System.out.print("Please Enter the Quantity of the Food : ");
				 int quan = sc.nextInt();
				 total = (double)(cost*quan);
				 System.out.println("\nThe Total Cost of the Food = "+ total);
				 Thread.sleep(2000);
				 System.out.println("\n\t\tPlease Select the Payment Method \n1.Google Pay \n2.Phone Pay");
				 System.out.print("\nSelect the Payment Method by Entering (1 or 2) = ");
				 
				 payment(sc.nextInt());
				 
				 break;}
			}
			}
		case 3:
			{//Mc Donalds
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
				 int cost = 255;
				 Thread.sleep(2000);
				 System.out.print("Please Enter the Quantity of the Food : ");
				 int quan = sc.nextInt();
				 total = (double)(cost*quan);
				 System.out.println("\nThe Total Cost of the Food = "+ total);
				 Thread.sleep(2000);
				 System.out.println("\n\t\tPlease Select the Payment Method \n1.Google Pay \n2.Phone Pay");
				 System.out.print("\nSelect the Payment Method by Entering (1 or 2) = ");
				 
				 payment(sc.nextInt());
				 
				 break;}
			
			case 2: // Chicken Maharaja Mac
				{ 
				 System.out.println("\nYou have Selected Chicken Maharaja Mac\n");
				 int cost = 235;
				 Thread.sleep(2000);
				 System.out.print("Please Enter the Quantity of the Food : ");
				 int quan = sc.nextInt();
				 total = (double)(cost*quan);
				 System.out.println("\nThe Total Cost of the Food = "+ total);
				 Thread.sleep(2000);
				 System.out.println("\n\t\tPlease Select the Payment Method \n1.Google Pay \n2.Phone Pay");
				 System.out.print("\nSelect the Payment Method by Entering (1 or 2) = ");
				 
				 payment(sc.nextInt());
				 
				 break;}
			
			case 3: // Chicken Kebab Burger
				{ 
				 System.out.println("\nYou have Selected Chicken Kebab Burger\n");
				 int cost = 105;
				 Thread.sleep(2000);
				 System.out.print("Please Enter the Quantity of the Food : ");
				 int quan = sc.nextInt();
				 total = (double)(cost*quan);
				 System.out.println("\nThe Total Cost of the Food = "+ total);
				 Thread.sleep(2000);
				 System.out.println("\n\t\tPlease Select the Payment Method \n1.Google Pay \n2.Phone Pay");
				 System.out.print("\nSelect the Payment Method by Entering (1 or 2) = ");
				 
				 payment(sc.nextInt());
				 
				 break;}
			
			case 4:  // McSpicy Chicken Burger
				{
				 System.out.println("\nYou have Selected McSpicy Chicken Burger\n");
				 int cost = 185;
				 Thread.sleep(2000);
				 System.out.print("Please Enter the Quantity of the Food : ");
				 int quan = sc.nextInt();
				 total = (double)(cost*quan);
				 System.out.println("\nThe Total Cost of the Food = "+ total);
				 Thread.sleep(2000);
				 System.out.println("\n\t\tPlease Select the Payment Method \n1.Google Pay \n2.Phone Pay");
				 System.out.print("\nSelect the Payment Method by Entering (1 or 2) = ");
				 
				 payment(sc.nextInt());
				 break;}
			}
			}	
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
				 int cost = 369;
				 Thread.sleep(2000);
				 System.out.print("Please Enter the Quantity of the Food : ");
				 int quan = sc.nextInt();
				 total = (double)(cost*quan);
				 System.out.println("\nThe Total Cost of the Food = "+ total);
				 Thread.sleep(2000);
				 System.out.println("\n\t\tPlease Select the Payment Method \n1.Google Pay \n2.Phone Pay");
				 System.out.print("\nSelect the Payment Method by Entering (1 or 2) = ");
				 
				 payment(sc.nextInt());
				 
				 break;}
			
			case 2: // Pepper Barbecue Chicken Pizza
				{ 
				 System.out.println("\nYou have Selected Pepper Barbecue Chicken Pizza\n");
				 int cost = 259;
				 Thread.sleep(2000);
				 System.out.print("Please Enter the Quantity of the Food : ");
				 int quan = sc.nextInt();
				 total = (double)(cost*quan);
				 System.out.println("\nThe Total Cost of the Food = "+ total);
				 Thread.sleep(2000);
				 System.out.println("\n\t\tPlease Select the Payment Method \n1.Google Pay \n2.Phone Pay");
				 System.out.print("\nSelect the Payment Method by Entering (1 or 2) = ");
				 
				 payment(sc.nextInt());
				 
				 break;}
			
			case 3: // Spiced Double Chicken
				{ 
				 System.out.println("\nYou have Selected Spiced Double Chicken\n");
				 int cost = 309;
				 Thread.sleep(2000);
				 System.out.print("Please Enter the Quantity of the Food : ");
				 int quan = sc.nextInt();
				 total = (double)(cost*quan);
				 System.out.println("\nThe Total Cost of the Food = "+ total);
				 Thread.sleep(2000);
				 System.out.println("\n\t\tPlease Select the Payment Method \n1.Google Pay \n2.Phone Pay");
				 System.out.print("\nSelect the Payment Method by Entering (1 or 2) = ");
				 
				 payment(sc.nextInt());
				 
				 break;}
			
			case 4:  // Chicken Maximus
				{
				 System.out.println("\nYou have Selected Chicken Maximus\n");
				 int cost = 399;
				 Thread.sleep(2000);
				 System.out.print("Please Enter the Quantity of the Food : ");
				 int quan = sc.nextInt();
				 total = (double)(cost*quan);
				 System.out.println("\nThe Total Cost of the Food = "+ total);
				 Thread.sleep(2000);
				 System.out.println("\n\t\tPlease Select the Payment Method \n1.Google Pay \n2.Phone Pay");
				 System.out.print("\nSelect the Payment Method by Entering (1 or 2) = ");
				 
				 payment(sc.nextInt());
				 break;}
				 }
				 }
		}
	}	

	//About Developer
	public static void creator(){
		System.out.println("\t\t\t-------------- About the Creator -----------\n");
		System.out.println("\t\t\t                  Suriya J \2");
		System.out.println("\t\t\t                 03-02-2023");
		System.out.println("\t\t\t      Chase the thing which exicites you. \3\3\3\n");
	}

	//After OTP Verification
	public static void zepOtp() throws Exception {
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
	
	//After Total Verification
	public static void zepTotal() throws Exception {
		int otp = (int) (Math.random()*9999+9999);
		System.out.println("\nPlease wait we are generating OTP \n");
		Thread.sleep(3000);
		System.out.println("****** "+otp+" ******");
		System.out.print("Enter the OTP you received : ");
		int u_otp = sc.nextInt();
		Thread.sleep(2000);
		if(u_otp == otp){
			zepOtp();
			}
			else{
				System.out.println("\t\t*********Payment Failed*********\n\t\t\tOTP Verification Failed");
				}
	}
	
	//Google Pay
	public static void gPay() throws Exception{
		System.out.println("\n\t\t\t----- Google Pay -----\n");
				 	 System.out.print("Enter the Total Amount you need to Pay : ");
					 double u_total = sc.nextDouble();

					 if(u_total == total)
						{
						 	zepTotal();
						}

						else
						{
							System.out.println("\t\t*********Payment Failed*********\n\t\t\tTotal Amount that you have entered is wrong");
						}
	}
	//Phone Pay
	public static void phonePay() throws Exception{
		System.out.println("\n\t\t\t----- Phone Pay -----\n");
				 	System.out.print("Enter the Total Amount you need to Pay : ");
					double u_total = sc.nextDouble();

					 if(u_total == total)
						{
							zepTotal();
						}

						else
						{
							System.out.println("\t\t*********Payment Failed*********\n\t\t\tTotal Amount that you have entered is wrong");
						}
	}
	
	//Choosing Payment Gateway
	public static void payment(int pay) throws Exception{
		System.out.println("\nPlease wait We are connecting to the Payment Gateway.");

				 switch (pay)
				 {
					 //Google Pay
				 case 1:{
					 gPay();
					 break;}

					// Phone Pay
				case 2: {phonePay();
					 break;}

				 
				 }
	}
}

	