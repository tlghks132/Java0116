package java0116;

import java.util.HashMap;
import java.util.Set;

public class MapUse {

	public static void main(String[] args) {
		// Map 인스턴스 생성 - 순서대로 출력하고 싶으면
		// HashMap를 LinkedHashMap으로 바꾸면 된다.
		HashMap<String, Object> map = new HashMap<String, Object>();

		// 데이터 저장
		map.put("baseball", "야구");
		map.put("soccer", "축구");
		map.put("volleyball", "배구");

		// 데이터 가져오기
		String obj = (String) map.get("soccer");
		System.out.println(obj.toUpperCase());
		// 없는 key의 값 가져오기 - 언어마다 다르므로 확인
		Object value = map.get("basketball");
		System.out.println(value);

		// 동일한 key에 데이터를 삽입하면 업데이트
		map.put("soccer", "발로 하는 축구");
		obj = (String) map.get("soccer");
		System.out.println(obj.toUpperCase());

		// Map의 모든 데이터를 출력 - key의 이름을 사용하지 않음
		System.out.println("===========================");

		// 모든 key값을 가져오기
		Set<String> keys = map.keySet();
		// Set을 순화
		for (String key : keys) {
			System.out.println(key + ":" + map.get(keys));
		}
	}
}
