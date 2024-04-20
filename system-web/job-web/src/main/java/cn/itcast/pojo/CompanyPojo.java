package cn.itcast.pojo;

public class CompanyPojo {

	private int index;
	private String Review;
	private int total_num;


	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getReview() {
		return Review;
	}

	public void setReview(String review) {
		Review = review;
	}

	public int getTotal_num() {
		return total_num;
	}

	public void setTotal_num(int total_num) {
		this.total_num = total_num;
	}

	@Override
	public String toString() {
		return "CompanyPojo{" +
				"index=" + index +
				", Review='" + Review + '\'' +
				", total_num=" + total_num +
				'}';
	}
}
