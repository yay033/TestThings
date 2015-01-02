public class TestExcelSheet{
	
	public String convertToTitle(int n) {
        String s = "";
        
	while(n!=0){
            	n--;
            	s=(char)(n%26+'A')+s;
            	n=n/26;
       	}
        return s;
   	}
	public void test(){
		for(int i=1;i<1000000;i++){
			System.out.print(i+"    ");
			System.out.println(convertToTitle(i));
		}
	}
	public static void main(String[] args){
	TestExcelSheet t = new TestExcelSheet();
	t.test();	
	System.out.println("keep testing,dont stop!!!!");
	}
}
