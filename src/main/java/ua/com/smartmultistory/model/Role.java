package ua.com.smartmultistory.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.validation.annotation.Validated;
import ua.com.smartmultistory.enumeration.RoleName;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "role")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(allowGetters = true)
@Validated
@Data
public class Role implements GrantedAuthority {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Override
	public String getAuthority() {
		return name.name();
	}

	@OneToMany(mappedBy = "role")
	private List<Account> accounts;

	@Column(name = "name")
	@NotNull
	private RoleName name;

	public String getName() {
		return name.name();
	}

	public void setName(String name) {
		this.name = RoleName.valueOf(name);
	}
}
