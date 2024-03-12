package next0222;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {

	public static void main(String[] args) {
		List<Character> characters = List.of('A','1','A','B','Z','F','2','3');
	
	Set<Character> treeSet = new TreeSet<>(characters);
	//숫자 문자 순으로 정렬
	System.out.println("treeSet " + treeSet);
	
	Set<Character> linkedHashSet = new LinkedHashSet<>(characters);
	//순서 상관없이 출력
	System.out.println("linkedHashSet " + linkedHashSet);
	
	Set<Character> hashSet = new HashSet<>(characters); 
	//문자, 숫자 상관없이 순서대로 출력
	System.out.println("hashSet " + hashSet);
	
	}

}
