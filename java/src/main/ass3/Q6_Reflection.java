// 6. Invoke private methods of some other class using reflection.

import java.lang.reflect.Method;

class PrivateAccess {
	// Private method
	private void privateMethod() {
		System.out.println("Private Method " + "called from outside");
	}
	// Public method
	public void printData() {
		System.out.println("Public Method");
	}
}

class Q6_Reflection {
	public static void main(String[] args) throws Exception {
		PrivateAccess a = new PrivateAccess();

		// Using getDeclareMethod() method
		Method m = PrivateAccess.class.getDeclaredMethod("privateMethod");
		// Using setAccessible() method
		m.setAccessible(true);
		// Using invoke() method
		m.invoke(a);
        // a.privateMethod();   Not visible 
        a.printData();
	}
}
