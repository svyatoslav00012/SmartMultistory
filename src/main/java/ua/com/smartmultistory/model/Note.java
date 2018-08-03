package ua.com.smartmultistory.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "notes")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(allowGetters = true)
@Validated
@Data
@NoArgsConstructor
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

    @ManyToMany
    @JoinTable(
            name = "note_house",
            joinColumns = {@JoinColumn(name = "note_id")},
            inverseJoinColumns = {@JoinColumn(name = "house_id")}
    )
    private List<House> houses;

    public Note(NoteDTO noteFromClient) {
        this(noteFromClient.topic, noteFromClient.content);
    }

    public Note(String topic, String content) {
        this.topic = topic;
        this.content = content;

        SecurityContext securityContext = SecurityContextHolder.getContext();
        Authentication authentication = securityContext.getAuthentication();
        Account currentLoggedInAccount = (Account) authentication.getPrincipal();
        this.flat = currentLoggedInAccount.getFlat();
    }

    public House getHouse() {
        return flat.getHouse();
    }

}
