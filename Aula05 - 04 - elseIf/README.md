# aprendendo sobre else if

## incluindo novas perguntas no else de cada if

> não há limites em relação a aumentos de codições em ifs, porém deve ter cuidado com a quantidade
> pois fica a perguntas (não seria melhor um switch ?)
>
> porém quando utilizandos else if() 
> se faz necessário fechar essa cadeia com um else final, por questões de boas práticas


````java
if(condicao1){
  // se atender a condição 1
}else if(condicao2){ // so entra aqui se atender a condição
 // se atender a condição 2
}else if(condicaoN){ // so entra aqui se atender a condição
 // se atender a condição N
}else{ // seria a condição que sobrou
 //pode ter alguma ação, mas mesmo que não tenha escreva mesmo assim
}
````