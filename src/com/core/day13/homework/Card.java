/**
 * 
 */
package com.core.day13.homework;

import com.core.day12.homework.Kind;
import com.core.day12.homework.Rank;

/**
 * @author 蔡丽丽
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
		System.out.println("被调用了..");
		//只考虑点数
		//枚举的compareTo方法默认实现是比枚举常量的ordinal 进行排序
		return this.rank.compareTo(o.rank);
	}
	
}
