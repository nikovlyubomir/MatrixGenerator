import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;


class MatrixGeneratorTest {

	@Test
	void test1x1() {		
	    MatrixGenerator.createMatrix(1,1);
	    ArrayList<Integer> expected = MatrixGenerator.expetedArray();	    
	    ArrayList<Integer> arr = new ArrayList<Integer>();
	    arr.add(1);	           
        assertEquals(arr, expected);
	}
	
	@Test
	void test2x2() {		
	    MatrixGenerator.createMatrix(2,2);
	    ArrayList<Integer> expected = MatrixGenerator.expetedArray();	    
	    ArrayList<Integer> arr = new ArrayList<Integer>() {{
	        add(1);	      
		    add(2);	
		    add(4);	
		    add(3);	
	    }};	
        assertEquals(arr, expected);
	}
	
	@Test
	void test5x5() {		
	    MatrixGenerator.createMatrix(5,5);
	    ArrayList<Integer> expected = MatrixGenerator.expetedArray();	    
	    ArrayList<Integer> arr = new ArrayList<Integer>() {{
	    	add(1);	      
		    add(2);	
		    add(5);
		    add(10);
		    add(17);
		    add(4);	
			add(3);	      
		    add(6);	
		    add(11);
		    add(18);
		    add(9);
		    add(8);	
			add(7);	      
		    add(12);	
		    add(19);
		    add(16);
		    add(15);
		    add(14);	
		    add(13);
		    add(20);
		    add(25);
		    add(24);	
		    add(23);
		    add(22);
		    add(21);	    	
	    }};	    
        assertEquals(arr, expected);
	}
	
	@Test
	void test3x4() {		
	    MatrixGenerator.createMatrix(3,4);
	    ArrayList<Integer> expected = MatrixGenerator.expetedArray();	    
	    ArrayList<Integer> arr = new ArrayList<Integer>() {{
	        add(1);	      
		    add(2);	
		    add(5);	
		    add(10);	
		    add(4);	      
		    add(3);	
		    add(6);	
		    add(11);	
		    add(9);	      
		    add(8);	
		    add(7);	
		    add(12);	
	    }};	
        assertEquals(arr, expected);
	}
	
	@Test
	void test2x4() {		
	    MatrixGenerator.createMatrix(2,4);
	    ArrayList<Integer> expected = MatrixGenerator.expetedArray();	    
	    ArrayList<Integer> arr = new ArrayList<Integer>() {{
	        add(1);	      
		    add(2);	
		    add(5);	
		    add(7);	
		    add(4);	      
		    add(3);	
		    add(6);	
		    add(8);	
	    }};	
        assertEquals(arr, expected);
	}
	@Test
	void test4x2() {		
	    MatrixGenerator.createMatrix(4,2);
	    ArrayList<Integer> expected = MatrixGenerator.expetedArray();	    
	    ArrayList<Integer> arr = new ArrayList<Integer>() {{
	        add(1);	      
		    add(2);	
		    add(4);	
		    add(3);	
		    add(5);	
		    add(6);	
		    add(7);	
		    add(8);	
	    }};	
        assertEquals(arr, expected);
	}
	@Test
	void test5x2() {		
	    MatrixGenerator.createMatrix(5,2);
	    ArrayList<Integer> expected = MatrixGenerator.expetedArray();	    
	    ArrayList<Integer> arr = new ArrayList<Integer>() {{
	        add(1);	      
		    add(2);	
		    add(4);	
		    add(3);	
		    add(5);	      
		    add(6);	
		    add(7);	
		    add(8);
		    add(9);	      
		    add(10);	
	    }};	
        assertEquals(arr, expected);
	}    	
}