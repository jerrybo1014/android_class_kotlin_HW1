open class Human(var name : String){
    open fun attcak(){
        print(name+" use Fist Attack")
    }
}
/*宣告一個類別Human,變數name,類別內有函數attack()會印出name+" use Fist Attack"*/


fun main() {
    var Human = Human("name1")
    Human.attcak()

}/*將類別Human存入變數裡，並呼叫函數attack()來列印name+" use Fist Attack"*/
//name1 use Fist Attack