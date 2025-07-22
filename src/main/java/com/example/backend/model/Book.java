package com.example.backend.model;

import com.example.backend.model.Collection;
import jakarta.persistence.*;

@SuppressWarnings("unused")
@Entity
@Table(name = "BOOKS")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 255)
    private String title;

    @Column(nullable = false, length = 255)
    private String author;
    
    @Column(columnDefinition = "CLOB")
    private String synopsis;
    
    @Column(length = 100)
    private String genre;
    
    @Column(columnDefinition = "DOUBLE DEFAULT 0")
    private double rating = 0.0;
    
    private String image_url;
    
    @Column(nullable = false)
    private String status = "Not Started";

    @ManyToOne
    @JoinColumn(name="COLLECTIONID", nullable = true)
    private Collection collection;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Collection getCollection(){
        return collection;
    }

    public void setCollectionId(Collection collection){
        this.collection = collection;
    }
    
    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", rating=" + rating +
                ", status='" + status + '\'' +
                ", collectionId='" + collection + '\'' +
                '}';
    }

    // Getters and setters
}
