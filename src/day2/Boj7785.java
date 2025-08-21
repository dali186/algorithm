package day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 첫째 줄에 로그에 기록된 출입 기록의 수 n이 주어진다. (2 ≤ n ≤ 106) 
 * 다음 n개의 줄에는 출입 기록이 순서대로 주어지며, 각 사람의 이름이 주어지고 "enter"나 "leave"가 주어진다. 
 * "enter"인 경우는 출근, "leave"인 경우는 퇴근이다. 회사에는 동명이인이 없으며, 대소문자가 다른 경우에는 다른 이름이다. 
 * 사람들의 이름은 알파벳 대소문자로 구성된 5글자 이하의 문자열이다.
 * 
 * https://www.acmicpc.net/problem/7785
 */
public class Boj7785 {
	private static final String ENTER = "enter";
	private static final String LEAVE = "leave";
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		Set<String> answerSet = new HashSet<>();
		int reps = Integer.parseInt(reader.readLine());
		for (int i = 0; i < reps; i++) {
			String cond = reader.readLine();
			String[] conds = cond.split(" ");
			if (conds[1].equals(ENTER)) {
				answerSet.add(conds[0]);
			} else if (conds[1].equals(LEAVE)) {
				answerSet.remove(conds[0]);
			}
		}
		List<String> answers = new ArrayList<String>(answerSet);
		answers.sort(Comparator.reverseOrder());
	
		StringBuilder builder = new StringBuilder();
		for (String answer : answers) {
			builder.append(answer).append('\n');
		}
		
		System.out.println(builder);
	}
}
