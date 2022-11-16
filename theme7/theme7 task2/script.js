let n=1;
let nambers=[];
let i=0;
let j=0;
while (j<2){
	n=parseInt(prompt("Enter number"));
	if (n!=0) {
        nambers[i]=n;
        i=i+1;
}
    if (n==0) {j=3}
};
let sum=1;
let b=0;

while (b<nambers.length) {
sum=sum*nambers[b];
b=b+1
}
alert(Math.sqrt(sum))
		




							