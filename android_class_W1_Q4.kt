


open class Human(var name : String){

   open fun attcak(){
        print(name+" use Fist Attack")
    }

}

fun main() {
    var Human = Human("the name passed in")
    Human.attcak()
}