import java.io.IOException;

public class MagicSquare {

	public static void main (String[] args) throws IOException {
		
		Square square = new Square("Mercury.txt");
		
		square.printSquare();
		System.out.println(square.getSquareDimension());
		@SuppressWarnings("unused")
		int[][] myMagicSquare = square.getSquare();
		System.out.println();
		square.printRowSums();
		System.out.println();
		square.printColumnSums();
		
	}
}