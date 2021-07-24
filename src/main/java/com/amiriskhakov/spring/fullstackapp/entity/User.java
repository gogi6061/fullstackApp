package com.amiriskhakov.spring.fullstackapp.entity;


import com.amiriskhakov.spring.fullstackapp.entity.enums.Role;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.*;


@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;

    @Column(unique = true, updatable = true)
    public String username;

    @Column(nullable = false)
    public String lastname;

    @Column(nullable = false)
    public String name;

    @Column(unique = true)
    public String email;

    @Column(columnDefinition = "text")
    public String bio;

    @Column(length = 3000)
    public String password;

    @ElementCollection(targetClass = Role.class)
    @CollectionTable(joinColumns = @JoinColumn(columnDefinition = "user_id"))
    private Set<Role> role = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "user",
            orphanRemoval = true)
    private List<Post> posts = new ArrayList<>();

    @JsonFormat(pattern = "yyyy-mm-dd HH:mm:ss")
    @Column(updatable = false)
    private LocalDateTime createDate;

    @Transient
    private Collection<? extends GrantedAuthority> authorities;


    @PrePersist
    void onCreate() {
        this.createDate = LocalDateTime.now();
    }

    public User() {
    }

    public User(String username, String lastname, String name, String email, String bio, String password, Set<Role> role, List<Post> posts, LocalDateTime createDate) {

        this.username = username;
        this.lastname = lastname;
        this.name = name;
        this.email = email;
        this.bio = bio;
        this.password = password;
        this.role = role;
        this.posts = posts;
        this.createDate = createDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Role> getRole() {
        return role;
    }

    public void setRole(Set<Role> role) {
        this.role = role;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }


}
