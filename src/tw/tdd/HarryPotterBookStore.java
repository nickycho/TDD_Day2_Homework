package tw.tdd;

import java.util.List;

import com.sun.org.apache.regexp.internal.recompile;

public class HarryPotterBookStore {
	private static final Double SINGLE_BOOK_PRICE = 100d;
	private static final Double TWO_DIFF_BOOK_DISCOUNT = 0.95;
	private static final Double THREE_DIFF_BOOK_DISCOUNT = 0.9;
	private static final Double FOUR_DIFF_BOOK_DISCOUNT = 0.8;
	private static final Double FIVE_DIFF_BOOK_DISCOUNT = 0.75;
	
	

	public Double calculatePrice(List<HarryPotterBook> harryPotterBooks) {
		double price = 0;
		int diffBookNum = getDiffBookNum(harryPotterBooks);
		if(diffBookNum == 0) return 0d;
		
		price = getDiscountPrice(diffBookNum);	
		price += calculatePrice(harryPotterBooks);
		
		return price;
	}


	private int getDiffBookNum(List<HarryPotterBook> harryPotterBooks) {
		int diffBookNum = 0;
		for (int i = 1; i <= 5; i++) {
			for(HarryPotterBook harryPotterBook : harryPotterBooks){
				Integer episode = harryPotterBook.getEpisode();
				Integer count = harryPotterBook.getCount();
				if(!count.equals(0) && episode.equals(i)){
					diffBookNum++;
					harryPotterBook.setCount(count - 1);
					break;
				}
			}
		}
		return diffBookNum;
	}
	
	private double getDiscountPrice(int diffBookNum){
		double price = diffBookNum * SINGLE_BOOK_PRICE;
		switch (diffBookNum) {
		case 2:
			price = price * TWO_DIFF_BOOK_DISCOUNT;
			break;
		case 3:
			price = price * THREE_DIFF_BOOK_DISCOUNT;
			break;
		case 4:
			price = price * FOUR_DIFF_BOOK_DISCOUNT;
			break;
		case 5:
			price = price * FIVE_DIFF_BOOK_DISCOUNT;
			break;
		default:
			break;
		}
		return price;
	}
	
	
	
	
	

}
