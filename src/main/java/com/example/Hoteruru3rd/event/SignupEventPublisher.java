package com.example.Hoteruru3rd.event;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.example.Hoteruru3rd.entity.User;

@Component
public class SignupEventPublisher {
	private final ApplicationEventPublisher applicationEventPublisher;

	public SignupEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.applicationEventPublisher = applicationEventPublisher;
	}

	public void publishSignupEvent(User user, String requestUrl) {
		applicationEventPublisher.publishEvent(new SignupEvent(this, user, requestUrl));
	}
}

public class Main{
	public static int add(int x, int y) {
		int ans = x + y;
		return ans;
	}
	public static void main(String[] args) {
		int ans = add(100, 10);
		System.out.println("100 + 10 =" + ans);
	}
}