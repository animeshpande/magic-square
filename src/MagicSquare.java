import java.io.IOException;

public class MagicSquare {

	public static void main (String[] args) throws IOException {
		
		Square square = new Square("Mercury.txt");
		
		System.out.println("This is the square in the text file:");
		square.printSquare();
		System.out.println();
		square.printRowSums();
		System.out.println();
		square.printColumnSums();
		System.out.println();
		
		if (square.isMagicSquare()) {
			System.out.println("The square in the file '" + square.fileName + "' is a magic square!");
		}
		else {
			System.out.println("The square in the file '" + square.fileName + "' is not a magic square.");
		}
		
	}
}