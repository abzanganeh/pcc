/* File Name: week4.js */
/* Date: 10/22/16 */
/* Programmer: Alireza Barzin Zanganeh */

$(document).ready(function(){/* changing body element's class to jsOn  and calling dynamicFAQ function on loading the page */
	$('body').removeClass('jsOff').addClass('jsOn');
	dynamicFAQ(); 
});

function dynamicFAQ() {
	$('dd').hide();
	$('dt').on('click', function(){/* when user click the question, it toggles the class */
        $(this).toggleClass('open').next().slideToggle();
	});
}
