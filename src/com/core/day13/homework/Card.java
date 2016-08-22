/**
 * 
 */
package com.core.day13.homework;

import com.core.day12.homework.Kind;
import com.core.day12.homework.Rank;

/**
 * @author ������
 *
 */
public class Card implements Comparable<Card>{
	
    private Kind kind;
    private Rank rank;
	/**
	 * @return the kind
	 */
	public Kind getKind() {
		return kind;
	}
	/**
	 * @param kind the kind to set
	 */
	public void setKind(Kind kind) {
		this.kind = kind;
	}
	/**
	 * @return the rank
	 */
	public Rank getRank() {
		return rank;
	}
	/**
	 * @param rank the rank to set
	 */
	public void setRank(Rank rank) {
		this.rank = rank;
	}
	/**
	 * @param kind
	 * @param rank
	 */
	public Card(Kind kind, Rank rank) {
		super();
		this.kind = kind;
		this.rank = rank;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(this.kind).append(this.rank);
		return builder.toString();
	}
	
	@Override
	public int compareTo(Card o) {
		System.out.println("��������..");
		//ֻ���ǵ���
		//ö�ٵ�compareTo����Ĭ��ʵ���Ǳ�ö�ٳ�����ordinal ��������
		return this.rank.compareTo(o.rank);
	}
	
}
