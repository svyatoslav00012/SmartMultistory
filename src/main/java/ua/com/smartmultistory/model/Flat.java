package ua.com.smartmultistory.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.Valid;
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
    private List<Resident> residents;

    @NotNull
    @Size(max = 14, min = 1)
    @Column(name = "number")
    private String number;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "house_id")
    private House house;

    @OneToOne
    @JsonBackReference
    @JoinColumn(name = "account_id")
    private Account account;

    public String toString() {
        return "flat#" + id + "\n" + "House : " + house;
    }

    public void updateFromDetails(@Valid Flat flatDetails) {
        this.number = flatDetails.number;
    }
}
