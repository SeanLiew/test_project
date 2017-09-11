package project.memory;

public class TestInputParam {
	public static void main(String[] args) {

		System.out.println("program arguments:");
		if (args == null || args.length == 0) {
			System.out.println("\t" + "no input params");
		} else {
			for (String arg : args) {
				System.out.println("\t" + arg);
			}
		}

		System.out.println("VM arguments:");
		String vmParam1 = "vmParam1";
		String vmParam2 = "vmParam2";
		System.out.println("\tName：" + vmParam1 + ",Value:" + System.getProperty(vmParam1));
		System.out.println("\tName：" + vmParam2 + ",Value:" + System.getProperty(vmParam2));

		System.out.println("Default VM arguments:");
		System.out.println("java_vendor:" + System.getProperty("java.vendor"));
		System.out.println("java_vendor_url:" + System.getProperty("java.vendor.url"));
		System.out.println("java_home:" + System.getProperty("java.home"));
		System.out.println("java_class_version:" + System.getProperty("java.class.version"));
		System.out.println("java_class_path:" + System.getProperty("java.class.path"));
	}
}
