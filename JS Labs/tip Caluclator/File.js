function calcTip()
{
    let Price_value = document.getElementById("subtotal").value;
    let tip_value = document.getElementById("tip").value;
    let p_value = document.getElementById("total");

    let result = Number( Price_value ) * Number( tip_value/100)  ;

   p_value.innerHTML = "$" + Number( result);


}