package com.example.api.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@ToString(callSuper = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class User extends  AbstractCommon {
    @Column(name = "name", length = 100)
    private String name;
    @Column(name = "username", length = 100)
    private String username;
    @Column(name = "email", length = 100)
    private String email;
    @Column(name = "phone", length = 100)
    private String phone;
    @Column(name = "website", length = 100)
    @Builder.Default
    private String website = null;
}
