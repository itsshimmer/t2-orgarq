main
	ldi r1,0 
	ldw r2,tam

while
	ldi r3,0
	slt r3,r1,r2
	bez r3,endwhile

	ldi r5,vet
    add r5,r5,r1
    add r5,r5,r1

	ldw r5,r5
	stw r5,0xf002

    add r1,1

    ldi r3,0
    ldw r4,menornum
	slt r3,r5,r4
	bnz r3,menor

    ldi r3,0
    ldw r4,maiornum
	slt r3,r4,r5
	bnz r3,maior

	bnz r7,while

menor
    stw r5,menornum
    bnz r7,while
maior
    stw r5,maiornum
    bnz r7,while
endwhile
    ldw r4,menornum
    stw r4,0xf002
    ldw r4,maiornum
    stw r4,0xf002
	hcf

tam	25
vet	0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24
soma    0
produto    0
maiornum    -32767
menornum    32767