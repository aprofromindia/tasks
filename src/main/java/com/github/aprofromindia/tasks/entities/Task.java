package com.github.aprofromindia.tasks.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;

import java.time.Instant;

@Getter
@Setter
@ToString
@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "done")
    private Boolean done;

    @CreatedDate
    @Column(name = "created_date")
    private Instant createdDate;

    @Enumerated
    @Column(name = "priority")
    private Priority priority;

    @Version
    @Column(name = "version")
    private Integer version;
}


