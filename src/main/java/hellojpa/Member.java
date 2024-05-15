package hellojpa;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
public class Member {

    @Id
    private Long id;
    @Column(name = "name")
    private String username;
    private Integer age;
    @Enumerated(EnumType.STRING)
    private RoleType roleType;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    private LocalDateTime lastModifiedDate;
    @Lob
    private String description;

    public Member() {
    }

}
