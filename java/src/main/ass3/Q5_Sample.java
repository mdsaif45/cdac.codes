// 5. Create a Sample class to understand generic assignments using "? extends SomeClass" ,
//    "? super someclass "" and "?"".

class A<T>{
    private T t;

	public void add(T t){
		this.t = t;
	}
	public T get() { return t; }
}

public class Q5_Sample {
	public static void main(String[] args){

		A<String> s = new A<String>();

		A<Double> d = new A<Double>();

		s.add("Hello Java");
		d.add(12.5);
		System.out.println(s.get());
		System.out.println(d.get());
	}
}
