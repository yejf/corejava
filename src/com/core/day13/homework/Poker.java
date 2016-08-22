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
 * @author ������
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
	 * ��ȡ�˿���
	 * @return
	 */
	public List<Card> getPoker() {
		return new ArrayList<>(cards);
	}

	/****
	 * ϴ��
	 * @param poker
	 */
	public void shuffle(List<Card> poker) {
		Collections.shuffle(poker);
	}

	/****
	 * ����
	 * @param poker 
	 * @param person
	 * @param cards
	 */
	public void play(List<Card> poker, int person, int cards) {
		for (int j = 0; j < person; j++) {
			List<Card> npoker = this.give(poker, cards);
			System.out.printf("���:[%d]\n\t", j+1);
			for (Card c : npoker) {
				System.out.printf("%-5s", c);
			}
			System.out.println();
		}

	}

	private List<Card> give(List<Card> poker, int cards) {
		//�ж�
		if(cards > poker.size()) {
			//ʣ�µ��Ʋ����� cards ��
			cards = poker.size(); // ��ʣ�µĶ�����
		}
		//��ȡ��������
		List<Card> npoker = poker.subList(0, cards);
		//���°ѷ���������ӵ��µļ�����
		List<Card> npoker1 = new ArrayList<>(npoker);
		//��������Ҫ���
		npoker.clear();
		//�� npoker1����
		Collections.sort(npoker1);
		
		/*Collections.sort(npoker1, new Comparator<Card>() {
			@Override
			public int compare(Card o1, Card o2) {
				//�˴�ʹ�� �ַ��Ĵ�С���Ƚ�
				return o1.getRank().toString()
						.compareTo(o2.getRank().toString());
			};
		});*/
		
		//����
		return npoker1;
	}
	
	
}


