package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Meuble implements Serializable{
	
	
private static final long serialVersionUID = 3152690779535828408L;

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String Libelle;
	private float Price;
	private String Photos;
	private String Adress;
	private String Description;
	
	@Enumerated(EnumType.STRING)
	//@NotNull
	private StateM stateM;
	
	
	@Enumerated(EnumType.STRING)
	//@NotNull
	private Categorie categorie;
	
	
	
	@Temporal(TemporalType.DATE)
	private Date dateAjout;



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getLibelle() {
		return Libelle;
	}



	public void setLibelle(String libelle) {
		Libelle = libelle;
	}



	public float getPrice() {
		return Price;
	}



	public void setPrice(float price) {
		Price = price;
	}



	public String getPhotos() {
		return Photos;
	}



	public void setPhotos(String photos) {
		Photos = photos;
	}



	public String getAdress() {
		return Adress;
	}



	public void setAdress(String adress) {
		Adress = adress;
	}



	public String getDescription() {
		return Description;
	}



	public void setDescription(String description) {
		Description = description;
	}



	public StateM getState() {
		return stateM;
	}



	public void setState(StateM stateM) {
		this.stateM = stateM;
	}



	public Categorie getCategorie() {
		return categorie;
	}



	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}



	public Date getDateAjout() {
		return dateAjout;
	}



	public void setDateAjout(Date dateAjout) {
		this.dateAjout = dateAjout;
	}



	@Override
	public String toString() {
		return "Meuble [id=" + id + ", Libelle=" + Libelle + ", Price=" + Price + ", Photos=" + Photos + ", Adress="
				+ Adress + ", Description=" + Description + ", state=" + stateM + ", categorie=" + categorie
				+ ", dateAjout=" + dateAjout + "]";
	}



	public Meuble(long id, String libelle, float price, String photos, String adress, String description, StateM stateM,
			Categorie categorie, Date dateAjout) {
		super();
		this.id = id;
		Libelle = libelle;
		Price = price;
		Photos = photos;
		Adress = adress;
		Description = description;
		this.stateM = stateM;
		this.categorie = categorie;
		this.dateAjout = dateAjout;
	}

	
	
	


	public Meuble(String libelle, float price, String photos, String adress, String description, StateM stateM,
			Categorie categorie, Date dateAjout) {
		super();
		Libelle = libelle;
		Price = price;
		Photos = photos;
		Adress = adress;
		Description = description;
		this.stateM = stateM;
		this.categorie = categorie;
		this.dateAjout = dateAjout;
		
	}



	public Meuble() {
		super();
	}
	
	
	
	
	//@JsonBackReference  
			@JsonIgnore
			@ManyToMany(mappedBy="meubles",fetch=FetchType.EAGER )
			//@NotNull
			private List<Basket> baskets;



			public List<Basket> getBaskets() {
				return baskets;
			}



			public void setBaskets(List<Basket> baskets) {
				this.baskets = baskets;
			}
			
			
			//@JsonManagedReference 
			@JsonIgnore
			@ManyToMany
			private List<User> user;



			public StateM getStateM() {
				return stateM;
			}



			public void setStateM(StateM stateM) {
				this.stateM = stateM;
			}



			public List<User> getUser() {
				return user;
			}



			public void setUser(List<User> user) {
				this.user = user;
			}
			
	
			
			

}
