package com.example.api.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.time.Instant;

@MappedSuperclass
@Getter
@Setter
@SuperBuilder
@EqualsAndHashCode
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class AbstractCommon {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "created_dt", nullable = false, columnDefinition = "timestamp NOT NULL DEFAULT current_timestamp()")
    @Builder.Default
    private Instant createdDt = Instant.now();

    @Column(name = "modified_dt", nullable = false, columnDefinition = "timestamp NOT NULL DEFAULT current_timestamp()")
    @Builder.Default
    private Instant modifiedDt = Instant.now();
}
