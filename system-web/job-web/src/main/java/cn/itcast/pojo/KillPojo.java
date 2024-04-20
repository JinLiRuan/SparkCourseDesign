package cn.itcast.pojo;

public class KillPojo {
	private String Review;
	private int num;
	public String getKills() {
		return Review;
	}
	public void setKills(String Review) {
		this.Review = Review;
	}
	public int getCount() {
		return num;
	}
	public void setCount(int num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "{\"name\":\"" + Review
				+ "\", \"value\":" 
				+ String.valueOf(num) + "}";
	}
}
