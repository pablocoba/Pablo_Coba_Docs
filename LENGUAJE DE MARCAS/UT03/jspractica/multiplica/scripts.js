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
    let y = parseInt(document.getElementById("ache"))
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
