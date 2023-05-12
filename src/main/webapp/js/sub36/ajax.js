$("#btn1").click(function() {
	const obj = {
		name: "정대만",
		age: 40
	}
	$.ajax("/sub36/link1", {
		method: "post",
		contentType: "application/json",
		data: JSON.stringify(obj)
	})
})

$("#btn2").click(function() {
	const obj = {
		name: "park",
		email: "park@park",
		score: 23.2,
		married: true
	}
	$.ajax("/sub36/link2", {
		method: "post",
		contentType: "application/json",
		data: JSON.stringify(obj)
	})
})

$("#btn3").click(function() {
	const obj = {
		name : "태웅",
		hobby : [
			"read",
			"baseball",
			"music"
		]
	}
	$.ajax("/sub36/link3", {
		method : "post",
		contentType : "application/json",
		data : JSON.stringify(obj)
	})
})

$("#btn4").click(function() {
	const obj = {
		name : "park",
		phone : [
			"lg","samsung", "iphone"
		]
	}
	$.ajax("/sub36/link4", {
		method:"post",
		contentType:"application/json",
		data:JSON.stringify(obj)
	})
})

$("#btn5").click(function() {
	const obj = {
		title : "java",
		publisher : "hanbit",
		writer : {
			name : "daeman",
			age : 44
		}
	}
	$.ajax("/sub36/link5", {
		method:"post",
		contentType:"application/json",
		data:JSON.stringify(obj)
	})
})

$("#btn6").click(function() {
	const obj = {
		city : "seoul",
		price : 300,
		etc : {
			name : "park",
			score : 2.2,
			email : "park@park",
			married : false
		}
	}
	$.ajax("/sub36/link6", {
		method:"post",
		contentType:"application/json",
		data:JSON.stringify(obj)
	})
})

$("#btn7").click(function() {
	const obj = [
		{name:"lee", age:22},
		{name:"park", age:30},
		{name:"kim", age:27},
		{name:"jung", age:23}
		]
	$.ajax("/sub36/link7", {
		method:"post",
		contentType:"application/json",
		data:JSON.stringify(obj)
	})
})

/////

$("#btn8").click(function() {
	const name = $("#inputName").val();
	const age = $("#inputAge").val();
	
	const obj = {
		name : name,
		age : age
	}
	$.ajax("/sub36/link1", {
		method:"post",
		contentType:"application/json",
		data:JSON.stringify(obj)
	})
})

$("#btn9").click(function() {
	const name = $("#inputName1").val();
	const email = $("#inputEmail1").val();
	const score = $("#inputScore1").val();
	//const married = document.querySelector("#inputMarried1").checked;
	const married = $("#inputMarried1").is(":checked");
	
	const obj = {
		name:name,
		email:email,
		score:score,
		married:married
	}
	$.ajax("/sub36/link2", {
		method:"post",
		contentType:"application/json",
		data:JSON.stringify(obj)
	})
})