package ua.od.game.model;

import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;

/**
 * @author ruslan.gramatic on 6/27/18.
 */
@Data
@Entity
//@EntityListeners(AuditingEntityListener.class)
public class Room implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;

    @NotBlank
    private String description;

    @Column(nullable = true, updatable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date startGameTime;
}
