package com.example.Hoteruru3rd.form;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ReservationRegisterForm {
	private Integer houseId;
	private Integer userId;
	private String checkinDate;
	private String checkoutDate;
	private Integer numberOfPeople;
	private Integer amount;
}