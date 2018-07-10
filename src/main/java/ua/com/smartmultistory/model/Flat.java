package ua.com.smartmultistory.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "flat")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(allowGetters = true)
@Validated
@Data
public class Flat {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@OneToMany(mappedBy = "flat")
	private List<User> users;

	@OneToMany(mappedBy = "flat")
	private List<Note> notes;

	@NotNull
	@Size(max = 14, min = 1)
	@Column(name = "number")
	private String number;

	@ManyToOne
	@JsonBackReference
	@JoinColumn(name = "house_id")
	private House house;

	@NotNull
	@OneToOne
	@JsonBackReference
	@JoinColumn(name = "id")
	private Flat account;

}
