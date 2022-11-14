let minutes=parseInt(prompt("Enter MINUTES"));
let hours=parseInt(minutes/60)
if (minutes%60==0) {alert(`ONLY ${minutes/60} hours`)} 
else {alert(`${hours} hours and ${minutes-(hours*60)} minutes`)}	




							