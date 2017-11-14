package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * The StateSettings class contains methods for configuring the states of different charts and their parts.<br/>
States are used for series, charts, annotations, intersections in Venn Diagram, pointers in Linear Gauge, tasks,
and milestones in PERT Chart, activities in Resource Chart.<br/> See examples below:
 */
public class StateSettings extends CoreBase {

    public StateSettings() {
        js.setLength(0);
        js.append("var stateSettings").append(++variableIndex).append(" = anychart.core.stateSettings();");
        jsBase = "stateSettings" + variableIndex;
    }

    protected StateSettings(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected StateSettings(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Fill dummyFill;

    /**
     * Setter for dummy fill settings using a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public StateSettings setDummyFill(Fill dummyFill) {
        if (jsBase == null) {
            this.dummyFill = dummyFill;
        } else {
            this.dummyFill = dummyFill;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".dummyFill(%s)", ((dummyFill != null) ? dummyFill.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".dummyFill(%s)", ((dummyFill != null) ? dummyFill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private String color;
    private Double opacity;

    /**
     * Dummy fill color with opacity.
     */
    public StateSettings dummyFill(String color, Double opacity) {
        if (jsBase == null) {
            this.color = color;
            this.opacity = opacity;
        } else {
            this.color = color;
            this.opacity = opacity;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".dummyFill(%s, %f)", wrapQuotes(color), opacity));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".dummyFill(%s, %f)", wrapQuotes(color), opacity));
                js.setLength(0);
            }
        }
        return this;
    }

    private GradientKey[] keys;
    private String[] keys1;
    private Double angle;
    private Boolean mode;
    private VectorRect mode1;
    private String mode2;
    private Double opacity1;

    /**
     * Linear gradient dummy fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public StateSettings dummyFill(GradientKey[] keys, Boolean mode, Double angle, Double opacity1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys = keys;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode = mode;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
        } else {
            this.keys = keys;
            this.mode = mode;
            this.angle = angle;
            this.opacity1 = opacity1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".dummyFill(%s, %b, %f, %f)", arrayToString(keys), mode, angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".dummyFill(%s, %b, %f, %f)", arrayToString(keys), mode, angle, opacity1));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient dummy fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public StateSettings dummyFill(GradientKey[] keys, VectorRect mode1, Double angle, Double opacity1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys = keys;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode1 = mode1;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
        } else {
            this.keys = keys;
            this.mode1 = mode1;
            this.angle = angle;
            this.opacity1 = opacity1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".dummyFill(%s, %s, %f, %f)", arrayToString(keys), ((mode1 != null) ? mode1.generateJs() : "null"), angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".dummyFill(%s, %s, %f, %f)", arrayToString(keys), ((mode1 != null) ? mode1.generateJs() : "null"), angle, opacity1));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient dummy fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public StateSettings dummyFill(GradientKey[] keys, String mode2, Double angle, Double opacity1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys = keys;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode2 = mode2;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
        } else {
            this.keys = keys;
            this.mode2 = mode2;
            this.angle = angle;
            this.opacity1 = opacity1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".dummyFill(%s, %s, %f, %f)", arrayToString(keys), wrapQuotes(mode2), angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".dummyFill(%s, %s, %f, %f)", arrayToString(keys), wrapQuotes(mode2), angle, opacity1));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient dummy fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public StateSettings dummyFill(String[] keys1, Boolean mode, Double angle, Double opacity1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys1 = keys1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode = mode;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
        } else {
            this.keys1 = keys1;
            this.mode = mode;
            this.angle = angle;
            this.opacity1 = opacity1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".dummyFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys1), mode, angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".dummyFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys1), mode, angle, opacity1));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient dummy fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public StateSettings dummyFill(String[] keys1, VectorRect mode1, Double angle, Double opacity1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys1 = keys1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode1 = mode1;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
        } else {
            this.keys1 = keys1;
            this.mode1 = mode1;
            this.angle = angle;
            this.opacity1 = opacity1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".dummyFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys1), ((mode1 != null) ? mode1.generateJs() : "null"), angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".dummyFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys1), ((mode1 != null) ? mode1.generateJs() : "null"), angle, opacity1));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient dummy fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public StateSettings dummyFill(String[] keys1, String mode2, Double angle, Double opacity1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys1 = keys1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode2 = mode2;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
        } else {
            this.keys1 = keys1;
            this.mode2 = mode2;
            this.angle = angle;
            this.opacity1 = opacity1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".dummyFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys1), wrapQuotes(mode2), angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".dummyFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys1), wrapQuotes(mode2), angle, opacity1));
                js.setLength(0);
            }
        }
        return this;
    }

    private GradientKey[] keys2;
    private String[] keys3;
    private Double cx;
    private Double cy;
    private GraphicsMathRect mode3;
    private Double opacity2;
    private Double fx;
    private Double fy;

    /**
     * Radial gradient dummy fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public StateSettings dummyFill(GradientKey[] keys2, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            
            this.keys2 = keys2;
            this.cx = cx;
            this.cy = cy;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            
            this.mode3 = mode3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            
            this.opacity2 = opacity2;
            this.fx = fx;
            this.fy = fy;
        } else {
            this.keys2 = keys2;
            this.cx = cx;
            this.cy = cy;
            this.mode3 = mode3;
            this.opacity2 = opacity2;
            this.fx = fx;
            this.fy = fy;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".dummyFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys2), cx, cy, ((mode3 != null) ? mode3.generateJs() : "null"), opacity2, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".dummyFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys2), cx, cy, ((mode3 != null) ? mode3.generateJs() : "null"), opacity2, fx, fy));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Radial gradient dummy fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public StateSettings dummyFill(String[] keys3, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            
            this.keys3 = keys3;
            this.cx = cx;
            this.cy = cy;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            
            this.mode3 = mode3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            
            this.opacity2 = opacity2;
            this.fx = fx;
            this.fy = fy;
        } else {
            this.keys3 = keys3;
            this.cx = cx;
            this.cy = cy;
            this.mode3 = mode3;
            this.opacity2 = opacity2;
            this.fx = fx;
            this.fy = fy;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".dummyFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys3), cx, cy, ((mode3 != null) ? mode3.generateJs() : "null"), opacity2, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".dummyFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys3), cx, cy, ((mode3 != null) ? mode3.generateJs() : "null"), opacity2, fx, fy));
                js.setLength(0);
            }
        }
        return this;
    }

    private Fill imageSettings;
    private Stroke color1;
    private ColoredFill color2;
    private String color3;
    private Double thickness;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;

    /**
     * Setter for tasks dummy stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public StateSettings setDummyStroke(Stroke color1, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            
            this.color1 = color1;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.color1 = color1;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".dummyStroke(%s, %f, %s, %s, %s)", ((color1 != null) ? color1.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".dummyStroke(%s, %f, %s, %s, %s)", ((color1 != null) ? color1.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for tasks dummy stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public StateSettings setDummyStroke(ColoredFill color2, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            
            this.color2 = color2;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.color2 = color2;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".dummyStroke(%s, %f, %s, %s, %s)", ((color2 != null) ? color2.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".dummyStroke(%s, %f, %s, %s, %s)", ((color2 != null) ? color2.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for tasks dummy stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public StateSettings setDummyStroke(String color3, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            
            this.color3 = color3;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.color3 = color3;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".dummyStroke(%s, %f, %s, %s, %s)", wrapQuotes(color3), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".dummyStroke(%s, %f, %s, %s, %s)", wrapQuotes(color3), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private Fill emptyFill;
    private String emptyFill1;

    /**
     * Setter for state fill settings for the empty part of a tank using a string or an object.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public StateSettings setEmptyFill(Fill emptyFill) {
        if (jsBase == null) {
            this.emptyFill = null;
            this.emptyFill1 = null;
            
            this.emptyFill = emptyFill;
        } else {
            this.emptyFill = emptyFill;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".emptyFill(%s)", ((emptyFill != null) ? emptyFill.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".emptyFill(%s)", ((emptyFill != null) ? emptyFill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for state fill settings for the empty part of a tank using a string or an object.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public StateSettings setEmptyFill(String emptyFill1) {
        if (jsBase == null) {
            this.emptyFill = null;
            this.emptyFill1 = null;
            
            this.emptyFill1 = emptyFill1;
        } else {
            this.emptyFill1 = emptyFill1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".emptyFill(%s)", wrapQuotes(emptyFill1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".emptyFill(%s)", wrapQuotes(emptyFill1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String color4;
    private Double opacity3;

    /**
     * State fill color with opacity for the empty part of a tank. Fill as a string or an object.
     */
    public StateSettings emptyFill(String color4, Double opacity3) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            
            this.color4 = color4;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
        } else {
            this.color4 = color4;
            this.opacity3 = opacity3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".emptyFill(%s, %f)", wrapQuotes(color4), opacity3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".emptyFill(%s, %f)", wrapQuotes(color4), opacity3));
                js.setLength(0);
            }
        }
        return this;
    }

    private PatternFill getEmptyHatchFill;

    /**
     * Getter for hatch fill settings.
     */
    public PatternFill getEmptyHatchFill() {
        if (getEmptyHatchFill == null)
            getEmptyHatchFill = new PatternFill(jsBase + ".emptyHatchFill()");

        return getEmptyHatchFill;
    }

    private PatternFill patternFillOrType;
    private HatchFill patternFillOrType1;
    private HatchFillType patternFillOrType2;
    private String patternFillOrType3;
    private Boolean patternFillOrType4;
    private String color5;
    private Double thickness1;
    private Double size;

    /**
     * Setter for hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public StateSettings setEmptyHatchFill(PatternFill patternFillOrType, String color5, Double thickness1, Double size) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            this.patternFillOrType4 = null;
            
            this.patternFillOrType = patternFillOrType;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            
            this.color5 = color5;
            this.thickness = null;
            this.thickness1 = null;
            
            this.thickness1 = thickness1;
            this.size = size;
        } else {
            this.patternFillOrType = patternFillOrType;
            this.color5 = color5;
            this.thickness1 = thickness1;
            this.size = size;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".emptyHatchFill(%s, %s, %f, %f)", ((patternFillOrType != null) ? patternFillOrType.generateJs() : "null"), wrapQuotes(color5), thickness1, size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".emptyHatchFill(%s, %s, %f, %f)", ((patternFillOrType != null) ? patternFillOrType.generateJs() : "null"), wrapQuotes(color5), thickness1, size));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public StateSettings setEmptyHatchFill(HatchFill patternFillOrType1, String color5, Double thickness1, Double size) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            this.patternFillOrType4 = null;
            
            this.patternFillOrType1 = patternFillOrType1;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            
            this.color5 = color5;
            this.thickness = null;
            this.thickness1 = null;
            
            this.thickness1 = thickness1;
            this.size = size;
        } else {
            this.patternFillOrType1 = patternFillOrType1;
            this.color5 = color5;
            this.thickness1 = thickness1;
            this.size = size;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".emptyHatchFill(%s, %s, %f, %f)", ((patternFillOrType1 != null) ? patternFillOrType1.generateJs() : "null"), wrapQuotes(color5), thickness1, size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".emptyHatchFill(%s, %s, %f, %f)", ((patternFillOrType1 != null) ? patternFillOrType1.generateJs() : "null"), wrapQuotes(color5), thickness1, size));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public StateSettings setEmptyHatchFill(HatchFillType patternFillOrType2, String color5, Double thickness1, Double size) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            this.patternFillOrType4 = null;
            
            this.patternFillOrType2 = patternFillOrType2;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            
            this.color5 = color5;
            this.thickness = null;
            this.thickness1 = null;
            
            this.thickness1 = thickness1;
            this.size = size;
        } else {
            this.patternFillOrType2 = patternFillOrType2;
            this.color5 = color5;
            this.thickness1 = thickness1;
            this.size = size;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".emptyHatchFill(%s, %s, %f, %f)", ((patternFillOrType2 != null) ? patternFillOrType2.generateJs() : "null"), wrapQuotes(color5), thickness1, size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".emptyHatchFill(%s, %s, %f, %f)", ((patternFillOrType2 != null) ? patternFillOrType2.generateJs() : "null"), wrapQuotes(color5), thickness1, size));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public StateSettings setEmptyHatchFill(String patternFillOrType3, String color5, Double thickness1, Double size) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            this.patternFillOrType4 = null;
            
            this.patternFillOrType3 = patternFillOrType3;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            
            this.color5 = color5;
            this.thickness = null;
            this.thickness1 = null;
            
            this.thickness1 = thickness1;
            this.size = size;
        } else {
            this.patternFillOrType3 = patternFillOrType3;
            this.color5 = color5;
            this.thickness1 = thickness1;
            this.size = size;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".emptyHatchFill(%s, %s, %f, %f)", wrapQuotes(patternFillOrType3), wrapQuotes(color5), thickness1, size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".emptyHatchFill(%s, %s, %f, %f)", wrapQuotes(patternFillOrType3), wrapQuotes(color5), thickness1, size));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public StateSettings setEmptyHatchFill(Boolean patternFillOrType4, String color5, Double thickness1, Double size) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            this.patternFillOrType4 = null;
            
            this.patternFillOrType4 = patternFillOrType4;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            
            this.color5 = color5;
            this.thickness = null;
            this.thickness1 = null;
            
            this.thickness1 = thickness1;
            this.size = size;
        } else {
            this.patternFillOrType4 = patternFillOrType4;
            this.color5 = color5;
            this.thickness1 = thickness1;
            this.size = size;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".emptyHatchFill(%b, %s, %f, %f)", patternFillOrType4, wrapQuotes(color5), thickness1, size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".emptyHatchFill(%b, %s, %f, %f)", patternFillOrType4, wrapQuotes(color5), thickness1, size));
                js.setLength(0);
            }
        }
        return this;
    }

    private Fill fallingFill;

    /**
     * Setter for falling fill settings using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CartesianSeriesBase setFallingFill(Fill fallingFill) {
        if (jsBase == null) {
            this.fallingFill = fallingFill;
        } else {
            this.fallingFill = fallingFill;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fallingFill(%s)", ((fallingFill != null) ? fallingFill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return new CartesianSeriesBase(jsBase);
    }

    private String color6;
    private Double opacity4;

    /**
     * Falling fill color with opacity.
     */
    public CartesianSeriesBase fallingFill(String color6, Double opacity4) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            
            this.color6 = color6;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            
            this.opacity4 = opacity4;
        } else {
            this.color6 = color6;
            this.opacity4 = opacity4;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fallingFill(%s, %f)", wrapQuotes(color6), opacity4));
                js.setLength(0);
            }
        }
        return new CartesianSeriesBase(jsBase);
    }

    private GradientKey[] keys4;
    private String[] keys5;
    private Double angle1;
    private Boolean mode4;
    private VectorRect mode5;
    private String mode6;
    private Double opacity5;

    /**
     * Linear gradient falling fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CartesianSeriesBase fallingFill(GradientKey[] keys4, Boolean mode4, Double angle1, Double opacity5) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            
            this.keys4 = keys4;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            
            this.mode4 = mode4;
            this.angle = null;
            this.angle1 = null;
            
            this.angle1 = angle1;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            
            this.opacity5 = opacity5;
        } else {
            this.keys4 = keys4;
            this.mode4 = mode4;
            this.angle1 = angle1;
            this.opacity5 = opacity5;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fallingFill(%s, %b, %f, %f)", arrayToString(keys4), mode4, angle1, opacity5));
                js.setLength(0);
            }
        }
        return new CartesianSeriesBase(jsBase);
    }


    /**
     * Linear gradient falling fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CartesianSeriesBase fallingFill(GradientKey[] keys4, VectorRect mode5, Double angle1, Double opacity5) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            
            this.keys4 = keys4;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            
            this.mode5 = mode5;
            this.angle = null;
            this.angle1 = null;
            
            this.angle1 = angle1;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            
            this.opacity5 = opacity5;
        } else {
            this.keys4 = keys4;
            this.mode5 = mode5;
            this.angle1 = angle1;
            this.opacity5 = opacity5;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fallingFill(%s, %s, %f, %f)", arrayToString(keys4), ((mode5 != null) ? mode5.generateJs() : "null"), angle1, opacity5));
                js.setLength(0);
            }
        }
        return new CartesianSeriesBase(jsBase);
    }


    /**
     * Linear gradient falling fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CartesianSeriesBase fallingFill(GradientKey[] keys4, String mode6, Double angle1, Double opacity5) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            
            this.keys4 = keys4;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            
            this.mode6 = mode6;
            this.angle = null;
            this.angle1 = null;
            
            this.angle1 = angle1;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            
            this.opacity5 = opacity5;
        } else {
            this.keys4 = keys4;
            this.mode6 = mode6;
            this.angle1 = angle1;
            this.opacity5 = opacity5;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fallingFill(%s, %s, %f, %f)", arrayToString(keys4), wrapQuotes(mode6), angle1, opacity5));
                js.setLength(0);
            }
        }
        return new CartesianSeriesBase(jsBase);
    }


    /**
     * Linear gradient falling fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CartesianSeriesBase fallingFill(String[] keys5, Boolean mode4, Double angle1, Double opacity5) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            
            this.keys5 = keys5;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            
            this.mode4 = mode4;
            this.angle = null;
            this.angle1 = null;
            
            this.angle1 = angle1;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            
            this.opacity5 = opacity5;
        } else {
            this.keys5 = keys5;
            this.mode4 = mode4;
            this.angle1 = angle1;
            this.opacity5 = opacity5;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fallingFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys5), mode4, angle1, opacity5));
                js.setLength(0);
            }
        }
        return new CartesianSeriesBase(jsBase);
    }


    /**
     * Linear gradient falling fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CartesianSeriesBase fallingFill(String[] keys5, VectorRect mode5, Double angle1, Double opacity5) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            
            this.keys5 = keys5;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            
            this.mode5 = mode5;
            this.angle = null;
            this.angle1 = null;
            
            this.angle1 = angle1;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            
            this.opacity5 = opacity5;
        } else {
            this.keys5 = keys5;
            this.mode5 = mode5;
            this.angle1 = angle1;
            this.opacity5 = opacity5;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fallingFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys5), ((mode5 != null) ? mode5.generateJs() : "null"), angle1, opacity5));
                js.setLength(0);
            }
        }
        return new CartesianSeriesBase(jsBase);
    }


    /**
     * Linear gradient falling fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CartesianSeriesBase fallingFill(String[] keys5, String mode6, Double angle1, Double opacity5) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            
            this.keys5 = keys5;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            
            this.mode6 = mode6;
            this.angle = null;
            this.angle1 = null;
            
            this.angle1 = angle1;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            
            this.opacity5 = opacity5;
        } else {
            this.keys5 = keys5;
            this.mode6 = mode6;
            this.angle1 = angle1;
            this.opacity5 = opacity5;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fallingFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys5), wrapQuotes(mode6), angle1, opacity5));
                js.setLength(0);
            }
        }
        return new CartesianSeriesBase(jsBase);
    }

    private GradientKey[] keys6;
    private String[] keys7;
    private Double cx1;
    private Double cy1;
    private GraphicsMathRect mode7;
    private Double opacity6;
    private Double fx1;
    private Double fy1;

    /**
     * Radial gradient falling fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CartesianSeriesBase fallingFill(GradientKey[] keys6, Double cx1, Double cy1, GraphicsMathRect mode7, Double opacity6, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            
            this.keys6 = keys6;
            this.cx = null;
            this.cx1 = null;
            
            this.cx1 = cx1;
            this.cy = null;
            this.cy1 = null;
            
            this.cy1 = cy1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            
            this.mode7 = mode7;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            
            this.opacity6 = opacity6;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.keys6 = keys6;
            this.cx1 = cx1;
            this.cy1 = cy1;
            this.mode7 = mode7;
            this.opacity6 = opacity6;
            this.fx1 = fx1;
            this.fy1 = fy1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fallingFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys6), cx1, cy1, ((mode7 != null) ? mode7.generateJs() : "null"), opacity6, fx1, fy1));
                js.setLength(0);
            }
        }
        return new CartesianSeriesBase(jsBase);
    }


    /**
     * Radial gradient falling fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CartesianSeriesBase fallingFill(String[] keys7, Double cx1, Double cy1, GraphicsMathRect mode7, Double opacity6, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            
            this.keys7 = keys7;
            this.cx = null;
            this.cx1 = null;
            
            this.cx1 = cx1;
            this.cy = null;
            this.cy1 = null;
            
            this.cy1 = cy1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            
            this.mode7 = mode7;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            
            this.opacity6 = opacity6;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.keys7 = keys7;
            this.cx1 = cx1;
            this.cy1 = cy1;
            this.mode7 = mode7;
            this.opacity6 = opacity6;
            this.fx1 = fx1;
            this.fy1 = fy1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fallingFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys7), cx1, cy1, ((mode7 != null) ? mode7.generateJs() : "null"), opacity6, fx1, fy1));
                js.setLength(0);
            }
        }
        return new CartesianSeriesBase(jsBase);
    }

    private Fill imageSettings1;
    private PatternFill getFallingHatchFill;

    /**
     * Getter for falling hatch fill settings.
     */
    public PatternFill getFallingHatchFill() {
        if (getFallingHatchFill == null)
            getFallingHatchFill = new PatternFill(jsBase + ".fallingHatchFill()");

        return getFallingHatchFill;
    }

    private PatternFill patternFillOrTypeOrState;
    private HatchFill patternFillOrTypeOrState1;
    private HatchFillType patternFillOrTypeOrState2;
    private String patternFillOrTypeOrState3;
    private Boolean patternFillOrTypeOrState4;
    private String color7;
    private Double thickness2;
    private Double size1;

    /**
     * Setter for falling hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public CartesianSeriesBase setFallingHatchFill(PatternFill patternFillOrTypeOrState, String color7, Double thickness2, Double size1) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            
            this.patternFillOrTypeOrState = patternFillOrTypeOrState;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            
            this.color7 = color7;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            
            this.thickness2 = thickness2;
            this.size = null;
            this.size1 = null;
            
            this.size1 = size1;
        } else {
            this.patternFillOrTypeOrState = patternFillOrTypeOrState;
            this.color7 = color7;
            this.thickness2 = thickness2;
            this.size1 = size1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fallingHatchFill(%s, %s, %f, %f)", ((patternFillOrTypeOrState != null) ? patternFillOrTypeOrState.generateJs() : "null"), wrapQuotes(color7), thickness2, size1));
                js.setLength(0);
            }
        }
        return new CartesianSeriesBase(jsBase);
    }


    /**
     * Setter for falling hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public CartesianSeriesBase setFallingHatchFill(HatchFill patternFillOrTypeOrState1, String color7, Double thickness2, Double size1) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            
            this.patternFillOrTypeOrState1 = patternFillOrTypeOrState1;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            
            this.color7 = color7;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            
            this.thickness2 = thickness2;
            this.size = null;
            this.size1 = null;
            
            this.size1 = size1;
        } else {
            this.patternFillOrTypeOrState1 = patternFillOrTypeOrState1;
            this.color7 = color7;
            this.thickness2 = thickness2;
            this.size1 = size1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fallingHatchFill(%s, %s, %f, %f)", ((patternFillOrTypeOrState1 != null) ? patternFillOrTypeOrState1.generateJs() : "null"), wrapQuotes(color7), thickness2, size1));
                js.setLength(0);
            }
        }
        return new CartesianSeriesBase(jsBase);
    }


    /**
     * Setter for falling hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public CartesianSeriesBase setFallingHatchFill(HatchFillType patternFillOrTypeOrState2, String color7, Double thickness2, Double size1) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            
            this.patternFillOrTypeOrState2 = patternFillOrTypeOrState2;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            
            this.color7 = color7;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            
            this.thickness2 = thickness2;
            this.size = null;
            this.size1 = null;
            
            this.size1 = size1;
        } else {
            this.patternFillOrTypeOrState2 = patternFillOrTypeOrState2;
            this.color7 = color7;
            this.thickness2 = thickness2;
            this.size1 = size1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fallingHatchFill(%s, %s, %f, %f)", ((patternFillOrTypeOrState2 != null) ? patternFillOrTypeOrState2.generateJs() : "null"), wrapQuotes(color7), thickness2, size1));
                js.setLength(0);
            }
        }
        return new CartesianSeriesBase(jsBase);
    }


    /**
     * Setter for falling hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public CartesianSeriesBase setFallingHatchFill(String patternFillOrTypeOrState3, String color7, Double thickness2, Double size1) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            
            this.patternFillOrTypeOrState3 = patternFillOrTypeOrState3;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            
            this.color7 = color7;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            
            this.thickness2 = thickness2;
            this.size = null;
            this.size1 = null;
            
            this.size1 = size1;
        } else {
            this.patternFillOrTypeOrState3 = patternFillOrTypeOrState3;
            this.color7 = color7;
            this.thickness2 = thickness2;
            this.size1 = size1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fallingHatchFill(%s, %s, %f, %f)", wrapQuotes(patternFillOrTypeOrState3), wrapQuotes(color7), thickness2, size1));
                js.setLength(0);
            }
        }
        return new CartesianSeriesBase(jsBase);
    }


    /**
     * Setter for falling hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public CartesianSeriesBase setFallingHatchFill(Boolean patternFillOrTypeOrState4, String color7, Double thickness2, Double size1) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            
            this.patternFillOrTypeOrState4 = patternFillOrTypeOrState4;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            
            this.color7 = color7;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            
            this.thickness2 = thickness2;
            this.size = null;
            this.size1 = null;
            
            this.size1 = size1;
        } else {
            this.patternFillOrTypeOrState4 = patternFillOrTypeOrState4;
            this.color7 = color7;
            this.thickness2 = thickness2;
            this.size1 = size1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fallingHatchFill(%b, %s, %f, %f)", patternFillOrTypeOrState4, wrapQuotes(color7), thickness2, size1));
                js.setLength(0);
            }
        }
        return new CartesianSeriesBase(jsBase);
    }

    private Stroke stroke;
    private ColoredFill stroke1;
    private String stroke2;
    private Double thickness3;
    private String dashpattern1;
    private StrokeLineJoin lineJoin1;
    private StrokeLineCap lineCap1;

    /**
     * Setter for falling stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public StateSettings setFallingStroke(Stroke stroke, Double thickness3, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        if (jsBase == null) {
            this.stroke = null;
            this.stroke1 = null;
            this.stroke2 = null;
            
            this.stroke = stroke;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            
            this.thickness3 = thickness3;
            this.dashpattern = null;
            this.dashpattern1 = null;
            
            this.dashpattern1 = dashpattern1;
            this.lineJoin = null;
            this.lineJoin1 = null;
            
            this.lineJoin1 = lineJoin1;
            this.lineCap = null;
            this.lineCap1 = null;
            
            this.lineCap1 = lineCap1;
        } else {
            this.stroke = stroke;
            this.thickness3 = thickness3;
            this.dashpattern1 = dashpattern1;
            this.lineJoin1 = lineJoin1;
            this.lineCap1 = lineCap1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fallingStroke(%s, %f, %s, %s, %s)", ((stroke != null) ? stroke.generateJs() : "null"), thickness3, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fallingStroke(%s, %f, %s, %s, %s)", ((stroke != null) ? stroke.generateJs() : "null"), thickness3, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for falling stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public StateSettings setFallingStroke(ColoredFill stroke1, Double thickness3, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        if (jsBase == null) {
            this.stroke = null;
            this.stroke1 = null;
            this.stroke2 = null;
            
            this.stroke1 = stroke1;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            
            this.thickness3 = thickness3;
            this.dashpattern = null;
            this.dashpattern1 = null;
            
            this.dashpattern1 = dashpattern1;
            this.lineJoin = null;
            this.lineJoin1 = null;
            
            this.lineJoin1 = lineJoin1;
            this.lineCap = null;
            this.lineCap1 = null;
            
            this.lineCap1 = lineCap1;
        } else {
            this.stroke1 = stroke1;
            this.thickness3 = thickness3;
            this.dashpattern1 = dashpattern1;
            this.lineJoin1 = lineJoin1;
            this.lineCap1 = lineCap1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fallingStroke(%s, %f, %s, %s, %s)", ((stroke1 != null) ? stroke1.generateJs() : "null"), thickness3, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fallingStroke(%s, %f, %s, %s, %s)", ((stroke1 != null) ? stroke1.generateJs() : "null"), thickness3, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for falling stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public StateSettings setFallingStroke(String stroke2, Double thickness3, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        if (jsBase == null) {
            this.stroke = null;
            this.stroke1 = null;
            this.stroke2 = null;
            
            this.stroke2 = stroke2;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            
            this.thickness3 = thickness3;
            this.dashpattern = null;
            this.dashpattern1 = null;
            
            this.dashpattern1 = dashpattern1;
            this.lineJoin = null;
            this.lineJoin1 = null;
            
            this.lineJoin1 = lineJoin1;
            this.lineCap = null;
            this.lineCap1 = null;
            
            this.lineCap1 = lineCap1;
        } else {
            this.stroke2 = stroke2;
            this.thickness3 = thickness3;
            this.dashpattern1 = dashpattern1;
            this.lineJoin1 = lineJoin1;
            this.lineCap1 = lineCap1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fallingStroke(%s, %f, %s, %s, %s)", wrapQuotes(stroke2), thickness3, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fallingStroke(%s, %f, %s, %s, %s)", wrapQuotes(stroke2), thickness3, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private Fill fill;

    /**
     * Setter for fill settings using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public StateSettings setFill(Fill fill) {
        if (jsBase == null) {
            this.fill = fill;
        } else {
            this.fill = fill;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fill(%s)", ((fill != null) ? fill.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s)", ((fill != null) ? fill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private String color8;
    private Double opacity7;

    /**
     * Setter for the fill color with opacity.
     */
    public StateSettings setFill(String color8, Double opacity7) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            
            this.color8 = color8;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            
            this.opacity7 = opacity7;
        } else {
            this.color8 = color8;
            this.opacity7 = opacity7;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fill(%s, %f)", wrapQuotes(color8), opacity7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f)", wrapQuotes(color8), opacity7));
                js.setLength(0);
            }
        }
        return this;
    }

    private GradientKey[] keys8;
    private String[] keys9;
    private Double angle2;
    private Boolean mode8;
    private VectorRect mode9;
    private String mode10;
    private Double opacity8;

    /**
     * Setter for the linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public StateSettings setFill(GradientKey[] keys8, Boolean mode8, Double angle2, Double opacity8) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            
            this.keys8 = keys8;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            
            this.mode8 = mode8;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            
            this.angle2 = angle2;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            
            this.opacity8 = opacity8;
        } else {
            this.keys8 = keys8;
            this.mode8 = mode8;
            this.angle2 = angle2;
            this.opacity8 = opacity8;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fill(%s, %b, %f, %f)", arrayToString(keys8), mode8, angle2, opacity8));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %b, %f, %f)", arrayToString(keys8), mode8, angle2, opacity8));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public StateSettings setFill(GradientKey[] keys8, VectorRect mode9, Double angle2, Double opacity8) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            
            this.keys8 = keys8;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            
            this.mode9 = mode9;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            
            this.angle2 = angle2;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            
            this.opacity8 = opacity8;
        } else {
            this.keys8 = keys8;
            this.mode9 = mode9;
            this.angle2 = angle2;
            this.opacity8 = opacity8;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fill(%s, %s, %f, %f)", arrayToString(keys8), ((mode9 != null) ? mode9.generateJs() : "null"), angle2, opacity8));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %s, %f, %f)", arrayToString(keys8), ((mode9 != null) ? mode9.generateJs() : "null"), angle2, opacity8));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public StateSettings setFill(GradientKey[] keys8, String mode10, Double angle2, Double opacity8) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            
            this.keys8 = keys8;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            
            this.mode10 = mode10;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            
            this.angle2 = angle2;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            
            this.opacity8 = opacity8;
        } else {
            this.keys8 = keys8;
            this.mode10 = mode10;
            this.angle2 = angle2;
            this.opacity8 = opacity8;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fill(%s, %s, %f, %f)", arrayToString(keys8), wrapQuotes(mode10), angle2, opacity8));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %s, %f, %f)", arrayToString(keys8), wrapQuotes(mode10), angle2, opacity8));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public StateSettings setFill(String[] keys9, Boolean mode8, Double angle2, Double opacity8) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            
            this.keys9 = keys9;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            
            this.mode8 = mode8;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            
            this.angle2 = angle2;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            
            this.opacity8 = opacity8;
        } else {
            this.keys9 = keys9;
            this.mode8 = mode8;
            this.angle2 = angle2;
            this.opacity8 = opacity8;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys9), mode8, angle2, opacity8));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys9), mode8, angle2, opacity8));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public StateSettings setFill(String[] keys9, VectorRect mode9, Double angle2, Double opacity8) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            
            this.keys9 = keys9;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            
            this.mode9 = mode9;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            
            this.angle2 = angle2;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            
            this.opacity8 = opacity8;
        } else {
            this.keys9 = keys9;
            this.mode9 = mode9;
            this.angle2 = angle2;
            this.opacity8 = opacity8;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys9), ((mode9 != null) ? mode9.generateJs() : "null"), angle2, opacity8));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys9), ((mode9 != null) ? mode9.generateJs() : "null"), angle2, opacity8));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public StateSettings setFill(String[] keys9, String mode10, Double angle2, Double opacity8) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            
            this.keys9 = keys9;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            
            this.mode10 = mode10;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            
            this.angle2 = angle2;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            
            this.opacity8 = opacity8;
        } else {
            this.keys9 = keys9;
            this.mode10 = mode10;
            this.angle2 = angle2;
            this.opacity8 = opacity8;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys9), wrapQuotes(mode10), angle2, opacity8));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys9), wrapQuotes(mode10), angle2, opacity8));
                js.setLength(0);
            }
        }
        return this;
    }

    private GradientKey[] keys10;
    private String[] keys11;
    private Double cx2;
    private Double cy2;
    private GraphicsMathRect mode11;
    private Double opacity9;
    private Double fx2;
    private Double fy2;

    /**
     * Setter for the radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public StateSettings setFill(GradientKey[] keys10, Double cx2, Double cy2, GraphicsMathRect mode11, Double opacity9, Double fx2, Double fy2) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            
            this.keys10 = keys10;
            this.cx = null;
            this.cx1 = null;
            this.cx2 = null;
            
            this.cx2 = cx2;
            this.cy = null;
            this.cy1 = null;
            this.cy2 = null;
            
            this.cy2 = cy2;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            
            this.mode11 = mode11;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            
            this.opacity9 = opacity9;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            
            this.fx2 = fx2;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            
            this.fy2 = fy2;
        } else {
            this.keys10 = keys10;
            this.cx2 = cx2;
            this.cy2 = cy2;
            this.mode11 = mode11;
            this.opacity9 = opacity9;
            this.fx2 = fx2;
            this.fy2 = fy2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys10), cx2, cy2, ((mode11 != null) ? mode11.generateJs() : "null"), opacity9, fx2, fy2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys10), cx2, cy2, ((mode11 != null) ? mode11.generateJs() : "null"), opacity9, fx2, fy2));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public StateSettings setFill(String[] keys11, Double cx2, Double cy2, GraphicsMathRect mode11, Double opacity9, Double fx2, Double fy2) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            
            this.keys11 = keys11;
            this.cx = null;
            this.cx1 = null;
            this.cx2 = null;
            
            this.cx2 = cx2;
            this.cy = null;
            this.cy1 = null;
            this.cy2 = null;
            
            this.cy2 = cy2;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            
            this.mode11 = mode11;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            
            this.opacity9 = opacity9;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            
            this.fx2 = fx2;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            
            this.fy2 = fy2;
        } else {
            this.keys11 = keys11;
            this.cx2 = cx2;
            this.cy2 = cy2;
            this.mode11 = mode11;
            this.opacity9 = opacity9;
            this.fx2 = fx2;
            this.fy2 = fy2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys11), cx2, cy2, ((mode11 != null) ? mode11.generateJs() : "null"), opacity9, fx2, fy2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys11), cx2, cy2, ((mode11 != null) ? mode11.generateJs() : "null"), opacity9, fx2, fy2));
                js.setLength(0);
            }
        }
        return this;
    }

    private Fill imageSettings2;
    private String fontFamily;

    /**
     * Setter for the font family of text.
     */
    public StateSettings setFontFamily(String fontFamily) {
        if (jsBase == null) {
            this.fontFamily = fontFamily;
        } else {
            this.fontFamily = fontFamily;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fontFamily(%s)", wrapQuotes(fontFamily)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontFamily(%s)", wrapQuotes(fontFamily)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double fontSize;
    private String fontSize1;

    /**
     * Setter for font size settings.
     */
    public StateSettings setFontSize(Double fontSize) {
        if (jsBase == null) {
            this.fontSize = null;
            this.fontSize1 = null;
            
            this.fontSize = fontSize;
        } else {
            this.fontSize = fontSize;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fontSize(%f)", fontSize));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontSize(%f)", fontSize));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for font size settings.
     */
    public StateSettings setFontSize(String fontSize1) {
        if (jsBase == null) {
            this.fontSize = null;
            this.fontSize1 = null;
            
            this.fontSize1 = fontSize1;
        } else {
            this.fontSize1 = fontSize1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fontSize(%s)", wrapQuotes(fontSize1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontSize(%s)", wrapQuotes(fontSize1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private TextFontStyle fontStyle;
    private String fontStyle1;

    /**
     * Setter for the text font style.
     */
    public StateSettings setFontStyle(TextFontStyle fontStyle) {
        if (jsBase == null) {
            this.fontStyle = null;
            this.fontStyle1 = null;
            
            this.fontStyle = fontStyle;
        } else {
            this.fontStyle = fontStyle;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fontStyle(%s)", ((fontStyle != null) ? fontStyle.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontStyle(%s)", ((fontStyle != null) ? fontStyle.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the text font style.
     */
    public StateSettings setFontStyle(String fontStyle1) {
        if (jsBase == null) {
            this.fontStyle = null;
            this.fontStyle1 = null;
            
            this.fontStyle1 = fontStyle1;
        } else {
            this.fontStyle1 = fontStyle1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fontStyle(%s)", wrapQuotes(fontStyle1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontStyle(%s)", wrapQuotes(fontStyle1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private TextFontVariant fontVariant;
    private String fontVariant1;

    /**
     * Setter for the text font variant.
     */
    public StateSettings setFontVariant(TextFontVariant fontVariant) {
        if (jsBase == null) {
            this.fontVariant = null;
            this.fontVariant1 = null;
            
            this.fontVariant = fontVariant;
        } else {
            this.fontVariant = fontVariant;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fontVariant(%s)", ((fontVariant != null) ? fontVariant.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontVariant(%s)", ((fontVariant != null) ? fontVariant.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the text font variant.
     */
    public StateSettings setFontVariant(String fontVariant1) {
        if (jsBase == null) {
            this.fontVariant = null;
            this.fontVariant1 = null;
            
            this.fontVariant1 = fontVariant1;
        } else {
            this.fontVariant1 = fontVariant1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fontVariant(%s)", wrapQuotes(fontVariant1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontVariant(%s)", wrapQuotes(fontVariant1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String fontWeight;
    private Double fontWeight1;

    /**
     * Setter for the text font weight. {@link https://www.w3schools.com/cssref/pr_font_weight.asp}
     */
    public StateSettings setFontWeight(String fontWeight) {
        if (jsBase == null) {
            this.fontWeight = null;
            this.fontWeight1 = null;
            
            this.fontWeight = fontWeight;
        } else {
            this.fontWeight = fontWeight;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fontWeight(%s)", wrapQuotes(fontWeight)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontWeight(%s)", wrapQuotes(fontWeight)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the text font weight. {@link https://www.w3schools.com/cssref/pr_font_weight.asp}
     */
    public StateSettings setFontWeight(Double fontWeight1) {
        if (jsBase == null) {
            this.fontWeight = null;
            this.fontWeight1 = null;
            
            this.fontWeight1 = fontWeight1;
        } else {
            this.fontWeight1 = fontWeight1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fontWeight(%f)", fontWeight1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontWeight(%f)", fontWeight1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Stroke grid;
    private ColoredFill grid1;
    private String grid2;
    private Double thickness4;
    private String dashpattern2;
    private StrokeLineJoin lineJoin2;
    private StrokeLineCap lineCap2;

    /**
     * Setter for annotation grid settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public StateSettings setGrid(Stroke grid, Double thickness4, String dashpattern2, StrokeLineJoin lineJoin2, StrokeLineCap lineCap2) {
        if (jsBase == null) {
            this.grid = null;
            this.grid1 = null;
            this.grid2 = null;
            
            this.grid = grid;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            
            this.thickness4 = thickness4;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            
            this.dashpattern2 = dashpattern2;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            
            this.lineJoin2 = lineJoin2;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            
            this.lineCap2 = lineCap2;
        } else {
            this.grid = grid;
            this.thickness4 = thickness4;
            this.dashpattern2 = dashpattern2;
            this.lineJoin2 = lineJoin2;
            this.lineCap2 = lineCap2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".grid(%s, %f, %s, %s, %s)", ((grid != null) ? grid.generateJs() : "null"), thickness4, wrapQuotes(dashpattern2), ((lineJoin2 != null) ? lineJoin2.generateJs() : "null"), ((lineCap2 != null) ? lineCap2.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".grid(%s, %f, %s, %s, %s)", ((grid != null) ? grid.generateJs() : "null"), thickness4, wrapQuotes(dashpattern2), ((lineJoin2 != null) ? lineJoin2.generateJs() : "null"), ((lineCap2 != null) ? lineCap2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for annotation grid settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public StateSettings setGrid(ColoredFill grid1, Double thickness4, String dashpattern2, StrokeLineJoin lineJoin2, StrokeLineCap lineCap2) {
        if (jsBase == null) {
            this.grid = null;
            this.grid1 = null;
            this.grid2 = null;
            
            this.grid1 = grid1;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            
            this.thickness4 = thickness4;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            
            this.dashpattern2 = dashpattern2;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            
            this.lineJoin2 = lineJoin2;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            
            this.lineCap2 = lineCap2;
        } else {
            this.grid1 = grid1;
            this.thickness4 = thickness4;
            this.dashpattern2 = dashpattern2;
            this.lineJoin2 = lineJoin2;
            this.lineCap2 = lineCap2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".grid(%s, %f, %s, %s, %s)", ((grid1 != null) ? grid1.generateJs() : "null"), thickness4, wrapQuotes(dashpattern2), ((lineJoin2 != null) ? lineJoin2.generateJs() : "null"), ((lineCap2 != null) ? lineCap2.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".grid(%s, %f, %s, %s, %s)", ((grid1 != null) ? grid1.generateJs() : "null"), thickness4, wrapQuotes(dashpattern2), ((lineJoin2 != null) ? lineJoin2.generateJs() : "null"), ((lineCap2 != null) ? lineCap2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for annotation grid settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public StateSettings setGrid(String grid2, Double thickness4, String dashpattern2, StrokeLineJoin lineJoin2, StrokeLineCap lineCap2) {
        if (jsBase == null) {
            this.grid = null;
            this.grid1 = null;
            this.grid2 = null;
            
            this.grid2 = grid2;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            
            this.thickness4 = thickness4;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            
            this.dashpattern2 = dashpattern2;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            
            this.lineJoin2 = lineJoin2;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            
            this.lineCap2 = lineCap2;
        } else {
            this.grid2 = grid2;
            this.thickness4 = thickness4;
            this.dashpattern2 = dashpattern2;
            this.lineJoin2 = lineJoin2;
            this.lineCap2 = lineCap2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".grid(%s, %f, %s, %s, %s)", wrapQuotes(grid2), thickness4, wrapQuotes(dashpattern2), ((lineJoin2 != null) ? lineJoin2.generateJs() : "null"), ((lineCap2 != null) ? lineCap2.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".grid(%s, %f, %s, %s, %s)", wrapQuotes(grid2), thickness4, wrapQuotes(dashpattern2), ((lineJoin2 != null) ? lineJoin2.generateJs() : "null"), ((lineCap2 != null) ? lineCap2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private PatternFill getHatchFill;

    /**
     * Getter for hatch fill settings.
     */
    public PatternFill getHatchFill() {
        if (getHatchFill == null)
            getHatchFill = new PatternFill(jsBase + ".hatchFill()");

        return getHatchFill;
    }

    private PatternFill patternFillOrType5;
    private HatchFill patternFillOrType6;
    private HatchFillType patternFillOrType7;
    private String patternFillOrType8;
    private String color9;
    private Double thickness5;
    private Double size2;

    /**
     * Setter for hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public StateSettings setHatchFill(PatternFill patternFillOrType5, String color9, Double thickness5, Double size2) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            this.patternFillOrType4 = null;
            this.patternFillOrType5 = null;
            this.patternFillOrType6 = null;
            this.patternFillOrType7 = null;
            this.patternFillOrType8 = null;
            
            this.patternFillOrType5 = patternFillOrType5;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            
            this.color9 = color9;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            
            this.thickness5 = thickness5;
            this.size = null;
            this.size1 = null;
            this.size2 = null;
            
            this.size2 = size2;
        } else {
            this.patternFillOrType5 = patternFillOrType5;
            this.color9 = color9;
            this.thickness5 = thickness5;
            this.size2 = size2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", ((patternFillOrType5 != null) ? patternFillOrType5.generateJs() : "null"), wrapQuotes(color9), thickness5, size2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", ((patternFillOrType5 != null) ? patternFillOrType5.generateJs() : "null"), wrapQuotes(color9), thickness5, size2));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public StateSettings setHatchFill(HatchFill patternFillOrType6, String color9, Double thickness5, Double size2) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            this.patternFillOrType4 = null;
            this.patternFillOrType5 = null;
            this.patternFillOrType6 = null;
            this.patternFillOrType7 = null;
            this.patternFillOrType8 = null;
            
            this.patternFillOrType6 = patternFillOrType6;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            
            this.color9 = color9;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            
            this.thickness5 = thickness5;
            this.size = null;
            this.size1 = null;
            this.size2 = null;
            
            this.size2 = size2;
        } else {
            this.patternFillOrType6 = patternFillOrType6;
            this.color9 = color9;
            this.thickness5 = thickness5;
            this.size2 = size2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", ((patternFillOrType6 != null) ? patternFillOrType6.generateJs() : "null"), wrapQuotes(color9), thickness5, size2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", ((patternFillOrType6 != null) ? patternFillOrType6.generateJs() : "null"), wrapQuotes(color9), thickness5, size2));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public StateSettings setHatchFill(HatchFillType patternFillOrType7, String color9, Double thickness5, Double size2) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            this.patternFillOrType4 = null;
            this.patternFillOrType5 = null;
            this.patternFillOrType6 = null;
            this.patternFillOrType7 = null;
            this.patternFillOrType8 = null;
            
            this.patternFillOrType7 = patternFillOrType7;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            
            this.color9 = color9;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            
            this.thickness5 = thickness5;
            this.size = null;
            this.size1 = null;
            this.size2 = null;
            
            this.size2 = size2;
        } else {
            this.patternFillOrType7 = patternFillOrType7;
            this.color9 = color9;
            this.thickness5 = thickness5;
            this.size2 = size2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", ((patternFillOrType7 != null) ? patternFillOrType7.generateJs() : "null"), wrapQuotes(color9), thickness5, size2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", ((patternFillOrType7 != null) ? patternFillOrType7.generateJs() : "null"), wrapQuotes(color9), thickness5, size2));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public StateSettings setHatchFill(String patternFillOrType8, String color9, Double thickness5, Double size2) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            this.patternFillOrType4 = null;
            this.patternFillOrType5 = null;
            this.patternFillOrType6 = null;
            this.patternFillOrType7 = null;
            this.patternFillOrType8 = null;
            
            this.patternFillOrType8 = patternFillOrType8;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            
            this.color9 = color9;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            
            this.thickness5 = thickness5;
            this.size = null;
            this.size1 = null;
            this.size2 = null;
            
            this.size2 = size2;
        } else {
            this.patternFillOrType8 = patternFillOrType8;
            this.color9 = color9;
            this.thickness5 = thickness5;
            this.size2 = size2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", wrapQuotes(patternFillOrType8), wrapQuotes(color9), thickness5, size2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", wrapQuotes(patternFillOrType8), wrapQuotes(color9), thickness5, size2));
                js.setLength(0);
            }
        }
        return this;
    }

    private UiLabelsFactory getHeaders;

    /**
     * Getter for the header labels (TreeMap).
     */
    public UiLabelsFactory getHeaders() {
        if (getHeaders == null)
            getHeaders = new UiLabelsFactory(jsBase + ".headers()");

        return getHeaders;
    }

    private String headers;
    private Boolean headers1;

    /**
     * Setter for the header labels (TreeMap).
     */
    public StateSettings setHeaders(String headers) {
        if (jsBase == null) {
            this.headers = null;
            this.headers1 = null;
            
            this.headers = headers;
        } else {
            this.headers = headers;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".headers(%s)", wrapQuotes(headers)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".headers(%s)", wrapQuotes(headers)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the header labels (TreeMap).
     */
    public StateSettings setHeaders(Boolean headers1) {
        if (jsBase == null) {
            this.headers = null;
            this.headers1 = null;
            
            this.headers1 = headers1;
        } else {
            this.headers1 = headers1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".headers(%b)", headers1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".headers(%b)", headers1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Stroke color10;
    private ColoredFill color11;
    private String color12;
    private Double thickness6;
    private String dashpattern3;
    private StrokeLineJoin lineJoin3;
    private StrokeLineCap lineCap3;

    /**
     * Setter for high stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public StateSettings setHighStroke(Stroke color10, Double thickness6, String dashpattern3, StrokeLineJoin lineJoin3, StrokeLineCap lineCap3) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            
            this.color10 = color10;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            
            this.thickness6 = thickness6;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            
            this.dashpattern3 = dashpattern3;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            
            this.lineJoin3 = lineJoin3;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            
            this.lineCap3 = lineCap3;
        } else {
            this.color10 = color10;
            this.thickness6 = thickness6;
            this.dashpattern3 = dashpattern3;
            this.lineJoin3 = lineJoin3;
            this.lineCap3 = lineCap3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".highStroke(%s, %f, %s, %s, %s)", ((color10 != null) ? color10.generateJs() : "null"), thickness6, wrapQuotes(dashpattern3), ((lineJoin3 != null) ? lineJoin3.generateJs() : "null"), ((lineCap3 != null) ? lineCap3.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".highStroke(%s, %f, %s, %s, %s)", ((color10 != null) ? color10.generateJs() : "null"), thickness6, wrapQuotes(dashpattern3), ((lineJoin3 != null) ? lineJoin3.generateJs() : "null"), ((lineCap3 != null) ? lineCap3.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for high stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public StateSettings setHighStroke(ColoredFill color11, Double thickness6, String dashpattern3, StrokeLineJoin lineJoin3, StrokeLineCap lineCap3) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            
            this.color11 = color11;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            
            this.thickness6 = thickness6;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            
            this.dashpattern3 = dashpattern3;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            
            this.lineJoin3 = lineJoin3;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            
            this.lineCap3 = lineCap3;
        } else {
            this.color11 = color11;
            this.thickness6 = thickness6;
            this.dashpattern3 = dashpattern3;
            this.lineJoin3 = lineJoin3;
            this.lineCap3 = lineCap3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".highStroke(%s, %f, %s, %s, %s)", ((color11 != null) ? color11.generateJs() : "null"), thickness6, wrapQuotes(dashpattern3), ((lineJoin3 != null) ? lineJoin3.generateJs() : "null"), ((lineCap3 != null) ? lineCap3.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".highStroke(%s, %f, %s, %s, %s)", ((color11 != null) ? color11.generateJs() : "null"), thickness6, wrapQuotes(dashpattern3), ((lineJoin3 != null) ? lineJoin3.generateJs() : "null"), ((lineCap3 != null) ? lineCap3.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for high stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public StateSettings setHighStroke(String color12, Double thickness6, String dashpattern3, StrokeLineJoin lineJoin3, StrokeLineCap lineCap3) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            
            this.color12 = color12;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            
            this.thickness6 = thickness6;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            
            this.dashpattern3 = dashpattern3;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            
            this.lineJoin3 = lineJoin3;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            
            this.lineCap3 = lineCap3;
        } else {
            this.color12 = color12;
            this.thickness6 = thickness6;
            this.dashpattern3 = dashpattern3;
            this.lineJoin3 = lineJoin3;
            this.lineCap3 = lineCap3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".highStroke(%s, %f, %s, %s, %s)", wrapQuotes(color12), thickness6, wrapQuotes(dashpattern3), ((lineJoin3 != null) ? lineJoin3.generateJs() : "null"), ((lineCap3 != null) ? lineCap3.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".highStroke(%s, %f, %s, %s, %s)", wrapQuotes(color12), thickness6, wrapQuotes(dashpattern3), ((lineJoin3 != null) ? lineJoin3.generateJs() : "null"), ((lineCap3 != null) ? lineCap3.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private StateSettings getHovered;

    /**
     * Getter for the hovered state.
     */
    public StateSettings getHovered() {
        if (getHovered == null)
            getHovered = new StateSettings(jsBase + ".hovered()");

        return getHovered;
    }

    private String hovered;

    /**
     * Setter for the hovered state.
     */
    public void setHovered(String hovered) {
        if (jsBase == null) {
            this.hovered = hovered;
        } else {
            this.hovered = hovered;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hovered(%s)", wrapQuotes(hovered)));
                js.setLength(0);
            }
        }
    }

    private UiLabelsFactory getLabels;

    /**
     * Getter for labels.
     */
    public UiLabelsFactory getLabels() {
        if (getLabels == null)
            getLabels = new UiLabelsFactory(jsBase + ".labels()");

        return getLabels;
    }

    private String labels;
    private Boolean labels1;

    /**
     * Setter for labels.
     */
    public StateSettings setLabels(String labels) {
        if (jsBase == null) {
            this.labels = null;
            this.labels1 = null;
            
            this.labels = labels;
        } else {
            this.labels = labels;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".labels(%s)", wrapQuotes(labels)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".labels(%s)", wrapQuotes(labels)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for labels.
     */
    public StateSettings setLabels(Boolean labels1) {
        if (jsBase == null) {
            this.labels = null;
            this.labels1 = null;
            
            this.labels1 = labels1;
        } else {
            this.labels1 = labels1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".labels(%b)", labels1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".labels(%b)", labels1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Stroke color13;
    private ColoredFill color14;
    private String color15;
    private Double thickness7;
    private String dashpattern4;
    private StrokeLineJoin lineJoin4;
    private StrokeLineCap lineCap4;

    /**
     * Setter for low stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public StateSettings setLowStroke(Stroke color13, Double thickness7, String dashpattern4, StrokeLineJoin lineJoin4, StrokeLineCap lineCap4) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            
            this.color13 = color13;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            
            this.thickness7 = thickness7;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            
            this.dashpattern4 = dashpattern4;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            
            this.lineJoin4 = lineJoin4;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            
            this.lineCap4 = lineCap4;
        } else {
            this.color13 = color13;
            this.thickness7 = thickness7;
            this.dashpattern4 = dashpattern4;
            this.lineJoin4 = lineJoin4;
            this.lineCap4 = lineCap4;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".lowStroke(%s, %f, %s, %s, %s)", ((color13 != null) ? color13.generateJs() : "null"), thickness7, wrapQuotes(dashpattern4), ((lineJoin4 != null) ? lineJoin4.generateJs() : "null"), ((lineCap4 != null) ? lineCap4.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".lowStroke(%s, %f, %s, %s, %s)", ((color13 != null) ? color13.generateJs() : "null"), thickness7, wrapQuotes(dashpattern4), ((lineJoin4 != null) ? lineJoin4.generateJs() : "null"), ((lineCap4 != null) ? lineCap4.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for low stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public StateSettings setLowStroke(ColoredFill color14, Double thickness7, String dashpattern4, StrokeLineJoin lineJoin4, StrokeLineCap lineCap4) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            
            this.color14 = color14;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            
            this.thickness7 = thickness7;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            
            this.dashpattern4 = dashpattern4;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            
            this.lineJoin4 = lineJoin4;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            
            this.lineCap4 = lineCap4;
        } else {
            this.color14 = color14;
            this.thickness7 = thickness7;
            this.dashpattern4 = dashpattern4;
            this.lineJoin4 = lineJoin4;
            this.lineCap4 = lineCap4;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".lowStroke(%s, %f, %s, %s, %s)", ((color14 != null) ? color14.generateJs() : "null"), thickness7, wrapQuotes(dashpattern4), ((lineJoin4 != null) ? lineJoin4.generateJs() : "null"), ((lineCap4 != null) ? lineCap4.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".lowStroke(%s, %f, %s, %s, %s)", ((color14 != null) ? color14.generateJs() : "null"), thickness7, wrapQuotes(dashpattern4), ((lineJoin4 != null) ? lineJoin4.generateJs() : "null"), ((lineCap4 != null) ? lineCap4.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for low stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public StateSettings setLowStroke(String color15, Double thickness7, String dashpattern4, StrokeLineJoin lineJoin4, StrokeLineCap lineCap4) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            
            this.color15 = color15;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            
            this.thickness7 = thickness7;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            
            this.dashpattern4 = dashpattern4;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            
            this.lineJoin4 = lineJoin4;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            
            this.lineCap4 = lineCap4;
        } else {
            this.color15 = color15;
            this.thickness7 = thickness7;
            this.dashpattern4 = dashpattern4;
            this.lineJoin4 = lineJoin4;
            this.lineCap4 = lineCap4;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".lowStroke(%s, %f, %s, %s, %s)", wrapQuotes(color15), thickness7, wrapQuotes(dashpattern4), ((lineJoin4 != null) ? lineJoin4.generateJs() : "null"), ((lineCap4 != null) ? lineCap4.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".lowStroke(%s, %f, %s, %s, %s)", wrapQuotes(color15), thickness7, wrapQuotes(dashpattern4), ((lineJoin4 != null) ? lineJoin4.generateJs() : "null"), ((lineCap4 != null) ? lineCap4.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private UiLabelsFactory getLowerLabels;

    /**
     * Getter for lower labels (for pert tasks).
     */
    public UiLabelsFactory getLowerLabels() {
        if (getLowerLabels == null)
            getLowerLabels = new UiLabelsFactory(jsBase + ".lowerLabels()");

        return getLowerLabels;
    }

    private String lowerLabels;
    private Boolean lowerLabels1;

    /**
     * Setter for lower labels (for pert tasks).
     */
    public StateSettings setLowerLabels(String lowerLabels) {
        if (jsBase == null) {
            this.lowerLabels = null;
            this.lowerLabels1 = null;
            
            this.lowerLabels = lowerLabels;
        } else {
            this.lowerLabels = lowerLabels;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".lowerLabels(%s)", wrapQuotes(lowerLabels)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".lowerLabels(%s)", wrapQuotes(lowerLabels)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for lower labels (for pert tasks).
     */
    public StateSettings setLowerLabels(Boolean lowerLabels1) {
        if (jsBase == null) {
            this.lowerLabels = null;
            this.lowerLabels1 = null;
            
            this.lowerLabels1 = lowerLabels1;
        } else {
            this.lowerLabels1 = lowerLabels1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".lowerLabels(%b)", lowerLabels1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".lowerLabels(%b)", lowerLabels1));
                js.setLength(0);
            }
        }
        return this;
    }

    private UiMarkersFactory getMarkers;

    /**
     * Getter for data markers.
     */
    public UiMarkersFactory getMarkers() {
        if (getMarkers == null)
            getMarkers = new UiMarkersFactory(jsBase + ".markers()");

        return getMarkers;
    }

    private String markers;
    private Boolean markers1;
    private String markers2;

    /**
     * Setter for data markers.
     */
    public StateSettings setMarkers(String markers) {
        if (jsBase == null) {
            this.markers = null;
            this.markers1 = null;
            this.markers2 = null;
            
            this.markers = markers;
        } else {
            this.markers = markers;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".markers(%s)", wrapQuotes(markers)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".markers(%s)", wrapQuotes(markers)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for data markers.
     */
    public StateSettings setMarkers(Boolean markers1) {
        if (jsBase == null) {
            this.markers = null;
            this.markers1 = null;
            this.markers2 = null;
            
            this.markers1 = markers1;
        } else {
            this.markers1 = markers1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".markers(%b)", markers1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".markers(%b)", markers1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Stroke color16;
    private ColoredFill color17;
    private String color18;
    private Double thickness8;
    private String dashpattern5;
    private StrokeLineJoin lineJoin5;
    private StrokeLineCap lineCap5;

    /**
     * Setter for median stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public StateSettings setMedianStroke(Stroke color16, Double thickness8, String dashpattern5, StrokeLineJoin lineJoin5, StrokeLineCap lineCap5) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            
            this.color16 = color16;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            
            this.thickness8 = thickness8;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            this.dashpattern5 = null;
            
            this.dashpattern5 = dashpattern5;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            this.lineJoin5 = null;
            
            this.lineJoin5 = lineJoin5;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            this.lineCap5 = null;
            
            this.lineCap5 = lineCap5;
        } else {
            this.color16 = color16;
            this.thickness8 = thickness8;
            this.dashpattern5 = dashpattern5;
            this.lineJoin5 = lineJoin5;
            this.lineCap5 = lineCap5;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".medianStroke(%s, %f, %s, %s, %s)", ((color16 != null) ? color16.generateJs() : "null"), thickness8, wrapQuotes(dashpattern5), ((lineJoin5 != null) ? lineJoin5.generateJs() : "null"), ((lineCap5 != null) ? lineCap5.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".medianStroke(%s, %f, %s, %s, %s)", ((color16 != null) ? color16.generateJs() : "null"), thickness8, wrapQuotes(dashpattern5), ((lineJoin5 != null) ? lineJoin5.generateJs() : "null"), ((lineCap5 != null) ? lineCap5.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for median stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public StateSettings setMedianStroke(ColoredFill color17, Double thickness8, String dashpattern5, StrokeLineJoin lineJoin5, StrokeLineCap lineCap5) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            
            this.color17 = color17;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            
            this.thickness8 = thickness8;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            this.dashpattern5 = null;
            
            this.dashpattern5 = dashpattern5;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            this.lineJoin5 = null;
            
            this.lineJoin5 = lineJoin5;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            this.lineCap5 = null;
            
            this.lineCap5 = lineCap5;
        } else {
            this.color17 = color17;
            this.thickness8 = thickness8;
            this.dashpattern5 = dashpattern5;
            this.lineJoin5 = lineJoin5;
            this.lineCap5 = lineCap5;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".medianStroke(%s, %f, %s, %s, %s)", ((color17 != null) ? color17.generateJs() : "null"), thickness8, wrapQuotes(dashpattern5), ((lineJoin5 != null) ? lineJoin5.generateJs() : "null"), ((lineCap5 != null) ? lineCap5.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".medianStroke(%s, %f, %s, %s, %s)", ((color17 != null) ? color17.generateJs() : "null"), thickness8, wrapQuotes(dashpattern5), ((lineJoin5 != null) ? lineJoin5.generateJs() : "null"), ((lineCap5 != null) ? lineCap5.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for median stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public StateSettings setMedianStroke(String color18, Double thickness8, String dashpattern5, StrokeLineJoin lineJoin5, StrokeLineCap lineCap5) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            
            this.color18 = color18;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            
            this.thickness8 = thickness8;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            this.dashpattern5 = null;
            
            this.dashpattern5 = dashpattern5;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            this.lineJoin5 = null;
            
            this.lineJoin5 = lineJoin5;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            this.lineCap5 = null;
            
            this.lineCap5 = lineCap5;
        } else {
            this.color18 = color18;
            this.thickness8 = thickness8;
            this.dashpattern5 = dashpattern5;
            this.lineJoin5 = lineJoin5;
            this.lineCap5 = lineCap5;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".medianStroke(%s, %f, %s, %s, %s)", wrapQuotes(color18), thickness8, wrapQuotes(dashpattern5), ((lineJoin5 != null) ? lineJoin5.generateJs() : "null"), ((lineCap5 != null) ? lineCap5.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".medianStroke(%s, %f, %s, %s, %s)", wrapQuotes(color18), thickness8, wrapQuotes(dashpattern5), ((lineJoin5 != null) ? lineJoin5.generateJs() : "null"), ((lineCap5 != null) ? lineCap5.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private Fill negativeFill;

    /**
     * Setter for negative fill settings using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public StateSettings setNegativeFill(Fill negativeFill) {
        if (jsBase == null) {
            this.negativeFill = negativeFill;
        } else {
            this.negativeFill = negativeFill;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".negativeFill(%s)", ((negativeFill != null) ? negativeFill.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".negativeFill(%s)", ((negativeFill != null) ? negativeFill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private String color19;
    private Double opacity10;

    /**
     * Negative fill color with opacity.
     */
    public StateSettings negativeFill(String color19, Double opacity10) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            
            this.color19 = color19;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            
            this.opacity10 = opacity10;
        } else {
            this.color19 = color19;
            this.opacity10 = opacity10;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".negativeFill(%s, %f)", wrapQuotes(color19), opacity10));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".negativeFill(%s, %f)", wrapQuotes(color19), opacity10));
                js.setLength(0);
            }
        }
        return this;
    }

    private GradientKey[] keys12;
    private String[] keys13;
    private Double angle3;
    private Boolean mode12;
    private VectorRect mode13;
    private String mode14;
    private Double opacity11;

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public StateSettings negativeFill(GradientKey[] keys12, Boolean mode12, Double angle3, Double opacity11) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            
            this.keys12 = keys12;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            
            this.mode12 = mode12;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            
            this.angle3 = angle3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            
            this.opacity11 = opacity11;
        } else {
            this.keys12 = keys12;
            this.mode12 = mode12;
            this.angle3 = angle3;
            this.opacity11 = opacity11;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".negativeFill(%s, %b, %f, %f)", arrayToString(keys12), mode12, angle3, opacity11));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".negativeFill(%s, %b, %f, %f)", arrayToString(keys12), mode12, angle3, opacity11));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public StateSettings negativeFill(GradientKey[] keys12, VectorRect mode13, Double angle3, Double opacity11) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            
            this.keys12 = keys12;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            
            this.mode13 = mode13;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            
            this.angle3 = angle3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            
            this.opacity11 = opacity11;
        } else {
            this.keys12 = keys12;
            this.mode13 = mode13;
            this.angle3 = angle3;
            this.opacity11 = opacity11;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".negativeFill(%s, %s, %f, %f)", arrayToString(keys12), ((mode13 != null) ? mode13.generateJs() : "null"), angle3, opacity11));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".negativeFill(%s, %s, %f, %f)", arrayToString(keys12), ((mode13 != null) ? mode13.generateJs() : "null"), angle3, opacity11));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public StateSettings negativeFill(GradientKey[] keys12, String mode14, Double angle3, Double opacity11) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            
            this.keys12 = keys12;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            
            this.mode14 = mode14;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            
            this.angle3 = angle3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            
            this.opacity11 = opacity11;
        } else {
            this.keys12 = keys12;
            this.mode14 = mode14;
            this.angle3 = angle3;
            this.opacity11 = opacity11;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".negativeFill(%s, %s, %f, %f)", arrayToString(keys12), wrapQuotes(mode14), angle3, opacity11));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".negativeFill(%s, %s, %f, %f)", arrayToString(keys12), wrapQuotes(mode14), angle3, opacity11));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public StateSettings negativeFill(String[] keys13, Boolean mode12, Double angle3, Double opacity11) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            
            this.keys13 = keys13;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            
            this.mode12 = mode12;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            
            this.angle3 = angle3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            
            this.opacity11 = opacity11;
        } else {
            this.keys13 = keys13;
            this.mode12 = mode12;
            this.angle3 = angle3;
            this.opacity11 = opacity11;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".negativeFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys13), mode12, angle3, opacity11));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".negativeFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys13), mode12, angle3, opacity11));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public StateSettings negativeFill(String[] keys13, VectorRect mode13, Double angle3, Double opacity11) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            
            this.keys13 = keys13;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            
            this.mode13 = mode13;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            
            this.angle3 = angle3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            
            this.opacity11 = opacity11;
        } else {
            this.keys13 = keys13;
            this.mode13 = mode13;
            this.angle3 = angle3;
            this.opacity11 = opacity11;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".negativeFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys13), ((mode13 != null) ? mode13.generateJs() : "null"), angle3, opacity11));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".negativeFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys13), ((mode13 != null) ? mode13.generateJs() : "null"), angle3, opacity11));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public StateSettings negativeFill(String[] keys13, String mode14, Double angle3, Double opacity11) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            
            this.keys13 = keys13;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            
            this.mode14 = mode14;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            
            this.angle3 = angle3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            
            this.opacity11 = opacity11;
        } else {
            this.keys13 = keys13;
            this.mode14 = mode14;
            this.angle3 = angle3;
            this.opacity11 = opacity11;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".negativeFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys13), wrapQuotes(mode14), angle3, opacity11));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".negativeFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys13), wrapQuotes(mode14), angle3, opacity11));
                js.setLength(0);
            }
        }
        return this;
    }

    private GradientKey[] keys14;
    private String[] keys15;
    private Double cx3;
    private Double cy3;
    private GraphicsMathRect mode15;
    private Double opacity12;
    private Double fx3;
    private Double fy3;

    /**
     * Radial gradient negative fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public StateSettings negativeFill(GradientKey[] keys14, Double cx3, Double cy3, GraphicsMathRect mode15, Double opacity12, Double fx3, Double fy3) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            
            this.keys14 = keys14;
            this.cx = null;
            this.cx1 = null;
            this.cx2 = null;
            this.cx3 = null;
            
            this.cx3 = cx3;
            this.cy = null;
            this.cy1 = null;
            this.cy2 = null;
            this.cy3 = null;
            
            this.cy3 = cy3;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            
            this.mode15 = mode15;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            
            this.opacity12 = opacity12;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            
            this.fx3 = fx3;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            
            this.fy3 = fy3;
        } else {
            this.keys14 = keys14;
            this.cx3 = cx3;
            this.cy3 = cy3;
            this.mode15 = mode15;
            this.opacity12 = opacity12;
            this.fx3 = fx3;
            this.fy3 = fy3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".negativeFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys14), cx3, cy3, ((mode15 != null) ? mode15.generateJs() : "null"), opacity12, fx3, fy3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".negativeFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys14), cx3, cy3, ((mode15 != null) ? mode15.generateJs() : "null"), opacity12, fx3, fy3));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Radial gradient negative fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public StateSettings negativeFill(String[] keys15, Double cx3, Double cy3, GraphicsMathRect mode15, Double opacity12, Double fx3, Double fy3) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            
            this.keys15 = keys15;
            this.cx = null;
            this.cx1 = null;
            this.cx2 = null;
            this.cx3 = null;
            
            this.cx3 = cx3;
            this.cy = null;
            this.cy1 = null;
            this.cy2 = null;
            this.cy3 = null;
            
            this.cy3 = cy3;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            
            this.mode15 = mode15;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            
            this.opacity12 = opacity12;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            
            this.fx3 = fx3;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            
            this.fy3 = fy3;
        } else {
            this.keys15 = keys15;
            this.cx3 = cx3;
            this.cy3 = cy3;
            this.mode15 = mode15;
            this.opacity12 = opacity12;
            this.fx3 = fx3;
            this.fy3 = fy3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".negativeFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys15), cx3, cy3, ((mode15 != null) ? mode15.generateJs() : "null"), opacity12, fx3, fy3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".negativeFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys15), cx3, cy3, ((mode15 != null) ? mode15.generateJs() : "null"), opacity12, fx3, fy3));
                js.setLength(0);
            }
        }
        return this;
    }

    private Fill imageSettings3;
    private PatternFill getNegativeHatchFill;

    /**
     * Getter for negative hatch fill settings.
     */
    public PatternFill getNegativeHatchFill() {
        if (getNegativeHatchFill == null)
            getNegativeHatchFill = new PatternFill(jsBase + ".negativeHatchFill()");

        return getNegativeHatchFill;
    }

    private PatternFill patternFillOrType9;
    private HatchFill patternFillOrType10;
    private HatchFillType patternFillOrType11;
    private String patternFillOrType12;
    private String color20;
    private Double thickness9;
    private Double size3;

    /**
     * Setter for negative hatch fill settings.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public StateSettings setNegativeHatchFill(PatternFill patternFillOrType9, String color20, Double thickness9, Double size3) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            this.patternFillOrType4 = null;
            this.patternFillOrType5 = null;
            this.patternFillOrType6 = null;
            this.patternFillOrType7 = null;
            this.patternFillOrType8 = null;
            this.patternFillOrType9 = null;
            this.patternFillOrType10 = null;
            this.patternFillOrType11 = null;
            this.patternFillOrType12 = null;
            
            this.patternFillOrType9 = patternFillOrType9;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            this.color20 = null;
            
            this.color20 = color20;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            
            this.thickness9 = thickness9;
            this.size = null;
            this.size1 = null;
            this.size2 = null;
            this.size3 = null;
            
            this.size3 = size3;
        } else {
            this.patternFillOrType9 = patternFillOrType9;
            this.color20 = color20;
            this.thickness9 = thickness9;
            this.size3 = size3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".negativeHatchFill(%s, %s, %f, %f)", ((patternFillOrType9 != null) ? patternFillOrType9.generateJs() : "null"), wrapQuotes(color20), thickness9, size3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".negativeHatchFill(%s, %s, %f, %f)", ((patternFillOrType9 != null) ? patternFillOrType9.generateJs() : "null"), wrapQuotes(color20), thickness9, size3));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for negative hatch fill settings.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public StateSettings setNegativeHatchFill(HatchFill patternFillOrType10, String color20, Double thickness9, Double size3) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            this.patternFillOrType4 = null;
            this.patternFillOrType5 = null;
            this.patternFillOrType6 = null;
            this.patternFillOrType7 = null;
            this.patternFillOrType8 = null;
            this.patternFillOrType9 = null;
            this.patternFillOrType10 = null;
            this.patternFillOrType11 = null;
            this.patternFillOrType12 = null;
            
            this.patternFillOrType10 = patternFillOrType10;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            this.color20 = null;
            
            this.color20 = color20;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            
            this.thickness9 = thickness9;
            this.size = null;
            this.size1 = null;
            this.size2 = null;
            this.size3 = null;
            
            this.size3 = size3;
        } else {
            this.patternFillOrType10 = patternFillOrType10;
            this.color20 = color20;
            this.thickness9 = thickness9;
            this.size3 = size3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".negativeHatchFill(%s, %s, %f, %f)", ((patternFillOrType10 != null) ? patternFillOrType10.generateJs() : "null"), wrapQuotes(color20), thickness9, size3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".negativeHatchFill(%s, %s, %f, %f)", ((patternFillOrType10 != null) ? patternFillOrType10.generateJs() : "null"), wrapQuotes(color20), thickness9, size3));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for negative hatch fill settings.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public StateSettings setNegativeHatchFill(HatchFillType patternFillOrType11, String color20, Double thickness9, Double size3) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            this.patternFillOrType4 = null;
            this.patternFillOrType5 = null;
            this.patternFillOrType6 = null;
            this.patternFillOrType7 = null;
            this.patternFillOrType8 = null;
            this.patternFillOrType9 = null;
            this.patternFillOrType10 = null;
            this.patternFillOrType11 = null;
            this.patternFillOrType12 = null;
            
            this.patternFillOrType11 = patternFillOrType11;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            this.color20 = null;
            
            this.color20 = color20;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            
            this.thickness9 = thickness9;
            this.size = null;
            this.size1 = null;
            this.size2 = null;
            this.size3 = null;
            
            this.size3 = size3;
        } else {
            this.patternFillOrType11 = patternFillOrType11;
            this.color20 = color20;
            this.thickness9 = thickness9;
            this.size3 = size3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".negativeHatchFill(%s, %s, %f, %f)", ((patternFillOrType11 != null) ? patternFillOrType11.generateJs() : "null"), wrapQuotes(color20), thickness9, size3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".negativeHatchFill(%s, %s, %f, %f)", ((patternFillOrType11 != null) ? patternFillOrType11.generateJs() : "null"), wrapQuotes(color20), thickness9, size3));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for negative hatch fill settings.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public StateSettings setNegativeHatchFill(String patternFillOrType12, String color20, Double thickness9, Double size3) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            this.patternFillOrType4 = null;
            this.patternFillOrType5 = null;
            this.patternFillOrType6 = null;
            this.patternFillOrType7 = null;
            this.patternFillOrType8 = null;
            this.patternFillOrType9 = null;
            this.patternFillOrType10 = null;
            this.patternFillOrType11 = null;
            this.patternFillOrType12 = null;
            
            this.patternFillOrType12 = patternFillOrType12;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            this.color20 = null;
            
            this.color20 = color20;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            
            this.thickness9 = thickness9;
            this.size = null;
            this.size1 = null;
            this.size2 = null;
            this.size3 = null;
            
            this.size3 = size3;
        } else {
            this.patternFillOrType12 = patternFillOrType12;
            this.color20 = color20;
            this.thickness9 = thickness9;
            this.size3 = size3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".negativeHatchFill(%s, %s, %f, %f)", wrapQuotes(patternFillOrType12), wrapQuotes(color20), thickness9, size3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".negativeHatchFill(%s, %s, %f, %f)", wrapQuotes(patternFillOrType12), wrapQuotes(color20), thickness9, size3));
                js.setLength(0);
            }
        }
        return this;
    }

    private Stroke color21;
    private ColoredFill color22;
    private String color23;
    private Double thickness10;
    private String dashpattern6;
    private StrokeLineJoin lineJoin6;
    private StrokeLineCap lineCap6;

    /**
     * Setter for stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public StateSettings setNegativeStroke(Stroke color21, Double thickness10, String dashpattern6, StrokeLineJoin lineJoin6, StrokeLineCap lineCap6) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            this.color20 = null;
            this.color21 = null;
            this.color22 = null;
            this.color23 = null;
            
            this.color21 = color21;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            this.thickness10 = null;
            
            this.thickness10 = thickness10;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            this.dashpattern5 = null;
            this.dashpattern6 = null;
            
            this.dashpattern6 = dashpattern6;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            this.lineJoin5 = null;
            this.lineJoin6 = null;
            
            this.lineJoin6 = lineJoin6;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            this.lineCap5 = null;
            this.lineCap6 = null;
            
            this.lineCap6 = lineCap6;
        } else {
            this.color21 = color21;
            this.thickness10 = thickness10;
            this.dashpattern6 = dashpattern6;
            this.lineJoin6 = lineJoin6;
            this.lineCap6 = lineCap6;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".negativeStroke(%s, %f, %s, %s, %s)", ((color21 != null) ? color21.generateJs() : "null"), thickness10, wrapQuotes(dashpattern6), ((lineJoin6 != null) ? lineJoin6.generateJs() : "null"), ((lineCap6 != null) ? lineCap6.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".negativeStroke(%s, %f, %s, %s, %s)", ((color21 != null) ? color21.generateJs() : "null"), thickness10, wrapQuotes(dashpattern6), ((lineJoin6 != null) ? lineJoin6.generateJs() : "null"), ((lineCap6 != null) ? lineCap6.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public StateSettings setNegativeStroke(ColoredFill color22, Double thickness10, String dashpattern6, StrokeLineJoin lineJoin6, StrokeLineCap lineCap6) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            this.color20 = null;
            this.color21 = null;
            this.color22 = null;
            this.color23 = null;
            
            this.color22 = color22;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            this.thickness10 = null;
            
            this.thickness10 = thickness10;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            this.dashpattern5 = null;
            this.dashpattern6 = null;
            
            this.dashpattern6 = dashpattern6;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            this.lineJoin5 = null;
            this.lineJoin6 = null;
            
            this.lineJoin6 = lineJoin6;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            this.lineCap5 = null;
            this.lineCap6 = null;
            
            this.lineCap6 = lineCap6;
        } else {
            this.color22 = color22;
            this.thickness10 = thickness10;
            this.dashpattern6 = dashpattern6;
            this.lineJoin6 = lineJoin6;
            this.lineCap6 = lineCap6;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".negativeStroke(%s, %f, %s, %s, %s)", ((color22 != null) ? color22.generateJs() : "null"), thickness10, wrapQuotes(dashpattern6), ((lineJoin6 != null) ? lineJoin6.generateJs() : "null"), ((lineCap6 != null) ? lineCap6.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".negativeStroke(%s, %f, %s, %s, %s)", ((color22 != null) ? color22.generateJs() : "null"), thickness10, wrapQuotes(dashpattern6), ((lineJoin6 != null) ? lineJoin6.generateJs() : "null"), ((lineCap6 != null) ? lineCap6.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public StateSettings setNegativeStroke(String color23, Double thickness10, String dashpattern6, StrokeLineJoin lineJoin6, StrokeLineCap lineCap6) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            this.color20 = null;
            this.color21 = null;
            this.color22 = null;
            this.color23 = null;
            
            this.color23 = color23;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            this.thickness10 = null;
            
            this.thickness10 = thickness10;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            this.dashpattern5 = null;
            this.dashpattern6 = null;
            
            this.dashpattern6 = dashpattern6;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            this.lineJoin5 = null;
            this.lineJoin6 = null;
            
            this.lineJoin6 = lineJoin6;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            this.lineCap5 = null;
            this.lineCap6 = null;
            
            this.lineCap6 = lineCap6;
        } else {
            this.color23 = color23;
            this.thickness10 = thickness10;
            this.dashpattern6 = dashpattern6;
            this.lineJoin6 = lineJoin6;
            this.lineCap6 = lineCap6;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".negativeStroke(%s, %f, %s, %s, %s)", wrapQuotes(color23), thickness10, wrapQuotes(dashpattern6), ((lineJoin6 != null) ? lineJoin6.generateJs() : "null"), ((lineCap6 != null) ? lineCap6.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".negativeStroke(%s, %f, %s, %s, %s)", wrapQuotes(color23), thickness10, wrapQuotes(dashpattern6), ((lineJoin6 != null) ? lineJoin6.generateJs() : "null"), ((lineCap6 != null) ? lineCap6.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private StateSettings getNormal;

    /**
     * Getter for the normal state.
     */
    public StateSettings getNormal() {
        if (getNormal == null)
            getNormal = new StateSettings(jsBase + ".normal()");

        return getNormal;
    }

    private String normal;

    /**
     * Setter for the normal state.
     */
    public void setNormal(String normal) {
        if (jsBase == null) {
            this.normal = normal;
        } else {
            this.normal = normal;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".normal(%s)", wrapQuotes(normal)));
                js.setLength(0);
            }
        }
    }

    private UiMarkersFactory getOutlierMarkers;

    /**
     * Getter for series outlier markers.
     */
    public UiMarkersFactory getOutlierMarkers() {
        if (getOutlierMarkers == null)
            getOutlierMarkers = new UiMarkersFactory(jsBase + ".outlierMarkers()");

        return getOutlierMarkers;
    }

    private String outlierMarkers;
    private Boolean outlierMarkers1;
    private String outlierMarkers2;

    /**
     * Setter for series outlier markers.
     */
    public StateSettings setOutlierMarkers(String outlierMarkers) {
        if (jsBase == null) {
            this.outlierMarkers = null;
            this.outlierMarkers1 = null;
            this.outlierMarkers2 = null;
            
            this.outlierMarkers = outlierMarkers;
        } else {
            this.outlierMarkers = outlierMarkers;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".outlierMarkers(%s)", wrapQuotes(outlierMarkers)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".outlierMarkers(%s)", wrapQuotes(outlierMarkers)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for series outlier markers.
     */
    public StateSettings setOutlierMarkers(Boolean outlierMarkers1) {
        if (jsBase == null) {
            this.outlierMarkers = null;
            this.outlierMarkers1 = null;
            this.outlierMarkers2 = null;
            
            this.outlierMarkers1 = outlierMarkers1;
        } else {
            this.outlierMarkers1 = outlierMarkers1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".outlierMarkers(%b)", outlierMarkers1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".outlierMarkers(%b)", outlierMarkers1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Fill risingFill;

    /**
     * Setter for the rising fill settings using an array or a string.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public ScrollerseriesBase setRisingFill(Fill risingFill) {
        if (jsBase == null) {
            this.risingFill = risingFill;
        } else {
            this.risingFill = risingFill;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".risingFill(%s)", ((risingFill != null) ? risingFill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return new ScrollerseriesBase(jsBase);
    }

    private String color24;
    private Double opacity13;

    /**
     * Rising fill color with opacity.
     */
    public ScrollerseriesBase risingFill(String color24, Double opacity13) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            this.color20 = null;
            this.color21 = null;
            this.color22 = null;
            this.color23 = null;
            this.color24 = null;
            
            this.color24 = color24;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            
            this.opacity13 = opacity13;
        } else {
            this.color24 = color24;
            this.opacity13 = opacity13;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".risingFill(%s, %f)", wrapQuotes(color24), opacity13));
                js.setLength(0);
            }
        }
        return new ScrollerseriesBase(jsBase);
    }

    private GradientKey[] keys16;
    private String[] keys17;
    private Double angle4;
    private Boolean mode16;
    private VectorRect mode17;
    private String mode18;
    private Double opacity14;

    /**
     * Linear gradient rising fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ScrollerseriesBase risingFill(GradientKey[] keys16, Boolean mode16, Double angle4, Double opacity14) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            
            this.keys16 = keys16;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            
            this.mode16 = mode16;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            
            this.angle4 = angle4;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            
            this.opacity14 = opacity14;
        } else {
            this.keys16 = keys16;
            this.mode16 = mode16;
            this.angle4 = angle4;
            this.opacity14 = opacity14;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".risingFill(%s, %b, %f, %f)", arrayToString(keys16), mode16, angle4, opacity14));
                js.setLength(0);
            }
        }
        return new ScrollerseriesBase(jsBase);
    }


    /**
     * Linear gradient rising fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ScrollerseriesBase risingFill(GradientKey[] keys16, VectorRect mode17, Double angle4, Double opacity14) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            
            this.keys16 = keys16;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            
            this.mode17 = mode17;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            
            this.angle4 = angle4;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            
            this.opacity14 = opacity14;
        } else {
            this.keys16 = keys16;
            this.mode17 = mode17;
            this.angle4 = angle4;
            this.opacity14 = opacity14;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".risingFill(%s, %s, %f, %f)", arrayToString(keys16), ((mode17 != null) ? mode17.generateJs() : "null"), angle4, opacity14));
                js.setLength(0);
            }
        }
        return new ScrollerseriesBase(jsBase);
    }


    /**
     * Linear gradient rising fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ScrollerseriesBase risingFill(GradientKey[] keys16, String mode18, Double angle4, Double opacity14) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            
            this.keys16 = keys16;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            
            this.mode18 = mode18;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            
            this.angle4 = angle4;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            
            this.opacity14 = opacity14;
        } else {
            this.keys16 = keys16;
            this.mode18 = mode18;
            this.angle4 = angle4;
            this.opacity14 = opacity14;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".risingFill(%s, %s, %f, %f)", arrayToString(keys16), wrapQuotes(mode18), angle4, opacity14));
                js.setLength(0);
            }
        }
        return new ScrollerseriesBase(jsBase);
    }


    /**
     * Linear gradient rising fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ScrollerseriesBase risingFill(String[] keys17, Boolean mode16, Double angle4, Double opacity14) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            
            this.keys17 = keys17;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            
            this.mode16 = mode16;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            
            this.angle4 = angle4;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            
            this.opacity14 = opacity14;
        } else {
            this.keys17 = keys17;
            this.mode16 = mode16;
            this.angle4 = angle4;
            this.opacity14 = opacity14;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".risingFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys17), mode16, angle4, opacity14));
                js.setLength(0);
            }
        }
        return new ScrollerseriesBase(jsBase);
    }


    /**
     * Linear gradient rising fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ScrollerseriesBase risingFill(String[] keys17, VectorRect mode17, Double angle4, Double opacity14) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            
            this.keys17 = keys17;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            
            this.mode17 = mode17;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            
            this.angle4 = angle4;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            
            this.opacity14 = opacity14;
        } else {
            this.keys17 = keys17;
            this.mode17 = mode17;
            this.angle4 = angle4;
            this.opacity14 = opacity14;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".risingFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys17), ((mode17 != null) ? mode17.generateJs() : "null"), angle4, opacity14));
                js.setLength(0);
            }
        }
        return new ScrollerseriesBase(jsBase);
    }


    /**
     * Linear gradient rising fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ScrollerseriesBase risingFill(String[] keys17, String mode18, Double angle4, Double opacity14) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            
            this.keys17 = keys17;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            
            this.mode18 = mode18;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            
            this.angle4 = angle4;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            
            this.opacity14 = opacity14;
        } else {
            this.keys17 = keys17;
            this.mode18 = mode18;
            this.angle4 = angle4;
            this.opacity14 = opacity14;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".risingFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys17), wrapQuotes(mode18), angle4, opacity14));
                js.setLength(0);
            }
        }
        return new ScrollerseriesBase(jsBase);
    }

    private GradientKey[] keys18;
    private String[] keys19;
    private Double cx4;
    private Double cy4;
    private GraphicsMathRect mode19;
    private Double opacity15;
    private Double fx4;
    private Double fy4;

    /**
     * Radial gradient rising fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public StateSettings risingFill(GradientKey[] keys18, Double cx4, Double cy4, GraphicsMathRect mode19, Double opacity15, Double fx4, Double fy4) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            
            this.keys18 = keys18;
            this.cx = null;
            this.cx1 = null;
            this.cx2 = null;
            this.cx3 = null;
            this.cx4 = null;
            
            this.cx4 = cx4;
            this.cy = null;
            this.cy1 = null;
            this.cy2 = null;
            this.cy3 = null;
            this.cy4 = null;
            
            this.cy4 = cy4;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            
            this.mode19 = mode19;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            
            this.opacity15 = opacity15;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            this.fx4 = null;
            
            this.fx4 = fx4;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            this.fy4 = null;
            
            this.fy4 = fy4;
        } else {
            this.keys18 = keys18;
            this.cx4 = cx4;
            this.cy4 = cy4;
            this.mode19 = mode19;
            this.opacity15 = opacity15;
            this.fx4 = fx4;
            this.fy4 = fy4;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".risingFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys18), cx4, cy4, ((mode19 != null) ? mode19.generateJs() : "null"), opacity15, fx4, fy4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".risingFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys18), cx4, cy4, ((mode19 != null) ? mode19.generateJs() : "null"), opacity15, fx4, fy4));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Radial gradient rising fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public StateSettings risingFill(String[] keys19, Double cx4, Double cy4, GraphicsMathRect mode19, Double opacity15, Double fx4, Double fy4) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            
            this.keys19 = keys19;
            this.cx = null;
            this.cx1 = null;
            this.cx2 = null;
            this.cx3 = null;
            this.cx4 = null;
            
            this.cx4 = cx4;
            this.cy = null;
            this.cy1 = null;
            this.cy2 = null;
            this.cy3 = null;
            this.cy4 = null;
            
            this.cy4 = cy4;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            
            this.mode19 = mode19;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            
            this.opacity15 = opacity15;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            this.fx4 = null;
            
            this.fx4 = fx4;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            this.fy4 = null;
            
            this.fy4 = fy4;
        } else {
            this.keys19 = keys19;
            this.cx4 = cx4;
            this.cy4 = cy4;
            this.mode19 = mode19;
            this.opacity15 = opacity15;
            this.fx4 = fx4;
            this.fy4 = fy4;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".risingFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys19), cx4, cy4, ((mode19 != null) ? mode19.generateJs() : "null"), opacity15, fx4, fy4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".risingFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys19), cx4, cy4, ((mode19 != null) ? mode19.generateJs() : "null"), opacity15, fx4, fy4));
                js.setLength(0);
            }
        }
        return this;
    }

    private Fill imageSettings4;
    private PatternFill getRisingHatchFill;

    /**
     * Getter for the rising hatch fill.
     */
    public PatternFill getRisingHatchFill() {
        if (getRisingHatchFill == null)
            getRisingHatchFill = new PatternFill(jsBase + ".risingHatchFill()");

        return getRisingHatchFill;
    }

    private PatternFill patternFillOrTypeOrState5;
    private HatchFill patternFillOrTypeOrState6;
    private HatchFillType patternFillOrTypeOrState7;
    private String patternFillOrTypeOrState8;
    private Boolean patternFillOrTypeOrState9;
    private String color25;
    private Double thickness11;
    private Double size4;

    /**
     * Setter for rising hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public ScrollerseriesBase setRisingHatchFill(PatternFill patternFillOrTypeOrState5, String color25, Double thickness11, Double size4) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            this.patternFillOrTypeOrState5 = null;
            this.patternFillOrTypeOrState6 = null;
            this.patternFillOrTypeOrState7 = null;
            this.patternFillOrTypeOrState8 = null;
            this.patternFillOrTypeOrState9 = null;
            
            this.patternFillOrTypeOrState5 = patternFillOrTypeOrState5;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            this.color20 = null;
            this.color21 = null;
            this.color22 = null;
            this.color23 = null;
            this.color24 = null;
            this.color25 = null;
            
            this.color25 = color25;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            this.thickness10 = null;
            this.thickness11 = null;
            
            this.thickness11 = thickness11;
            this.size = null;
            this.size1 = null;
            this.size2 = null;
            this.size3 = null;
            this.size4 = null;
            
            this.size4 = size4;
        } else {
            this.patternFillOrTypeOrState5 = patternFillOrTypeOrState5;
            this.color25 = color25;
            this.thickness11 = thickness11;
            this.size4 = size4;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".risingHatchFill(%s, %s, %f, %f)", ((patternFillOrTypeOrState5 != null) ? patternFillOrTypeOrState5.generateJs() : "null"), wrapQuotes(color25), thickness11, size4));
                js.setLength(0);
            }
        }
        return new ScrollerseriesBase(jsBase);
    }


    /**
     * Setter for rising hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public ScrollerseriesBase setRisingHatchFill(HatchFill patternFillOrTypeOrState6, String color25, Double thickness11, Double size4) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            this.patternFillOrTypeOrState5 = null;
            this.patternFillOrTypeOrState6 = null;
            this.patternFillOrTypeOrState7 = null;
            this.patternFillOrTypeOrState8 = null;
            this.patternFillOrTypeOrState9 = null;
            
            this.patternFillOrTypeOrState6 = patternFillOrTypeOrState6;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            this.color20 = null;
            this.color21 = null;
            this.color22 = null;
            this.color23 = null;
            this.color24 = null;
            this.color25 = null;
            
            this.color25 = color25;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            this.thickness10 = null;
            this.thickness11 = null;
            
            this.thickness11 = thickness11;
            this.size = null;
            this.size1 = null;
            this.size2 = null;
            this.size3 = null;
            this.size4 = null;
            
            this.size4 = size4;
        } else {
            this.patternFillOrTypeOrState6 = patternFillOrTypeOrState6;
            this.color25 = color25;
            this.thickness11 = thickness11;
            this.size4 = size4;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".risingHatchFill(%s, %s, %f, %f)", ((patternFillOrTypeOrState6 != null) ? patternFillOrTypeOrState6.generateJs() : "null"), wrapQuotes(color25), thickness11, size4));
                js.setLength(0);
            }
        }
        return new ScrollerseriesBase(jsBase);
    }


    /**
     * Setter for rising hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public ScrollerseriesBase setRisingHatchFill(HatchFillType patternFillOrTypeOrState7, String color25, Double thickness11, Double size4) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            this.patternFillOrTypeOrState5 = null;
            this.patternFillOrTypeOrState6 = null;
            this.patternFillOrTypeOrState7 = null;
            this.patternFillOrTypeOrState8 = null;
            this.patternFillOrTypeOrState9 = null;
            
            this.patternFillOrTypeOrState7 = patternFillOrTypeOrState7;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            this.color20 = null;
            this.color21 = null;
            this.color22 = null;
            this.color23 = null;
            this.color24 = null;
            this.color25 = null;
            
            this.color25 = color25;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            this.thickness10 = null;
            this.thickness11 = null;
            
            this.thickness11 = thickness11;
            this.size = null;
            this.size1 = null;
            this.size2 = null;
            this.size3 = null;
            this.size4 = null;
            
            this.size4 = size4;
        } else {
            this.patternFillOrTypeOrState7 = patternFillOrTypeOrState7;
            this.color25 = color25;
            this.thickness11 = thickness11;
            this.size4 = size4;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".risingHatchFill(%s, %s, %f, %f)", ((patternFillOrTypeOrState7 != null) ? patternFillOrTypeOrState7.generateJs() : "null"), wrapQuotes(color25), thickness11, size4));
                js.setLength(0);
            }
        }
        return new ScrollerseriesBase(jsBase);
    }


    /**
     * Setter for rising hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public ScrollerseriesBase setRisingHatchFill(String patternFillOrTypeOrState8, String color25, Double thickness11, Double size4) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            this.patternFillOrTypeOrState5 = null;
            this.patternFillOrTypeOrState6 = null;
            this.patternFillOrTypeOrState7 = null;
            this.patternFillOrTypeOrState8 = null;
            this.patternFillOrTypeOrState9 = null;
            
            this.patternFillOrTypeOrState8 = patternFillOrTypeOrState8;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            this.color20 = null;
            this.color21 = null;
            this.color22 = null;
            this.color23 = null;
            this.color24 = null;
            this.color25 = null;
            
            this.color25 = color25;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            this.thickness10 = null;
            this.thickness11 = null;
            
            this.thickness11 = thickness11;
            this.size = null;
            this.size1 = null;
            this.size2 = null;
            this.size3 = null;
            this.size4 = null;
            
            this.size4 = size4;
        } else {
            this.patternFillOrTypeOrState8 = patternFillOrTypeOrState8;
            this.color25 = color25;
            this.thickness11 = thickness11;
            this.size4 = size4;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".risingHatchFill(%s, %s, %f, %f)", wrapQuotes(patternFillOrTypeOrState8), wrapQuotes(color25), thickness11, size4));
                js.setLength(0);
            }
        }
        return new ScrollerseriesBase(jsBase);
    }


    /**
     * Setter for rising hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public ScrollerseriesBase setRisingHatchFill(Boolean patternFillOrTypeOrState9, String color25, Double thickness11, Double size4) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            this.patternFillOrTypeOrState5 = null;
            this.patternFillOrTypeOrState6 = null;
            this.patternFillOrTypeOrState7 = null;
            this.patternFillOrTypeOrState8 = null;
            this.patternFillOrTypeOrState9 = null;
            
            this.patternFillOrTypeOrState9 = patternFillOrTypeOrState9;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            this.color20 = null;
            this.color21 = null;
            this.color22 = null;
            this.color23 = null;
            this.color24 = null;
            this.color25 = null;
            
            this.color25 = color25;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            this.thickness10 = null;
            this.thickness11 = null;
            
            this.thickness11 = thickness11;
            this.size = null;
            this.size1 = null;
            this.size2 = null;
            this.size3 = null;
            this.size4 = null;
            
            this.size4 = size4;
        } else {
            this.patternFillOrTypeOrState9 = patternFillOrTypeOrState9;
            this.color25 = color25;
            this.thickness11 = thickness11;
            this.size4 = size4;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".risingHatchFill(%b, %s, %f, %f)", patternFillOrTypeOrState9, wrapQuotes(color25), thickness11, size4));
                js.setLength(0);
            }
        }
        return new ScrollerseriesBase(jsBase);
    }

    private Stroke color26;
    private ColoredFill color27;
    private String color28;
    private Double thickness12;
    private String dashpattern7;
    private StrokeLineJoin lineJoin7;
    private StrokeLineCap lineCap7;

    /**
     * Setter for rising stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public StateSettings setRisingStroke(Stroke color26, Double thickness12, String dashpattern7, StrokeLineJoin lineJoin7, StrokeLineCap lineCap7) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            this.color20 = null;
            this.color21 = null;
            this.color22 = null;
            this.color23 = null;
            this.color24 = null;
            this.color25 = null;
            this.color26 = null;
            this.color27 = null;
            this.color28 = null;
            
            this.color26 = color26;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            this.thickness10 = null;
            this.thickness11 = null;
            this.thickness12 = null;
            
            this.thickness12 = thickness12;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            this.dashpattern5 = null;
            this.dashpattern6 = null;
            this.dashpattern7 = null;
            
            this.dashpattern7 = dashpattern7;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            this.lineJoin5 = null;
            this.lineJoin6 = null;
            this.lineJoin7 = null;
            
            this.lineJoin7 = lineJoin7;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            this.lineCap5 = null;
            this.lineCap6 = null;
            this.lineCap7 = null;
            
            this.lineCap7 = lineCap7;
        } else {
            this.color26 = color26;
            this.thickness12 = thickness12;
            this.dashpattern7 = dashpattern7;
            this.lineJoin7 = lineJoin7;
            this.lineCap7 = lineCap7;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".risingStroke(%s, %f, %s, %s, %s)", ((color26 != null) ? color26.generateJs() : "null"), thickness12, wrapQuotes(dashpattern7), ((lineJoin7 != null) ? lineJoin7.generateJs() : "null"), ((lineCap7 != null) ? lineCap7.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".risingStroke(%s, %f, %s, %s, %s)", ((color26 != null) ? color26.generateJs() : "null"), thickness12, wrapQuotes(dashpattern7), ((lineJoin7 != null) ? lineJoin7.generateJs() : "null"), ((lineCap7 != null) ? lineCap7.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for rising stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public StateSettings setRisingStroke(ColoredFill color27, Double thickness12, String dashpattern7, StrokeLineJoin lineJoin7, StrokeLineCap lineCap7) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            this.color20 = null;
            this.color21 = null;
            this.color22 = null;
            this.color23 = null;
            this.color24 = null;
            this.color25 = null;
            this.color26 = null;
            this.color27 = null;
            this.color28 = null;
            
            this.color27 = color27;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            this.thickness10 = null;
            this.thickness11 = null;
            this.thickness12 = null;
            
            this.thickness12 = thickness12;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            this.dashpattern5 = null;
            this.dashpattern6 = null;
            this.dashpattern7 = null;
            
            this.dashpattern7 = dashpattern7;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            this.lineJoin5 = null;
            this.lineJoin6 = null;
            this.lineJoin7 = null;
            
            this.lineJoin7 = lineJoin7;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            this.lineCap5 = null;
            this.lineCap6 = null;
            this.lineCap7 = null;
            
            this.lineCap7 = lineCap7;
        } else {
            this.color27 = color27;
            this.thickness12 = thickness12;
            this.dashpattern7 = dashpattern7;
            this.lineJoin7 = lineJoin7;
            this.lineCap7 = lineCap7;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".risingStroke(%s, %f, %s, %s, %s)", ((color27 != null) ? color27.generateJs() : "null"), thickness12, wrapQuotes(dashpattern7), ((lineJoin7 != null) ? lineJoin7.generateJs() : "null"), ((lineCap7 != null) ? lineCap7.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".risingStroke(%s, %f, %s, %s, %s)", ((color27 != null) ? color27.generateJs() : "null"), thickness12, wrapQuotes(dashpattern7), ((lineJoin7 != null) ? lineJoin7.generateJs() : "null"), ((lineCap7 != null) ? lineCap7.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for rising stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public StateSettings setRisingStroke(String color28, Double thickness12, String dashpattern7, StrokeLineJoin lineJoin7, StrokeLineCap lineCap7) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            this.color20 = null;
            this.color21 = null;
            this.color22 = null;
            this.color23 = null;
            this.color24 = null;
            this.color25 = null;
            this.color26 = null;
            this.color27 = null;
            this.color28 = null;
            
            this.color28 = color28;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            this.thickness10 = null;
            this.thickness11 = null;
            this.thickness12 = null;
            
            this.thickness12 = thickness12;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            this.dashpattern5 = null;
            this.dashpattern6 = null;
            this.dashpattern7 = null;
            
            this.dashpattern7 = dashpattern7;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            this.lineJoin5 = null;
            this.lineJoin6 = null;
            this.lineJoin7 = null;
            
            this.lineJoin7 = lineJoin7;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            this.lineCap5 = null;
            this.lineCap6 = null;
            this.lineCap7 = null;
            
            this.lineCap7 = lineCap7;
        } else {
            this.color28 = color28;
            this.thickness12 = thickness12;
            this.dashpattern7 = dashpattern7;
            this.lineJoin7 = lineJoin7;
            this.lineCap7 = lineCap7;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".risingStroke(%s, %f, %s, %s, %s)", wrapQuotes(color28), thickness12, wrapQuotes(dashpattern7), ((lineJoin7 != null) ? lineJoin7.generateJs() : "null"), ((lineCap7 != null) ? lineCap7.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".risingStroke(%s, %f, %s, %s, %s)", wrapQuotes(color28), thickness12, wrapQuotes(dashpattern7), ((lineJoin7 != null) ? lineJoin7.generateJs() : "null"), ((lineCap7 != null) ? lineCap7.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private StateSettings getSelected;

    /**
     * Getter for the selected state.
     */
    public StateSettings getSelected() {
        if (getSelected == null)
            getSelected = new StateSettings(jsBase + ".selected()");

        return getSelected;
    }

    private String selected;

    /**
     * Setter for the selected state.
     */
    public void setSelected(String selected) {
        if (jsBase == null) {
            this.selected = selected;
        } else {
            this.selected = selected;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selected(%s)", wrapQuotes(selected)));
                js.setLength(0);
            }
        }
    }

    private Double size5;

    /**
     * Setter for the marker size.
     */
    public StateSettings setSize(Double size5) {
        if (jsBase == null) {
            this.size = null;
            this.size1 = null;
            this.size2 = null;
            this.size3 = null;
            this.size4 = null;
            this.size5 = null;
            
            this.size5 = size5;
        } else {
            this.size5 = size5;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".size(%f)", size5));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".size(%f)", size5));
                js.setLength(0);
            }
        }
        return this;
    }

    private Stroke color29;
    private ColoredFill color30;
    private String color31;
    private Double thickness13;
    private String dashpattern8;
    private StrokeLineJoin lineJoin8;
    private StrokeLineCap lineCap8;

    /**
     * Setter for stem stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public StateSettings setStemStroke(Stroke color29, Double thickness13, String dashpattern8, StrokeLineJoin lineJoin8, StrokeLineCap lineCap8) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            this.color20 = null;
            this.color21 = null;
            this.color22 = null;
            this.color23 = null;
            this.color24 = null;
            this.color25 = null;
            this.color26 = null;
            this.color27 = null;
            this.color28 = null;
            this.color29 = null;
            this.color30 = null;
            this.color31 = null;
            
            this.color29 = color29;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            this.thickness10 = null;
            this.thickness11 = null;
            this.thickness12 = null;
            this.thickness13 = null;
            
            this.thickness13 = thickness13;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            this.dashpattern5 = null;
            this.dashpattern6 = null;
            this.dashpattern7 = null;
            this.dashpattern8 = null;
            
            this.dashpattern8 = dashpattern8;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            this.lineJoin5 = null;
            this.lineJoin6 = null;
            this.lineJoin7 = null;
            this.lineJoin8 = null;
            
            this.lineJoin8 = lineJoin8;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            this.lineCap5 = null;
            this.lineCap6 = null;
            this.lineCap7 = null;
            this.lineCap8 = null;
            
            this.lineCap8 = lineCap8;
        } else {
            this.color29 = color29;
            this.thickness13 = thickness13;
            this.dashpattern8 = dashpattern8;
            this.lineJoin8 = lineJoin8;
            this.lineCap8 = lineCap8;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".stemStroke(%s, %f, %s, %s, %s)", ((color29 != null) ? color29.generateJs() : "null"), thickness13, wrapQuotes(dashpattern8), ((lineJoin8 != null) ? lineJoin8.generateJs() : "null"), ((lineCap8 != null) ? lineCap8.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".stemStroke(%s, %f, %s, %s, %s)", ((color29 != null) ? color29.generateJs() : "null"), thickness13, wrapQuotes(dashpattern8), ((lineJoin8 != null) ? lineJoin8.generateJs() : "null"), ((lineCap8 != null) ? lineCap8.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for stem stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public StateSettings setStemStroke(ColoredFill color30, Double thickness13, String dashpattern8, StrokeLineJoin lineJoin8, StrokeLineCap lineCap8) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            this.color20 = null;
            this.color21 = null;
            this.color22 = null;
            this.color23 = null;
            this.color24 = null;
            this.color25 = null;
            this.color26 = null;
            this.color27 = null;
            this.color28 = null;
            this.color29 = null;
            this.color30 = null;
            this.color31 = null;
            
            this.color30 = color30;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            this.thickness10 = null;
            this.thickness11 = null;
            this.thickness12 = null;
            this.thickness13 = null;
            
            this.thickness13 = thickness13;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            this.dashpattern5 = null;
            this.dashpattern6 = null;
            this.dashpattern7 = null;
            this.dashpattern8 = null;
            
            this.dashpattern8 = dashpattern8;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            this.lineJoin5 = null;
            this.lineJoin6 = null;
            this.lineJoin7 = null;
            this.lineJoin8 = null;
            
            this.lineJoin8 = lineJoin8;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            this.lineCap5 = null;
            this.lineCap6 = null;
            this.lineCap7 = null;
            this.lineCap8 = null;
            
            this.lineCap8 = lineCap8;
        } else {
            this.color30 = color30;
            this.thickness13 = thickness13;
            this.dashpattern8 = dashpattern8;
            this.lineJoin8 = lineJoin8;
            this.lineCap8 = lineCap8;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".stemStroke(%s, %f, %s, %s, %s)", ((color30 != null) ? color30.generateJs() : "null"), thickness13, wrapQuotes(dashpattern8), ((lineJoin8 != null) ? lineJoin8.generateJs() : "null"), ((lineCap8 != null) ? lineCap8.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".stemStroke(%s, %f, %s, %s, %s)", ((color30 != null) ? color30.generateJs() : "null"), thickness13, wrapQuotes(dashpattern8), ((lineJoin8 != null) ? lineJoin8.generateJs() : "null"), ((lineCap8 != null) ? lineCap8.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for stem stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public StateSettings setStemStroke(String color31, Double thickness13, String dashpattern8, StrokeLineJoin lineJoin8, StrokeLineCap lineCap8) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            this.color20 = null;
            this.color21 = null;
            this.color22 = null;
            this.color23 = null;
            this.color24 = null;
            this.color25 = null;
            this.color26 = null;
            this.color27 = null;
            this.color28 = null;
            this.color29 = null;
            this.color30 = null;
            this.color31 = null;
            
            this.color31 = color31;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            this.thickness10 = null;
            this.thickness11 = null;
            this.thickness12 = null;
            this.thickness13 = null;
            
            this.thickness13 = thickness13;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            this.dashpattern5 = null;
            this.dashpattern6 = null;
            this.dashpattern7 = null;
            this.dashpattern8 = null;
            
            this.dashpattern8 = dashpattern8;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            this.lineJoin5 = null;
            this.lineJoin6 = null;
            this.lineJoin7 = null;
            this.lineJoin8 = null;
            
            this.lineJoin8 = lineJoin8;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            this.lineCap5 = null;
            this.lineCap6 = null;
            this.lineCap7 = null;
            this.lineCap8 = null;
            
            this.lineCap8 = lineCap8;
        } else {
            this.color31 = color31;
            this.thickness13 = thickness13;
            this.dashpattern8 = dashpattern8;
            this.lineJoin8 = lineJoin8;
            this.lineCap8 = lineCap8;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".stemStroke(%s, %f, %s, %s, %s)", wrapQuotes(color31), thickness13, wrapQuotes(dashpattern8), ((lineJoin8 != null) ? lineJoin8.generateJs() : "null"), ((lineCap8 != null) ? lineCap8.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".stemStroke(%s, %f, %s, %s, %s)", wrapQuotes(color31), thickness13, wrapQuotes(dashpattern8), ((lineJoin8 != null) ? lineJoin8.generateJs() : "null"), ((lineCap8 != null) ? lineCap8.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private Stroke color32;
    private ColoredFill color33;
    private String color34;
    private Double thickness14;
    private String dashpattern9;
    private StrokeLineJoin lineJoin9;
    private StrokeLineCap lineCap9;

    /**
     * Setter for stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public StateSettings setStroke(Stroke color32, Double thickness14, String dashpattern9, StrokeLineJoin lineJoin9, StrokeLineCap lineCap9) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            this.color20 = null;
            this.color21 = null;
            this.color22 = null;
            this.color23 = null;
            this.color24 = null;
            this.color25 = null;
            this.color26 = null;
            this.color27 = null;
            this.color28 = null;
            this.color29 = null;
            this.color30 = null;
            this.color31 = null;
            this.color32 = null;
            this.color33 = null;
            this.color34 = null;
            
            this.color32 = color32;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            this.thickness10 = null;
            this.thickness11 = null;
            this.thickness12 = null;
            this.thickness13 = null;
            this.thickness14 = null;
            
            this.thickness14 = thickness14;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            this.dashpattern5 = null;
            this.dashpattern6 = null;
            this.dashpattern7 = null;
            this.dashpattern8 = null;
            this.dashpattern9 = null;
            
            this.dashpattern9 = dashpattern9;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            this.lineJoin5 = null;
            this.lineJoin6 = null;
            this.lineJoin7 = null;
            this.lineJoin8 = null;
            this.lineJoin9 = null;
            
            this.lineJoin9 = lineJoin9;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            this.lineCap5 = null;
            this.lineCap6 = null;
            this.lineCap7 = null;
            this.lineCap8 = null;
            this.lineCap9 = null;
            
            this.lineCap9 = lineCap9;
        } else {
            this.color32 = color32;
            this.thickness14 = thickness14;
            this.dashpattern9 = dashpattern9;
            this.lineJoin9 = lineJoin9;
            this.lineCap9 = lineCap9;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", ((color32 != null) ? color32.generateJs() : "null"), thickness14, wrapQuotes(dashpattern9), ((lineJoin9 != null) ? lineJoin9.generateJs() : "null"), ((lineCap9 != null) ? lineCap9.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", ((color32 != null) ? color32.generateJs() : "null"), thickness14, wrapQuotes(dashpattern9), ((lineJoin9 != null) ? lineJoin9.generateJs() : "null"), ((lineCap9 != null) ? lineCap9.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public StateSettings setStroke(ColoredFill color33, Double thickness14, String dashpattern9, StrokeLineJoin lineJoin9, StrokeLineCap lineCap9) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            this.color20 = null;
            this.color21 = null;
            this.color22 = null;
            this.color23 = null;
            this.color24 = null;
            this.color25 = null;
            this.color26 = null;
            this.color27 = null;
            this.color28 = null;
            this.color29 = null;
            this.color30 = null;
            this.color31 = null;
            this.color32 = null;
            this.color33 = null;
            this.color34 = null;
            
            this.color33 = color33;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            this.thickness10 = null;
            this.thickness11 = null;
            this.thickness12 = null;
            this.thickness13 = null;
            this.thickness14 = null;
            
            this.thickness14 = thickness14;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            this.dashpattern5 = null;
            this.dashpattern6 = null;
            this.dashpattern7 = null;
            this.dashpattern8 = null;
            this.dashpattern9 = null;
            
            this.dashpattern9 = dashpattern9;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            this.lineJoin5 = null;
            this.lineJoin6 = null;
            this.lineJoin7 = null;
            this.lineJoin8 = null;
            this.lineJoin9 = null;
            
            this.lineJoin9 = lineJoin9;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            this.lineCap5 = null;
            this.lineCap6 = null;
            this.lineCap7 = null;
            this.lineCap8 = null;
            this.lineCap9 = null;
            
            this.lineCap9 = lineCap9;
        } else {
            this.color33 = color33;
            this.thickness14 = thickness14;
            this.dashpattern9 = dashpattern9;
            this.lineJoin9 = lineJoin9;
            this.lineCap9 = lineCap9;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", ((color33 != null) ? color33.generateJs() : "null"), thickness14, wrapQuotes(dashpattern9), ((lineJoin9 != null) ? lineJoin9.generateJs() : "null"), ((lineCap9 != null) ? lineCap9.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", ((color33 != null) ? color33.generateJs() : "null"), thickness14, wrapQuotes(dashpattern9), ((lineJoin9 != null) ? lineJoin9.generateJs() : "null"), ((lineCap9 != null) ? lineCap9.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public StateSettings setStroke(String color34, Double thickness14, String dashpattern9, StrokeLineJoin lineJoin9, StrokeLineCap lineCap9) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            this.color20 = null;
            this.color21 = null;
            this.color22 = null;
            this.color23 = null;
            this.color24 = null;
            this.color25 = null;
            this.color26 = null;
            this.color27 = null;
            this.color28 = null;
            this.color29 = null;
            this.color30 = null;
            this.color31 = null;
            this.color32 = null;
            this.color33 = null;
            this.color34 = null;
            
            this.color34 = color34;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            this.thickness10 = null;
            this.thickness11 = null;
            this.thickness12 = null;
            this.thickness13 = null;
            this.thickness14 = null;
            
            this.thickness14 = thickness14;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            this.dashpattern5 = null;
            this.dashpattern6 = null;
            this.dashpattern7 = null;
            this.dashpattern8 = null;
            this.dashpattern9 = null;
            
            this.dashpattern9 = dashpattern9;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            this.lineJoin5 = null;
            this.lineJoin6 = null;
            this.lineJoin7 = null;
            this.lineJoin8 = null;
            this.lineJoin9 = null;
            
            this.lineJoin9 = lineJoin9;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            this.lineCap5 = null;
            this.lineCap6 = null;
            this.lineCap7 = null;
            this.lineCap8 = null;
            this.lineCap9 = null;
            
            this.lineCap9 = lineCap9;
        } else {
            this.color34 = color34;
            this.thickness14 = thickness14;
            this.dashpattern9 = dashpattern9;
            this.lineJoin9 = lineJoin9;
            this.lineCap9 = lineCap9;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", wrapQuotes(color34), thickness14, wrapQuotes(dashpattern9), ((lineJoin9 != null) ? lineJoin9.generateJs() : "null"), ((lineCap9 != null) ? lineCap9.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", wrapQuotes(color34), thickness14, wrapQuotes(dashpattern9), ((lineJoin9 != null) ? lineJoin9.generateJs() : "null"), ((lineCap9 != null) ? lineCap9.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private Stroke trend;
    private ColoredFill trend1;
    private String trend2;
    private Double thickness15;
    private String dashpattern10;
    private StrokeLineJoin lineJoin10;
    private StrokeLineCap lineCap10;

    /**
     * Setter for annotation trend settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public StateSettings setTrend(Stroke trend, Double thickness15, String dashpattern10, StrokeLineJoin lineJoin10, StrokeLineCap lineCap10) {
        if (jsBase == null) {
            this.trend = null;
            this.trend1 = null;
            this.trend2 = null;
            
            this.trend = trend;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            this.thickness10 = null;
            this.thickness11 = null;
            this.thickness12 = null;
            this.thickness13 = null;
            this.thickness14 = null;
            this.thickness15 = null;
            
            this.thickness15 = thickness15;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            this.dashpattern5 = null;
            this.dashpattern6 = null;
            this.dashpattern7 = null;
            this.dashpattern8 = null;
            this.dashpattern9 = null;
            this.dashpattern10 = null;
            
            this.dashpattern10 = dashpattern10;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            this.lineJoin5 = null;
            this.lineJoin6 = null;
            this.lineJoin7 = null;
            this.lineJoin8 = null;
            this.lineJoin9 = null;
            this.lineJoin10 = null;
            
            this.lineJoin10 = lineJoin10;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            this.lineCap5 = null;
            this.lineCap6 = null;
            this.lineCap7 = null;
            this.lineCap8 = null;
            this.lineCap9 = null;
            this.lineCap10 = null;
            
            this.lineCap10 = lineCap10;
        } else {
            this.trend = trend;
            this.thickness15 = thickness15;
            this.dashpattern10 = dashpattern10;
            this.lineJoin10 = lineJoin10;
            this.lineCap10 = lineCap10;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".trend(%s, %f, %s, %s, %s)", ((trend != null) ? trend.generateJs() : "null"), thickness15, wrapQuotes(dashpattern10), ((lineJoin10 != null) ? lineJoin10.generateJs() : "null"), ((lineCap10 != null) ? lineCap10.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".trend(%s, %f, %s, %s, %s)", ((trend != null) ? trend.generateJs() : "null"), thickness15, wrapQuotes(dashpattern10), ((lineJoin10 != null) ? lineJoin10.generateJs() : "null"), ((lineCap10 != null) ? lineCap10.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for annotation trend settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public StateSettings setTrend(ColoredFill trend1, Double thickness15, String dashpattern10, StrokeLineJoin lineJoin10, StrokeLineCap lineCap10) {
        if (jsBase == null) {
            this.trend = null;
            this.trend1 = null;
            this.trend2 = null;
            
            this.trend1 = trend1;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            this.thickness10 = null;
            this.thickness11 = null;
            this.thickness12 = null;
            this.thickness13 = null;
            this.thickness14 = null;
            this.thickness15 = null;
            
            this.thickness15 = thickness15;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            this.dashpattern5 = null;
            this.dashpattern6 = null;
            this.dashpattern7 = null;
            this.dashpattern8 = null;
            this.dashpattern9 = null;
            this.dashpattern10 = null;
            
            this.dashpattern10 = dashpattern10;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            this.lineJoin5 = null;
            this.lineJoin6 = null;
            this.lineJoin7 = null;
            this.lineJoin8 = null;
            this.lineJoin9 = null;
            this.lineJoin10 = null;
            
            this.lineJoin10 = lineJoin10;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            this.lineCap5 = null;
            this.lineCap6 = null;
            this.lineCap7 = null;
            this.lineCap8 = null;
            this.lineCap9 = null;
            this.lineCap10 = null;
            
            this.lineCap10 = lineCap10;
        } else {
            this.trend1 = trend1;
            this.thickness15 = thickness15;
            this.dashpattern10 = dashpattern10;
            this.lineJoin10 = lineJoin10;
            this.lineCap10 = lineCap10;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".trend(%s, %f, %s, %s, %s)", ((trend1 != null) ? trend1.generateJs() : "null"), thickness15, wrapQuotes(dashpattern10), ((lineJoin10 != null) ? lineJoin10.generateJs() : "null"), ((lineCap10 != null) ? lineCap10.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".trend(%s, %f, %s, %s, %s)", ((trend1 != null) ? trend1.generateJs() : "null"), thickness15, wrapQuotes(dashpattern10), ((lineJoin10 != null) ? lineJoin10.generateJs() : "null"), ((lineCap10 != null) ? lineCap10.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for annotation trend settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public StateSettings setTrend(String trend2, Double thickness15, String dashpattern10, StrokeLineJoin lineJoin10, StrokeLineCap lineCap10) {
        if (jsBase == null) {
            this.trend = null;
            this.trend1 = null;
            this.trend2 = null;
            
            this.trend2 = trend2;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            this.thickness10 = null;
            this.thickness11 = null;
            this.thickness12 = null;
            this.thickness13 = null;
            this.thickness14 = null;
            this.thickness15 = null;
            
            this.thickness15 = thickness15;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            this.dashpattern5 = null;
            this.dashpattern6 = null;
            this.dashpattern7 = null;
            this.dashpattern8 = null;
            this.dashpattern9 = null;
            this.dashpattern10 = null;
            
            this.dashpattern10 = dashpattern10;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            this.lineJoin5 = null;
            this.lineJoin6 = null;
            this.lineJoin7 = null;
            this.lineJoin8 = null;
            this.lineJoin9 = null;
            this.lineJoin10 = null;
            
            this.lineJoin10 = lineJoin10;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            this.lineCap5 = null;
            this.lineCap6 = null;
            this.lineCap7 = null;
            this.lineCap8 = null;
            this.lineCap9 = null;
            this.lineCap10 = null;
            
            this.lineCap10 = lineCap10;
        } else {
            this.trend2 = trend2;
            this.thickness15 = thickness15;
            this.dashpattern10 = dashpattern10;
            this.lineJoin10 = lineJoin10;
            this.lineCap10 = lineCap10;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".trend(%s, %f, %s, %s, %s)", wrapQuotes(trend2), thickness15, wrapQuotes(dashpattern10), ((lineJoin10 != null) ? lineJoin10.generateJs() : "null"), ((lineCap10 != null) ? lineCap10.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".trend(%s, %f, %s, %s, %s)", wrapQuotes(trend2), thickness15, wrapQuotes(dashpattern10), ((lineJoin10 != null) ? lineJoin10.generateJs() : "null"), ((lineCap10 != null) ? lineCap10.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private MarkerType type;
    private String type1;

    /**
     * Setter for the marker type.
     */
    public StateSettings setType(MarkerType type) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            
            this.type = type;
        } else {
            this.type = type;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".type(%s)", ((type != null) ? type.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".type(%s)", ((type != null) ? type.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the marker type.
     */
    public StateSettings setType(String type1) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            
            this.type1 = type1;
        } else {
            this.type1 = type1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".type(%s)", wrapQuotes(type1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".type(%s)", wrapQuotes(type1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private UiLabelsFactory getUpperLabels;

    /**
     * Getter for upper labels (for pert tasks).
     */
    public UiLabelsFactory getUpperLabels() {
        if (getUpperLabels == null)
            getUpperLabels = new UiLabelsFactory(jsBase + ".upperLabels()");

        return getUpperLabels;
    }

    private String upperLabels;
    private Boolean upperLabels1;

    /**
     * Setter for upper labels (for pert tasks).
     */
    public StateSettings setUpperLabels(String upperLabels) {
        if (jsBase == null) {
            this.upperLabels = null;
            this.upperLabels1 = null;
            
            this.upperLabels = upperLabels;
        } else {
            this.upperLabels = upperLabels;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".upperLabels(%s)", wrapQuotes(upperLabels)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".upperLabels(%s)", wrapQuotes(upperLabels)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for upper labels (for pert tasks).
     */
    public StateSettings setUpperLabels(Boolean upperLabels1) {
        if (jsBase == null) {
            this.upperLabels = null;
            this.upperLabels1 = null;
            
            this.upperLabels1 = upperLabels1;
        } else {
            this.upperLabels1 = upperLabels1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".upperLabels(%b)", upperLabels1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".upperLabels(%b)", upperLabels1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Stroke color35;
    private ColoredFill color36;
    private String color37;
    private Double thickness16;
    private String dashpattern11;
    private StrokeLineJoin lineJoin11;
    private StrokeLineCap lineCap11;

    /**
     * Setter for whisker stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public StateSettings setWhiskerStroke(Stroke color35, Double thickness16, String dashpattern11, StrokeLineJoin lineJoin11, StrokeLineCap lineCap11) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            this.color20 = null;
            this.color21 = null;
            this.color22 = null;
            this.color23 = null;
            this.color24 = null;
            this.color25 = null;
            this.color26 = null;
            this.color27 = null;
            this.color28 = null;
            this.color29 = null;
            this.color30 = null;
            this.color31 = null;
            this.color32 = null;
            this.color33 = null;
            this.color34 = null;
            this.color35 = null;
            this.color36 = null;
            this.color37 = null;
            
            this.color35 = color35;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            this.thickness10 = null;
            this.thickness11 = null;
            this.thickness12 = null;
            this.thickness13 = null;
            this.thickness14 = null;
            this.thickness15 = null;
            this.thickness16 = null;
            
            this.thickness16 = thickness16;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            this.dashpattern5 = null;
            this.dashpattern6 = null;
            this.dashpattern7 = null;
            this.dashpattern8 = null;
            this.dashpattern9 = null;
            this.dashpattern10 = null;
            this.dashpattern11 = null;
            
            this.dashpattern11 = dashpattern11;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            this.lineJoin5 = null;
            this.lineJoin6 = null;
            this.lineJoin7 = null;
            this.lineJoin8 = null;
            this.lineJoin9 = null;
            this.lineJoin10 = null;
            this.lineJoin11 = null;
            
            this.lineJoin11 = lineJoin11;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            this.lineCap5 = null;
            this.lineCap6 = null;
            this.lineCap7 = null;
            this.lineCap8 = null;
            this.lineCap9 = null;
            this.lineCap10 = null;
            this.lineCap11 = null;
            
            this.lineCap11 = lineCap11;
        } else {
            this.color35 = color35;
            this.thickness16 = thickness16;
            this.dashpattern11 = dashpattern11;
            this.lineJoin11 = lineJoin11;
            this.lineCap11 = lineCap11;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".whiskerStroke(%s, %f, %s, %s, %s)", ((color35 != null) ? color35.generateJs() : "null"), thickness16, wrapQuotes(dashpattern11), ((lineJoin11 != null) ? lineJoin11.generateJs() : "null"), ((lineCap11 != null) ? lineCap11.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".whiskerStroke(%s, %f, %s, %s, %s)", ((color35 != null) ? color35.generateJs() : "null"), thickness16, wrapQuotes(dashpattern11), ((lineJoin11 != null) ? lineJoin11.generateJs() : "null"), ((lineCap11 != null) ? lineCap11.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for whisker stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public StateSettings setWhiskerStroke(ColoredFill color36, Double thickness16, String dashpattern11, StrokeLineJoin lineJoin11, StrokeLineCap lineCap11) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            this.color20 = null;
            this.color21 = null;
            this.color22 = null;
            this.color23 = null;
            this.color24 = null;
            this.color25 = null;
            this.color26 = null;
            this.color27 = null;
            this.color28 = null;
            this.color29 = null;
            this.color30 = null;
            this.color31 = null;
            this.color32 = null;
            this.color33 = null;
            this.color34 = null;
            this.color35 = null;
            this.color36 = null;
            this.color37 = null;
            
            this.color36 = color36;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            this.thickness10 = null;
            this.thickness11 = null;
            this.thickness12 = null;
            this.thickness13 = null;
            this.thickness14 = null;
            this.thickness15 = null;
            this.thickness16 = null;
            
            this.thickness16 = thickness16;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            this.dashpattern5 = null;
            this.dashpattern6 = null;
            this.dashpattern7 = null;
            this.dashpattern8 = null;
            this.dashpattern9 = null;
            this.dashpattern10 = null;
            this.dashpattern11 = null;
            
            this.dashpattern11 = dashpattern11;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            this.lineJoin5 = null;
            this.lineJoin6 = null;
            this.lineJoin7 = null;
            this.lineJoin8 = null;
            this.lineJoin9 = null;
            this.lineJoin10 = null;
            this.lineJoin11 = null;
            
            this.lineJoin11 = lineJoin11;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            this.lineCap5 = null;
            this.lineCap6 = null;
            this.lineCap7 = null;
            this.lineCap8 = null;
            this.lineCap9 = null;
            this.lineCap10 = null;
            this.lineCap11 = null;
            
            this.lineCap11 = lineCap11;
        } else {
            this.color36 = color36;
            this.thickness16 = thickness16;
            this.dashpattern11 = dashpattern11;
            this.lineJoin11 = lineJoin11;
            this.lineCap11 = lineCap11;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".whiskerStroke(%s, %f, %s, %s, %s)", ((color36 != null) ? color36.generateJs() : "null"), thickness16, wrapQuotes(dashpattern11), ((lineJoin11 != null) ? lineJoin11.generateJs() : "null"), ((lineCap11 != null) ? lineCap11.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".whiskerStroke(%s, %f, %s, %s, %s)", ((color36 != null) ? color36.generateJs() : "null"), thickness16, wrapQuotes(dashpattern11), ((lineJoin11 != null) ? lineJoin11.generateJs() : "null"), ((lineCap11 != null) ? lineCap11.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for whisker stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public StateSettings setWhiskerStroke(String color37, Double thickness16, String dashpattern11, StrokeLineJoin lineJoin11, StrokeLineCap lineCap11) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            this.color20 = null;
            this.color21 = null;
            this.color22 = null;
            this.color23 = null;
            this.color24 = null;
            this.color25 = null;
            this.color26 = null;
            this.color27 = null;
            this.color28 = null;
            this.color29 = null;
            this.color30 = null;
            this.color31 = null;
            this.color32 = null;
            this.color33 = null;
            this.color34 = null;
            this.color35 = null;
            this.color36 = null;
            this.color37 = null;
            
            this.color37 = color37;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            this.thickness10 = null;
            this.thickness11 = null;
            this.thickness12 = null;
            this.thickness13 = null;
            this.thickness14 = null;
            this.thickness15 = null;
            this.thickness16 = null;
            
            this.thickness16 = thickness16;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            this.dashpattern5 = null;
            this.dashpattern6 = null;
            this.dashpattern7 = null;
            this.dashpattern8 = null;
            this.dashpattern9 = null;
            this.dashpattern10 = null;
            this.dashpattern11 = null;
            
            this.dashpattern11 = dashpattern11;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            this.lineJoin5 = null;
            this.lineJoin6 = null;
            this.lineJoin7 = null;
            this.lineJoin8 = null;
            this.lineJoin9 = null;
            this.lineJoin10 = null;
            this.lineJoin11 = null;
            
            this.lineJoin11 = lineJoin11;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            this.lineCap5 = null;
            this.lineCap6 = null;
            this.lineCap7 = null;
            this.lineCap8 = null;
            this.lineCap9 = null;
            this.lineCap10 = null;
            this.lineCap11 = null;
            
            this.lineCap11 = lineCap11;
        } else {
            this.color37 = color37;
            this.thickness16 = thickness16;
            this.dashpattern11 = dashpattern11;
            this.lineJoin11 = lineJoin11;
            this.lineCap11 = lineCap11;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".whiskerStroke(%s, %f, %s, %s, %s)", wrapQuotes(color37), thickness16, wrapQuotes(dashpattern11), ((lineJoin11 != null) ? lineJoin11.generateJs() : "null"), ((lineCap11 != null) ? lineCap11.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".whiskerStroke(%s, %f, %s, %s, %s)", wrapQuotes(color37), thickness16, wrapQuotes(dashpattern11), ((lineJoin11 != null) ? lineJoin11.generateJs() : "null"), ((lineCap11 != null) ? lineCap11.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double whiskerWidth;
    private String whiskerWidth1;

    /**
     * Setter for the whisker width.
     */
    public StateSettings setWhiskerWidth(Double whiskerWidth) {
        if (jsBase == null) {
            this.whiskerWidth = null;
            this.whiskerWidth1 = null;
            
            this.whiskerWidth = whiskerWidth;
        } else {
            this.whiskerWidth = whiskerWidth;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".whiskerWidth(%f)", whiskerWidth));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".whiskerWidth(%f)", whiskerWidth));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the whisker width.
     */
    public StateSettings setWhiskerWidth(String whiskerWidth1) {
        if (jsBase == null) {
            this.whiskerWidth = null;
            this.whiskerWidth1 = null;
            
            this.whiskerWidth1 = whiskerWidth1;
        } else {
            this.whiskerWidth1 = whiskerWidth1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".whiskerWidth(%s)", wrapQuotes(whiskerWidth1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".whiskerWidth(%s)", wrapQuotes(whiskerWidth1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSgetEmptyHatchFill() {
        if (getEmptyHatchFill != null) {
            return getEmptyHatchFill.generateJs();
        }
        return "";
    }

    private String generateJSgetFallingHatchFill() {
        if (getFallingHatchFill != null) {
            return getFallingHatchFill.generateJs();
        }
        return "";
    }

    private String generateJSgetHatchFill() {
        if (getHatchFill != null) {
            return getHatchFill.generateJs();
        }
        return "";
    }

    private String generateJSgetHeaders() {
        if (getHeaders != null) {
            return getHeaders.generateJs();
        }
        return "";
    }

    private String generateJSgetHovered() {
        if (getHovered != null) {
            return getHovered.generateJs();
        }
        return "";
    }

    private String generateJSgetLabels() {
        if (getLabels != null) {
            return getLabels.generateJs();
        }
        return "";
    }

    private String generateJSgetLowerLabels() {
        if (getLowerLabels != null) {
            return getLowerLabels.generateJs();
        }
        return "";
    }

    private String generateJSgetMarkers() {
        if (getMarkers != null) {
            return getMarkers.generateJs();
        }
        return "";
    }

    private String generateJSgetNegativeHatchFill() {
        if (getNegativeHatchFill != null) {
            return getNegativeHatchFill.generateJs();
        }
        return "";
    }

    private String generateJSgetNormal() {
        if (getNormal != null) {
            return getNormal.generateJs();
        }
        return "";
    }

    private String generateJSgetOutlierMarkers() {
        if (getOutlierMarkers != null) {
            return getOutlierMarkers.generateJs();
        }
        return "";
    }

    private String generateJSgetRisingHatchFill() {
        if (getRisingHatchFill != null) {
            return getRisingHatchFill.generateJs();
        }
        return "";
    }

    private String generateJSgetSelected() {
        if (getSelected != null) {
            return getSelected.generateJs();
        }
        return "";
    }

    private String generateJSgetUpperLabels() {
        if (getUpperLabels != null) {
            return getUpperLabels.generateJs();
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetEmptyHatchFill());
        jsGetters.append(generateJSgetFallingHatchFill());
        jsGetters.append(generateJSgetHatchFill());
        jsGetters.append(generateJSgetHeaders());
        jsGetters.append(generateJSgetHovered());
        jsGetters.append(generateJSgetLabels());
        jsGetters.append(generateJSgetLowerLabels());
        jsGetters.append(generateJSgetMarkers());
        jsGetters.append(generateJSgetNegativeHatchFill());
        jsGetters.append(generateJSgetNormal());
        jsGetters.append(generateJSgetOutlierMarkers());
        jsGetters.append(generateJSgetRisingHatchFill());
        jsGetters.append(generateJSgetSelected());
        jsGetters.append(generateJSgetUpperLabels());

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}