const calculator = document.querySelector('.calculator')
const keys = calculator.querySelector('.calculator__keys')

keys.addEventListener('click', e =>{
    if(e.target.matches('button')){

    }
})

const key = e.target
const action = key.dataset.action

if(!action){
    console.log('number key!')
}

if(
    action === "add" || action === "subtract" || action === "multiply" || action === "divide" 
){
    console.log('operator key!')
}

if(action === 'clear'){
    console.log('clear key!')
}

if(action === 'calculate'){
    console.log('equal key!')
}

function sum(x,y){

    let summ = parseInt(x)+parseInt(y)
    document.getElementById("res").style.visibility = 'visible';
    document.getElementById("res").innerHTML = summ;

}

function alm(){

    let tecla = document.querySelector(".num");
    num = num + tecla;
    console.log(num);
}



function multiplicar(){
    let x = prompt("Introduce un número a multiplicar")
    let y = prompt("Introduce otro número")
    let producto = x*y
    document.getElementById("boton").style.visibility = 'visible';
    document.getElementById("boton").innerHTML = producto;
}
function dividir(){
    let x = prompt("Introduce dividendo")
    let y = prompt("Introduce divisor")
    let cociente = x/y
    document.getElementById("boton").style.visibility = 'visible';
    document.getElementById("boton").innerHTML = cociente;
}
function sumar(){
    let x = parseInt(prompt("Introduce sumando"))
    let y = parseInt(prompt("Introduce sumando"))
    let suma = x+y
    document.getElementById("boton").style.visibility = 'visible';
    document.getElementById("boton").innerHTML = suma;
}
function restar(){
    let x = prompt("Introduce un número")
    let y = prompt("Introduce número a restar")
    let resta = x-y
    document.getElementById("boton").style.visibility = 'visible';
    document.getElementById("boton").innerHTML = resta;
}
//?????????????????????????????
function mayor(){
    let primero = prompt("Introduce un número")
    let segundo = prompt("Introduce otro número")

    if(primero>segundo){
        document.getElementById("boton").style.visibility = 'visible';
        document.getElementById("boton").innerHTML = '' + segundo + ' es mayor que ' + primero;
    }
    else if(primero<segundo){
        document.getElementById("boton").style.visibility = 'visible';
        document.getElementById("boton").innerHTML = '' + primero + ' es mayor que ' + segundo;
    }
    else{
        document.getElementById("boton").style.visibility = 'visible';
        document.getElementById("boton").innerHTML = 'Son iguales'; 
    }
    console.log('primero = ' + primero + ', segundo = ' + segundo);
}

function encabezado(){
    let x = prompt("Introduce un texto")
    let y = prompt("Introduce un número del 1 al 6")
    let that = document.getElementById("he");
    let p = document.createElement('h' + y);
    p.setAttribute('id',that.getAttribute('id'));

  // move all elements in the other container.
  while(that.firstChild) {
      p.appendChild(that.firstChild);
  }
  that.parentNode.replaceChild(p,that);
  document.getElementById("he").style.visibility = 'visible';
  document.getElementById("he").innerHTML = x;

}

function bgcolor(color){
    let tabla = document.getElementById("uno")
    tabla.style.backgroundColor = color;
}
