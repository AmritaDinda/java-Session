package javasession;

public class DataTypeConcepts {

	public static void main(String[] args) {
     
	//Data type:
		
		//1. primitive data type:it takes the space in the memory --without object
		 
		     //boolean type: true/false
		     //Numeric type:
		            //a. character type: char
		            //b. Integral type:
		                      //1. Integer: byte,short,int,long
		                      //2. floating-point: float,double
	    
	
		
		//2. Non-premitive data type: it takes space in memory with object OOP.
		     
		         //Array,string,classes,Interface 
		
		
		
    //1. byte:
	  //size: 1 byte = 8 bits
	  //range: -128 to 127
		byte b = 10;
		b = 30; //overridden on b
		byte c = 20;
		byte g = -90;
		//byte h= 30.4;not allowed
		
	//2. short:
	  //size:2 bytes = 2x8 = 16 bits
	  //range:-32768 to 32767
		short s = 234;
		short s1 = 1;//not recommended cause it take more momery.
		
	//3. int:
	  //size: 4 byte = 4x8 = 32 bits
	  //range: -2147483648 to 2147483647  -2^31 to 2^31-1
		 int i = 2300;//not recommended
		 int j = 90998;
		 int k = 0;//not recommended
		 
	//4. long:
	  //size: 8 bytes = 8x8 =64 bits
	  //range:-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807   -2^63 to 2^63-1
		 long num= 12121212;
		 long distance = 98989898988983293L;//L is for denoting the long num.
		 
	//BigInteger
		 
		 
	//5. float:
	 //size: 4 bytes = 32 bits
	 //range: after . it can take upto 7 digits both positive and negative value
		float f1 = 12.33f;//f is compulsory 
		float f2 = (float)33.45;
		float f3 = 100;//100.0 allowed
		
	//6. double:
	  //size: 8 bytes = 64 bits 
	  //range: after . it can take upto 15 digits both positive and negative value  	
		double d = 12.333;//not recommended
		double d1 = 1.1;//not recommended
		
	//BigDecimal
		
	//7. char:
		//size = 2 bytes =16 bits
		//range = a-z, A-Z, 0-9
		// only take single input.
		char c1 = 'a';//a-z and A-Z
		char c3 = 'A';
		char c4 = '1';//0-9
		char c5 = '$';
		
	//8. boolean:
		//size: ~1 bits
		boolean b1 = true;
		boolean b2 = false;
		
		
		
	
		
		
		
		
		  
	}

}
