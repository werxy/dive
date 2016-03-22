package com.dive.game;

import com.badlogic.gdx.Input.Buttons;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class ScoreScreen implements InputProcessor {
	
	private Sprite returnMenu;
	private GameState gameState;
	private BitmapFont font;
	
	
	public ScoreScreen(GameState state,World world, BitmapFont font){
		
		gameState = state;
		this.font = font;
		
		returnMenu = new Sprite(Assets.getInstance().menuButton);
		returnMenu.setBounds(560, 200, 800, 155);
		
	}
	
	public void draw(Batch batch){
		returnMenu.draw(batch);
	}

	@Override
	public boolean keyDown(int keycode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean keyUp(int keycode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		
		if(gameState.getState() != State.HIGHSCORES){return false;}

		float[] p = Coords.getCameraCoords(screenX, Gdx.graphics.getHeight()-screenY);
		
		if(button == Buttons.LEFT && returnMenu.getBoundingRectangle().contains(p[0],p[1])){
			gameState.returnMenu();
			return true;
		}
		
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
//		screenY = Gdx.graphics.getHeight()-screenY;
//		float[] p = Coords.getCameraCoords(screenX, screenY);
//		
//		if(gameState.getState() == State.ENDSCREEN){
//			if(restart.getBoundingRectangle().contains(p[0],p[1])){
//				restart.setTexture(Assets.getInstance().restartButton_hover);
//			}
//			else{
//				restart.setTexture(Assets.getInstance().restartButton);
//			}
//			return true;
//		}
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		// TODO Auto-generated method stub
		return false;
	}

}
