package com.test.sleuth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.test.sleuth.models.Coupon;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping(value="/coupons/{code}", method = RequestMethod.GET)
	public Coupon getCoupon(@PathVariable("code") String code) {
		return Coupon.getCouponByCode(code);
	}
	
}
