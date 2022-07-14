$(function () {
  let price = $("#item-price").text();
  let totalPrice = price;
  $("#item-amount").on('change', function () {
    let amount = $("#item-amount").val();
    totalPrice = price * amount;
    $("#total-price").text(totalPrice);
  })
})