package io.jsd.training.udemy.balazs.part1.linkedlist;

public interface List<T> {
	public void insert(T data);

	public void remove(T data);

	public void traverseList();

	public String traverseListToString();

	public int size();
}
