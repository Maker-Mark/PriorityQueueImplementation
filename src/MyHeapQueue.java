import java.util.ArrayList;
import java.util.Comparator;

//Has two constructors, a default, that takes no comparator and a non-default that does take one.
//


public class MyHeapQueue<E> implements MyPriorityQueue<E> {
	
	private ArrayList<E> theHeap;
	private Comparator<E> comp;
	
	
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean add(E e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E peek() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E poll() {
		return null;
		// TODO Auto-generated method stub
		
	}
	
	
	

}
