package com.phoenix.howabouttoday.member.wishlist;

import com.phoenix.howabouttoday.reserve.domain.Reservation.Reservation;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("wishlist")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "t_wishlist")
public class WishList extends Reservation {
}
