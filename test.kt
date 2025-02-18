fun main(){
    var hello: String = "Hello World"   
    println(hello)
    for(i in 1..10){
    	print(kertoma(i))
        print("\n")
    }
}


fun kertoma(A: Int): Int{
    var apu: Int = 1
    for (i in 1..A) {
        apu = apu * i
    }
    return apu
}

