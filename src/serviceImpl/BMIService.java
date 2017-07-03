package serviceImpl;

public class BMIService {
	private double height, weight, bmi;
	private String comment;
	
	public void setHeight(double height) {
		this.height = height; 
	}
	public void setWeight(double weight) {
		this.weight = weight; 
	}
	public void setBmi() {
		this.bmi = weight / (height * height);
	}
	public double getHeight() {
		return height;
	}
	public double getWeight() {
		return weight;
	}
	public double getBmi() {
		return bmi;
	}
	
	public void setComment() {
		if (bmi < 18.5 ) {
			comment = "저체중";
		} else if (bmi < 25) {
			comment = "정상";
		} else if (bmi < 30) {
			comment = "과체중";
		} else {
			comment = "비만";
		}
	}
	
	public String getComment() {
		return comment;
	}
}
