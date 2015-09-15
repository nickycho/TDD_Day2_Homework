package tw.tdd;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;


public class HarryPotterBookStoreTest {

	@Test
	public void buy_1_first_episode_should_100() {
		//arrange
		HarryPotterBookStore bookStore = new HarryPotterBookStore();
		Double actual;
		Double expected = 100d;
		List<HarryPotterBook> harryPotterBooks = new ArrayList<HarryPotterBook>();
		HarryPotterBook harryPotterBook = new HarryPotterBook(1, 1);
		harryPotterBooks.add(harryPotterBook);
		
		//act
		actual = bookStore.calculatePrice(harryPotterBooks);
		
		//assert
		assertEquals(expected, actual);
	}
	
	@Test
	public void buy_2_first_episode_should_200() {
		//arrange
		HarryPotterBookStore bookStore = new HarryPotterBookStore();
		Double actual;
		Double expected = 200d;
		List<HarryPotterBook> harryPotterBooks = new ArrayList<HarryPotterBook>();
		HarryPotterBook harryPotterBook = new HarryPotterBook(1, 2);
		harryPotterBooks.add(harryPotterBook);
		
		//act
		actual = bookStore.calculatePrice(harryPotterBooks);
		
		//assert
		assertEquals(expected, actual);
	}
	
	@Test
	public void buy_1_first_and_1_second_should_190() {
		//arrange
		HarryPotterBookStore bookStore = new HarryPotterBookStore();
		Double actual;
		Double expected = 190d;
		List<HarryPotterBook> harryPotterBooks = new ArrayList<HarryPotterBook>();
		harryPotterBooks.add(new HarryPotterBook(1, 1));
		harryPotterBooks.add(new HarryPotterBook(2, 1));
		
		//act
		actual = bookStore.calculatePrice(harryPotterBooks);
		
		//assert
		assertEquals(expected, actual);
	}
	
	@Test
	public void buy_1_first_and_1_second_and_1_third_should_270() {
		//arrange
		HarryPotterBookStore bookStore = new HarryPotterBookStore();
		Double actual;
		Double expected = 270d;
		List<HarryPotterBook> harryPotterBooks = new ArrayList<HarryPotterBook>();
		harryPotterBooks.add(new HarryPotterBook(1, 1));
		harryPotterBooks.add(new HarryPotterBook(2, 1));
		harryPotterBooks.add(new HarryPotterBook(3, 1));
		
		//act
		actual = bookStore.calculatePrice(harryPotterBooks);
		
		//assert
		assertEquals(expected, actual);
	}
	
	@Test
	public void buy_1_first_and_1_second_and_1_third_and_1_fourth_should_320() {
		//arrange
		HarryPotterBookStore bookStore = new HarryPotterBookStore();
		Double actual;
		Double expected = 320d;
		List<HarryPotterBook> harryPotterBooks = new ArrayList<HarryPotterBook>();
		harryPotterBooks.add(new HarryPotterBook(1, 1));
		harryPotterBooks.add(new HarryPotterBook(2, 1));
		harryPotterBooks.add(new HarryPotterBook(3, 1));
		harryPotterBooks.add(new HarryPotterBook(4, 1));
		
		//act
		actual = bookStore.calculatePrice(harryPotterBooks);
		
		//assert
		assertEquals(expected, actual);
	}
	
	@Test
	public void buy_1_first_and_1_second_and_1_third_and_1_fourth_and_1_fifth_should_375() {
		//arrange
		HarryPotterBookStore bookStore = new HarryPotterBookStore();
		Double actual;
		Double expected = 375d;
		List<HarryPotterBook> harryPotterBooks = new ArrayList<HarryPotterBook>();
		harryPotterBooks.add(new HarryPotterBook(1, 1));
		harryPotterBooks.add(new HarryPotterBook(2, 1));
		harryPotterBooks.add(new HarryPotterBook(3, 1));
		harryPotterBooks.add(new HarryPotterBook(4, 1));
		harryPotterBooks.add(new HarryPotterBook(5, 1));
		
		//act
		actual = bookStore.calculatePrice(harryPotterBooks);
		
		//assert
		assertEquals(expected, actual);
	}
	
	
	@Test
	public void buy_1_first_and_1_second_and_2_third_should_370() {
		//arrange
		HarryPotterBookStore bookStore = new HarryPotterBookStore();
		Double actual;
		Double expected = 370d;
		List<HarryPotterBook> harryPotterBooks = new ArrayList<HarryPotterBook>();
		harryPotterBooks.add(new HarryPotterBook(1, 1));
		harryPotterBooks.add(new HarryPotterBook(2, 1));
		harryPotterBooks.add(new HarryPotterBook(3, 1));
		harryPotterBooks.add(new HarryPotterBook(3, 1));
		
		//act
		actual = bookStore.calculatePrice(harryPotterBooks);
		
		//assert
		assertEquals(expected, actual);
	}
	
	
	@Test
	public void buy_1_first_and_1_second_and_2_third_should_460() {
		//arrange
		HarryPotterBookStore bookStore = new HarryPotterBookStore();
		Double actual;
		Double expected = 460d;
		List<HarryPotterBook> harryPotterBooks = new ArrayList<HarryPotterBook>();
		harryPotterBooks.add(new HarryPotterBook(3, 1));
		harryPotterBooks.add(new HarryPotterBook(3, 1));
		harryPotterBooks.add(new HarryPotterBook(1, 1));
		harryPotterBooks.add(new HarryPotterBook(2, 2));
		
		
		//act
		actual = bookStore.calculatePrice(harryPotterBooks);
		
		//assert
		assertEquals(expected, actual);
	}
	
	
	

}
