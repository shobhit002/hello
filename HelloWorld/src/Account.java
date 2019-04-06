
class Account {
	int a;
	int b;
	public void setData(int c, int d){
		
		a=c;
		b=d;
		showData();
	}

	public void showData(){
		System.out.println("Value of A: " +a);
		System.out.println("Value of B: " +b);

	}
	
	public static void main(String args[]){
		Account obj1 = new Account();
		obj1.setData(3, 4);
		//obj1.showData();
		Account obj2 = new Account();
		obj2.setData(5, 7);
		//obj2.showData();
	}
}
