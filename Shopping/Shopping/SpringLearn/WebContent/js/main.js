$(function(){
	
	$.ajax({
		type:"get",
		url:"getAllProduct",
		success:function(data){
			for(var i=0;i<data.length;i++){
				$('ul')[0].innerHTML+='<li><a style="text-decoration: none;" href="getProductDetailPage/'+data[i].id+'">\
					<div class="product">\
						<img class="productImg" src="../productImg/'+data[i].imagePath+'" />\
						<div class="label">'+data[i].name+'</div>\
						<div class="price">\
							¥'+data[i].price+'\
						</div>\
					</div>\
				</a></li>';
			}
			
		},
		error:function(){
			alert('加载失败');
		}
	});
});