let user=[{"login":"kanat","password":"123"},
          {"login":"samat","password":"158"},
          {"login":"rifat","password":"vf25"},
          {"login":"slava","password":"mrd48"},
          {"login":"aigul","password":"sd78"},
          {"login":"zarina","password":"654"}
          ];
let login=prompt("Enter login");
let password=prompt("Enter password");
let n=0;
for (let i = 0; i<user.length; i++) {
	if (user[i]["login"]==login & user[i]["password"]==password) {
		alert("Welcome, you are authenticated");
		 n=1}
	};
	if (n==0) {alert("User not found")}
    

		




							