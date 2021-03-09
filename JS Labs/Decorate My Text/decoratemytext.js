
window.onload = loadJS;


var timer = null;


function loadJS()
{

	document.getElementById('biggerdeco').addEventListener("click", decorate);

	document.getElementById('chkBling').addEventListener("click", addBling);
	
//document.biggerdeco.


}


function decorate () {
	
//alert("Hello, world!");
	
var txtDeco = document.getElementById("txtDeco");
	
var fontsized = parseInt(txtDeco.style.fontSize);


	if (isNaN(fontsized))
	{

		fontsized = 12;
	
}
	
//var fontsized = Number(txtDeco.getAttribute("font-size"));

	//alert (fontsized);

	fontsized = fontsized +2;

	//alert (fontsized);

	var ptsize = fontsized +"pt";
	
txtDeco.style.fontSize = ptsize;
	
//txtDeco.setAttribute("font-size", ptsize) ;

	//alert (ptsize);
}

function addBling() 
{
		 
//timer =
		 if (timer == null) {
			 timer = setInterval(decorate, 500);
  } else {
    clearInterval(timer);
    timer = null;
  }
	var chkbling = document.getElementById('chkBling');
	var txtDeco = document.getElementById('txtDeco');

	if (chkbling.checked = true)
	{
			//alert("Check bling checked!");
			txtDeco.style.color =  "#00FF00";
			txtDeco.style.textDecoration = "underline";
			  // document.body.style.backgroundImage = "('img_tree.png')";
			  //document.body.style.backgroundImage = "url('img_tree.png')";
			document.body.style.backgroundImage = "url('http://www.cs.washington.edu/education/courses/190m/CurrentQtr/labs/6/hundred-dollar-bill.jpg')";
	}
}
