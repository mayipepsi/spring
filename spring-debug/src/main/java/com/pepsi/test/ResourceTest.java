package com.pepsi.test;

import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

public class ResourceTest {
	public static void main(String[] args) {

		ResourceLoader resourceLoader = new DefaultResourceLoader();
		Resource resource = resourceLoader.getResource("C:\\Users\\jhguyb\\Desktop\\re.txt");
		System.out.println(resource.getFilename());
		System.out.println("fileResource1 is FileSystemResource:" + (resource instanceof FileSystemResource));

	}
}
