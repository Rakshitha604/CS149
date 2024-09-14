import java.util.Scanner;
class palindrome{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.");
		int num=sc.nextInt();
		int originalnum=num;
		int rev=0;
			while(num!=0) {
            			int a = num % 10; 
            			rev = rev * 10 + a; 
            			num = num / 10; 
        		}
			if(originalnum==rev){
				System.out.println("palindrome");
			}
			else{
				System.out.println("not palindrome");
			}

	}
}