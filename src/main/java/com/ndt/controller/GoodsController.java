package com.ndt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ndt.entity.Goodsinfo;
import com.ndt.service.GoodsService;
import com.ndt.util.JsonData;

@Controller
public class GoodsController {

	@Autowired
	private GoodsService goodsService;

	@RequestMapping("/api/insertSourceInformation.json")
	@ResponseBody
	public JsonData insertGoods(Goodsinfo goodsinfo) {

		JsonData insertGoods = goodsService.insertGoods(goodsinfo);
		return insertGoods;

	}

	@RequestMapping("/api/updeteSourceInformation.json")
	@ResponseBody
	public JsonData altGoods(Goodsinfo goodsinfo) {

		JsonData altGoods = goodsService.altGoods(goodsinfo);
		return altGoods;

	}

	@RequestMapping("/api/deleteSourceInformation.json")
	@ResponseBody
	public JsonData delGoods(Integer ids[]) {

		JsonData delGoods = goodsService.delGoods(ids);
		return delGoods;

	}

	@RequestMapping("/api/sourceInformation.json")
	@ResponseBody
	public JsonData selectGoods(Goodsinfo goodsinfo, Integer page) {

		JsonData selectGoods = goodsService.selectGoods(goodsinfo, page);
		return selectGoods;
	}

	/**
	 * 返回所有货源信息
	 * 
	 * @return
	 */
	@RequestMapping("/api/source")
	@ResponseBody
	public JsonData source() {
		JsonData source = goodsService.source();
		return source;

	}
}
