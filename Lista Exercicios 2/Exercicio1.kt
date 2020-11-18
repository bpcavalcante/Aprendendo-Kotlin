
fun main() {
    
    fun soma(a : Int, b : Int) {
        var soma = a + b
        println(" A soma de $a + $b é: " + soma)
    }
    
    fun subtracao(a : Int, b : Int){
        var subtracao = a - b
        println(" A subtração de $a - $b é: " + subtracao)

    }
    
    fun multiplicacao(a : Double, b: Double){
        var multiplicacao = a * b
        println(" A multiplicação de $a X $b é: " + multiplicacao)
    }
    
    fun divisao(a : Double, b : Double){
        var divisao = a / b
        println(" A divisão de $a / $b é: " + divisao)

    }
    
    soma(5,6)
    subtracao(6,5)
    multiplicacao(5.0,6.0)
    divisao(6.0,2.0)
}