package com.core.day13.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.core.day12.homework.Kind;
import com.core.day12.homework.Rank;

/**
 * 
 */

/**
 * @author 蔡丽丽
 *
 */
public class Poker {
	private static final List<Card> cards = new ArrayList<>();

	static {
		Rank[] rank = Rank.values();
		Kind[] kind = Kind.values();
		for (int i = 0; i < kind.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				Card c = new Card(kind[i], rank[j]);
				cards.add(c);
			}
		}
	}

	/****
	 * 获取扑克牌
	 * @return
	 */
	public List<Card> getPoker() {
		return new ArrayList<>(cards);
	}

	/****
	 * 洗牌
	 * @param poker
	 */
	public void shuffle(List<Card> poker) {
		Collections.shuffle(poker);
	}

	/****
	 * 玩牌
	 * @param poker 
	 * @param person
	 * @param cards
	 */
	public void play(List<Card> poker, int person, int cards) {
		for (int j = 0; j < person; j++) {
			List<Card> npoker = this.give(poker, cards);
			System.out.printf("玩家:[%d]\n\t", j+1);
			for (Card c : npoker) {
				System.out.printf("%-5s", c);
			}
			System.out.println();
		}

	}

	private List<Card> give(List<Card> poker, int cards) {
		//判断
		if(cards > poker.size()) {
			//剩下的牌不够发 cards 张
			cards = poker.size(); // 把剩下的都给他
		}
		//获取发出的牌
		List<Card> npoker = poker.subList(0, cards);
		//重新把发出的牌添加到新的集合中
		List<Card> npoker1 = new ArrayList<>(npoker);
		//发出的牌要清空
		npoker.clear();
		//给 npoker1排序
		Collections.sort(npoker1);
		
		/*Collections.sort(npoker1, new Comparator<Card>() {
			@Override
			public int compare(Card o1, Card o2) {
				//此处使用 字符的大小来比较
				return o1.getRank().toString()
						.compareTo(o2.getRank().toString());
			};
		});*/
		
		//返回
		return npoker1;
	}
	
	
}


