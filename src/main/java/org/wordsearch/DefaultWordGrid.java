package org.wordsearch;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

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

	@Override
	public Point max() {
		int maxX = 0;
		int maxY = 0;
		Iterator<Entry<Point, String>> mapSet = wordMap.entrySet().iterator();
		
		while (mapSet.hasNext()) {
			Point p = mapSet.next().getKey();
			
			if (p.x > maxX)
				maxX = p.x;
			
			if (p.y > maxY)
				maxY = p.y;
		}
		
		return new Point(maxX, maxY);
	}

	@Override
	public List<Point> find(String search) {
		Iterator<Entry<Point, String>> mapSet = wordMap.entrySet().iterator();
		String str = search.trim();
		List<Point> values = new ArrayList<Point>();
		
		while (mapSet.hasNext()) {
			Entry<Point, String> entry = mapSet.next();
			
			if (entry.getValue().equals(str))
				values.add(entry.getKey());
		}
		
		return values;
	}
	
}
