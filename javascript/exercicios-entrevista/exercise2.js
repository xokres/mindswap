/* 2. They see you rolling

You arrived on the island, but you will need to rent a vehicle to get around
and explore all the spectacular sites your destination has to offer.

The manager of the car rental company makes you a few reasonable offers:

For every day you rent the car it will cost you 35€.
If you rent the car for seven or more days, you'll get a 40€ discount.
Alternatively, if you rent the car for three or more days, you'll get 10€ off your total.

The manager is having a hard time calculating your total because
you can't decide how many days you want to spend on the island,
but he shouldn't fear! As a programmer in the making,
you choose to step up and help the man by creating a function that
calculates a car's rental cost for a given amount of days.

Task
1. Write the function described above.
2. Your function should return the total cost of renting a car for X days.

Example
If you decide to rent a car for 3 days, your function should return 95. */

function getRentalCost(days) {
  let discount;
  const pricePerDay = 35;

  if (days >= 3 && days < 7) {
    discount = 10;
  } else if (days >= 7) {
    discount = 40;
  } else {
    discount = 0;
  }
  return (days * pricePerDay - discount);
}

window.getRentalCost = getRentalCost;