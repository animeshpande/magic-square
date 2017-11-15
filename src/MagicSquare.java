import java.io.IOException;

public class MagicSquare {

	public static void main (String[] args) throws IOException {
		
		Square square = new Square("Mercury.txt");
		
		square.printSquare();
		System.out.println();
		square.printRowSums(square.rowSums);
		System.out.println();
		square.printColumnSums(square.columnSums);
		
	}
}