package org.wordsearch;

import java.awt.Point;
import java.util.Map;

public class DefaultWordGrid implements WordGrid {

	private Map<Point, String> wordMap;
	
	@Override
	public void setGrid(Map<Point, String> wordMap) {
		this.wordMap = wordMap;
	}

	@Override
	public String get(Point p) {
		if (!wordMap.containsKey(p))
			throw new IllegalArgumentException("No such point exists in word map");
		
		return wordMap.get(p);
	}

	@Override
	public Map<Point, String> getGrid() {
		return wordMap;
	}
	
}
