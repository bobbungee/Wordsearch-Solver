package org.wordsearch;

import java.awt.Point;
import java.util.Map;

public interface WordGrid {

	public void setGrid(Map<Point, String> wordMap);
	
	public String get(Point p);
	
	public Map<Point, String> getGrid();
}
