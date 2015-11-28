$(document).ready(function(){
	$('html,body').animate({scrollTop: 0}, 1000);	//Redirection of Page to top when the page is reloaded
	$("#memCalender").hide();
	pageLoadHiddenElemen();
	//ScrollEvent
	$(window).scroll(function(e){
		console.log("scroll event triggered");
		var windowScrollHeight = $(window).scrollTop();
		if(windowScrollHeight == 636){
			//alert("church page loaded");
			$(".churchNameandAddress,.churchContactDetails,.recentUpdates,.churchHistory").css("opacity","0.5");
			$(".bookYourInfo").css("display","block");
			$("#bookYourRequest").css("border","2px solid white");
			//$("#bookYourRequest").addClass("animated zoomIn");
			$(".bookYourInfo").addClass("animated zoomIn");
		} else {
			$(".churchNameandAddress,.churchContactDetails,.recentUpdates,.churchHistory").css("opacity","1");
			$(".bookYourInfo").css("display","none");
			$("#bookYourRequest").css("border","none");
			$("#bookYourRequest").removeClass("animated zoomIn");
			$(".bookYourInfo").removeClass("animated zoomIn");
		}
		e.preventDefault();
	})
	//Book Your Request Button Click
	$("#bookYourRequest").click(function(e){
		if($("#bookYourRequest").text() == "Book Your Request"){
			$("#memCalender").css("display","block");
			$('#memCalender').fullCalendar({
				// put your options and callbacks here
				header: {
						left: 'prev,next today',
						center: 'title',
						right: 'month,agendaWeek,agendaDay'
					},
					defaultView: 'month',
					editable: true,
					dayClick: function(date, jsEvent, view) {
						
						console.log("dayclick");
						showCalendarOverlay(date);
						/* alert('Clicked on: ' + moment(date).format("MMM DD YYYY"));

						alert('Coordinates: ' + jsEvent.pageX + ',' + jsEvent.pageY);

						alert('Current view: ' + view.name); */
						//return false;
					}
			});
			$(".churchDetails").removeClass("col-sm-6 col-md-6 col-lg-6").addClass("col-sm-4 col-md-4 col-lg-4");
			$(".churchMEM").removeClass("col-sm-3 col-md-3 col-lg-3").addClass("col-sm-5 col-md-5 col-lg-5");
			$("#memCalender").removeClass("animated slideOutRight").addClass("animated slideInRight");
			$(".fc-day-grid-container").css("height","338px");
			$(".fc-center h2").css("font-size","24px");
			$("#bookYourRequest").text("Click Here to Collapse");
			$(".fc-day-grid-container").removeClass("fc-scroller");
			$(".fc-widget-header").css("margin-right","0px");
			$(".fc-row .fc-widget-content:not(.fc-other-month)").append("<td class='insertedTableData'>Book</td>");
			$(".fc-row .fc-widget-content:not(.fc-other-month)").css({"curosor":"pointer !important"});
		} else {
			$(".churchDetails").removeClass("col-sm-4 col-md-4 col-lg-4").addClass("col-sm-6 col-md-6 col-lg-6");
			$(".churchMEM").addClass("col-sm-3 col-md-3 col-lg-3").removeClass("col-sm-5 col-md-5 col-lg-5");
			$("#memCalender").removeClass("animated slideInRight").addClass("animated slideOutRight");
			$("#bookYourRequest").text("Book Your Request");
		}
		e.preventDefault();
	});
	//dayagenda button click
	$(document).on("click", ".fc-agendaDay-button",function(e){
		containerHeighAndScroll();
		e.preventDefault();
	});
	//week agenda button click
	$(document).on("click", ".fc-agendaWeek-button",function(e){
		containerHeighAndScroll();
		e.preventDefault();
	});
	//Previous and next button click
	$(document).on("click", ".fc-prev-button,.fc-next-button",function(e){
		containerHeighAndScroll();
		if($(".fc-month-button").hasClass("fc-state-active")){
			$(".fc-row .fc-widget-content:not(.fc-other-month) td.insertedTableData").empty();
			$(".fc-row .fc-widget-content:not(.fc-other-month)").append("<td class='insertedTableData'>Book</td>");
		}
	});
	//Month View
	 $(document).on("click",".fc-month-button",function(e){
		$(".fc-day-grid-container").css("height","338px");
		$(".fc-day-grid-container").removeClass("fc-scroller");
		$(".fc-widget-header").css("margin-right","0px");
		$(".fc-row .fc-widget-content:not(.fc-other-month) td.insertedTableData").empty();
		$(".fc-row .fc-widget-content:not(.fc-other-month)").append("<td class='insertedTableData'>Book</td>");
		e.preventDefault();
	});
	//Todaybutton Click
	$(document).on("click", ".fc-today-button",function(e){
		alert("hello");
		$(".fc-time-grid-container").css("height","296px !important");
		$(".fc-day-grid-container").css("height","338px !important");
		e.preventDefault();
	});
	//Close button for the overlay
	$(document).on("click","#close",function(e){
		$("#overlay").removeClass("shade animated zoomIn").addClass("animated zoomOut");
		$("#contentManager").css("opacity","1");
		//$("#overlay").css("background-color","white");
		$("#overlayContent").html("");
		$("body").css("overflow", "auto");
		//$(".fc-row .fc-widget-content:not(.fc-other-month)").css({"curosor":"pointer !important"});
		$("#overlay").css("display","none");
		e.preventDefault();
	});
	
	//Mouse Over and Mouse Leave for the Book
	/* $(document).on("mouseover",".fc-row .fc-widget-content:not(.fc-other-month)",function(e){
		e.preventDefault();
		$(this).find(".insertedTableData").removeClass("animated fadeInDown").addClass("animated fadeInUp").css({"top":"0","background-color":"rgba(0,0,0,0.5)","line-height":"90px","vertical-align":"bottom"});
	});
	$(document).on("mouseleave",".fc-row .fc-widget-content:not(.fc-other-month)",function(e){
		e.preventDefault();
		$(this).find(".insertedTableData").removeClass("animated fadeInUp").addClass("animated fadeInDown").css({"background-color":"green"});
		
	}); */
	//Showing the Fadein Elements on Pageload
	//setTimeout(showFadeInElement(),1000);
	
	//Church Info Next Button
	$(document).on("click","#calendarInfoNext",function(e){
		//pageLoadHiddenElemen();
		setTimeout(hideChurchMemInfo(),5000);
		showChurchHistoryInfo();
		e.preventDefault();
	});
	
	//Church History information
	$(document).on("click","#churchHisoryInfoNext",function(e){
		//pageLoadHiddenElemen();
		setTimeout(hideChurchMemInfo(),5000);
		showChurchHistoryInfo();
		e.preventDefault();
	});
});

function showCalendarOverlay(selectedDate){
	console.log("selected Date",selectedDate);
	var date = moment(selectedDate).format("MMM DD YYYY");
	console.log("date after format",date);
	displayOverlay(date);
}
//Setting the Calendar Heigh and 	Scroll Management
function containerHeighAndScroll(){
	$(".fc-time-grid-container").css("height","296px");
	$(".fc-time-grid-container").addClass("fc-scroller");
	$(".fc-day-grid-container").css("height","338px");
	$(".fc-widget-header").css("margin-right","0px");
	$(".fc-day-grid-container").removeClass("fc-scroller");
}
//Display Overlay
function displayOverlay(content){
	$("#overlayContent").html("");
	$("#overlay").removeClass("shade animated zoomIn").addClass("animated zoomOut");
	$("#overlay").css("display","block");
	$("#contentManager").css("opacity","0.3");
	$('#overlay').css({
	   position:'relative',
	   left: ($(window).width() - $('#overlay').outerWidth())/2,
	   top : 20
	   //top: ($(window).height() - $('#overlay').outerHeight())/2-100
	});
	$("#overlay").css("background-color","rgba(0,0,0,0.8)");
	//$("#contentManager").css("background-color","rgba(0,0,0,0.8)");
	$("#overlay").css("color","white");
	$("#overlay").removeClass("animated zoomOut").addClass("shade animated zoomIn");
	$("#overlayContent").append('<div class="showDayView">'
															+'<div id="dayAgenda"></div>'
															+'<div class="eventSelector"></div>'
														+'</div>');
	$('#dayAgenda').fullCalendar({
				// put your options and callbacks here
				defaultView: 'agendaDay',
				editable: true
			});
	$("#dayAgenda").find(".fc-left h2").text(content);
	var weekDay = moment(content).format("dddd");
	$("#dayAgenda").find("th.fc-day-header").text(weekDay);
	$("#dayAgenda").find(".fc-today-button,.fc-right").hide();
	$("#dayAgenda").find(".fc-time-grid-container").css("height","350px");
	//$("#dayAgenda").find(".fc-right").hide();
	var eventSelectorHTML = '<div class="eventSelectionContainer">'
													+'<h3 style="margin-top:0px !important;">Book Your Slot Here</h3>'
													+'<div class="dateHolder">'
														+'<div>'
															+'<label for="fromDate">From:<label><input style="height:25px;" type="time" id="formDate" />'
														+'</div>'
														+'<div>'
															+'<label for="toDate">To:<label><input style="height:25px;" type="time" id="toDate" />'
														+'</div>'
													+'</div>'
													+'<div class="eventDescription">'
														+'<textarea rows="4" cols="20" style="width:94%;padding-left : 5px;"  placeolder="Event Description"></textarea>'
													+'</div>'
													+'<button type="button" class="btn btn-default">Submit</button>'
												+'</div>';
	$(".eventSelector").html(eventSelectorHTML);										
	$("body").css("overflow","hidden");
}
//Close Overlay
function closeOverlay(){
	$("body").removeClass("overlayBackgroundColor");
	$(".container").css("opacity", "1");
	 $("#Overlay").hide("slow");
	 $("#overlayContent").html("");
	 $("body").css("overflow", "");
}

//Function to display the fade in elements
function showFadeInElement(){
	console.log("fade in elements to display");
	$("#homePage .container").css("opacity","0.7");
	$(".fadeInElements").css("display","block");
	$("#homePageFadeInOptions").addClass("animated slideInDown");
}
//Pageload Hidden Elements function
function pageLoadHiddenElemen(){
	$(".churchNameandAddress,.churchContactDetails,.recentUpdates,.churchHistory").css("opacity","1");
	$(".bookYourInfo").css("display","none");
	$("#bookYourRequest").css("border","none");
	//$("#bookYourRequest").removeClass("animated zoomIn");
	$(".bookYourInfo").removeClass("animated zoomIn");
}

//HIding the Church Mem Info
function hideChurchMemInfo(){
	//$(".churchNameandAddress,.churchContactDetails,.recentUpdates,.churchHistory").css("opacity","1");
	$(".bookYourInfo").removeClass("animated zoomIn").addClass("animated zoomOut");
	$("#bookYourRequest").css("border","none");
	//$("#bookYourRequest").removeClass("animated zoomIn");
}

//Showing the Church History Info
function showChurchHistoryInfo(){
	$(".bookYourInfo").css("display","none");
	$(".churchNameandAddress,.churchContactDetails,.recentUpdates,.churchMEM").css("opacity","0.5");
	$(".churchHistory").css("opacity","1");
	$(".churchHistoryInfoBlock").css("display","block");
	$(".churchHistoryInfoBlock").addClass("animated zoomIn");
}
