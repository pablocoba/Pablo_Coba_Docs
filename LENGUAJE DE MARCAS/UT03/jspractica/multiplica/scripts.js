function multiplicar(){
    let x = prompt("Introduce un número a multiplicar")
    let y = prompt("Introduce otro número")
    let producto = x*y
    document.getElementById("boton").style.visibility = 'visible';
    document.getElementById("boton").innerHTML = producto;
}
//?????????????????????????????
function mayor(){
    let primero = prompt("Introduce un número")
    let segundo = prompt("Introduce otro número")

    if(primero>segundo){
        document.getElementById("boton").style.visibility = 'visible';
        document.getElementById("boton").innerHTML = '' + primero + ' es mayor que ' + segundo;
    }
    else if(primero<segundo){
        document.getElementById("boton").style.visibility = 'visible';
        document.getElementById("boton").innerHTML = '' + segundo + ' es mayor que ' + primero;
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
    var that = document.getElementById("he");

    var p = document.createElement('h' + y);
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
