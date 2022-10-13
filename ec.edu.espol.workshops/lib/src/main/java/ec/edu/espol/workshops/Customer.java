package ec.edu.espol.workshops;

public class Customer {
	private int age;
	private Sex sex;
	private boolean married;
	
	Customer(int age, Sex sex, boolean married){
		this.age = age;
		this.married = married;
		this.sex = sex;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Sex getSex() {
		return sex;
	}
	public void setSex(Sex sex) {
		this.sex = sex;
	}
	public boolean isMarried() {
		return married;
	}
	public void setMarried(boolean married) {
		this.married = married;
	}
	
}
