package utils.freemarker;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class FreemarkerUtil {
	private String path = System.getProperty("user.dir");
	public Template getTemplate(String name) {
		Template temp = null;
		try {
			//String path1 = Class.class.getClass().getResource("/").getPath();
			System.out.println("project path:"+path);
			//System.out.println("path1:"+path1);
			// 通过Freemarker的Configuration读取相应的Ftl
			Configuration cfg = new Configuration();
			cfg.setDefaultEncoding("UTF-8");
			// 设定去哪里读取相应的ftl模板
			File ftlDir = new File(path+"\\config\\ftl");
			cfg.setDirectoryForTemplateLoading(ftlDir);
			//cfg.setClassForTemplateLoading(this.getClass(), path+"\\src\\main\\webapp\\ftl");
			// 在模板文件目录中寻找名称为name的模板文件
			temp = cfg.getTemplate(name);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return temp;
	}

	/**
	 * 控制台输出文件内容
	 * @param name
	 * @param rootMap
	 */
	public void print(String name, Map<String, Object> rootMap) {
		try {
			// 通过Template类可以将模板文件输出到相应的文件
			Template temp = this.getTemplate(name);
			temp.process(rootMap, new PrintWriter(System.out));
		} catch (TemplateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 将替换后的模板内容输出到文件
	 * @param name
	 * @param rootMap
	 * @param outFile
	 */
	public void fprint(String name, Map<String, Object> rootMap, String outFile) {
		FileWriter out = null;
		try {
			out = new FileWriter(new File(path+"\\src\\main\\webapp\\pages\\"
					+ outFile));
			Template template = this.getTemplate(name);
			template.process(rootMap, out);
		} catch (TemplateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (null != out)
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}
}
