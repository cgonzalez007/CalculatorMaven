package edu.wctc.cbg.calculatormaven.model;

/**
 * Service class for calculating the area of a Rectangle
 * @author Chris Gonzalez
 */
public class RectangleCalculatorService {
    private static final double MIN_INPUT_LENGTH_WIDTH = 0.0;
    private static final String ERROR_INVALID_INPUT = 
            "Error: A valid input must be provided for length and width. "
            + "Input cannot be less than zero";
    /**
     * Input two doubles representing length and width; Returns calculated area
     * as double.
     * @param length of rectangle
     * @param width of rectangle
     * @return the calculated area
     */
    public final double calculateAreaOfRectangle(double length, double width){
        if(length < MIN_INPUT_LENGTH_WIDTH || width < MIN_INPUT_LENGTH_WIDTH ){
            throw new IllegalArgumentException(ERROR_INVALID_INPUT);
        }
        return length * width;
    }
    /**
     * Input two Strings representing length and width measurements; Returns 
     * calculated area as String.
     * @param length of rectangle
     * @param width of rectangle
     * @return the calculated area
     */
    public final String calculateAreaOfRectangle(String length, String width){
        if(Double.parseDouble(length) < MIN_INPUT_LENGTH_WIDTH || 
                Double.parseDouble(width) < MIN_INPUT_LENGTH_WIDTH || 
                width.isEmpty() || width == null || length.isEmpty() || 
                length == null){
            throw new IllegalArgumentException(ERROR_INVALID_INPUT);
        }
        return Double.toString(Double.parseDouble(length) *
                Double.parseDouble(width));
    }
}
