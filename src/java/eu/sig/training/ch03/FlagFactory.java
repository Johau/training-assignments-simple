package eu.sig.training.ch03;

import java.awt.Color;
import java.util.Arrays;
import java.util.List;

public class FlagFactory {

    // tag::getFlag[]
    public List<Color> getFlagColors(Nationality nationality) {
        List<Color> result;     
        
        return result;
    }
    // end::getFlag[]
}

class Dutch extends FlagFactory{
	public void setColor(List<Color> result) {
		result = Arrays.asList(Color.RED, Color.WHITE, Color.BLUE);
	}
}

class German extends FlagFactory{
	public void setColor(List<Color> result) {
		result = Arrays.asList(Color.BLACK, Color.RED, Color.YELLOW);
	}
}

class Belgian extends FlagFactory{
	public void setColor(List<Color> result) {
		result = Arrays.asList(Color.BLACK, Color.YELLOW, Color.RED);
	}
}

class French extends FlagFactory{
	public void setColor(List<Color> result) {
		result = Arrays.asList(Color.BLUE, Color.WHITE, Color.RED);
	}
}

class Italian extends FlagFactory{
	public void setColor(List<Color> result) {
		result = Arrays.asList(Color.GREEN, Color.WHITE, Color.RED);
	}
}

class Romanian extends FlagFactory{
	public void setColor(List<Color> result) {
		result = Arrays.asList(Color.BLUE, Color.WHITE, Color.RED);
	}
}

class Ireland extends FlagFactory{
	public void setColor(List<Color> result) {
		result = Arrays.asList(Color.GREEN, Color.WHITE, Color.ORANGE);
	}
}

class Hungarian extends FlagFactory{
	public void setColor(List<Color> result) {
		result = Arrays.asList(Color.RED, Color.WHITE, Color.GREEN);
	}
}

class Bulgarian extends FlagFactory{
	public void setColor(List<Color> result) {
		result = Arrays.asList(Color.WHITE, Color.GREEN, Color.RED);
	}
}

class Russia extends FlagFactory{
	public void setColor(List<Color> result) {
		result = Arrays.asList(Color.WHITE, Color.BLUE, Color.RED);
	}
}

class Unclassified extends FlagFactory{
	public void setColor(List<Color> result) {
		 result = Arrays.asList(Color.GRAY);
	}
}