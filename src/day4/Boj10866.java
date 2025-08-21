package day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

/**
 * 정수를 저장하는 덱(Deque)를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
 * 명령은 총 여덟 가지이다.
 * 
 * https://www.acmicpc.net/problem/10866
 */
public class Boj10866 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		Deque<Integer> deque = new ArrayDeque<>();
		StringBuilder builder = new StringBuilder();
		
		int reps = Integer.parseInt(reader.readLine());
		for (int i = 0; i < reps; i++) {
			String cond = reader.readLine();
			String[] conds = cond.split(" ");
			if (conds[0].equals("push_front")) {
				deque.addFirst(Integer.parseInt(conds[1]));
			} else if (conds[0].equals("push_back")) {
				deque.addLast(Integer.parseInt(conds[1]));
			} else if (conds[0].equals("pop_front")) {
				Integer element = deque.pollFirst();
				builder.append(element == null ? -1 : element).append('\n');
			} else if (conds[0].equals("pop_back")) {
				Integer element = deque.pollLast();
				builder.append(element == null ? -1 : element).append('\n');
			} else if (conds[0].equals("size")) {
				builder.append(deque.size()).append('\n');
			} else if (conds[0].equals("empty")) {
				builder.append(deque.isEmpty() ? 1 : 0).append('\n');
			} else if (conds[0].equals("front")) {
				Integer element = deque.peekFirst();
				builder.append(element == null ? -1 : element).append('\n');
			} else if (conds[0].equals("back")) {
				Integer element = deque.peekLast();
				builder.append(element == null ? -1 : element).append('\n');
			}
		}
		
		System.out.println(builder);
	}
}

/**
 * 1. 참조비교 equals vs ==
 * 	==
 * 		- 주소 값 비교
 * 	equals
 * 		- 내용 비교
 * 2. 우선순위 큐 Deque (LinkedList, ArrayDeque) 
 * 	ArrayDeque
 * 		- 원형 배열(circular array) 기반
 * 		- 크기가 꽉 차면 자동으로 2배 확장
 * 		- 인덱스로 직접 접근 가능 → 매우 빠름
 * 	LinkedList
 * 		- 이중 연결 리스트(doubly linked list) 기반
 * 		- 각 노드에 value, prev, next 포인터 저장
 * 		- 요소 접근 시 앞/뒤에서 순차 탐색 필요
 */
