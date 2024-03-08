import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Numbers {

	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<>();
		arr.add(6);
		arr.add(2);
		arr.add(4);
		arr.add(10);
		
		for(int i:arr) {
			System.out.println(i);
		}
		
		Collections.sort(arr);
		int minValue=Integer.MAX_VALUE;
		System.out.println(minValue);
		for(int i=1;i<arr.size();i++) {
			minValue=Math.min(minValue, (arr.get(i))-(arr.get(i-1)));
		}
		
		for(int i=1;i<arr.size();i++) {
			if(minValue==(arr.get(i))-arr.get(i-1)) {
				System.out.println(arr.get(i-1)+" "+arr.get(i)+" ");
			}
		}
		

	}

}
