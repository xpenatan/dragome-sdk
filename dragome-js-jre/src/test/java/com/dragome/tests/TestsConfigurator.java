package com.dragome.tests;

import java.net.URL;
import java.util.ArrayList;

import com.dragome.commons.DragomeConfiguratorImplementor;
import com.dragome.commons.compiler.classpath.ClasspathFile;
import com.dragome.web.config.DomHandlerApplicationConfigurator;
import com.dragome.web.helpers.DefaultClasspathFileFilter;

@DragomeConfiguratorImplementor(priority= 1)
public class TestsConfigurator extends DomHandlerApplicationConfigurator
{
	public TestsConfigurator()
	{
		super();

		setClasspathFilter(new DefaultClasspathFileFilter()
		{
			public boolean accept(ClasspathFile classpathFile)
			{
				boolean flag= super.accept(classpathFile);
				if (classpathFile.getFilename().contains("TestsConfigurator"))
					flag= false; // ignore this class
				return flag;
			}
		});
	}

	public boolean isRemoveUnusedCode()
	{
		return true;
	}

	@Override
	public boolean isObfuscateCode()
	{
		return false;
	}

	@Override
	public void getAdditionalCodeKeepConfigFile(ArrayList<URL> urls)
	{
		urls.add(getClass().getResource("/proguard-extra.conf"));
	}

	@Override
	public void getAdditionalObfuscateCodeKeepConfigFile(ArrayList<URL> urls)
	{
//		urls.add(getClass().getResource("/proguard-extra.conf"));
	}

	public boolean filterClassPath(String classpathEntry)
	{
		boolean include= super.filterClassPath(classpathEntry);
		include|= classpathEntry.contains("junit-4");
		include|= classpathEntry.contains("hamcrest-core");
		include|= classpathEntry.contains("test-classes");

		return include;
	}

	@Override
	public boolean isCaching()
	{
		return false;
	}
}
