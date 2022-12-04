import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
		
		System.out.println("Version 1 ?");
		
		String version1 = scan.nextLine();
		
		System.out.println("Version 2 ?");
		
		String version2 = scan.nextLine();
		
		System.out.println("okay");
		
		
		String[] splittedVersion1= version1.split("\\.");
				
		int arr1[] = new int[5]; 
		
		String[] splittedVersion2 = version2.split("\\.");
		
		int arr2[] = new int[5]; 
		
		
					for(int i = 0 ; i < splittedVersion1.length; i++) {
					
					  
						arr1[i] = Integer.parseInt(splittedVersion1[i]);
						
					  
				  }
			
	
					for(int i = 0 ; i < splittedVersion2.length; i++) {
						
						  
						arr2[i] = Integer.parseInt(splittedVersion2[i]);
					  
				  }
			
					
					
					
					for(int i = 0 ; i <5; i++) {
						
						
						
						if ( arr1.toString() == null ) {
							
							
						}
						
						
					}
					
					
						for(int i = 0 ; i <5; i++) {
						
						Object item2 = arr2.get(i);
						
						if ( item2 != null) {
							
							
						}
						else {
							arr2.add(i, 0);
						}
						
					}
					
					
					
						for(int i = 0 ; i < 5; i++) {
							
							System.out.println(arr1.toString());
						}
			
					
//				for(int i = 0 ; i < 5; i++) {
//					
//					
//					if( arr1.get(i) > arr2.get(i)  ) {
//						
//						
//						System.out.println("version1");
//						
//					}
//					
//					else if ( arr1.get(i) == arr2.get(i)  ) {
//						
//						System.out.println("esit");
//					}
//							
//					else if( arr1.get(i) < arr2.get(i) ) {
//						
//						System.out.println("version2");
//						
//					}
//					
//						  
//					  }
					
					
					
	}
}
