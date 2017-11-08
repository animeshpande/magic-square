import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import org.apache.commons.lang3.StringUtils;

public class MagicSquare {

	public static void main (String[] args) throws IOException {
		
		FileReader Mercury = new FileReader("Mercury.txt");
		BufferedReader br = new BufferedReader(Mercury);
		
		String line;
		String[] lineSum = new String[50];
		int lineCount = 0;
		int[] sum = new int[50];
		
		while ( (line = br.readLine()) != null ) {
			lineSum = line.split("\t");
			if(!(StringUtils.isAllBlank(lineSum))) {
				lineCount++;
				System.out.println("Row number " + lineCount + " in the magic square is: ");
				System.out.println(line);
				for (int i = 0; i < lineSum.length; i++) {
					sum[lineCount - 1] = sum[lineCount - 1] + Integer.valueOf(lineSum[i]);
				}
			System.out.println("The sum of this row is " + sum[lineCount - 1]);
			System.out.println();
//			System.out.println(lineCount);
			}
		}
		br.close();
		
		for (int i = 1; i < lineCount; i++) {
			assert sum[i] == sum[i-1];
		}
		System.out.println("The sum of all rows in the magic square is the same and is equal to " + sum[0]);
	}
}