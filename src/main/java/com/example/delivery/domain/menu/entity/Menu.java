package com.example.delivery.domain.menu.entity;

import com.example.delivery.domain.user.entity.User;
import com.example.delivery.global.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table(name = "menus")
public class Menu extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id", nullable = false)
    private User owner;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer price;

    private String description;

    @Column(name = "is_deleted", nullable = false)
    private boolean deleted = false;

    protected Menu() {

    }
}
