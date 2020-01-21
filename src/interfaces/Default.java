package interfaces;

public interface Default {

//	default void sort(Comparator<? super E> c) {
//		Collections.sort(this, c);
//	}
	
	default void teste(String msg) {
		System.out.println(msg);
	}
	
	

}
