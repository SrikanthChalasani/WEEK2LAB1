
public class Magazine extends Book {
	private Publisher publisher;

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public Magazine(Publisher publisher, Author[] author, String title) {
		super(title, author);
		this.setPublisher(publisher);
	}

	public int CalculatePrice(Author[] authors) {

		int price = super.CalculatePrice(authors) * 12;
		return price;
	}

	public String toString() {
		return String.format("%s%nPublisher: %s %nPublisher Address: %s%n",
				super.toString(), getPublisher().getName(), getPublisher()
						.getAddress());
	}
}
