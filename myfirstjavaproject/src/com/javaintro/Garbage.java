<<<<<<< HEAD
package com.javaintro;

public class Garbage {

	protected void finalize() {
		System.out.println("The object is destroyed by Garbage collector");
	}

	static {

		{
			Garbage d4 = new Garbage();// using method
		}
	}

	public static void main(String[] args) {
		Garbage d1 = new Garbage();
		d1 = null;// assigning the null value
		Garbage d2 = new Garbage();
		d2 = new Garbage();// reassigning the value
		new Garbage();// anonymous object
		System.gc();
	}

}
=======
package com.javaintro;

public class Garbage {

	protected void finalize() {
		System.out.println("The object is destroyed by Garbage collector");
	}

	static {

		{
			Garbage d4 = new Garbage();// using method
		}
	}

	public static void main(String[] args) {
		Garbage d1 = new Garbage();
		d1 = null;// assigning the null value
		Garbage d2 = new Garbage();
		d2 = new Garbage();// reassigning the value
		new Garbage();// anonymous object
		System.gc();
	}

}
>>>>>>> branch 'master' of https://github.com/alagandulaniteesh/corejava-niteesh
