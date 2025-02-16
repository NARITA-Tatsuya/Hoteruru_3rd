const stripe = Stripe('sk_test_51QmVwNBhNh6elxFySWV9jTeZ8uIzfiFJgMDwcuUsvv7dVKyZqxUraN83hZaTT7QCrt34HS6Q7eWthXtgg0Rn6i8L001WEeB9zb');
const paymentButton = document.querySelector('#paymentButton');
paymentButton.addEventListener('click', () => {
	stripe.redirectToCheckout({
		sessionId: sessionId
	})
});