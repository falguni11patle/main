package com.magidash.dashboards.model;


import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "dashboards")
public class Dashboard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column( name = "createdAt", updatable = false, insertable = false, columnDefinition = "TIMESTAMP")
    private LocalDateTime createdAt;

    @Column( name = "updatedAt", insertable = false, columnDefinition = "TIMESTAMP")
    private LocalDateTime updatedAt;


    @Column(nullable = false)
    private String title;

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
