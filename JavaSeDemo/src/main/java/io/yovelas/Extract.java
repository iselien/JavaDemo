package io.yovelas;

import java.util.*;

/**
 * 2019/7/28
 */
public class Extract{
	public static void main(String[] args) {
		Random rd = new Random();
		String[] arr = new String[]{
			"黄勇",
			"王梓丞",
			"陈定莘",
			"曹键聪",
			"黎鑫华",
			"张振培",
			"李鹏英",
			"陈志峰",
			"梁纪辉",
			"胡泽贤",
			"黄华龙",
			"梁景辉",
			"钟志龙",
			"林仕良",
			"赖民浩",
			"杨鹏程",
			"叶景致",
			"陈羽",
			"陈永健",
			"梁锦武",
			"钟玉娜",
			"张雪怡",
			"姚伟成",
			"吴昆恒",
			"倪浦东",
			"陈建茗",
			"阮允嘉",
			"庞明杰",
			"冯林辉",
			"马柏良",
			"余德水",
			"张海林",
			"戴鹏",
			"李华炎",
			"彭华成",
			"詹旭华",
			"陈祖康",
			"刘慧锦",
			"杨耀",
			"阮泓龙",
			"肖子明",
			"黄芳清",
			"谭盛龙",
			"向帅贤",
			"林艺滔",
			"叶灿明",
			"全鑫涛"};
		
		int rdnum = rd.nextInt(arr.length);
		System.out.println(arr[rdnum]);

	}
}



