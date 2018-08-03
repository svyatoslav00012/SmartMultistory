package ua.com.smartmultistory.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
import java.util.List;

@Entity
@Table(name = "account")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(allowGetters = true)
@Validated
@Data
public class Account implements Serializable, CredentialsContainer, AccountDetails {

    private static final long serialVersionUID = 1L;

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

    @OneToOne(mappedBy = "account")
    private Flat flat;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "house_id")
    private House house;

    @OneToMany(mappedBy = "flat")
    private List<Note> notes;

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

    public String toString() {
        return id + " " + email;
    }

    public void updateFromDetails(Account accountDetails) {
        System.err.println("Account updateFromDetails(Account accountDetails) DOES NOTHING");
        new Exception().printStackTrace();
    }
}
