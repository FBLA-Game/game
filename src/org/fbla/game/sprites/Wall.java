package org.fbla.game.sprites;

import org.fbla.game.spriteutils.Sprite;
import org.fbla.game.spriteutils.SpriteType;
import org.fbla.game.spriteutils.State;

public class Wall extends Sprite {
	
	State state;
	int size;

	public Wall(int x, int y, int size, State state) {
        super(x, y);
        this.state = state;
        this.size = size;
        init();
    }
	
	public Wall(int x, int y, int size, State state,boolean invisible) {
        super(x, y);
        this.state = state;
        this.size = size;
        if(invisible)initInvisible();
        else init();
    }
    
    @Override
    public SpriteType getType(){
    	return SpriteType.WALL;
    }

    private void init() {
    	
    	switch(state){
    	case LEFT_LOWER_CORNER:
    		loadImage("wall/lowerLeftCorner.png");
    		break;
    	case LEFT_UPPER_CORNER:
    		loadImage("wall/upperLeftCorner.png");
    		break;
    	case RIGHT_LOWER_CORNER:
    		loadImage("wall/lowerRightCorner.png");
    		break;
    	case RIGHT_UPPER_CORNER:
    		loadImage("wall/upperRightCorner.png");
    		break;
    	case VERTICAL:
    		loadImage("wall/vertical.png");
    		height = size;
    		setImageDimensions(2, size);
    		break;
    	case LARGE_VERTICAL:
    		loadImage("wall/vertical_large.png");
    		break;
    		
    	case HORIZONTAL:
    		loadImage("wall/horizontal.png");
    		setImageDimensions(size, 2);
    		width = size;
    		break;
    		default:
    			loadImage("wall/vertical.png");
    			break;
    	}
    }
    
    private void initInvisible() {
    	
    	switch(state){
    	case VERTICAL:
    		loadImage("empty.png");
    		height = size;
    		setImageDimensions(2, size);
    		break;
    	case LARGE_VERTICAL:
    		loadImage("empty.png");
    		break;
    		
    	case HORIZONTAL:
    		loadImage("empty.png");
    		setImageDimensions(size, 2);
    		width = size;
    		break;
    		default:
    			loadImage("empty.png");
    			break;
    	}
    }
}