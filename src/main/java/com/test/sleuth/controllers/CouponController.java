package com.test.sleuth.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.sleuth.models.Coupon;

@RestController
@RequestMapping("/couponapi")
public class CouponController {

	
	@RequestMapping(value="/coupons/{code}", method = RequestMethod.GET)
	public Coupon getCoupon(@PathVariable("code") String code) {
		return Coupon.getCouponByCode(code);
	}
	
}
