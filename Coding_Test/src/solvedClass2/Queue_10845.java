package solvedClass2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Queue_10845 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		Queue<Integer> qu = new LinkedList<Integer>();
		int N = Integer.parseInt(br.readLine());
		
		
		for (int i = 0; i < N; i++) {
			String line = br.readLine();
			st = new StringTokenizer(line);
			if (st.countTokens() > 1) {
				st.nextToken();
				qu.offer(Integer.parseInt(st.nextToken()));
				System.out.println(qu.toString());
			}else if(line.equals("pop")) {
				if (qu.isEmpty()) {
					bw.write("-1" +"\n");
				}else {
					bw.write(qu.peek()+"\n");
					qu.poll();
				}
			}else if(line.equals("empty")) {
				bw.write(qu.isEmpty() ? "1" : "0");
				bw.write("\n");
			}else if(line.equals("back")){
				if (qu.isEmpty()) {
					bw.write("-1"+"\n");
				}else {
					System.out.println(qu.peek()+"백");
					bw.write(qu.peek()+"\n");
				}
			}else if(line.equals("front")) {
				if (qu.isEmpty()) {
					bw.write("-1"+"\n");
				}else {
					int num = qu.poll();
					System.out.println(num+"프론트");
					bw.write(num+"\n");
				}
			}
			if (line.equals("size")) {
				System.out.println(qu.size()+"사이즈");
				bw.write(qu.size()+"\n");
			}
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
