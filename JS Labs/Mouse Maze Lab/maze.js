(function maze()
{

$(document).ready(function() {
    //$("#boundary1").mouseover(function (){document.getElementById("boundary1").style.backgroundColor = "red";})
   //$("div.boundary").mouseover(function(){document.getSelection("div.boundary")[0].style.backgroundColor = "#F88";});
    $(".boundary").mouseover(boundarycross);
    $("#end").mouseover(win);
    $("#start").click(reset);
    //$("#boundary1").mouseover(function(){alert ("herllo");});
    //div.boundary
});
var crossed =0;
var  boundarycross =
function () {
    //$("div.boundary").css("background-color" , "red");
    $(".boundary").addClass("youlose");
    crossed ++;
};

var win =
    function () {
        if( crossed ==0) {
            $("#status").text("you win");
            //alert('you win');
        }
        else
        {
            //alert("you lose");
            $("#status").text("you lose");
        }

    };

var reset =
    function(){

        $(".boundary").removeClass("youlose");
        $("#status").text("");
        crossed =0;
    };
})();