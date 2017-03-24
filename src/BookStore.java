
public class BookStore {

	public static void main(String[] args) {
		Book[] books = new Book[6];
		int totalprice = 0;
		
		Author[] authors1 = new Author[2];
		authors1[0] = new Author("John", "Doe",
				"5224 Enclave Way, Normal IL 61761");
		authors1[1] = new Author("Becky", "Monroe",
				"365 Yearly Way, Weavery AL 85240");
		books[0] = new Book("Visual Basic for Dummies", authors1);
		System.out.println((Book) books[0]);
		totalprice = totalprice + ((Book) books[0]).CalculatePrice(authors1);

		System.out.println();
		Author[] authors2 = new Author[2];
		authors2[0] = new Author("Michael", "Jackson",
				"356 Blue Bill Way, Normal IL 61761");
		authors2[1] = new Author("Berry", "Yogurt",
				"867 Duck Horn Drive, Bloomington MN 85240");
		books[1] = new Book("Learn C++ in 21 Days", authors2);
		System.out.println((Book) books[1]);
		totalprice = totalprice + ((Book) books[1]).CalculatePrice(authors2);

		System.out.println();
		Author[] authors3 = new Author[2];
		authors3[0] = new Author("Srinivas", "Yelamanchili",
				"945 5224th South Street, Davie FL 33256");
		authors3[1] = new Author("Koti", "Babu",
				"Suite 100 3901 W Miller Rd, Garland TX 75041");
		Publisher publisher1 = new Publisher("New York Co", "New York");
		books[2] = new Magazine(publisher1, authors3,
				"Computer Architecture Montly Mag");
		System.out.println((Book) books[2]);
		totalprice = totalprice
				+ ((Magazine) books[2]).CalculatePrice(authors3);

		System.out.println();
		Author[] authors4 = new Author[2];
		authors4[0] = new Author("Joni", "Poisel",
				"890 Escalade Dr, Springfield IL 66721");
		authors4[1] = new Author("Dave", "Poindexter",
				"325 W Ray road, Chandler AZ 85245");
		Publisher publisher2 = new Publisher("Childers Prints", "Daytona Co");
		books[3] = new Magazine(publisher2, authors4,
				"Computer Architecture Montly Mag");
		System.out.println((Book) books[3]);
		totalprice = totalprice
				+ ((Magazine) books[3]).CalculatePrice(authors4);

		System.out.println();
		Author[] authors5 = new Author[2];
		authors5[0] = new Author("Jerry", "Erb",
				"120 duck horn drive, poster IL 66721");
		authors5[1] = new Author("Hari", "Didigam",
				"329 Raab road, bloomington IL 85245");
		books[4] = new ElectronicBook(authors5,
 "One dollar E Book");
		System.out.println((Book) books[4]);
		totalprice = totalprice + ((ElectronicBook) books[4]).CalculatePrice();

		System.out.println();
		Author[] authors6 = new Author[2];
		authors6[0] = new Author("Spice", "Express",
				"689 Tiger Rd, Morton IL 66721");
		authors6[1] = new Author("RK", "Reddy",
				"945 Phoenix Dr, Donlevy MN 85245");
		books[5] = new ElectronicBook(authors6, "One dollar E Book 2");
		System.out.println((Book) books[5]);
		totalprice = totalprice + ((ElectronicBook) books[5]).CalculatePrice();

		System.out.printf("%nTotal Price: $%s", totalprice);

	}
}

