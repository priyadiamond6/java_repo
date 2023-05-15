package String;

public class String6 {

	public static void main(String[] args) {
	
		// 1. charAt - it returns char values for the particular index
		
		String S1 = "Velocity";
		
		System.out.println(S1.charAt(3));
		System.out.println(S1.charAt(7));
        System.out.println();
        
        System.out.println("Index :"+S1.charAt(3));
        System.out.println("Index :"+S1.charAt(7));
        System.out.println();
        // 2. length(); - it returns string length/size
        
        System.out.println("String Length :"+S1.length());
        
        // 3. equal - It check the equality of string with given object
        
        String S2 = "Velocity";
        String S3 = "Velocity";
        String S4 = new String ("VeloCity");
        
        System.out.println(S2.equals(S3)); // true
        System.out.println(S2.equals(S4)); // false
        System.out.println();
        //4. isEmpty
        
        String S5 = "Java";
        System.out.println(S5.isEmpty()); // false
        System.out.println();
        String S6 = "";
        System.out.println(S6.isEmpty()); // true
        System.out.println();
        
        //5. Replace -
        String S7 = "Velocity";
        System.out.println(S7.replace('c','p'));
        
        System.out.println();
        String S8 = "16/07/2022";
        System.out.println(S8.replace("/","-"));
        
        System.out.println();
        //6. ReplaceAll;
        
        String S9 = "Ruby Java Python";
        System.out.println(S9.replaceAll("Java","Selenium"));
        
        System.out.println();
        
        
        // 7. SubString - it returns substring for the given string.starting index is 
        //included and ending index is excluded
        String S10 = "Selenium Automation";// here space is also considered as index
        System.out.println(S10.substring(1,4));
        System.out.println(S10.substring(7,15));
        System.out.println(S10.substring(1));
        System.out.println(S10.substring(5));
        System.out.println(S10.substring(15));
        
        System.out.println();
        //8. IndexofChar
        String S11 = "Python Java Raby Selenium";
        
        System.out.println("index :"+S11.indexOf('a')); //1st occurence
        System.out.println("index :"+S11.indexOf('a',S11.indexOf('a')+1));
        System.out.println("index :"+S11.indexOf('a',S11.indexOf('a',S11.indexOf('a')+1)+1));
        
        System.out.println();
        
        //9.Lastindexof     
       String S12 = "Java";
       System.out.println(S12.lastIndexOf('a'));
       System.out.println();
       
       //10. To lowercase
       String S13 = "WELCOME";
       System.out.println(S13.toLowerCase());
       System.out.println();
       
       //11. To uppercase
       String S14 = "priyanka";
       System.out.println(S14.toUpperCase());
       
       //12. Trim - It removes starting & ending spaces of string
       
       String S15 = " Good Morning    ";
       System.out.println(S15);
       System.out.println(S15.trim());
       System.out.println();
       
       //13. Split // string array is return type of split
                   //split function cannot be directly used in printing statement
       String S16 = "Java/Python/Ruby";
       //System.out.println(S16.split("/"));
       
       String S17[] = S16.split("/");// shows three parts in console
       
       System.out.println(S17.length); // slash(/) splits three parts i.e. length so 3 in console
       System.out.println(S16.length());  // done by using method
       for (int i=0; i<S17.length;i++) {  // we have initialized S16 in S17 String Array S16 = S17[]
    	   System.out.println(S17[i]);    // 
       }
       
       System.out.println();
       
       String S18 = "30-04-2020";
       String S19[] = S18.split("-");
       
       for (int i=0; i<S19.length;i++) { //
    	   System.out.println(S19[i]);
       }
       
      // 14. Concat - It concatenates the specified string
        
       String S20 = "Hello";
       System.out.println(S20.concat(" "+"Java"));
       
       System.out.println();
       
      String x = "Hello";
      String y = "World";
      
       int a = 10;
       int b = 20;
       
       System.out.println(x+y); // HelloWorld
       System.out.println(a+b); // 30
       System.out.println(x+y+a+b); // HelloWorld1020
       System.out.println(a+b+x+y); //30HelloWorld
       System.out.println(x+y+(a+b)); // HelloWorld30
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}    

}
