let n=parseInt(prompt("Enter n"));
let nambers={};
for (let i = 0; i<n; i++) {
nambers[i]=prompt("Enter namber")
};
let nambers2;
for (let j=n-1; j>=0;j--) {
	nambers2=nambers2+nambers[j]+" ";
};
alert(nambers2);
		




							