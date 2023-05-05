//fun main() {
//    val border = "`-._,-'"
//    val timesToRepeat = 4
//    printBorder(border, timesToRepeat)
//    println("  Happy Birthday, Jhansi!")
//    printBorder(border, timesToRepeat)
//}
//
//fun printBorder(border: String, timesToRepeat: Int) {
//    repeat(timesToRepeat) {
//        print(border)
//    }
//    println()
//}

//********** CAKE BUILDING *********
fun main(){

    val age = 24;
    val layers = 5;

    //    CALLING printCakeTop FUNCTION
    printCakeCandles(age);

    //    CALLING printCakeTop FUNCTION
    printCakeTop(age);

    //    CALLING printCakeBottom FUNCTION
    printCakeBottom(age, layers);

}
//******** CAKE TOP FUNC *********
fun printCakeTop(age: Int){
    repeat(age + 2){
        print("=");
    }
    println();
}

//******** CANDLES FUNC ********
fun printCakeCandles(age: Int){
    print(" ");
    repeat(age){
        print(",");
    }
    println();
    print(" ");

    repeat(age){
        print("|");
    }
    println();
}

//******* CAKE BOTTOM ******
fun printCakeBottom(age: Int, layers: Int){

    repeat(layers){
        repeat(age + 2) {
            print("@");
        }
        println();
    }

}


