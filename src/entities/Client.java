package entities;

public class Client {
	private String cpf;
	private String name;
	private String username;
	private Integer age;

	public Client(String cpf, String name, String username, Integer age) {
		this.cpf = cpf;
		this.name = name;
		this.username = username;
		this.age = age;
	}

	public String getCpf() {
		return cpf;
	}
	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}
