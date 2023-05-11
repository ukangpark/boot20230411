$("#button1").click(function() {
	$.ajax("/sub35/link1", {method:"post"});
})

$("#button2").click(function() {
	$.ajax("/sub35/link2", {method:"post"});
})

$("#button3").click(function() {
	$.ajax("/sub35/link3", {method:"post", data:"?name=손"});
})

$("#button4").click(function() {
	$.ajax("/sub35/link4", {method:"post", data:"?address=서울&price=50"});
})

$("#button5").click(function() {
	$.ajax("/sub35/link5", {method:"post", data:"name=발&score=20&email=22"});
})

$("#button6").click(function() {
	$.ajax("/sub35/link6", {method:"post", data:"address=seoul&product=car&price=50"});
})

$("#button7").click(function() {
	const obj = {name: "son"};
	
	$.ajax("/sub35/link7", {
		method: "post",
		//data: '{"name":"son"}',
		data: JSON.stringify(obj),
		contentType: "application/json"
	})
})

$("#button8").click(function() {
		const obj = {
			address: "seoul",
			name: "박지성"
		};
	$.ajax("/sub35/link8", {
		method:"post",
		//data:'{"address":"seoul"}',
		data: JSON.stringify(obj),
		contentType:"application/json"
	})
})

$("#button9").click(function() {
	const obj = {
		age: 22,
		name: "son",
		married: true
	}
	
	$.ajax("/sub35/link9", {
		method:"post",
		//data:'{"age" : 22, "name" : "son", "married" : true}',
		data: JSON.stringify(obj),
		contentType: "application/json"
	})
})

$("#button10").click(function() {
	const obj = {
		address:null,
		age:30,
		name:"son"
	}
	
	$.ajax("/sub35/link10", {
		method:"post",
		//data:'{"address" : null, "age" : 30, "name" : "son"}',
		data:JSON.stringify(obj),
		contentType: "application/json"
	})
})

$("#button11").click(function() {
	const obj = {
		book: {
			title:"java",
			price:300
		},
		address:"seoul"
	}
	$.ajax("/sub35/link11", {
		method:"post",
		contentType: "application/json",
		//data: '{"book":{"title":"java", "pirce":300}, address:"seoul"}'
		data:JSON.stringify(obj)
	})
})

$("#button12").click(function() {
	const obj = {
		food : [
			"pizza",
			"coke",
			"coffee"
		],
		store : "pizzaSchool"
	}
	$.ajax("/sub35/link12", {
		method:"post",
		contentType:"application/json",
		//data: '{"food" : ["pizza", "coke", "coffe"], "store" : "pizzaSchool"}'
		data: JSON.stringify(obj)
	})
})

$("#button13").click(function() {
	const obj = [
		"pixxa",
		"coke",
		"coffe"
	]
	$.ajax("/sub35/link13", {
		method: "post",
		contentType: "application/json",
		//data: '["pizza", "coke", "coffee"]'
		data:JSON.stringify(obj)
	})
})

$("#button14").click(function() {
	const obj = [
		{name:"강백호", pos:"파포"},
		{name:"서태웅", pos:"스포"}
	]
	$.ajax("/sub35/link14", {
		method:"post",
		contentType:"application/json",
		//data:'[{"name":"강백호", "pos":"파포"}, {"name":"서태웅", "pos":"스포"}]'
		data:JSON.stringify(obj)
	})
})