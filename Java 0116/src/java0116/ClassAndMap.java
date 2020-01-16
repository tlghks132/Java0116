package java0116;

import java.util.HashMap;
import java.util.Set;

public class ClassAndMap {

	public static void main(String[] args) {
		//번호, 이름, 타율을 저장하는 Players 클래스의 인스턴스를 만들어서 데이터를 저장
		Player player = new Player(1, "홍길동", 0.393);
		
		//3개를 저장하는 Map을 인스턴스를 생성해서 데이터를 저장
		HashMap<String, Object>map = new HashMap<String, Object>();
		map.put("num", 2);
		map.put("name", "홍길동");
		map.put("hit", 0.387);
		
		//대부분의 IDE에서 일반 인스턴스를 사용할 때 Code Sence가 동작
		//하나의 속성을 가져올 때는 클래스가 유용하다
		//Map은 key를 기억해야 한다.
		String name = player.getName();
		name = (String)map.get("name");
		
		//전체를 출력할 때나 속성을 확장할 때는 Map이 유리
		//DTO 클래스의 인스턴스는 속성 확장이 안된다.
		//DTO 클래스의 인스턴스는 속성을 확장할려면 클래스 구조를 변경해야 한다.
		//Map은 제한이 없다
		map.put("homerun", 31);
		
		//DTO 클래스의 인스턴스는 각각의 데이터를 하나씩 출력해야 한다면 메소드를 일일이 호출: 반복문 사용 불가
		System.out.println(player.getNum());
		System.out.println(player.getName());
		System.out.println(player.getHit());
		
		//Map의 인스턴스는 keySet()을 이용해서 반복문으로 출력 가능
		Set<String> keys = map.keySet();
		for(String key:keys) {
			System.out.println(key + ":" + map.get(keys));
			
		}
		
	}
}
