let n=parseInt(prompt("Enter n"));
let nambers={};
for (let i = 0; i<n; i++) {
nambers[i]=parseInt(prompt("Enter namber"));
};
let sum=parseInt(0);

for (let j=0; j<n;j++) {
	sum=sum+nambers[j];	
    };
alert(sum+" "+sum/n);
		




							