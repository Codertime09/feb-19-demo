public class Student {
	private int id;
	private String name;
	private int age;
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	
	public String getName() {
		return this.name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getAge() {
		return this.age;
	}
	
	
	public void setAge(int age) throws Exception {
		if(age >= 20 && age <= 40 ) {
			this.age = age;	
		} else {
			throw new Exception("Not a valid age!!");
		}
	}
	
	
}