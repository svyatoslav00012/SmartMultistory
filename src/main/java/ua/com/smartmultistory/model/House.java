package ua.com.smartmultistory.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "house")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(allowGetters = true)
@Validated
@Data
public class House {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@JsonManagedReference
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "house", cascade = CascadeType.PERSIST)
	private List<Flat> flats;

	@Column(name = "adress")
	@NotNull
	private String adress;

	@JsonManagedReference
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "flat", cascade = CascadeType.PERSIST)
	private List<Note> notes;

}


/*

some changes to be able to save nested objects like

{
	"adress": "someAdress",
	"flats": [
		{
		"number": "123a"
		}
	]
}

 */
