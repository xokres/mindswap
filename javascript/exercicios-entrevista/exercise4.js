/* 4. Under The Sea

Congratulations, you won a free dinner!
But before you stuff your face with some delicious local delicacies,
it's time for one last adventure: snorkeling!

You get into your car and happily drive to the water sports site,
but when you get there, the girl from the snorkeling booth is locking the doors.
You approach her to get some answers, and she tells you that,
according to her ocean-monitoring chart, there is a higher than 30% chance
that you will get seasick. When that happens, her orders are to close for the day.
You look at her chart, and knowing that only the change from calm (-) to wave (~)
adds to the probability of being seasick, it is your strong belief that she's wrong.

Task
1. Write a function that analyzes the girl's chart, counting the number of calm to wave changes. If the result represents more than 30% of the total events, she's right. If not... Time to get out your cool snorkeling goggles!
2. Your function should return the probability value, rounded down. */

function chartAnalyser(chart) {
  
  let counter = 0;
  
  for(let i = 0 ; i < chart.length; i++){
   if(chart[i] === '-' && chart[i+1] === '~'){
      counter++;
    }
    
  }
  return Math.floor(counter / chart.length * 100 );
}

window.chartAnalyser = chartAnalyser;