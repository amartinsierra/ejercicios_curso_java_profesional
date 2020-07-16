package principal;

import java.util.ArrayList;

public class Test1 {
	static double media=0.0;
	public static void main(String[] args) {
		ArrayList<Integer> nums=new ArrayList<>();
		nums.add(300);nums.add(81);nums.add(80);
		nums.add(25);nums.add(267);nums.add(459);
		/*for(Integer n:nums) {
			System.out.println(n);
		}*/
		nums.forEach(n->System.out.println(n));
		
		nums.forEach(n->media+=n);
		System.out.println("La media es "+media/nums.size());
	}
	
	
}
