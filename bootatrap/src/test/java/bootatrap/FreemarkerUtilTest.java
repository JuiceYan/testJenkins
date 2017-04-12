package bootatrap;
import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import utils.freemarker.FreemarkerUtil;

public class FreemarkerUtilTest {
	private FreemarkerUtil freemarkerUtil;
	private Map<String, Object> rootMap = null;
	@Before
	public void setUp() {
		freemarkerUtil = new FreemarkerUtil();
		rootMap = new HashMap<String, Object>();
	}
	
	@Test
	public void testAbout() {
		String ftlName = "about.ftl";
		// 填充数据
		rootMap.put("username", "王三毛");
		rootMap.put("pics", new int[]{1,2,3,4,5});
		// 打印到控制台
		freemarkerUtil.print(ftlName, rootMap);
		// 输出到文件
		freemarkerUtil.fprint(ftlName, rootMap, ftlName.substring(0, ftlName.lastIndexOf("."))+".html");
	}
	
	@Test
	public void testMain() {
		String ftlName = "main.ftl";
		// 填充数据
		rootMap.put("username", "王三毛");
		rootMap.put("pics", new int[]{1,2,3,4,5});
		// 打印到控制台
		freemarkerUtil.print(ftlName, rootMap);
		// 输出到文件
		freemarkerUtil.fprint(ftlName, rootMap, ftlName.substring(0, ftlName.lastIndexOf("."))+".html");
	}
}
