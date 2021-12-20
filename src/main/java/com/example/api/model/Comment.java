package com.example.api.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity
@Table(name = "comments")
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@ToString(callSuper = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class Comment extends  AbstractCommon {
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(
			name = "postId",
			nullable = false,
			columnDefinition = "bigint",
			foreignKey = @ForeignKey(value = ConstraintMode.NO_CONSTRAINT)
	)
//	@EqualsAndHashCode.Exclude
//	@ToString.Exclude
	private Post post;

	@Column(name = "name", length = 100)
	private String name;
	@Column(name = "email", length = 100)
	String email;
	@Column(name = "body")
	String body;
}
