package util;

public class Alugem {

	private String name;
	private String email;
	private int room1;
	private int room2;
	private int room3;
	
	
	
	
	
	
	public Alugem(String name, String email, int room1, int room2, int room3) {
		this.name = name;
		this.email = email;
		this.room1 = room1;
		this.room2 = room2;
		this.room3 = room3;
	}





	public Alugem(String name, String email) {
	
		this.name = name;
		this.email = email;
	}
	
	
	
	
	
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public int getRoom1() {
		return room1;
	}

	public int getRoom2() {
		return room2;
	}

	public int getRoom3() {
		return room3;
	}

	public void setRoom1(int room1) {
		this.room1 = room1;
	}

	public void setRoom2(int room2) {
		this.room2 = room2;
	}

	public void setRoom3(int room3) {
		this.room3 = room3;
	}
	
	
	
}
