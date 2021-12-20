package com.example.api.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity
@Table(name = "posts")
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@ToString(callSuper = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class Post extends  AbstractCommon {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "userId",
            nullable = false,
            columnDefinition = "bigint",
            foreignKey = @ForeignKey(value = ConstraintMode.NO_CONSTRAINT)
    )
    private User user;

    @Column(name = "title", length = 255)
    private String title;

    @Column(name = "body")
    private String body;
}
