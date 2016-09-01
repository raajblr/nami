package test.nami;

public class PalimdromeTest {

	public static void main(String[] args) {

		//test1();
		findSmallIndex();
	}
	
	static void test(){
		String s="madam";
		int len=s.length();
		String rev="";
		for(int k=len;k>0;k--){
			rev=rev+s.charAt(k-1);
			//System.out.println(rev);
		}
		System.out.println(rev);
		if(s.equalsIgnoreCase(rev))
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
			
	}
	
	static void test1(){
		String s="*";
		String ss="";
		int count=0;
		for(int k=0;k<5;k++){
			for(int j=0;j<5;j++){
				if(j<=k){
					System.out.print(s);
					ss=ss+s;
				}
				
				}
			System.out.println();
			ss=ss+"\n";
		}
		System.out.println(ss);
	}
	
	static void findSmallIndex(){
		int intArr[]={4,8,6,1,2,9,4};
		
		int intArrLeng=intArr.length;
		int smallNum=0;
		int indPointer=0;
		for(int k=0;k<intArrLeng;k++){
			
			if(k==0)
				smallNum=intArr[k]; //get first item to compare with
			
			if(smallNum>intArr[k]){
				smallNum=intArr[k];
				indPointer=k;
			}
			
			}
		System.out.println("Small Number is "+smallNum+" at Index: "+indPointer);
			
		}
	

}
