<<<<<<< HEAD
package constructors;

public class Bankaccount1 {
	int accno;
	String customername;
	double balance;
	Bankaccount1(){
		System.out.println("*********NO ARG CONSTRUCTOR************");
		accno=1;
		customername="basker";
		balance=50000.0;
		display();
	}
	Bankaccount1(int accno){
		this();
		System.out.println("*********ONE ARG CONSTRUCTOR************");
		System.out.println("account holder details");
		this.accno=accno;
		display();
		
	}
	Bankaccount1(int accno,String customername){
		this(2);
		System.out.println("*********TWO ARG CONSTRUCTOR************");
		System.out.println("Account holder details");
		this.accno=accno;
		this.customername=customername;
		display();
	}
	Bankaccount1(int accno,String customername,double balance ){
		this(3,"vasu");
		System.out.println("*********THREE ARG CONSTRUCTOR************");
		this.accno=accno;
		this.customername=customername;
		this.balance=balance;
		display();
	}

	public static void main(String[] args) {
		System.out.println("WELCOME TO OUR BANK");
		Bankaccount1 c1 = new Bankaccount1(4,"jagruth",70000);	

	}
	void display() {
		System.out.println("**************************");
		System.out.println("Accno:"+accno);
		System.out.println("CustomerName:"+customername);
		System.out.println("Balance:"+balance);
		System.out.println("**************************");
	}

}
=======
package constructors;

public class Bankaccount1 {
	int accno;
	String customername;
	double balance;
	Bankaccount1(){
		System.out.println("*********NO ARG CONSTRUCTOR************");
		accno=1;
		customername="basker";
		balance=50000.0;
		display();
	}
	Bankaccount1(int accno){
		this();
		System.out.println("*********ONE ARG CONSTRUCTOR************");
		System.out.println("account holder details");
		this.accno=accno;
		display();
		
	}
	Bankaccount1(int accno,String customername){
		this(2);
		System.out.println("*********TWO ARG CONSTRUCTOR************");
		System.out.println("Account holder details");
		this.accno=accno;
		this.customername=customername;
		display();
	}
	Bankaccount1(int accno,String customername,double balance ){
		this(3,"vasu");
		System.out.println("*********THREE ARG CONSTRUCTOR************");
		this.accno=accno;
		this.customername=customername;
		this.balance=balance;
		display();
	}

	public static void main(String[] args) {
		System.out.println("WELCOME TO OUR BANK");
		Bankaccount1 c1 = new Bankaccount1(4,"jagruth",70000);	

	}
	void display() {
		System.out.println("**************************");
		System.out.println("Accno:"+accno);
		System.out.println("CustomerName:"+customername);
		System.out.println("Balance:"+balance);
		System.out.println("**************************");
	}

}
>>>>>>> branch 'master' of https://github.com/alagandulaniteesh/corejava-niteesh
