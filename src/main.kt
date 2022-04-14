fun main() {
    //QN
var x =CurrentAccount("A1202211","Sharon", 1200.00)
    println( x.deposit(3000.00))
    println(x.withdraw(2000.00))
    x.details()

//QN2
    var y =SavingsAccount("A1202233", "Joana", 1300.00,3 )
    y.withdraw()

    //QN3
    var milk = Product("Milk",5,100.0,"groceries")
    var bread =Product("maize",10, 120.0, "hygiene")
    var eggs = Product("eggs", 3, 20.0,"others")
println(milk.excuteWhen("Mangoes"))
            //Qn4
    var output = getStrEven("banana")
    println(output)
}


//qn1
//.deposit(amount: Double) - Increments the balance bythe
//amount deposited
//b.withdraw(amount: Double) - Decrements the balanceby the
//amount withdrawn
//c.details() - Prints out the account number and balanceand
//name in this format: “Account number x with balance y is
//operated by z
class CurrentAccount(var accountnumber:String, var accountname:String, var balance:Double){
fun deposit(amount: Double){
    var increment = amount+ balance
    println(increment)

}
open fun withdraw(amount: Double){
var decrement = amount-balance
    println(decrement)
}

    fun details(){
        println("Account number $accountnumber with balance $balance is operated by $accountname")
    }

}
//QN2
//Create another classSavingsAccount. It has the samefunctions and
//attributes as the current account except for one attribute,
//withdrawals: Int. Withdrawals is a counter variablethat is used to
//keep track of how many withdrawals have been made from the account
//in a year. The only other difference is that the savings account
//withdraw() method first checks if the number of withdrawalsis less
//than 4 for it to allow one to withdraw money from the account. It also
//increments the withdrawals attribute after a successful withdrawal
//(5points)
class  SavingsAccount(var accountnumber:String, var accountname:String, var balance:Double, var withdrawals: Int){
    fun withdraw(){
            if (withdrawals<=4){
            withdrawals++
                println("allows withdraw")
            }
    }


}

//3.A product is represented by a data class with these attributes: name,
//weight, price, category. Category can either be groceries, hygiene or
//other. Write a function that takes in a product and uses a when
//statement to assign each product to a list based on its category
//(3 points)
data class Product(var name:String, var weight:Int, var price:Double, var category:String){
fun excuteWhen(product:String){
    var newpdtlist = mutableListOf<Product>()
when(product){
    category -> product.plus(product)

}

}

}

//qn4
//.Write a function that given a string returns a string composed of only
//the characters in even indices. For example given “banana” it will return "bnn"

fun getStrEven(word:String):String {
    var newstr=" "
    for(characters in word){
        if(word.indexOf(characters)%2==0){
            newstr +=characters
        }
    }
    return newstr
}