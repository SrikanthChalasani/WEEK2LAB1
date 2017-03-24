
public class Book {
	private String Title;
	private Author[] Author;

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public Author[] getAuthor() {
		return Author;
	}

	public void setAuthor(Author[] author) {
		Author = author;
	}

	public Book(String Title, Author[] Author) {
		this.Title = Title;
		this.Author = Author;
	}

	public int CalculatePrice(Author[] authors) {
		int price = 0;
		for (Author author : authors) {
			price = price + author.getFirstName().length()
					+ author.getLastName().length();
		}
		return price;
	}

	public String toString() {
		Author[] authors = this.Author;
		StringBuilder authorname = new StringBuilder();
		for (Author author : authors) {
			authorname.append(author.getFirstName() + " "
					+ author.getLastName() + ",");
		}
		return String.format("Title: %s%nAuthor(s): %s %nPrice: $%s",
				this.getTitle(),
				authorname.toString().substring(0, authorname.length() - 1),
				CalculatePrice(this.getAuthor()));
	}
}

