package ua.com.smartmultistory.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "notes")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(allowGetters = true)
@Validated
@Data
public class Note {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "topic")
	@NotNull
	private String topic;

	@Column(name = "content")
	@NotNull
	private String content;

	@ManyToOne
	@JsonBackReference
	@JoinColumn(name = "flat_id")
	private Flat flat;

	@ManyToOne
	@JsonBackReference
	@JoinColumn(name = "house_id")
	private House house;

}
