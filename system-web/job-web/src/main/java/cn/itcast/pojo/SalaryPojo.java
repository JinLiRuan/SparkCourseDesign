package cn.itcast.pojo;

public class SalaryPojo {
	private String MealID;
	private int num;
	public String getSalary() {
		return MealID;
	}
	public void setSalary(String MealID) {
		this.MealID = MealID;
	}
	public int getCount() {
		return num;
	}
	public void setCount(int num) {
		this.num = num;
	}	
	@Override
	public String toString() {
		return "{\"name\":\"" + MealID
				+ "\", \"value\":" 
				+ String.valueOf(num) + "}";
	}
}
