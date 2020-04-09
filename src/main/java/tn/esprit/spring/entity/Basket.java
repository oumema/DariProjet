package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Basket implements Serializable{
	
	
private static final long serialVersionUID = 3152690779535828408L;

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private int quantity;
	private float Totalprice;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getTotalprice() {
		return Totalprice;
	}
	public void setTotalprice(float totalprice) {
		Totalprice = totalprice;
	}
	@Override
	public String toString() {
		return "Basket [id=" + id + ", quantity=" + quantity + ", Totalprice=" + Totalprice + "]";
	}
	public Basket(long id, int quantity, float totalprice) {
		super();
		this.id = id;
		this.quantity = quantity;
		Totalprice = totalprice;
	}
	
	
	
	
	public Basket(int quantity, float totalprice) {
		super();
		this.quantity = quantity;
		Totalprice = totalprice;
	}
	public Basket() {
		super();
	}
	
	
	
	//@JsonManagedReference 
			@JsonIgnore
			@ManyToMany
			private List<Meuble> meubles;
			public List<Meuble> getMeubles() {
				return meubles;
			}
			public void setMeubles(List<Meuble> meubles) {
				this.meubles = meubles;
			}
	
	
	

}
