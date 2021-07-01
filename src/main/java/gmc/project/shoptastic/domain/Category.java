package gmc.project.shoptastic.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Data
@EqualsAndHashCode(exclude = {"productCategory"})
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@Enumerated(value = EnumType.STRING)
	private Categories categories;
	
	private String description;
	
	@Lob
	private String imageUrl;
	
	@Lob
	private Byte[] image;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
	private Set<Products> productCategory;

}
