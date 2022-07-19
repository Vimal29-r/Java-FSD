package map;
import java.util.*;
public class Impmap {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		System.out.println("HashMap");
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1,"Qwerty");
		hm.put(2,"Vimalraj");
		hm.put(3,"raj");
		for(Map.Entry i:hm.entrySet())
		{
			System.out.println(i.getKey()+" "+i.getValue());
		}
		
		System.out.println("Hash Table");
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
		ht.put(4,"String4");
		ht.put(5,"String5");
		ht.put(6,"String6");
		for(Map.Entry i:ht.entrySet())
		{
			System.out.println(i.getKey()+" "+i.getValue());
		}
		
		System.out.println("Tree Map");
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
		tm.put(7,"String7");
		tm.put(8,"String8");
		tm.put(9,"String9");
		for(Map.Entry i:tm.entrySet())
		{
			System.out.println(i.getKey()+" "+i.getValue());
		}
	}

}
