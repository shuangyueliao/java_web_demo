$(function(){
	var id=$('#myid').attr('name');
	$.ajax({
		type:"get",
		url:"../getProductDetail/"+id,
		success:function(data){
			$('img').attr('src','../../productImg/'+data.product.imagePath);
			$('#name')[0].innerHTML=data.product.name;
			$('#price')[0].innerHTML+=data.product.price;
			$('#up')[0].innerHTML=data.introduction;
			$('#down')[0].innerHTML=data.standard;
		},
		error:function(){
			alert('加载失败');
		}
	});
});