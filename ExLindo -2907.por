programa
{/*Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.

*/
	
	funcao inicio()
	{
	inteiro numero[5], x, maiorpont =0 

	para (x=0; x<5; x++) {

		escreva ("Entre com um número: ")
		leia (numero[x])
		

		se (maiorpont < numero[x]) 

		maiorpont = numero[x]
	}
	limpa ()
	escreva ("\nA maior pontuação é: " ,maiorpont)



	para (x=0; x<5; x++) {

		escreva ("\nOs valores foram: " ,numero[x]) }
		
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 394; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */