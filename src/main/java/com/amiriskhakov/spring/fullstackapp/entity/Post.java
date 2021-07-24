package com.amiriskhakov.spring.fullstackapp.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;
    private String caption;
    private String location;
    private int likes;

    @Column
    @ElementCollection(targetClass = String.class)
    private Set<String> linkedUsers = new HashSet<>();


    @ManyToOne(fetch = FetchType.LAZY)
    private User user;


    @OneToMany(cascade = CascadeType.REFRESH,
            fetch = FetchType.EAGER,
            mappedBy = "post",
            orphanRemoval = true)
    private List<Comment> comment = new ArrayList<>();

    @Column(updatable = false)
    private LocalDateTime createDate;

    @PrePersist
    void onCreate() {
        this.createDate = LocalDateTime.now();
    }

    public Post() {
    }

    public Post( String title, String caption, String location, int likes, Set<String> linkedUsers, User user, List<Comment> comment, LocalDateTime createDate) {
        this.title = title;
        this.caption = caption;
        this.location = location;
        this.likes = likes;
        this.linkedUsers = linkedUsers;
        this.user = user;
        this.comment = comment;
        this.createDate = createDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public Set<String> getLinkedUsers() {
        return linkedUsers;
    }

    public void setLinkedUsers(Set<String> linkedUsers) {
        this.linkedUsers = linkedUsers;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Comment> getComment() {
        return comment;
    }

    public void setComment(List<Comment> comment) {
        this.comment = comment;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }
}
