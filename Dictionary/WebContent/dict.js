/*(function dict()
{*/
window.onload = function()
{
		    $("#Search").click(btnLookup_Click);
}

/*$.(document).ready(function()
		{
		alert("Not enough information for an insertion!");
		    $("#Search").click(btnLookup_Click);
		    
		}
		);
*/
function btnLookup_Click() 
	{
	
	  // Get the text from the inputs.
		  var word = $("#searchWord").val();
		
		//alert(word);
		
		if (word === "") {
			alert("Not enough information for an insertion!");
			return;
		}
		
		$.ajax({
                type: "POST",
                url: "dictServlet",
                data: {"Requested": word},
                success: function (data2) {
                
          
                        $("#result").html(data2);
                   

                   
                },
                error: function (e) {
                    $("#result").html(e.textResponse);
                }
            });
	};

   /* function retrieveBands() {

	$.ajax({
		"url" : "DictRetriveData",
		"type" : "GET",
		"data" : {
			"button-id" : "Search"
		},
		"success" : function(data)
    {
	alert("in success function")
       alert(data);
        arr = jQuery.parseJSON(data);
       
	$("#Discription").append(arr);
		
       /* jQuery.each(data.results, function(i, val) {
            // here you can do your magic
            $("#yourdivid").append(document.createTextNode(val.term));
            $("#yourdivid").append(document.createTextNode(val.count));
        });*/
  /*  },
		"error" : function() {
			alert("Request failed.");
		}
	});
}*/

	/*function printData(json) {
		console.log(json);
		// First empty the <div> completely and add a title.
		$("#Discription").append(json);
	
		// Then add every band name contained in the list.
		$.each(json, function(i, name) {
			$("#Discription").append( name + " </br>");
		});
	};*/

    




/*})();*/