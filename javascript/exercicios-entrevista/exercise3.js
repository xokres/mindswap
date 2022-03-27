/* 3. There Ain't No Mountain High Enough

Now that you have the car situation figured out and have checked into the hotel,
you're all set. This means it's adventure time!

You pull out a list of the best tourist activities around the island
and decide on a mountain climbing trail.

When you get there, you realize a contest is taking place: 
A few boxes were hidden in some of the mountains' viewpoints. 
Each box contains a set of digits inside.
Your job is to multiply all the digits in said set, and if you succeed,
you win a free meal in the most famous restaurant on the island.

Task
1. Write a function that solves the problem above, no matter what set of digits you're given.
2. Your function should return the result of the multiplication of all the digits inside the box.

Example
Let's imagine that you open your box, and inside it there's the following
set of numbers: [1,4,7,8]. In this case, your function should return 224. */

function getMultipliedBoxDigits(digits) {
  let result = 1;
  for (let i = 0; i < digits.length; i++){
    result = result * digits[i];
  }
  return (result);
}

window.getMultipliedBoxDigits = getMultipliedBoxDigits;