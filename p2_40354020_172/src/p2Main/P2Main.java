package p2Main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class P2Main {

	public static void main(String[] args) throws FileNotFoundException {
		
		int[] ts = new int [2];
		ts[0] = 0;
		Random rnd = new Random();
		int n = 21;
		int m = 20;
		
		String parentDirectory = "inputFiles";
		String dataFiles = "dataFiles";
		int time = 0;
		
		
		for (int i=1; i<n; i++) {	
			String fileName = "data_" + i + ".txt"; 
			PrintWriter out = new PrintWriter(new File(parentDirectory, fileName));
			ts[0] = rnd.nextInt(m) + ts[0];
			ts[1] = rnd.nextInt(m); 
			out.print(ts[0] + " ");
			out.println(ts[1]);	
			out.close();
		}
		
		String fileName2 = "dataFiles.txt";
		PrintWriter outfileName = new PrintWriter(new File(dataFiles, fileName2)); 
		for (int i=1; i<n; i++) {	
			String fileName = "data_" + i + ".txt";
			outfileName.println(fileName);	
		}
		outfileName.close();
	
		/*
		 * Initialize necessary data structures, t=0, etc.
			While not finished do:
			    For each event e occurring at current time t do:
			          Process e
			    endFor
			    Update t
			    If no more events do:
			          Finished = true
			    endIf
			endWhile
			Compute final statistics

		 */
		
		

	}

}
