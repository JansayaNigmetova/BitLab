let books=[{"Наименование":"Над пропастью во ржи","Автор":"Джером Сэлинджер","ISBN":"154623","Цена":"100$"},
          {"Наименование":"Алхимик","Автор":"Пауло Коэльо","ISBN":"541876","Цена":"150$"},
          {"Наименование":"Сто лет одиночества","Автор":"Габриэль Гарсиа Маркес","ISBN":"135462","Цена":"95$"},
          {"Наименование":"Мактуб","Автор":"Пауло Коэльо","ISBN":"8462137","Цена":"125$"},
          {"Наименование":"Азазель","Автор":"Борис Акунин","ISBN":"546782","Цена":"145$"},
          {"Наименование":"Код да Винчи","Автор":"Дэн Браун","ISBN":"945213","Цена":"250$"},
          {"Наименование":"Происхождение","Автор":"Дэн Браун","ISBN":"954274","Цена":"270$"}
          ];
let author=prompt("Enter author");
let n=0;
for (let i = 0; i<books.length; i++) {
	if (books[i]["Автор"]==author) {
		alert(`Наименование-${books[i]["Наименование"]}; Автор-${books[i]["АВтор"]}; ISBN- ${books[i]["ISBN"]}; Цена-${books[i]["Цена"]};`);
		 n=1}
	};
	if (n==0) {alert("Книг этого автора нет")}
    

		




							