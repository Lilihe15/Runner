
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/** Use to display static
 element (background or number of life). This class is defined
 by two double (x,y), one ImageView. */


class StaticThing {
    private double length;
    private double height;
    private String path;
    private ImageView img;
    private Integer Nboflives;

    public StaticThing(double l,double h,String path){
        this.path=path;
        Image spriteSheet = new Image(path);
        this.img = new ImageView(spriteSheet);
        this.length=l;
        this.height=h;
        img.setFitHeight(h);
        img.setFitWidth(l);
        img.setPreserveRatio(false);
        Nboflives=0;
    }

/**Background**/
    public ImageView getImg() {
        return img;
    }

    /**Number of life*/

    public Integer Lifelose(){
        this.Nboflives=this.Nboflives-1;
        return Nboflives;
    }
    public Integer Lifegain(){
        this.Nboflives=this.Nboflives+1;
        return Nboflives;
    }



}
