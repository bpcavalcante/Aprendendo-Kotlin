fun main() {
	
    var altura = 2.10
    var peso = 97.0
    var imc = peso / (altura * altura)
   
    if(imc < 18.5){
        println("Seu IMC é : $imc e está abaixo do peso cuidado !")
    }
    else if(imc >= 18.6 && imc <= 24.9 ){
        println("Seu IMC é : $imc e está no peso ideal Parabéns !")
    }
    else if(imc >= 25.0 && imc <= 29.9){
        println("Seu IMC é : $imc e está em sobrepeso !")
    }
    else if(imc >= 30.0 && imc <= 34.9){
        println("Seu IMC é : $imc e está em Obesidade 1 !")
    }
    else if(imc >= 35.0 && imc <= 34.9){
        println("Seu IMC é : $imc e está em Obesidade 2 !")
    }
    else{
        println("Seu IMC é : $imc e está em Obesidade 3 !")
    }

}