fun main() {
	for(i in 1..100){
		if (i%3 == 0 && i%5 == 0){
            println("$i es un Fizz Buzz")
        } else if (i%5 == 0){
            println("$i es un Buzz")
        } else if (i%3 == 0){
        	println("$i es un Fizz")
        } else {
        	println(i)
        }
	}    
}