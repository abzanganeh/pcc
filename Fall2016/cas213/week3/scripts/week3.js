/* File Name: week3.js */
/* Date: 10/16/16 */
/* Programmer: Alireza Barzin Zanganeh */

$(document).ready(function(){
	$('body').removeClass('jsOff').addClass('jsOn');

$('#methods a').on('click', function(e){
	e.preventDefault();
	$('#methods a.current').removeClass('current');
	$('.tab-section:visible').hide();
	$(this.hash).show();
	$(this).addClass('current');
}).filter(':first').click();
});