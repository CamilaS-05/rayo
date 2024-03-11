package clases;

public class libro {
	private String ISBN;
	private String autor;
	private int año;
	private static int numero = 0;

	public libro(String iSBN, String autor, int año) {
		super();
		ISBN = iSBN;
		this.autor = autor;
		this.año = año;
		numero++;

	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public static int getNumero() {
		return numero;
	}

	@Override
	public String toString() {
		return "libro [ISBN=" + ISBN + ", autor=" + autor + ", año=" + año + "]";
	}

}
