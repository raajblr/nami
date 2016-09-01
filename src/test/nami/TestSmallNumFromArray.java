package test.nami;

public class TestSmallNumFromArray {

	public static void main(String[] args) {
		TestSmallNumFromArray smalltest= new TestSmallNumFromArray();
		smalltest.findSmallIndex();

	}

	void findSmallIndex(){
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
