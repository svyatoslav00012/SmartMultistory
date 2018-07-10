package ua.com.smartmultistory.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.security.core.CredentialsContainer;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;

@Entity
@Table(name = "account")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(allowGetters = true)
@Validated
@Data
public class Account implements Serializable, CredentialsContainer, AccountDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "email")
	@NotNull
	@Size(min = 3, max = 64)
	private String email;

	@Column(name = "password")
	@NotNull
	@Size(min = 8, max = 64)
	private String password;

	@ManyToOne
	@JsonBackReference
	@JoinColumn(name = "role_id")
	private Role role;

	@OneToOne
	@JsonManagedReference
	@JoinColumn(name = "id")
	private Flat flat;

	@Column(name = "nonExpired")
	private boolean nonExpired;

	@Column(name = "nonLocked")
	private boolean nonLocked;

	@Column(name = "credentialsNonExpired")
	private boolean credentialsNonExpired;

	@Column(name = "enabled")
	private boolean enabled;

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return Collections.singleton(role);
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return email;
	}

	@Override
	public boolean isAccountNonExpired() {
		return nonExpired;
	}

	@Override
	public boolean isAccountNonLocked() {
		return nonLocked;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return credentialsNonExpired;
	}

	@Override
	public boolean isEnabled() {
		return enabled;
	}

	@Override
	public void eraseCredentials() {
		credentialsNonExpired = false;
	}

	private static final long serialVersionUID = 1L;
}
