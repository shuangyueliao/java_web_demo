package com.springmvc.controller;

import java.io.File;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.springmvc.entity.Product;
import com.springmvc.entity.ProductDetail;
import com.springmvc.service.ShopService;

@Controller
@RequestMapping("/shop")
public class ShopController {

	@Resource
	private ShopService shopService;
	@RequestMapping("/getAllProduct")
	@ResponseBody
	public List getAllProduct(){
		return shopService.getAllProduct();
	}
	@RequestMapping("/show")
	public String show(){
		return "main";
	}
	@RequestMapping("/getProductDetail/{id}")
	@ResponseBody
	public ProductDetail getProductDetail(@PathVariable("id") Integer id){
		System.out.println("id"+id+"---------------------");
		return shopService.getProductAndDetail(id);
	}
	@RequestMapping("/getProductDetailPage/{id}")
	public String getProductDetailPage(@PathVariable Integer id,Model model){
		model.addAttribute("id",id);
		return "detail";
	}
	@RequestMapping("/add")
	public String add(HttpServletRequest request,@RequestParam(value = "file", required = false) MultipartFile file){
		
		System.out.println("¿ªÊ¼");  
        String path = request.getSession().getServletContext().getRealPath("productImg");  
        //String fileName = file.getOriginalFilename();  
        String fileName = new Date().getTime()+".jpg";  
        System.out.println(path);  
        File targetFile = new File(path, fileName);  
        if(!targetFile.exists()){  
            targetFile.mkdirs();  
        }  
  
        //±£´æ  
        try {  
            file.transferTo(targetFile);  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
		
		Product product=new Product();
		product.setImagePath(fileName);
		product.setName(request.getParameter("name"));
		product.setPrice(Double.parseDouble(request.getParameter("price")));
		ProductDetail productDetail=new ProductDetail();
		productDetail.setIntroduction(request.getParameter("introduction"));
		productDetail.setStandard(request.getParameter("standard"));
		productDetail.setProduct(product);
		shopService.save(product,productDetail);
		return "main";
	}
	@RequestMapping("/preadd")
	public String preadd(){
		return "add";
	}
}