package com.kh.chap01_beforeVSafter.after.run;

import com.kh.chap01_beforeVSafter.after.model.vo.Desktop;
import com.kh.chap01_beforeVSafter.after.model.vo.Product;
import com.kh.chap01_beforeVSafter.after.model.vo.SmartPhone;
import com.kh.chap01_beforeVSafter.after.model.vo.Tv;

public class Run {

	public static void main(String[] args) {
		Product[] p = new Product[5];
		
		int count = 0;
		p[count++] = new Desktop("»ï¼º", "±èÄÚµå", "½´ÆÛ¾ÆÀÌ¿À·ÎÁ÷¿ïÆ®¶óÄ¸¼õ³ëÆ®ºÏ", 650000000, true);
		p[count++] = new SmartPhone("»ï¼º", "±èÄÚµå", "½´ÆÛ¾ÆÀÌ¿À·ÎÁ÷¿ïÆ®¶óÄ¸¼õ³ëÆ®ºÏ", 650000000, "±è¸ğ¹ÙÀÏ");
		p[count++] = new Tv("»ï¼º", "±èÄÚµå", "½´ÆÛ¾ÆÀÌ¿À·ÎÁ÷¿ïÆ®¶óÄ¸¼õ³ëÆ®ºÏ", 650000000, 65);
		p[count++] = new Desktop("»ï¼º", "±èÄÚµå", "½´ÆÛ¾ÆÀÌ¿À·ÎÁ÷¿ïÆ®¶óÄ¸¼õ³ëÆ®ºÏ", 650000000, true);
		p[count++] = new Tv("»ï¼º", "±èÄÚµå", "½´ÆÛ¾ÆÀÌ¿À·ÎÁ÷¿ïÆ®¶óÄ¸¼õ³ëÆ®ºÏ", 650000000, 30);
		
		for(Product pp : p) {			
			System.out.println(pp.information());
		}
	}

}
