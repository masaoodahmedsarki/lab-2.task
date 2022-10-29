//masaood sarki
//Roll num;56

//Create a restaurant manu in switch case where if we select any option the program should the price of that food item....



import java.util.*;
class Question6{
	public static void main(String[] args) {
	Scanner ob=new Scanner(System.in);
	System.out.println(" Welcom to masaood restaurant....");
	System.out.println(" ");
	System.out.println("This is manu: \n \n1)club sendwich.\n2)Zinger Burger.\n3)student chart.\n4)Chicken green karahi.\n5)White chiken korma .\n6)chiken pulao.\n7)kawa chai.\n8)Cold Drinks.");
System.out.println("\nPlease order! Would you wanna know prize about items\n" +
 " Enter the number of item.. ");
     int z=ob.nextInt();
	switch(z){
		case 1:
	 	System.out.println("Per club sendwich.\f Rs.500.0"); 
		break;
		case 2:
		 System.out.println("Per Zinger Birgur.\f Rs.450.0"); 
		 break;
		 	case 3:
	 	System.out.println("Per student chart.\f Rs.150.0"); 
	 	break;
	 		case 4:
	 	System.out.println("Chicken green karahi\f Rs.1200.0"); 
	 	break;
	 		case 5:
	 	System.out.println("White chiken korma.\f Rs.1300.0"); 
	 	break;
	 		case 6:
	 	System.out.println("chiken pulao plate.\f Rs.400.0"); 
	 	break;
	 		case 7:	
	 	System.out.println("kawa chai one cup.\f Rs.120"); 
	 	break;
	 		case 8:
	 	System.out.println("250ml Cold Drinks.\fRs.80"); 
		default:
		System.out.println("Sorry, This item is not available. please select among above items..");
	}
	                                                                                                                                       	                		
	}
}
