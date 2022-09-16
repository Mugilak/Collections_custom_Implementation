package customarraylistProgram;

public class CArrayListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomArrayListwithGenerics<String> alg = new CustomArrayListwithGenerics<>();
		
			alg.add("hi");
			alg.add("hello");
			alg.add("hii");
			alg.add("hello");
			alg.add("hii");
			alg.add("hello");
			alg.add("hi");
			alg.add("hello");
			alg.add("hii");
			alg.add("hello");
			alg.add("hii");
			alg.add("hello");
			
		System.out.println(alg);
		System.out.println(alg.remove("hi"));
		System.out.println(alg);

		customArrayList al = new customArrayList();           //ArrayList without generics
		al.add(12);
		al.add(13);
		al.add(14);
		al.add(15);
		al.add(12);
		al.add(13);
		al.add(14);
		al.add(15);
		al.add(66);
		al.add(77);
		System.out.println(al);
		System.out.println(al.isFull());
		al.add(9);
		System.out.println(al.isEmpty());
		System.out.println(al.remove(13));
		System.out.println(al);
	}

}
