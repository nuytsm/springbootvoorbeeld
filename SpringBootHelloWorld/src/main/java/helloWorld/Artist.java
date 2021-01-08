package helloWorld;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Artists")
public class Artist {
	
	@Id
	@Column(name = "Artistid")
	private Integer id;
	
	@Column(name = "Name")
	private String name;
	
	public Integer getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setId(Integer Id) {
		this.id = Id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
