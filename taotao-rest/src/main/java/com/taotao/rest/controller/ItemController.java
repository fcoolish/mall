package com.taotao.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.common.pojo.TaotaoResult;
import com.taotao.rest.service.ItemService;

/**
 * 商品信息Controller
 * <p>Title: ItemController</p>
 * <p>Description: </p>
 * <p>Company: www.itcast.com</p> 
 * @author	入云龙
 * @date	2015年9月12日上午10:22:11
 * @version 1.0
 */
@Controller
@RequestMapping("/item")
public class ItemController {

	@Autowired
	private ItemService itemService;
	
	@RequestMapping("/info/{itemId}")
	@ResponseBody
	public TaotaoResult getItemBaseInfo(@PathVariable Long itemId) {
		TaotaoResult result = itemService.getItemBaseInfo(itemId);
		return result;
	}
	
	@RequestMapping("/desc/{itemId}")
	@ResponseBody
	public TaotaoResult getItemDesc(@PathVariable Long itemId) {
		TaotaoResult result = itemService.getItemDesc(itemId);
		return result;
	}
	
	@RequestMapping("/param/{itemId}")
	@ResponseBody
	public TaotaoResult getItemParam(@PathVariable Long itemId) {
		TaotaoResult result = itemService.getItemParam(itemId);
		return result;
	}
}
