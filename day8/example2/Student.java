package day8.example2;

import java.io.Serializable;

/**
 * Serializable is interface
 *
 */
public class Student implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	private String name;

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

}
