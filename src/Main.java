
public class Main {

	public static void main(String[] args) {
		
		System.out.println("--- LESSON 5 (helloWorld) ---");
		helloWorld();
		
		System.out.println("\n--- LESSON 6,7 (variables) ---");
		variables();
		
		System.out.println("\n--- LESSON 8,9 (ifStatements) ---");
		ifStatements();
		
		System.out.println("\n--- LESSON 10 (switchStatements) ---");
		switchStatements();	
		
		System.out.println("\n--- LESSON 11 (forLoop) ---");
		forLoop();
		
		System.out.println("\n\n--- LESSON 12 (whileLoop) ---");
		whileLoop();
		
		System.out.println("\n\n--- LESSON 13 (doWhileLoop) ---");
		doWhileLoop();
		
		System.out.println("\n\n--- LESSON 14,15 (arrays) ---");
		arrays();
		
		System.out.println("\n--- LESSON 16 (multiDimensionalArray) ---");
		multiDimensionalArray();
		
		System.out.println("\n--- LESSON 17, 18 (strings) ---");
		strings();
		
		System.out.println("\n--- LESSON 19 (miniProjectAsalSayi) ---");
		miniProjectAsalSayi();
		
		System.out.println("\n--- LESSON 20 (miniProjectSesliHarfler) ---");
		miniProjectSesliHarfler();
		
		System.out.println("\n--- LESSON 21 (miniProjectMukemmelSayi) ---");
		miniProjectMukemmelSayi();
		
		System.out.println("\n--- LESSON 22 (miniProjectArkadawSayilar) ---");
		miniProjectArkadawSayilar();
		
		System.out.println("\n--- LESSON 23 (miniProjectSayiBulma) ---");
		miniProjectSayiBulma();
	}
	
	public static void helloWorld() {
		
		System.out.println("Hello World");		
	}
		
	public static void variables() {
		
	// case sensitive, camel casing, reusability
	// Primitive data types - includes byte, short, int, long, float, double, boolean and char
	// Non-primitive data types - such as String, Arrays and Classes
		
		int number=10;
		String message="Number: ";
		System.out.println(message+number);		
	}
	
	public static void ifStatements () {
		
		int number1=44;
		int number2=25;
		int number3=30;
		int max;
		max=number1;
		
		if(max<number2) {
			max=number2;
		}
		
		if(max<number3) {
			max=number3;
		}
		
		System.out.println("maxNumber: "+max);
	}
	
	public static void switchStatements() {

		char grade='F';
		switch(grade) {
		case 'A':
			System.out.println("Perfect: you passed");
			break;
		case 'B':
			System.out.println("Very nice: you passed");
			break;
		case 'C':
			System.out.println("Good: You passed");
			break;
		case 'D':
			System.out.println("Not bad: you passed");
			break;
		case 'F':
			System.out.println("Sorry, you failed the exam");
			break;
		default:
			System.out.println("Please write to the correct grade");
			break;		
		}
		
	}
    
	public static void forLoop() {
		
		for(int i=10; i>0; i-- ) {
				
			System.out.print(i+" ");
		}		
	}

	public static void whileLoop() {
		int number=10;
		while(number>0) {
			
			System.out.print(number+" ");
			number--;
		}
	}

    public static void doWhileLoop() {
    	    	    	
    	int number=10;
    	do{
    		System.out.print(number+" ");
    		number--;
    	}while(number>0); 	
    }  
   
    public static void arrays() {
    	
      	String[] students = {"Ali", "Lara", "Josh", "David"};
    	for(int i=0;i<students.length;i++) 
    	{
    		System.out.print(students[i]+" ");
    	}
    	
    	System.out.println();
    	
    	int[] numbers= {4,8,12,9,32,5};
    	int multiply=1;
    	int max=numbers[0];
    	for(int number:numbers)
    	{
    		multiply=multiply*number;
    		if(max<number)
    		{
    			max=number;
    		}
    	}    	
    	System.out.println("Multiply: "+ multiply);
    	System.out.println("Max: "+ max);    	
    }
    
    public static void multiDimensionalArray() {
    	int[][] numbers = new int [3][3];
    	numbers[0][0]=1;
    	numbers[0][1]=2;
    	numbers[0][2]=3;
    	numbers[1][0]=4;
    	numbers[1][1]=5;
    	numbers[1][2]=6;
    	numbers[2][0]=7;
    	numbers[2][1]=8;
    	numbers[2][2]=9;
    	
    	for(int i=0;i<3;i++)
    	{  		
    	  for(int j=0;j<3;j++)
    		{
    			System.out.print(numbers[i][j]+" ");
    		}
    		System.out.println();
    	}
    	
    }

    public static void strings() {
    	
    	String message1="Bugün hava çok güzel.";
    	String message2=" Yaþasýn!";
    	
    	System.out.println("Length: "+message1.length());
    	System.out.println("5.ci element: " + message1.charAt(4));
    	System.out.println(message1.concat(message2));
    	System.out.println(message1.startsWith("A"));
    	System.out.println(message2.endsWith("!"));
    	
    	char[] charArray=new char[5];
    	message1.getChars(0, 5, charArray, 0);    	
    	System.out.println(charArray);
    	
    	System.out.println(message1.indexOf("çok"));
    	System.out.println(message1.lastIndexOf('ç'));
    	System.out.println(message1.replace(" ", "-"));
    	System.out.println(message1.substring(2,5));
    	
    	for(String kelime: message1.split(" ")) 
    	{
    		System.out.println(kelime);
    	}
    	
    	System.out.println(message1.toLowerCase());
    	System.out.println(message1.toUpperCase());
    	
    	String message3="   Bugün hava çok güzel.   ";
    	
    	System.out.println(message3.trim());
    }
    
    public static void miniProjectAsalSayi() {
    	int number=49;
    	int remainder;
    	
    	if(number==1) {
    		System.out.println("Sayý asaldýr");
    		return;
    	}
    	if(number<1) {
    		System.out.println("Geçersiz sayý");
    		return;
    	}
    	for(int i=2;i<number;i++)
    	{
    		remainder=number%i;    		
    		if(remainder==0)
    		{
    			System.out.println("Asal sayý deyil");
    			return;
    		}
    	}
    	System.out.println("Sayý asaldýr");    	
    }

    public static void miniProjectSesliHarfler() {
    	
    	char harf='u';
    	char[] inceSesliHarfler= {'E','e','Ý','i','Ö','ö','Ü','ü',};
    	char[] kalinSesliHarfler= {'A','a','I','ý','O','o','U','u'};
    	
    	for(int i=0;i<inceSesliHarfler.length;i++) {
    		if(harf==inceSesliHarfler[i])
    		{
    			System.out.println("Harf ince seslidir");
    			return;
    		}
    	}
    	
    	for(int i=0;i<kalinSesliHarfler.length;i++) {
    		if(harf==kalinSesliHarfler[i])
    		{
    			System.out.println("Harf kalýn seslidir");
    			return;
    		}
    	}
    	
    	System.out.println("Harf sesli deðil");
    	
    }

    public static void miniProjectMukemmelSayi()
    {
    	int number=13;
    	int sum=0;
    	int remainder;
    	for(int i=1;i<number;i++)
    	{
    		remainder=number%i;
    		if(remainder==0)
    		{
    			sum=sum+i;
    		}
    	}
    	if(sum==number)
    	{
    		System.out.println("Sayý mükemmeldir");
    	}
    	else
    	{
    		System.out.println("Sayý mükemmel deðil");
    	}
    }
    
    public static void miniProjectArkadawSayilar() {
    
    	int number1=220;
    	int number2=284;
    	int sum1=0, sum2=0;
    	for(int i=1;i<number1;i++)
    		
    		if(number1%i==0)
    		{
    			sum1=sum1+i;
    		}
    	{
    		
    	for(int j=1;j<number2;j++)
    	{
    		if(number2%j==0)
    		{
    			sum2=sum2+j;
    		}
    	}
    	
    	if(sum1==number2 & sum2==number1) 
    	{
    		System.out.println("Aradaþ sayýlar");
    	}
    	else
    		System.out.println("Aradaþ sayýlar deðil");    		
    		
    	}
    	
    }
    
    public static void miniProjectSayiBulma() {
    	
    	int[] numbers=new int[] {1,5,98,7,45,2,1,5,8};
    	int number=56;
    	
    	for(int number1:numbers) 
    	{
    		if(number==number1)
    		{
    			System.out.println("Sayý bulundu");
    			return;
    		}
    	}
    	System.out.println("Sayý bulunamadý");
    }
    
}
