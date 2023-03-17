package entities;

import java.util.List;

public class Sale {
	private Integer id;
	private List<Product> items;
	private Double price;
	private Double commissionSystem;
	private Company company;
	private Client client;

	public Sale(Integer id, List<Product> items, Double price, Double commissionSystem, Company company, Client client) {
		this.id = id;
		this.items = items;
		this.price = price;
		this.commissionSystem = commissionSystem;
		this.company = company;
		this.client = client;
	}

	public Sale() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public Company getEmpresa() {
		return company;
	}

	public void setEmpresa(Company company) {
		this.company = company;
	}

	public Client getCliente() {
		return client;
	}

	public void setCliente(Client client) {
		this.client = client;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Product> getItems() {
		return items;
	}

	public void setItems(List<Product> items) {
		this.items = items;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getCommissionSystem() {
		return commissionSystem;
	}

	public void setCommissionSystem(Double commissionSystem) {
		this.commissionSystem = commissionSystem;
	}

}
