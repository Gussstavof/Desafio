package entities;

public  class User {
	private String username;
	private String password;
	private Company company;
	private Client client;
	private Admin admin;

	public User(String username, String password,  Client client, Company company, Admin admin) {
		this.username = username;
		this.password = password;
		this.company = company;
		this.client = client;
		this.admin = admin;
	}

	public boolean IsAdmin() {
		return this.company == null && this.client == null;
	}

	public boolean IsEmpresa() {
		return this.company != null;
	}

	public boolean IsCliente() {
		return this.client != null;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Client getCliente() {
		return client;
	}

	public void setCliente(Client client) {
		this.client = client;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
}
