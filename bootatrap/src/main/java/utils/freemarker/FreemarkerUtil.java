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

	public Template getTemplate(String name) {
		Template temp = null;
		try {
			// ͨ��Freemarker��Configuration��ȡ��Ӧ��Ftl
			Configuration cfg = new Configuration();
			// �趨ȥ�����ȡ��Ӧ��ftlģ��
			cfg.setClassForTemplateLoading(this.getClass(), "/ftl");
			// ��ģ���ļ�Ŀ¼��Ѱ������Ϊname��ģ���ļ�
			temp = cfg.getTemplate(name);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return temp;
	}

	/**
	 * ����̨����ļ�����
	 * @param name
	 * @param rootMap
	 */
	public void print(String name, Map<String, Object> rootMap) {
		try {
			// ͨ��Template����Խ�ģ���ļ��������Ӧ���ļ�
			Template temp = this.getTemplate(name);
			temp.process(rootMap, new PrintWriter(System.out));
		} catch (TemplateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * ���滻���ģ������������ļ�
	 * @param name
	 * @param rootMap
	 * @param outFile
	 */
	public void fprint(String name, Map<String, Object> rootMap, String outFile) {
		FileWriter out = null;
		try {
			out = new FileWriter(new File("D:\\freemarker\\ftl\\html\\"
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
