fun main() {

 var vogais = "aeiou"   
 var palavra = "aeiou"
 var totalVogal = 0
 for(letra in palavra){
     if(letra in vogais){
         totalVogal = totalVogal + 1
     }
 }
 
 println(totalVogal)

}