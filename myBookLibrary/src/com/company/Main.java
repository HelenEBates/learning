package com.company;

public class Main {

    public static void main(String[] args) {



		Person newPerson = new Person();

		newPerson.setFirstName("Mary");
		newPerson.setLastName("Magdalene");
		System.out.println(newPerson.firstName + " " + newPerson.lastName);

		//Main main = new Main();
		//main.theLuminaries.bookTitle("The Luminaires");
		Book theLuminaries = new Book();

		theLuminaries.bookTitle("The Luminaries");
		theLuminaries.publicationDate(2012);
		theLuminaries.series("Man Booker");

		System.out.println(theLuminaries.bookTitle);

		//setTheLuminaries(null);
	}




	public static void setTheLuminaries(Book theLuminaries) {




	}
}


