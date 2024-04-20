package cn.itcast.pojo;

public class CityPojo {
	private String Rating;
	private int num;
	public String getCity() {
		return Rating;
	}
	public void setCity(String Rating) {
		this.Rating = Rating;
	}
	public int getCount() {
		return num;
	}
	public void setCount(int num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "{\"name\":\"" + Rating
				+ "\", \"value\":" 
				+ String.valueOf(num) + "}";
	}
}
