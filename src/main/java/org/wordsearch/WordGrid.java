package org.wordsearch;

import java.awt.Point;
import java.util.List;
import java.util.Map;

public interface WordGrid {

	public void setGrid(Map<Point, String> wordMap);
	
	public String get(Point p);
	
	public Map<Point, String> getGrid();
	
	public Point max();
	
	public List<Point> find(String search);
}
