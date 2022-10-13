package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
	
		Scanner in = new Scanner(f); //making Scanner with a File
		String shapeType = in.next();
		
		int r = in.nextInt();
		int g = in.nextInt();
		int b = in.nextInt();
		boolean filled = in.nextBoolean();
		int n=in.nextInt();
		double x = in.nextDouble();
		double y = in.nextDouble();
		double halfWidth = in.nextDouble();
		double halfHeight = in.nextDouble();
		double array[]=new double[n/2];
		double array2[]=new double[n/2];
		
		for(int i=0; i<n;i++) {
		 array[i]=in.nextDouble();
		}
		for(int i=0;i<n;i++) {
			array2[i]=in.nextDouble();
		}
		if (filled = true) {
			if (shapeType == "triangle") {
			StdDraw.setPenColor(StdDraw.PINK);
			StdDraw.filledPolygon(array,array2);
			}
		}
	}
}
