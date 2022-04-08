fun main(){
    odd()
    robots(5)
    robots(7)
    robots(30)
    println(name(arrayOf("caroll","suzanie","betesi","dan")))
    num()

}
// create a function that prints out all the odd numbers between 1 and 1oo.
fun odd(){
    for (z in 1..100)
        if(z %2 !=0){
            println(z)

        }
     }
//create a function that take in an array of names and returns the number of
// names longer than 5 characters
fun name(names:Array<String>):Int{
    var number=0
    names.forEach{b->
        if(b.length>5)
            number++

    }
    return number
}
fun robots(age:Int){
    if(age<6){
        println("A glass of milk")
    }
    else if(age>=6 && age<15){
        println("A bottle of fanta orange")
    }
    else{
        println("bottle of coca cola")
    }
    fun num(){
        for(h in 1.. 100)
            if(h % 3==0 && h %5==0){
            println("Fiz Buzz")
            }else if(h %3==0){
                println("Fizz")
            }else{
             if(h%5==0){
                 println("Buzz")

             }
            }
    }

     }