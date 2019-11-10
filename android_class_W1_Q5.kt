open class Human(var name : String) {

    open fun attcak() {
        print(name + " use Fist Attack")
    }
}
/*宣告一個可被繼承的類別Human,變數name,類別內有函數attack()會印出name+" use Fist Attack"*/

class Mage(name:String) : Human(name){
    override fun attcak() {
        print("$name use Fireball")
    }
}
/*宣告一個類別Mage,變數name,繼承Human,類別內有覆寫函數attack()會印出$name use Fireball*/


fun main() {
    var Mage = Mage("name1")
    Mage.attcak()
}/*將類別Mage存入變數裡，並呼叫函數attack()來列印$name use Fireball*/
//name1 use Fireball