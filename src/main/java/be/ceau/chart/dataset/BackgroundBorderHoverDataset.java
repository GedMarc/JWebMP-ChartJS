/*
	Copyright 2016 Marceau Dewilde <m@ceau.be>

	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at

		http://www.apache.org/licenses/LICENSE-2.0

	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
*/
package be.ceau.chart.dataset;

import java.util.List;

import be.ceau.chart.color.Color;

public class BackgroundBorderHoverDataset extends Dataset {

	/**
	 * @see #setBackgroundColor(List)
	 */
	protected final List<Color> backgroundColor = new OptionalArray<Color>();

	/**
	 * @see #setBorderColor(List)
	 */
	protected final List<Color> borderColor = new OptionalArray<Color>();

	/**
	 * @see #setBorderWidth(List)
	 */
	protected final List<Integer> borderWidth = new OptionalArray<Integer>();

	/**
	 * @see #setHoverBackgroundColor(List)
	 */
	protected final List<Color> hoverBackgroundColor = new OptionalArray<Color>();

	/**
	 * @see #setHoverBorderColor(List)
	 */
	protected final List<Color> hoverBorderColor = new OptionalArray<Color>();

	/**
	 * @see #setHoverBorderWidth(List)
	 */
	protected final List<Integer> hoverBorderWidth = new OptionalArray<Integer>();

	/**
	 * @see #setBackgroundColor(List)
	 */
	public List<Color> getBackgroundColor() {
	    return this.backgroundColor;
	}

	/**
	 * @see #setBackgroundColor(List)
	 */
	public void addBackgroundColor(Color backgroundColor) {
	    if (backgroundColor != null) {
	    	this.backgroundColor.add(backgroundColor);
	    }
	}

	/**
	 * @see #setBackgroundColor(List)
	 */
	public void setBackgroundColor(Color backgroundColor) {
	    this.backgroundColor.clear();
	    addBackgroundColor(backgroundColor);
	}

	/**
	 * The fill color of the bars.
	 */
	public void setBackgroundColor(List<Color> backgroundColor) {
	    this.backgroundColor.clear();
	    if (backgroundColor != null) {
	    	this.backgroundColor.addAll(backgroundColor);
	    }
	}

	/**
	 * @see #setBorderColor(List)
	 */
	public List<Color> getBorderColor() {
	    return this.borderColor;
	}

	/**
	 * @see #setBorderColor(List)
	 */
	public void addBorderColor(Color borderColor) {
	    if (borderColor != null) {
	    	this.borderColor.add(borderColor);
	    }
	}

	/**
	 * @see #setBorderColor(List)
	 */
	public void setBorderColor(Color borderColor) {
	    this.borderColor.clear();
    	addBorderColor(borderColor);
	}

	/**
	 * Bar border color
	 */
	public void setBorderColor(List<Color> borderColor) {
	    this.borderColor.clear();
	    if (borderColor != null) {
	    	this.borderColor.addAll(borderColor);
	    }
	}

	/**
	 * @see #setBorderWidth(List)
	 */
	public List<Integer> getBorderWidth() {
	    return this.borderWidth;
	}

	/**
	 * @see #setBorderWidth(List)
	 */
	public void addBorderWidth(Integer borderWidth) {
	    if (borderWidth != null) {
	    	this.borderWidth.add(borderWidth);
	    }
	}

	/**
	 * @see #setBorderWidth(List)
	 */
	public void setBorderWidth(Integer borderWidth) {
	    this.borderWidth.clear();
    	addBorderWidth(borderWidth);
	}

	/**
	 * Border width of bar in pixels
	 */
	public void setBorderWidth(List<Integer> borderWidth) {
	    this.borderWidth.clear();
	    if (borderWidth != null) {
	    	this.borderWidth.addAll(borderWidth);
	    }
	}

	/**
	 * @see #setHoverBackgroundColor(List)
	 */
	public List<Color> getHoverBackgroundColor() {
	    return this.hoverBackgroundColor;
	}

	/**
	 * @see #setHoverBackgroundColor(List)
	 */
	public void addHoverBackgroundColor(Color hoverBackgroundColor) {
	    if (hoverBackgroundColor != null) {
		    this.hoverBackgroundColor.add(hoverBackgroundColor);
	    }
	}

	/**
	 * @see #setHoverBackgroundColor(List)
	 */
	public void setHoverBackgroundColor(Color hoverBackgroundColor) {
	    this.hoverBackgroundColor.clear();
	    addHoverBackgroundColor(hoverBackgroundColor);
	}

	/**
	 * Bar background color when hovered
	 */
	public void setHoverBackgroundColor(List<Color> hoverBackgroundColor) {
	    this.hoverBackgroundColor.clear();
	    if (hoverBackgroundColor != null) {
	    	this.hoverBackgroundColor.addAll(hoverBackgroundColor);
	    }
	}

	/**
	 * @see #setHoverBorderColor(List)
	 */
	public List<Color> getHoverBorderColor() {
	    return this.hoverBorderColor;
	}

	/**
	 * @see #setHoverBorderColor(List)
	 */
	public void addHoverBorderColor(Color hoverBorderColor) {
	    if (hoverBorderColor != null) {
	    	this.hoverBorderColor.add(hoverBorderColor);
	    }
	}

	/**
	 * @see #setHoverBorderColor(List)
	 */
	public void setHoverBorderColor(Color hoverBorderColor) {
	    this.hoverBorderColor.clear();
	    addHoverBorderColor(hoverBorderColor);
	}

	/**
	 * Bar border color when hovered
	 */
	public void setHoverBorderColor(List<Color> hoverBorderColor) {
	    this.hoverBorderColor.clear();
	    if (hoverBorderColor != null) {
	    	this.hoverBorderColor.addAll(hoverBorderColor);
	    }
	}

	/**
	 * @see #setHoverBorderWidth(List)
	 */
	public List<Integer> getHoverBorderWidth() {
	    return this.hoverBorderWidth;
	}

	/**
	 * @see #setHoverBorderWidth(List)
	 */
	public void addHoverBorderWidth(Integer hoverBorderWidth) {
	    if (hoverBorderWidth != null) {
		    this.hoverBorderWidth.add(hoverBorderWidth);
	    }
	}

	/**
	 * @see #setHoverBorderWidth(List)
	 */
	public void setHoverBorderWidth(Integer hoverBorderWidth) {
	    this.hoverBorderWidth.clear();
	    addHoverBorderWidth(hoverBorderWidth);
	}

	/**
	 * Border width of bar when hovered
	 */
	public void setHoverBorderWidth(List<Integer> hoverBorderWidth) {
	    this.hoverBorderWidth.clear();
	    if (hoverBorderWidth != null) {
	    	this.hoverBorderWidth.addAll(hoverBorderWidth);
	    }
	}
	
}
