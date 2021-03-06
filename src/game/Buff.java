package game;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Buff {
	private float x;
	private float y;
	private float width;
	private Image image;
	private boolean collected;
	//constructor of Buff which has two types
	public Buff( float x, float y, int type){
		this.x = x;
		this.y = y;
		this.width = 10;
		collected = false;
		//try to upload image of buff
		//type 1 -> for score-buff
		//type 2 -> for life-buff
		if(type == 1){
			try {
				image = new Image("img/BuffPic.png");
			} catch (SlickException e) {
				System.out.println("img/BuffPic.png cannot be found");
			}
		}
		else if(type == 2){
			try {
				image = new Image("img/buffLive.png");
			} catch (SlickException e) {
				System.out.println("img/buffLive.png cannot be found");
			}
			
		}

		//buff moves all the time by falling down
	}
	public void moveBuff(){
		y+=3;
	}
	//gets location of buff
	public float GetX(){
		return x;
	}
	public float GetY(){
		return y;
	}
	//gets width of buff in order to later spawn it from the middle of brick.
	public float GetWidth(){
		return width;
	}
	//place to spawn buff
	public void Spawn(float x, float y){
		this.x = x;
		this.y = y;
		collected = false;
	}
	//void which makes boolean collected true if buff is collected
	public void Collected(){
		collected = true;
	}
	//void which checks whether buff had been collected or not.
	public boolean GetCollected(){
		return collected;
	}
	//if the buff is not collected, displays buff on the specific place (x,y)
	public void Display(){
		if(!collected)
		image.draw(x,y);
	}


}
