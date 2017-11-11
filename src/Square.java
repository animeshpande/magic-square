import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.commons.lang3.StringUtils;

public class Square {
	
	Square(String name){
		fileName = name;
	}
	
	String fileName;
	int[] rowSums;
	int[] columnSums;
	
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
		return row.split("\t").length;
		
	}
	
	public int[][] getSquare() throws IOException {
		
		int squareDimension = getSquareDimension();
		int[][] magicSquare = new int[squareDimension][squareDimension];
		BufferedReader bufferedReader = getBufferedReader();
		String line;
		int arrayRowIndex = 0;
		String[] rowArray;
		
		while ((line = bufferedReader.readLine()) != null) {
			rowArray = line.split("\t");
			if(!StringUtils.isAllBlank(line)) {
				for (int i = 0; i < getSquareDimension(); i++) {
					magicSquare[arrayRowIndex][i] = Integer.valueOf(rowArray[i]);
				}
				arrayRowIndex++;
			}
		}
		
		return magicSquare;
	}
	
	public void printRowSums() throws IOException {
		int[][] square = getSquare();

		for (int i=0; i < getSquareDimension(); i++) {
			int sum = 0;
			for (int j=0; j < getSquareDimension(); j++) {
				sum = sum + square[i][j];
			}
			System.out.println("The sum for row " + i + " is: " + sum);
			rowSums[i] = sum;
		}
	}
	
	public void printColumnSums() throws IOException {
		int[][] square = getSquare();

		for (int j=0; j < getSquareDimension(); j++) {
			int sum = 0;
			for (int i=0; i < getSquareDimension(); i++) {
				sum = sum + square[i][j];
			}
			System.out.println("The sum for column " + j + " is: " + sum);
			columnSums[j] = sum;
		}
	}
	
	public boolean isMagicSquare() {
		return true;
	}
	
}