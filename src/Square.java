import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.*;
import org.apache.commons.lang3.StringUtils;

public class Square {
	
	String fileName;
	int dimension;
	int[][] square;
	ArrayList<Integer> rowSums = new ArrayList<Integer>();
	ArrayList<Integer> columnSums = new ArrayList<Integer>();
	
	Square(String name) throws IOException {
		fileName = name;
		dimension = getSquareDimension();
		square = getSquare();
		rowSums = getRowSums();
		columnSums = getColumnSums();
	}
	
	public BufferedReader getBufferedReader() throws FileNotFoundException {
		
		FileReader fileReader = new FileReader(fileName);
		return new BufferedReader(fileReader);
	
	}
	
	public void printSquare() throws IOException {
		
		String row;
		BufferedReader bufferedReader = getBufferedReader();
		
		while ( (row = bufferedReader.readLine()) != null ) {
			System.out.println(row);
			}
		bufferedReader.close();
		
	}
	
	public int getSquareDimension() throws IOException {
		
		String row = getBufferedReader().readLine();
		return dimension = row.split("\t").length;
		
	}
	
	public int[][] getSquare() throws IOException {
		
		int[][] square = new int[dimension][dimension];
		BufferedReader bufferedReader = getBufferedReader();
		String line;
		int arrayRowIndex = 0;
		String[] rowArray;
		
		while ((line = bufferedReader.readLine()) != null) {
			rowArray = line.split("\t");
			if(!StringUtils.isAllBlank(line)) {
				for (int i = 0; i < dimension; i++) {
					square[arrayRowIndex][i] = Integer.valueOf(rowArray[i]);
				}
				arrayRowIndex++;
			}
		}
		
		return square;
	}
	
	public void printRowSums() throws IOException {
		
		for (int i=0; i < dimension; i++) {
			System.out.println("The sum for row " + (i+1) + " is " + rowSums.get(i));
		}
		
	}
	
	public void printColumnSums() throws IOException {
		
		for (int i=0; i < dimension; i++) {
			System.out.println("The sum for column " + (i+1) + " is " + columnSums.get(i));
		}
		
	}
	
	public ArrayList<Integer> getRowSums() {
		
		ArrayList<Integer> rowSums = new ArrayList<Integer>();
		
		for (int index = 0; index < dimension; index++) {
			rowSums.add(IntStream.of(square[index]).sum());
		}
		
		return rowSums;
	}
	
	public ArrayList<Integer> getColumnSums(){
		ArrayList<Integer> columnSums = new ArrayList<Integer>();

		for (int j=0; j < dimension; j++) {
			int sum = 0;
			for (int i=0; i < dimension; i++) {
				sum = sum + square[i][j];
			}
			columnSums.add(sum);
		}
		
		return columnSums;
	}
	
	public boolean isMagicSquare() {
		int sum = rowSums.get(0);
		for (int i=0; i < dimension; i++) {
			if ( (rowSums.get(i) != sum) || (columnSums.get(i) != sum)) {
				return false;
			}
		}
		return true;
	}
	
}