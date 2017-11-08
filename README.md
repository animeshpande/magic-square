# magic-square
This project will read a '.txt' file that contains a magic square and verify the following:
1. The sum of all rows is the same
2. The sum of all columns is the same

Setup instructions:
- Add 'src' folder as a java project
- Add 'commons-lang3-3.6.jar' as external JAR to the library
--- For Eclipse, this can be done via Project > Properties > Java Build Path > Add External JARs

Testing files:
- There are 2 text files included - "Mercury.txt" and "Luna.txt"
- To test for a file, just replace the existing file name on line 10 of MagicSquare.java with the file name you want to test
- Make sure that the file you want to test is in the 'src' folder
- Files contain number arranged in a square
- Numbers in a row are separated by a tab ("\t")
- Each row is on a different line