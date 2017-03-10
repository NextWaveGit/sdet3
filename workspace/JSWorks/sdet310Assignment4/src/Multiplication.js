Multiplication = function (number){
    this.number = number;
}


Multiplication.prototype.fnValidate = function(){
    number = this.getNumber();            

            alert("generate multiplication table for number " + number + " ?");
 
                for(i=1; i<=number; i++){
                console.log(i + " x " + number + "= " + i*number);
            }

            return true;
        }

Multiplication.prototype.getNumber = function(){
    return this.number;
};
