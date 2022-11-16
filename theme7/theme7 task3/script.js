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
let sum=" ";
for (let b=0; b<nambers.length; b++) {
	if (nambers[b]>0) {
		sum=sum+nambers[b]+" ";
	}

}
alert(sum);
		




							