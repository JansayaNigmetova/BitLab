let students=[{"name":"a ","surname":" ","GPA":" "}];
let j=0;
let i=0;
let student;
while (j<2) {
let a=prompt("PRESS 1 TO ADD STUDENT \n PRESS 2 TO LIST STUDENT \n PRESS 0 TO EXIT")
    if (a==1) {
    	students[i]["name"]=prompt("INSERT NAME:");
    	students[i]["surname"]=prompt("INSERT SURNAME:");
    	students[i]["GPA"]=prompt("INSERT GPA:");
    	student=student+(`\n name: ${students[i]["name"]}; surname: ${students[i]["surname"]}; GPA: ${students[i]["GPA"]}`);
    }
    if (a==2) {
    	alert(student);
    }
    if (a==0) {
    	j=3;
    }
}



		




							