package day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 첫 줄에 영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 
 * 이 문자열의 길이는 1,000,000을 넘지 않는다. 
 * 단어는 공백 한 개로 구분되며, 공백이 연속해서 나오는 경우는 없다. 
 * 또한 문자열은 공백으로 시작하거나 끝날 수 있다.
 * 
 * https://www.acmicpc.net/problem/1152
 */
public class Boj1152 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String cond = reader.readLine().trim();
		
		int answer = 0;
		StringTokenizer tokenizer = new StringTokenizer(cond, " ");
		
		System.out.println(tokenizer.countTokens());
	}
}

/**
 * 1. StringTokenizer.countTokens()는 토큰 개수를 확인
 * 2. String.trim() 메서드는 양쪽 끝 공백만 제거
 */