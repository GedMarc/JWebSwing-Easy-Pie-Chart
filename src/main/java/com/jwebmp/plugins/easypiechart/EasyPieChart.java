/*
 * Copyright (C) 2017 Marc Magon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.jwebmp.plugins.easypiechart;

import com.jwebmp.base.html.Div;
import com.jwebmp.plugins.ComponentInformation;

/**
 * The actual easy pie chart component
 *
 * @author Marc Magon
 * @since 12 Jun 2017
 */
@ComponentInformation(name = "Easy Pie Chart",
		description = "easy pie chart is a lightweight plugin to draw simple, animated pie charts for single values http://rendro.github.io/easy-pie-chart",
		url = "https://github.com/rendro/easy-pie-chart")
public class EasyPieChart
		extends Div
{

	private static final long serialVersionUID = 1L;
	/**
	 * The percentage to be used
	 */
	private double percentage;

	private EasyPieChartFeature feature;

	/**
	 * Constructs with a default percentage (0.00)
	 */
	public EasyPieChart()
	{
		this(0.0);
	}

	/*
	 * Constructs a new EasyPieChart with a given percentage
	 */
	public EasyPieChart(double percentage)
	{
		addClass("chart");
		this.percentage = percentage;
		feature = new EasyPieChartFeature(this);
		addFeature(feature);
	}

	@Override
	public void preConfigure()
	{
		if (!isConfigured())
		{
			addAttribute("data-percent", Double.toString(percentage));
		}
		super.preConfigure();
	}

	/**
	 * The percentage to be used
	 *
	 * @return
	 */
	public double getPercentage()
	{
		return percentage;
	}

	/**
	 * The percentage to be used
	 *
	 * @param percentage
	 */
	public void setPercentage(double percentage)
	{
		this.percentage = percentage;
	}

	@Override
	public EasyPieChartOptions getOptions()
	{
		return getFeature().getOptions();
	}

	/**
	 * Returns the associated feature
	 *
	 * @return
	 */
	public EasyPieChartFeature getFeature()
	{
		if (feature == null)
		{
			feature = new EasyPieChartFeature(this);
		}
		return feature;
	}

	/**
	 * Sets the associated feature
	 *
	 * @param feature
	 *
	 * @return
	 */
	public EasyPieChart setFeature(EasyPieChartFeature feature)
	{
		this.feature = feature;
		return this;
	}

	@Override
	public boolean equals(Object o)
	{
		return super.equals(o);
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}

}