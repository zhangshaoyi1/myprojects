package com.zsy.com.interfaces;

import com.zsy.novel.entity.Chacter;

/**
 * 章节的接口，传入一个网址，得到该网址的信息
 * @author ZSY
 *
 */
public interface ChacterInterface {
	/**
	 * 给一个网址，获取该网址的章节信息
	 * @param url
	 * @return
	 */
	public Chacter getChacter(String url);
}
