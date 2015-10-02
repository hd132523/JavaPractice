package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MelonGenreChart {
	public static void main(String[] args) {
		Map<String, List<Music>> map = new HashMap<String, List<Music>>();

		List<Music> blist = new ArrayList<Music>();
		blist.add(new Music("내 첫사랑", "베리굿"));
		blist.add(new Music("또다시사랑", "임창정"));
		blist.add(new Music("부산에가면", "박진영"));

		List<Music> dlist = new ArrayList<Music>();
		dlist.add(new Music("커피", "유재환"));
		dlist.add(new Music("다 잘될거야", "쿨"));

		map.put("발라드", blist);
		map.put("댄스", dlist);

		System.out.println("--<< 멜론 장르별 차트 >>--");
		printMap(map);

		blist.set(2, new Music("지우고 지워도", "차수경"));
		map.put("발라드", blist);

		System.out.println("--<< 발라드 3위곡 변경 >>--");
		printMap(map);

		blist.remove(0);
		map.put("발라드", blist);

		System.out.println("--<< 발라드 1위곡 삭제 >>--");
		printMap(map);

		map.clear();

		System.out.println(("--<< 전체 리스트 삭제 >>--"));
		printMap(map);

	}

	public static void printMap(Map<String, List<Music>> map) {
		for (String key : map.keySet()) {
			System.out.println("[" + key + "]");
			for (int i = 0; i < map.get(key).size(); i++) {
				System.out.println((i + 1) + ". " + map.get(key).get(i));
			}
		}
		System.out.println();
	}
}