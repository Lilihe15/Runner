import javafx.animation.AnimationTimer;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

/** Create a class GameScene that extends the Scene class **/

public class GameScene extends Scene {


    private Camera Cam;
    private StaticThing left;
    private StaticThing right;
    private Hero hero= new Hero(500,430 ,0,"C:\\Users\\Cheng\\IdeaProjects\\Project\\heros.png", 84, 100 );;

    public GameScene(Pane root, double width, double height, boolean depthbuffer) {
        super(root,width, height, depthbuffer);
        this.Cam = new Camera(800,420,200,200);
        this.left = new StaticThing(800,600,"C:\\Users\\Cheng\\IdeaProjects\\Project\\desert.png");
        this.right = new StaticThing(800,600,"C:\\Users\\Cheng\\IdeaProjects\\Project\\desert.png");

        /**Taking care of the background **/
        left.getImg().setX(0);
        left.getImg().setY(0);
        right.getImg().setX(800);
        right.getImg().setY(0);
        root.getChildren().add(left.getImg());
        root.getChildren().add(right.getImg());

        root.getChildren().add(hero.getImgAT());

        timer.start();

    }

    /**Animation**/

    private long lastUpdate=0;
    private Integer decalage =0;


    private AnimationTimer timer = new AnimationTimer()
    {public void handle(long now){
        if (now - lastUpdate >= 80000000) {
            hero.update();
            update();
            lastUpdate=now;
        }
    }
    };


    public AnimationTimer getTimer() {
        return timer;
    }



    public void update(){
        decalage=(decalage+10)%800;
        left.getImg().setViewport(new Rectangle2D(0,0,800-decalage,600));
        right.getImg().setViewport(new Rectangle2D(800-decalage,0,decalage,600));
    }





}