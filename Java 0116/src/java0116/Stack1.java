package java0116;

import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		// 문자열 저장하는 스택 생성
		Stack<String> stack = new Stack<>();
		
		// 데이터 저장 push
		stack.push("안중근");
		stack.push("홍길동");
		stack.push("윤봉길");

		// 마지막 데이터 제거하면서 가져오기
		String human = stack.pop();
		System.out.println(human);

		// 마지막 데이터를 제거하지 않고 가져오기
		human = stack.peek();
		System.out.println(human);
		human = stack.peek();
		System.out.println(human);

	}

}
