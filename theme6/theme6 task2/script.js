let n=parseInt(prompt("Enter n"));
let nambers={};
for (let i = 0; i<n; i++) {
nambers[i]=prompt("Enter namber")
};
let max=nambers[0];

for (let j=1; j<n;j++) {
	if (nambers[j]>max) {
		max=nambers[j];	
    }
};
alert(max);
		




							