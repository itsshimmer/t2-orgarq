main
	ldi r1,0
	ldi r2,0
	ldi r3,0
	
	ldi r4,palavra
	ldb r4,r4
laco
	sub r5,r5,r4
	bez r5,teste
	bnz r5,senao	
volta
	ldi r5,frase
	add r5,r5,r1
	ldb r5,r5
	stw r5,0xf000
	add r1,1
	bnz r5,laco
	ldi r5,novalinha
	ldb r5,r5
	stw r5,0xf000
	stw r3,0xf002
	hcf
teste	
	add r2,1
	ldi r4,palavra
	add r4,r4,r2
	ldb r4,r4
	bez r4,conta
fimconta
	bnz r7,volta
senao
	ldi r2,0
	ldi r4,palavra
	ldb r4,r4
	bnz r7,volta	
conta
	add r3,1
	bnz r7,fimconta

frase	"abacaxi melancia laranja maca abacaxi"
palavra	"abacaxi"
novalinha	"\n"