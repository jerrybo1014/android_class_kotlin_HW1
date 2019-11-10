open class Human(var name : String) {
    open fun attcak() {
        print(name + " use Fist Attack")
    }
    open fun carrar():String{
        return "Human"
    } /*這裡加入回傳值為類別名稱的函數carrar()*/
}


class Mage(name:String) : Human(name) {
    override fun attcak() {
        print("$name use Fireball")
    }
    override fun carrar():String {
        return "Mage"
    } /*在每個子類別裡分別回傳各自類別名稱*/
}

class Mana(name:String) : Human(name) {
    override fun attcak() {
        print("$name use ?")
    }
    override fun carrar():String {
        return "Mana"
    }/*在每個子類別裡分別回傳各自類別名稱*/
}


fun main() {
    var p1 = Mage("name1")
    var p2 = Human("name2")
    var p3 = Mana("name3")
    /*輸入要使用的人物與其類別*/

    var checklist = listOf<Human>(p1,p2,p3)
    /*把所有人放入List裡*/

    var checkmana = 0
    for (h in checklist) {
        var a = h.carrar()
        if (a == "Mana") {
            checkmana = 1
        }
    }
    /*宣告一個變數為checkmana，最後若其值為0則無mana 若為1則有mana*/

    if (checkmana == 1 ){
        println("It has mana here")
    }else println("It hasn't mana")
    /*列印檢查後結果*/
}
//It has mana here