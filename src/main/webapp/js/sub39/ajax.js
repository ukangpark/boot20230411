$("#btn1").click(function() {
	$.ajax("/sub39/link1", {
		success: function() {
			console.log("성공");
		},
		error: function() {
			console.log("실패");

		},
		complete: function() {
			console.log("성공이든 실패든");

		}
	})
})

$("#btn2").click(function() {
	$.ajax("/sub39/link2", {
		success: function() {
			console.log("성공");
		},
		error: function() {
			console.log("실패");

		},
		complete: function() {
			console.log("성공이든 실패든");

		}
	})
})

$("#btn3").click(function() {
	$.ajax("/sub39/link3", {
		success: function() {
			console.log("성공");
		},
		error: function() {
			console.log("실패");
		},
		complete: function() {
			console.log("성공이든 실패든");
		}
	})
})

$("#btn4").click(function() {
	$.ajax("/sub39/link4", {
		success: function() {
			console.log("성공");
		},
		error: function() {
			console.log("실패");
		},
		complete: function() {
			console.log("성공이든 실패든");
		}
	})
})

$("#btn5").click(function() {
	$.ajax("/sub39/link1")
		.done(function() {
			console.log("done 메소드 사용, 성공");
		})
		.fail(function() {
			console.log("fail 메소드 사용, 실패");

		})
		.always(function() {
			console.log("always 메소드 사용, 성공이든실패든");

		});
})
$("#btn6").click(function() {
	$.ajax("/sub39/link2")
		.done(function() {
			console.log("done 메소드 사용, 성공");
		})
		.fail(function() {
			console.log("fail 메소드 사용, 실패");

		})
		.always(function() {
			console.log("always 메소드 사용, 성공이든실패든");

		});
})

$("#btn7").click(function() {
	$.ajax("/sub39/link3")
		.done(function() {
			console.log("done");
		})
		.fail(function() {
			console.log("fail");

		})
		.always(function() {
			console.log("always");

		});
})
$("#btn8").click(function() {
	$.ajax("/sub39/link4")
		.done(function() {
			console.log("done");
		})
		.fail(function() {
			console.log("fail");

		})
		.always(function() {
			console.log("always");

		});
})

$("#btn9").click(function() {
	$.ajax("/sub39/link9", {
		success: function(data) {
			console.log("링크9 성공");
			console.log(data);
		}
	})
})


$("#btn10").click(function() {
	$.ajax("/sub39/link10", {
		success: function(data) {
			console.log("링크10 성공");
			//console.log(data);
			$("#res10").text(data);
		}
	});
})

$("#btn11").click(function() {
	$.ajax("/sub39/link11", {
		success: function(data) {
			$("#res11").text(data.name);

		}
	});
})

$("#btn12").click(function() {
	$.ajax("/sub39/link12", {
		success: function(data) {
			console.log(data.address);
			console.log(data.city);
			console.log(data.phone);
			//$("#res12").text(data.);

		}
	});
})

$("#btn13").click(function() {
	$.ajax("/sub39/link13", {
		success: function(data) {
			console.log(data.address);
			console.log(data.city);
			console.log(data.phone);
			//$("#res12").text(data.);

		}
	});
})

$("#btn14").click(function() {
	$.ajax("/sub39/link14", {
		success: function(data) {
			for (let i = 0; i < data.length; i++) {
				console.log(data[i]);
			}

		}
	});
})

$("#btn15").click(function() {
	const cid = $("#input1").val();
	$.ajax("/sub39/link15?cid=" + cid, {
		success: function(data) {
			//console.log(data);
			for (let i = 0; i < data.length; i++) {
				$("res15").append(data[i].productName + "<br>");
			}
		}

	});
})

$("#btn16").click(function() {
	const cid = $("#input1").val();
	$.ajax("/sub39/link15?cid=" + cid, {
		success: function(data) {
			//console.log(data);
			$("#res16").empty();
			$("#res16").append(`
				<table class="table">
					<thead>
						<tr>
							<th>
								상품명
							</th>
							<th>
								가격
							</th>
						</tr>
					</thead>
					<tbody>
					</tbody>
					</table>
			`);
			for (let i = 0; i < data.length; i++) {
				$("#res16 tbody")
					.append(`
						<tr>
							<td>
								${data[i].productName}
							</td>
							<td>
								${data[i].price}
							</td>
						</tr>
					`)
			}
		}

	});
})