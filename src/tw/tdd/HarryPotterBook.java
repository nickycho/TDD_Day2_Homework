package tw.tdd;

public class HarryPotterBook {
	private Integer episode;
	private Integer count;
	
	
	public HarryPotterBook(Integer episode, Integer count){
		this.episode = episode;
		this.count = count;
	}
	
	public Integer getEpisode() {
		return episode;
	}
	public void setEpisode(Integer episode) {
		this.episode = episode;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	
	

}
