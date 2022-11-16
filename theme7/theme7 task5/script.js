let auto=[{"Имя":"BMV","Модель":"X5","Год выпуска":"2013","Объем двигателя":"3.5","Цена":"35000"},
          {"Имя":"BMV","Модель":"X7","Год выпуска":"2021","Объем двигателя":"4","Цена":"100000"},
          {"Имя":"Toyota","Модель":"RAV4","Год выпуска":"2006","Объем двигателя":"2.7","Цена":"40000"},
          {"Имя":"Toyota","Модель":"Corolla","Год выпуска":"2007","Объем двигателя":"2.4","Цена":"21000"},
          {"Имя":"Toyota","Модель":"Camry","Год выпуска":"2009","Объем двигателя":"2.7","Цена":"17000"},
          {"Имя":"Nissan","Модель":"Maxima","Год выпуска":"2015","Объем двигателя":"3","Цена":"37000"},
          {"Имя":"Nissan","Модель":"X-Trail","Год выпуска":"2019","Объем двигателя":"4.5","Цена":"41000"}
          ];
let j=0;
while (j<2) {
let request=prompt("INSERT [1] TO SEARCH BY NAME \n INSERT [2] TO SEARCH BY YEAR \n INSERT [3] TO SEARCH BY ENGINE VOLUME \n INSERT [4] TO SEARCH BY PRICE \n INSERT [5] TO EXIT");
if (request==1) {
	let name=prompt("INSERT NAME OF CAR:");
	let names;
	for (let i=0;i<auto.length; i++){
		if (auto[i]["Имя"]==name) {
	names=names+(`\n${auto[i]["Имя"]} - ${auto[i]["Модель"]} - ${auto[i]["Год выпуска"]} - ${auto[i]["Объем двигателя"]} liters - ${auto[i]["Цена"]} $`)}
};
alert(names)
};
if (request==2) {
	let t1=parseInt(prompt("INSERT YEAR START FROM:"));
	let t2=parseInt(prompt("INSERT YEAR ENDS FROM:"));
	let term;
	for (let i=0;i<auto.length; i++){
		if (parseInt(auto[i]["Год выпуска"])>t1 & parseInt(auto[i]["Год выпуска"])<t2) {
	term=term+(`\n${auto[i]["Имя"]} - ${auto[i]["Модель"]} - ${auto[i]["Год выпуска"]} - ${auto[i]["Объем двигателя"]} liters - ${auto[i]["Цена"]} $`)}
};
alert(term)
};
if (request==3) {
	let p1=parseInt(prompt("INSERT ENGINE VOLUME START FROM:"));
	let p2=parseInt(prompt("INSERT ENGINE VOLUME ENDS FROM:"));
	let volume;
	for (let i=0;i<auto.length; i++){
		if (parseInt(auto[i]["Объем двигателя"])>V1 & parseInt(auto[i]["Объем двигателя"])<V2) {
	volume=volume+(`\n${auto[i]["Имя"]} - ${auto[i]["Модель"]} - ${auto[i]["Год выпуска"]} - ${auto[i]["Объем двигателя"]} liters - ${auto[i]["Цена"]} $`)}
};
alert(volume)
};
if (request==4) {
	let p1=parseInt(prompt("INSERT PRICE START FROM:"));
	let p2=parseInt(prompt("INSERT PRICE ENDS FROM:"));
	let price;
	for (let i=0;i<auto.length; i++){
		if (parseInt(auto[i]["Цена"])>p1 & parseInt(auto[i]["Цена"])<p2) {
	price=price+(`\n${auto[i]["Имя"]} - ${auto[i]["Модель"]} - ${auto[i]["Год выпуска"]} - ${auto[i]["Объем двигателя"]} liters - ${auto[i]["Цена"]} $`)}
};
alert(price)
}; 
if (request==5) {j=2};
}   

		




							