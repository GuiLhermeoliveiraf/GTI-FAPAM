// Cria função que alerta sobre promoções ao clicar na imagem
function alertValor(){
    alert('Estamos com uma promoção de 10% de desconto!')
}

// Cria função que limpa a página e imprime uma mensagem
function acaoButton(){
    const botao = document.getElementById('botao');

    botao.addEventListener('click', function() {
        const mainDiv = document.querySelector('main');
        mainDiv.innerHTML = '';
        mainDiv.innerHTML = '<div class="newContent"><h1>Página em construção</h1></div>';
    });
}