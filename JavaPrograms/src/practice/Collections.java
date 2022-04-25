package practice;

import java.util.List;
import java.util.Vector;

class Solution {
    public String convert(String s, int numRows) {

        if (numRows == 1) return s;

        StringBuilder ret = new StringBuilder();
        int n = s.length();
        int cycleLen = 2 * numRows - 2;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j + i < n; j += cycleLen) {
                ret.append(s.charAt(j + i));
                if (i != 0 && i != numRows - 1 && j + cycleLen - i < n)
                    ret.append(s.charAt(j + cycleLen - i));
            }
        }
        return ret.toString();
    }
}

public class Collections {

	public static void main(String[] args) {
		
		Solution k=new Solution();
		System.out.println(k.convert("PAYPALISHIRING", 1));
		Vector<Integer> vec=new Vector<>(2);
		vec.add(45);
		vec.add(88);
		vec.add(8);
		System.out.println(vec);
		
		System.out.println(vec.capacity());

	}

}
