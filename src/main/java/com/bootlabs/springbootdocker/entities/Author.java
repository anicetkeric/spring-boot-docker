package com.bootlabs.springbootdocker.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import jakarta.persistence.*;

/**
 * JPA entity class for "Author"
 *
 * @author @bootteam
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "author", schema = "public")
public class Author implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "lastname", nullable = false, length = 100)
    private String lastname;

    @Column(name = "firstname", length = 255)
    private String firstname;
}
