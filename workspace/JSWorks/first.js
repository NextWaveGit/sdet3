function fnHello(){
    console.log("welcome from HEad")

    //var var1 = "jo";
    //var2= "bye";

    var name = prompt("Enter your name:")
    var age = parser(prompt("Enter your age: ", "20"))
    
    console.log("your name is "+ name);


    if(age >18){
        var mydiv = document.getElementById('mydiv');
        mydiv.innerHTML("Hey you are good");

    } else {document.getElementById('mydiv').innerHTML = "Sorry, you got to wait";

    }


}



functionfnHi(){
    console.log("Welcome from fnHi");

    console.log("value of var2 =" + var2)

}




