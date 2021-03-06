import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.event.EventHandler;

public abstract class AnimatedThing {
    private double x;
    private double y;
    private ImageView img;
    private Integer attitude;
    private String path;

    private Integer index;
    private Integer indexMax=16;
    private Integer timeframe;
    private Integer windowSizeX;
    private Integer windowSizeY;
    private Integer offset;
    private Rectangle2D frame;


    public AnimatedThing(double x,double y,Integer attitude,String path, Integer windowSizeX,Integer windowSizeY) {
        this.x = x;
        this.y = y;
        Image spriteSheet = new Image(path);
        this.img = new ImageView(spriteSheet);
        this.img.setX(x);
        this.img.setY(y);
        this.attitude = attitude;
        this.windowSizeX = windowSizeX;
        this.windowSizeY = windowSizeY;
        index = 1;
        frame = new Rectangle2D(20, 0, windowSizeX, windowSizeY);

    }

    /** METHOD OF SETTER**/

    public ImageView getImgAT() {
        return img;
    }

    public void setXpos(double x) {
        this.getImgAT().setX(x);
    }

    public void setY(double y) {
        this.getImgAT().setY(y);
    }

    public double getXpos() {
        return img.getX();
    }

    public double getYpos() {
        return img.getY();
    }


    public void update() {  /**Hero**/
        if (attitude==0) {
            index = (index + 1) % 6;
            this.img.setViewport(new Rectangle2D( 84 * (index), 0,this.windowSizeX, this.windowSizeY));
        }

    }
}
