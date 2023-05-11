$("#button1").click(function(){
	$.ajax("/sub34/link1");
});

$("#button2").click(function() {
	$.ajax("/sub34/link2");
})

$("#button3").click(function() {
	$.ajax("/sub34/link3?name=son");
})

$("#button4").click(function() {
	$.ajax("/sub34/link4?address=서울");
})

$("#button5").click(function() {
	$.ajax("/sub34/link5?name=son&age=22")
})

$("#button6").click(function() {
	$.ajax("/sub34/link6?food=rice&price=200")
})

$("#button7").click(function() {
	$.ajax("/sub34/link7?address=soeoul&name=son&age=22");
})

$("#button8").click(function() {
	$.ajax("/sub34/link8?price=200&product=car&category=car");
})