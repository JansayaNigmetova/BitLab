let n=parseInt(prompt("Enter n"));
let nambers={};
for (let i = 0; i<n; i++) {
nambers[i]=prompt("Enter namber")
};
let m=prompt("Enter m");
let s=0;

for (let j=1; j<n;j++) {
	if (nambers[j]==m) {
		alert(`Yes \n index: ${j}`)
		s=1
    }
};
if (s==0) {alert("Такой цифры нет")};
		




							