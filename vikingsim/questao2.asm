main
	ldw r3,quantidade
	ldi r1,0
	ldi r2,32
verificacao
	ldi r5,frase
	add r5,r5,r1
	ldb r5,r5
	bez r5,fim
laco
	ldi r5,frase
	add r5,r5,r1
	ldb r5,r5
	add r1,1
	sub r4,r5,r2
	bez r4,soma
	bnz r5,laco
soma
	add r3,1
	bnz r5,laco
fim
	stw r3,quantidade
	stw r3,0xf002
	hcf

frase "Teste para o exercicio"
quantidade 0