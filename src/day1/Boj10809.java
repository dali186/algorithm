package day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 알파벳 소문자로만 이루어진 단어 S가 주어진다. 
 * 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
 * 
 * https://www.acmicpc.net/problem/10809
 */
public class Boj10809 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String cond = reader.readLine();
		
		int[] answer = new int[26];
		Arrays.fill(answer, -1);
		
		for (int i = 0; i < cond.length(); i++) {
			int idx = cond.charAt(i) - 'a';
			if (answer[idx] == -1) {
				answer[idx] = i;
			}
		}
		
		StringBuilder builder = new StringBuilder();
		for (int ans : answer) {
			builder.append(ans + " ");
		}
		
		System.out.println(builder);
	}
}

/**
 * 1. 아스키코드 값 외울 필요 없이 ''으로 유추
 * 2. 주어진 문제 확인
 */