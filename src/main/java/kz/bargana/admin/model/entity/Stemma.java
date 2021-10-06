package kz.bargana.admin.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Date;

@EqualsAndHashCode
@Entity
@Table(name = "stemma")
@Data
public class Stemma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "patronymic")
    private String patronymic;

    @Column(name = "date_of_birth")
    private Date dateOfBirth;

    @Column(name = "date_of_death")
    private Date dateOfDeath;

    @Column(name = "info")
    private String info;

    @Column(name = "parent_id")
    private Long parentId;

    @Column(name = "gender")
    private Character gender;

    @Column(name = "children_count")
    private Integer childrenCount;
}
