package TreeMap;

public class TreeMap {
	public static void main(String[] args) {
		java.util.TreeMap<Integer, Integer> ref = new java.util.TreeMap<Integer, Integer>((	y,x)->1);
		ref.put(10, 5);
		ref.put(2, 4);
		ref.put(18, 3);
		System.out.println(ref);
	}
}
