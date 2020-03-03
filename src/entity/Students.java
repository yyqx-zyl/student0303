package entity;

/**
 * Ñ§Éú±í
 * @author Zylyyqx
 *
 */
public class Students {

	private int id;
	private String name;
	private int age;
	private String clas;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getClas() {
		return clas;
	}
	public void setClas(String clas) {
		this.clas = clas;
	}
	public Students(int id, String name, int age, String clas) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.clas = clas;
	}
	public Students(String name, int age, String clas) {
		super();
		this.name = name;
		this.age = age;
		this.clas = clas;
	}
	public Students() {
		super();
	}
	
	
}
