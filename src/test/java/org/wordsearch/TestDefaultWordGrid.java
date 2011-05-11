package org.wordsearch;

import java.awt.Point;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
		map.put(new Point(3, 6), "A");
		
		grid.setGrid(map);
	}
	
	@Test
	public void testGet() {
		assertEquals("Make sure same String is received as put", "A", grid.get(new Point(1, 1)));
	}
	
	@Test
	public void testMax() {
		assertEquals("Tests if max value is correct", new Point(3, 6), grid.max());
	}
	
	@Test
	public void testFind() {
		List<Point> found = grid.find("A");
		List<Point> origin = new ArrayList<Point>();
		origin.add(new Point(3, 6));
		origin.add(new Point(1, 1));
		
		assertTrue(!new ArrayList<Point>().equals(found));
		assertEquals("Tests if correct points are found", origin, found);
	}

}
