let n=parseInt(prompt("Enter n"));
let nambers={};
for (let i = 0; i<n; i++) {
nambers[i]=parseInt(prompt("Enter namber"));
};
let nambers2=nambers[0]*nambers[0];
for (let j=1; j<n;j++) {
	nambers2=nambers2+" "+nambers[j]*nambers[j]+" ";
};
alert(nambers2);
		




							