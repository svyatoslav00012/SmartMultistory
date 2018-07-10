package ua.com.smartmultistory.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "user")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(allowGetters = true)
@Validated
@Data
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "name")
	@NotNull
	private String name;

	@Column(name = "number")
	@NotNull
	@Size(min = 13)
	private String number;

	@NotNull
	@ManyToOne
	@JoinColumn(name = "flat_id")
	private Flat flat;

	@Column(name = "note")
	private String note;

	public void update(@Valid User userDetails) {
		this.name = userDetails.name;
		this.number = userDetails.number;
		this.flat = userDetails.flat;
		this.note = userDetails.note;
	}
}
