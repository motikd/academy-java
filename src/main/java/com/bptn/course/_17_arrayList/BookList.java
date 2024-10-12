package com.bptn.course._17_arrayList;

import java.util.ArrayList;

public class BookList {

	public static void main(String[] args) {
		// Create a new ArrayList called "myBooks"
		int counter = 1;

		ArrayList<String> myBooks = new ArrayList<>();

		// Add 3 favorite books to this list
		myBooks.add("Dark Matter".toLowerCase());
		myBooks.add("Charlie and the Chocolate Factory".toLowerCase());
		myBooks.add("Harry Potter".toLowerCase());

		// Display all books
		System.out.println("My favorite books are: " + myBooks);
		for (String book : myBooks) {
			System.out.println("Book " + counter + ": " + book);
			counter++;
		}

		// Display the first book from the list
		System.out.println(myBooks.getFirst());
		System.out.println(myBooks.get(0));
		// System.out.println(myBooks[1]);

		// Delete the second book
		myBooks.remove(1);
		System.out.println("My favorite books are: " + myBooks);

		// Search for a book
		if (myBooks.contains("harry potter".toLowerCase())) {
			System.out.println("Book found");
		} else {
			System.out.println("Book not found");
		}

		System.out.println("The size of the list is: " + myBooks.size());
		System.out.println("The last item of the list is: " + myBooks.get(myBooks.size() - 1));
	}

}
