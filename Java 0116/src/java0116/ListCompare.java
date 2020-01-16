package java0116;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListCompare {

	public static void main(String[] args) {
		//정수 데이터를 저장하는 ArrayList 생성
		//제너릭에서는 기본형은 사용할 수 없다. - 기본형을 대체하는 Wrapper 클래스 사용
		ArrayList<Integer> al = new ArrayList<>();
		
		//데이터 삽입
		al.add(10);
		al.add(30);
		
		//데이터 1개 가져오기
		Integer e = al.get(0);
		System.out.println(e);
		
		//데이터 1개 삭제
		al.remove(0);
		
		//데이터 전체 출력
		for(Integer imsi : al) {
			System.out.println(imsi);
		}
		
		//10 과 30을 갖는 ArrayLsit 생성
		al = new ArrayList<>();
		
		//데이터 삽입
		al.add(10);
		al.add(30);
		
		//현재 시간 저장
		long start = System.currentTimeMillis();
		
		//20이라는 데이터를 10만번 2번째 칸에 삽입
		for(int i=0; i<100000; i=i++) {
			al.add(1, 20);
		}
		long end = System.currentTimeMillis();
		
		LinkedList<Integer> li = new LinkedList<>();
		li.add(10);
		li.add(30);
		
		//현재 시간 저장
		start = System.currentTimeMillis();
				
		//20이라는 데이터를 10만번 2번째 칸에 삽입
		for(int i=0; i<100000; i=i++) {
			li.add(1, 20);
		}
		
		//현재 시간 저장
		end = System.currentTimeMillis();
		System.out.println("li: " + (end-start));
		
		
		//현재 시간 저장
		start = System.currentTimeMillis();				
		//20이라는 데이터를 10만번 2번째 칸에 삽입
		for(int i=0; i<100000; i=i++) {
			li.add(1, 20);
		}
		
		
		//현재 시간 저장
		start = System.currentTimeMillis();
		
		//모든 데이터 읽어서 출력
		for(int i=0; i<al.size(); i = i++){
			System.out.println(li.get(i));
		}
		
		//현재 시간 저장
		end = System.currentTimeMillis();
		System.out.println("li: " + (end-start));

	}

}
