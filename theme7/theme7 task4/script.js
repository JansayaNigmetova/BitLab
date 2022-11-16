let n=parseInt(prompt("Enter n"));
let nambers={};
for (let i = 0; i<n; i++) {
nambers[i]=prompt("Enter namber")
};
let m=1;
for (let j=0; j<n;j++) {
	if (nambers[j]!=0) {
		m=m*nambers[j];
    };
};
alert(m);
		




							