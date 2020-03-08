package com.jwebmp.plugins.easypiechart.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class EasyPieChartExclusionsModule
		implements IGuiceScanModuleExclusions<EasyPieChartExclusionsModule>
{
	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.easypiechart");
		return strings;
	}
}
