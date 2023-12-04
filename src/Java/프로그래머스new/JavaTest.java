package Java.프로그래머스new;

import java.util.LinkedList;

public class JavaTest {
	public static void main(String[] args) {
		JavaTest javaTest = new JavaTest();
		DoublyLinkedList list =javaTest.new DoublyLinkedList();

		list.add("Apple");
		list.add("Banana");
		list.add("Cherry");

		list.printList();

	}
	class Node {
		String data;
		Node prev;
		Node next;

		public Node(String data) {
			this.data = data;
			this.prev = null;
			this.next = null;
		}
	}
	class DoublyLinkedList {
		Node head;
		Node tail;

		public DoublyLinkedList() {
			this.head = null;
			this.tail = null;
		}

		// 요소 추가 메소드
		public void add(String data) {
			Node newNode = new Node(data);

			if (head == null) {
				head = newNode;
				tail = newNode;
			} else {
				tail.next = newNode;
				newNode.prev = tail;
				tail = newNode;
			}
		}

		// 요소 삭제 메소드
		public void remove(String data) {
			Node current = head;

			while (current != null) {
				if (current.data.equals(data)) {
					if (current == head) {
						head = current.next;
						if (head != null) {
							head.prev = null;
						}
					} else if (current == tail) {
						tail = current.prev;
						tail.next = null;
					} else {
						current.prev.next = current.next;
						current.next.prev = current.prev;
					}
					break;
				}
				current = current.next;
			}
		}

		// 리스트 출력 메소드
		public void printList() {
			Node current = head;
			while (current != null) {
				System.out.print(current.data + " ");
				current = current.next;
			}
			System.out.println();
		}
	}

}
