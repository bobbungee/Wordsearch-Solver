package org.wordsearch;

import java.awt.Point;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestDefaultWordGrid {
	
	private DefaultWordGrid grid;
	private Map<Point, String> map;
	
	@Before
	public void setUp() {
		grid = new DefaultWordGrid();
		
		map = new HashMap<Point, String>();
		map.put(new Point(1, 1), "A");
		map.put(new Point(1, 2), "B");
		map.put(new Point(2, 1), "C");
		
		grid.setGrid(map);
	}
	
	@Test
	public void testGet() {
		assertEquals("Make sure same String is received as put", "A", grid.get(new Point(1, 1)));
	}

}
