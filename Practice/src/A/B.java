package A;

public class B {
	private int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	{
		grade = 0;
		classroom =0;
		name = null;
		height = 0.0;
		gender = 0;
	}
	
	public B() {
		information();
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void setClassroon(int classroom) {
		this.classroom = classroom;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getGrade() {
		return grade;
	}
	public int getClassroom() {
		return classroom;
	}
	public String getName() {
		return name;
	}
	public double getHeight() {
		return height;
	}
	public char getGender() {
		return gender;
	}
	
	public void information() {
		System.out.println(grade+" "+classroom+" "+name+" "+height+" "+gender);
	}

}
