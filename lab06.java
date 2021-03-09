import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import static java.awt.Font.*;
import static javafx.scene.text.Font.font;
import javafx.scene.chart.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.layout.VBox;

public class lab06 extends Application {
    private Canvas canvas;

    @Override
    
    public void start(Stage primaryStage) throws Exception{

        double[] avgHousingPricesByYear = { 247381.0, 264171.4,287715.3,294736.1, 308431.4,322635.9,340253.0,363153.7};
        double[] avgCommercialProcesByYear = { 1121585.3,1219479.5,1246354.2,1295364.8, 1335932.6,1472362.0,1583521.9,1613246.3};
        primaryStage.setTitle("Lab 06");

        Group root = new Group();        
        Scene scene = new Scene(root, 1500, 1000);

        //        Create Canvas object and add it into the scene
        canvas = new Canvas();
        canvas.widthProperty().bind(primaryStage.widthProperty());
        canvas.heightProperty().bind(primaryStage.heightProperty());
        root.getChildren().add(canvas);

        primaryStage.setScene(scene);
        primaryStage.show();

        draw(root);
    }


    private void draw(Group root) {
        GraphicsContext gc = canvas.getGraphicsContext2D();

        //Bar data
        double[] avgHousingPricesByYear = { 247381.0, 264171.4,287715.3,294736.1, 308431.4,322635.9,340253.0,363153.7};
        double[] avgCommercialProcesByYear = { 1121585.3,1219479.5,1246354.2,1295364.8, 1335932.6,1472362.0,1583521.9,1613246.3};

        //Pie data
        String[] ageGroups = {"18-25", "26-35", "36-45", "46-55", "56-65", "65+"};
        int[] purchasesByAgeGroup = {648, 1021, 2453, 3173, 1868, 2247};
        Color[] pieColors = {Color.AQUA, Color.GOLD, Color.DARKORANGE,Color.DARKSALMON, Color.LAWNGREEN, Color.PLUM};

        //Making the bar graph
        //H1
        gc.setFill(Color.RED);
        gc.fillRect(50,800 - avgHousingPricesByYear[0]/2000,25, avgHousingPricesByYear[0]/2000);

        //C1
        gc.setFill(Color.BLUE);
        gc.fillRect(100, 800 - avgCommercialProcesByYear[0]/2000,25, avgCommercialProcesByYear[0]/2000);

        //H2
        gc.setFill(Color.RED);
        gc.fillRect(150,800 - avgHousingPricesByYear[1]/2000,25, avgHousingPricesByYear[1]/2000);

        //C2
        gc.setFill(Color.BLUE);
        gc.fillRect(200,800 - avgCommercialProcesByYear[1]/2000,25, avgCommercialProcesByYear[1]/2000);

        //H3
        gc.setFill(Color.RED);
        gc.fillRect(250,800 - avgHousingPricesByYear[2]/2000,25, avgHousingPricesByYear[2]/2000);

        //C3
        gc.setFill(Color.BLUE);
        gc.fillRect(300,800 - avgCommercialProcesByYear[2]/2000,25, avgCommercialProcesByYear[2]/2000);

        //H4
        gc.setFill(Color.RED);
        gc.fillRect(350,800 - avgHousingPricesByYear[3]/2000,25, avgHousingPricesByYear[3]/2000);

        //C4
        gc.setFill(Color.BLUE);
        gc.fillRect(400,800 - avgCommercialProcesByYear[3]/2000,25, avgCommercialProcesByYear[3]/2000);

        //H5
        gc.setFill(Color.RED);
        gc.fillRect(450,800 - avgHousingPricesByYear[4]/2000,25, avgHousingPricesByYear[4]/2000);

        //C5
        gc.setFill(Color.BLUE);
        gc.fillRect(500,800 - avgCommercialProcesByYear[4]/2000,25, avgCommercialProcesByYear[4]/2000);

        //H6
        gc.setFill(Color.RED);
        gc.fillRect(550,800 - avgHousingPricesByYear[5]/2000,25, avgHousingPricesByYear[5]/2000);

        //C6
        gc.setFill(Color.BLUE);
        gc.fillRect(600,800 - avgCommercialProcesByYear[5]/2000,25, avgCommercialProcesByYear[5]/2000);

        //H7
        gc.setFill(Color.RED);
        gc.fillRect(650,800 - avgHousingPricesByYear[6]/2000,25, avgHousingPricesByYear[6]/2000);

        //C7
        gc.setFill(Color.BLUE);
        gc.fillRect(700,800 - avgCommercialProcesByYear[6]/2000,25, avgCommercialProcesByYear[6]/2000);

        //H8
        gc.setFill(Color.RED);
        gc.fillRect(750,800 - avgHousingPricesByYear[7]/2000,25, avgHousingPricesByYear[7]/2000);

        //C8
        gc.setFill(Color.BLUE);
        gc.fillRect(800,800 - avgCommercialProcesByYear[7]/2000,25, avgCommercialProcesByYear[7]/2000);
        



        int numGroups = 0;
        for (int temp: purchasesByAgeGroup)
            numGroups += temp;

        double begin = 0.0;
        for (int i = 0; i < purchasesByAgeGroup.length; i++) {
            double size = (double) purchasesByAgeGroup[i] / (double) numGroups;
            double piePortion = size * 360.0;

            gc.setFill(pieColors[i]);
            gc.fillArc(1000, 400, 300, 300, begin, piePortion, ArcType.ROUND);

            begin += piePortion;
        }
    }


    public static void main(String[] args) {
        launch();
    }

}