package org.example.JavaFX_GUI;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class _129_JavaFX_scenes_drawing_stuff extends Application {
        // The main method where the application starts
        public static void main(String[] args) {
            // Launch the JavaFX application
            launch(args);
        }

        // Override the start method from the Application class
        @Override
        public void start(Stage primaryStage) throws Exception {

            // Create a root group to hold the graphical elements
            Group root = new Group();

            // Create a scene with a light sky blue background and a size of 600x600
            Scene scene = new Scene(root, 600, 600, Color.LIGHTSKYBLUE); //colours option come from drop down menu

            // Create a new stage
            Stage stage = new Stage();

            // Create a Text element
            Text text = new Text();
            text.setText("WHOOOOOA!!");
            text.setX(50);
            text.setY(50);
            text.setFont(Font.font("Verdana", 50));
            text.setFill(Color.LIMEGREEN);

            // Create a Line element
            Line line = new Line();
            line.setStartX(200);
            line.setStartY(200);
            line.setEndX(500);
            line.setEndY(200);
            line.setStrokeWidth(5);
            line.setStroke(Color.RED);
            line.setOpacity(0.5);
            line.setRotate(45);

            // Create a Rectangle element
            Rectangle rectangle = new Rectangle();
            rectangle.setX(100);
            rectangle.setY(100);
            rectangle.setWidth(100);
            rectangle.setHeight(100);
            rectangle.setFill(Color.BLUE);
            rectangle.setStrokeWidth(5);
            rectangle.setStroke(Color.BLACK);

            // Create a Polygon element (triangle)
            Polygon triangle = new Polygon();
            triangle.getPoints().setAll(
                    200.0, 200.0,
                    300.0, 300.0,
                    200.0, 300.0
            );
            triangle.setFill(Color.YELLOW);

            // Create a Circle element
            Circle circle = new Circle();
            circle.setCenterX(350);
            circle.setCenterY(350);
            circle.setRadius(50);
            circle.setFill(Color.ORANGE);

            // Load an image and create an ImageView
            Image image = new Image("com/example/ap_java_gui_javafx/others/pizza.png");
            ImageView imageView = new ImageView(image);
            imageView.setX(300);
            imageView.setY(300);


            // Add elements to the root group
            root.getChildren().add(text);
            root.getChildren().add(line);
            root.getChildren().add(rectangle);
            root.getChildren().add(triangle);
            root.getChildren().add(circle);
            root.getChildren().add(imageView);

            // Set the scene for the stage and display it
            stage.setScene(scene);
            stage.show();

            /**
             * JavaFX Scenes Basics Explanation Video Notes
             *
             * Introduction:
             * - Video hosted by "Bro."
             * - Greeting and expressing well wishes to the audience.
             * - Announcement of the topic: Basics of scenes in JavaFX.

             * Definition of Scene:
             * - Scene in JavaFX: A drawing surface for graphical content and a container for nodes.
             * - Analogy: Explained as a layer between the stage and nodes, using a sandwich analogy.

             * Purpose of the Video:
             * - Explanation of setting up scenes in JavaFX.
             * - Demonstrates creating and customizing various graphical elements.

             * Prerequisites:
             * - Ensure correct JavaFX imports are used.
             * - Have a root node (e.g., Group) for scenes.
             * - Understanding of setting up stages.

             * Creating a Basic Scene:
             * - Create a scene with a root node.
             * - Specify width, height, and background color for the scene.
             * - Show how the stage adjusts to fit the scene size.

             * Adding Text to the Scene:
             * - Create a Text node and set its properties (font, color).
             * - Manually place the text on the scene using coordinates.
             * - Explain the process of adding nodes to the root node.

             * Drawing Lines on the Scene:
             * - Create a Line node with specified start and end coordinates.
             * - Customize line properties: stroke width, color, opacity, rotation.
             * - Emphasize the availability of various methods for customization.

             * Adding Rectangles to the Scene:
             * - Create a Rectangle node with specified dimensions.
             * - Customize rectangle properties: fill color, border, and border color.
             * - Discuss the versatility of available methods for rectangles.

             * Drawing Triangles with Polygons:
             * - Use the Polygon class to create a triangle with three points.
             * - Set coordinates for each point and customize the triangle's color.
             * - Emphasize the flexibility of the set-all method for specifying points.

             * Creating Circles on the Scene:
             * - Create a Circle node with specified center coordinates and radius.
             * - Customize circle properties: fill color.
             * - Add the circle node to the root node.

             * Adding Images to the Scene:
             * - Load an image file and create an Image object.
             * - Create an ImageView object and set its coordinates.
             * - Add the ImageView to the root node, displaying the image on the scene.

             * Conclusion:
             * - Recap of key concepts covered in the video.
             * - Offer to share the code in the comments for viewers.

             * Closing:
             * - Encouragement to like, comment, and subscribe.
             * - Signing off with a catchy outro.
             * - Reminding viewers that learning is a two-way street: help the creator by engaging.
             */

        }
    }


