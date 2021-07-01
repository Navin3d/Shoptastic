var btn = document.getElementById("menu")
var hum = document.getElementById("alt")
var path = document.querySelector(".card")

console.log(hum)

btn.onclick = function(){
    if(hum.classList.contains('hide')){
        hum.classList.add("show")
        hum.classList.remove("hide")
    }
    else{
        hum.classList.remove("show")
        hum.classList.add("hide")
    }
}

path.addEventListener("click", function(){
    location.replace("/MOBILES_AND_GADGETS")
})

////////////////////////////////////////////////////////////////
////////////////ADDITIONS///////////////////////////////////////
////////////////////////////////////////////////////////////////
let img = "https://images.pexels.com/photos/1169754/pexels-photo-1169754.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940";
document.getElementById("bdy").style.backgroundImage = "linear-gradient(rgba(80, 79, 79, 0.315),rgba(80, 79, 79, 0.315)), url("+img+")";
