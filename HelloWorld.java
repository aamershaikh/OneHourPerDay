public class HelloWorld {
	public static void main (String args[])
	{
		helloWorld();
		addNumbers(3,6);
		numberOfCharactersInName("Aamer");
		reverseName("Aamer");
		sumOfNumbersInArray();
	}
	
	public static void helloWorld() {
		System.out.println("Hello World!!");
		
	}
	
	public static void addNumbers(int a, int b) {
		
		System.out.println("Sum is : "+(a+b));
		
	}
	
	public static void numberOfCharactersInName(String name)
	{
		System.out.println(name.length());
		
	}
	
	public static void reverseName(String name)
	{
		StringBuilder reverseName = new StringBuilder();
		for(int i=name.length()-1; i>=0; i--) {
			
			reverseName = reverseName.append(name.charAt(i));
					
		}
		
		System.out.println("Reverse Name is :"+reverseName);
		
	}
	
	public static void sumOfNumbersInArray() {
		
		int[] numArr = {1,2,3,4,5};
		int sum = 0;
		
		for(int i=0; i<=(numArr.length)-1; i++)
		{
			
			sum = sum+ numArr[i];
			
		}
		
		System.out.println(sum);
		
	}
	
	
}