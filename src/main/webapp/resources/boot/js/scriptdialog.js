// JavaScript Document
$(document).ready(function () {
    $("#btnAdd").click(function () {
		
       $(function () {
            $("#sampleDialog").dialog({

                autoOpen:true,
                modal: true,
                width: 1000,
                height: 500,
                show: {
                   effect: "blind",
                   duration: 500
                },
                hide: {
                   effect: "hide",
                    duration: 500
                }
            });
        });
    });
	    
   });