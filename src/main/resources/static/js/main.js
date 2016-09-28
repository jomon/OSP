jQuery(document).ready(function($) {
	 $(function () {
		    setNavigation();
		});
	
	function setNavigation() {
		$("nav ul li a").each(function(index,value){
		     if(value == window.location.href)
		        $($("nav ul li")[index]).addClass("active");
		     });
	    }

});