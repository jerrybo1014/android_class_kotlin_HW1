
open class Human(var name : String) {

    open fun attcak() {
        print(name + " use Fist Attack")
    }
}

class Mage(name:String) : Human(name){

override fun attcak(){
    print("$name use Fireball")
}
}


fun main() {
    var Mage = Mage("the name passed in")
    Mage.attcak()



}