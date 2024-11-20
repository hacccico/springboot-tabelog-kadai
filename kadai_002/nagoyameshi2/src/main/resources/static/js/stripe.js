const stripe = Stripe('pk_test_51QMl1TJZupSHAIAlskShIFER7ictNqDkhkIqRpR7VlD3WUvh9JHlOBg89jplR3miTMn7OarYk1AaKZ7sNojDjgaR00qdcDCBjZ');
const paymentButton = document.querySelector('#paymentButton');

paymentButton.addEventListener('click', () => {
  stripe.redirectToCheckout({
    sessionId: sessionId
  })
});