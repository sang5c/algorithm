package programmers;

import java.util.*;

public class q12915 {
	public String[] solution(String[] strings, int n) {
		String[] answer;
		Arrays.sort(strings);

		List<String> temp = new ArrayList<>(Arrays.asList(strings));
		List<String> temp2 = new ArrayList<>();

		for (char a = 'a'; a <= 'z'; a++) {
			for (String t : strings) {
				if (t.charAt(n) == a) {
					temp2.add(t);
					temp.remove(t);
				}
			}
		}
		answer = temp2.toArray(new String[0]);
		return answer;
	}
}
