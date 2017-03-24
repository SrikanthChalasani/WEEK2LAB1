import java.time.LocalDateTime;


public class ElectronicBook extends Book {

	public static final int PRICE = 1;

	public ElectronicBook(Author[] author, String title) {
		super(title, author);
	}

	public int CalculatePrice() {
		return PRICE;
	}

	public LocalDateTime dateSent() {
		return LocalDateTime.now();
	}

	public String toString() {
		Author[] authors = super.getAuthor();
		StringBuilder authorname = new StringBuilder();
		for (Author author : authors) {
			authorname.append(author.getFirstName() + " "
					+ author.getLastName() + ",");
		}
		return String.format(
				"Title: %s%nAuthor(s): %s %nPrice: $%s%nDate Sent: %s",
				this.getTitle(),
				authorname.toString().substring(0, authorname.length() - 1),
				CalculatePrice(), dateSent());
	}
}
