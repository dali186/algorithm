package day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

/**
 * 현재 Queue의 가장 앞에 있는 문서의 ‘중요도’를 확인한다.
 * 나머지 문서들 중 현재 문서보다 중요도가 높은 문서가 하나라도 있다면, 이 문서를 인쇄하지 않고 Queue의 가장 뒤에 재배치 한다. 그렇지 않다면 바로 인쇄를 한다.
 * 
 * https://www.acmicpc.net/problem/1966
 */
public class Boj1966 {
	static class Print {
		private int priority;
		private int idx;
		
		public Print (int priority, int idx) {
			this.priority = priority;
			this.idx = idx;
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder builder = new StringBuilder();
		
		int reps = Integer.parseInt(reader.readLine());
		for (int i = 0; i < reps; i++) {
			String cond = reader.readLine();
			String[] conds = cond.split(" ");
			int docCount = Integer.parseInt(conds[0]);
			int targetDoc = Integer.parseInt(conds[1]);
			
			PriorityQueue<Print> pQueue = new PriorityQueue<>((o1, o2) -> o2.priority - o1.priority);
			String docs = reader.readLine();
			String[] docList = docs.split(" ");
			for (int j = 0; j < docList.length; j++) {
				pQueue.add(new Print(Integer.parseInt(docList[j]), j));
			}
			
			int answer = 0;
			while (true) {
				Print curPrint = pQueue.poll();
				if (curPrint.idx == targetDoc) {
					builder.append(answer + 1).append('\n');
					break;
				}
				answer++;
			}
		}
		System.out.println(builder);
	}
}
