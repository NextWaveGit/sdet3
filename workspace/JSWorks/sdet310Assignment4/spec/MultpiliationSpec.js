describe("Multiplication", function(){
    var multi;

    beforeEach(function(){
        multi = new Multiplication(2);
        spyOn(citi, "getNumber");
    })

    it("Testing spy for getting number", function(){
                
        citi.fnValidate();
        expect(citi.getNumber).toHaveBeenCalled();  
    })

 });


