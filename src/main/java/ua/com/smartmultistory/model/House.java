package ua.com.smartmultistory.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.Valid;
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
    @OneToMany(mappedBy = "house")
    private List<Flat> flats;

    @Column(name = "address")
    @NotNull
    private String address;

    @JsonManagedReference
    @OneToMany(mappedBy = "house")
    private List<Account> accounts;

    @ManyToMany(mappedBy = "houses")
    private List<Note> notes;

    public void updateFromDetails(@Valid House houseDetails) {
        this.address = houseDetails.address;
    }

    @Override
    public String toString() {
        return id + " " + address + "\n";
    }

}