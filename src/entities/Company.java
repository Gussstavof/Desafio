package entities;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Company {
	private Integer id;
	private String name;
	private String cnpj;
	private Double rate;
	private Double balance;
	private Set<Product> products = new HashSet<>();

	public Company(Integer id, String name, String cnpj, Double rate, Double balance) {
		super();
		this.id = id;
		this.name = name;
		this.cnpj = cnpj;
		this.rate = rate;
		this.balance = balance;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}
}
