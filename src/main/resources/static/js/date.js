let d = new Date();

let date = d.getDate();

var weekdays = new Array(7);
weekdays[0] = "Sunday";
weekdays[1] = "Monday";
weekdays[2] = "Tuesday";
weekdays[3] = "Wednesday";
weekdays[4] = "Thursday";
weekdays[5] = "Friday";
weekdays[6] = "Saturday";

console.log("Todays date is " + date);

document.getElementById("date").innerHTML = date + 7 + " " + weekdays[d.getDay()];