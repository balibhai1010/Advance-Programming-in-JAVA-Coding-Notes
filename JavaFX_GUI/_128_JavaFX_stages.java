// Import necessary JavaFX classes
package JavaFX_GUI;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

// Main class that extends the Application class
public class _128_JavaFX_stages extends Application {

    // The main method where the application starts
    public static void main(String[] args) {
        // Launch the JavaFX application
        launch(args);
    }

    // Override the start method from the Application class
    @Override
    public void start(Stage stage) throws Exception {

        // Create a root group to hold the graphical elements
        Group root = new Group();

        // Create a scene with a black background
        Scene scene = new Scene(root, Color.BLACK);

        // Configure the stage with the created scene
        stage.setScene(scene);

        // Show the stage (main window of the application)
        stage.show();

        // Now, let's comment out the commented code to explain each part.




        // Set the stage title
        stage.setTitle("Stage Demo Program w00t w00t");

        // Set the width and height of the stage
        stage.setWidth(420);
        stage.setHeight(420);

        // Set whether the stage is resizable
        stage.setResizable(false);

        // Set the position of the stage on the screen (swing can't do that)
        stage.setX(50);
        stage.setY(50);

        // Set the stage to full-screen mode
        //stage.setFullScreen(true);

        // Set the hint message when exiting full-screen
        //stage.setFullScreenExitHint("YOU CAN'T ESCAPE unless you press q");

        // Set the key combination to exit full-screen
        //stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));

        // Uncomment the code below to set a custom icon for the stage which will be sceen at app at below taskbar and at screen corner
        Image icon = new Image("com/example/ap_java_gui_javafx/others/icon.png"); //its at "resources" folder
        stage.getIcons().add(icon);

        /**
         * JavaFX Stages Explanation Video Notes
         *
         * Introduction:
         * - Video hosted by "Bro."
         * - Greeting and expressing well wishes to the audience.
         * - Announcement of the topic: Explanation of how stages work in JavaFX.
         *
         * Definition of Stage:
         * - Stage in JavaFX: A top-level container, similar to a window in Swing or JFrame.
         * - Analogy: Likens it to a stage in a theater or play, relating it to a stage in a school talent show.
         *
         * Purpose of a Stage:
         * - Acts as the top-level container for JavaFX GUI applications.
         * - Similar to JFrame in Swing.
         * - It serves as the main window of the application.
         *
         * Setting Up a New JavaFX Project:
         * 1. Open IDE (Eclipse used in the video).
         * 2. Create a new JavaFX project named "HelloFX."
         * 3. Add JavaFX library to the project.
         * 4. Set up VM arguments if using IntelliJ.
         *
         * Creating a Basic Stage:
         * 1. Delete Default Content:
         *    - Clearing existing content in the main class.
         *
         * 2. Extending Application Class:
         *    - Explanation of the main class extending the Application class.
         *    - The need to override the `start` method.
         *
         * 3. Launching the Application:
         *    - Use the `launch` method to start the JavaFX application.
         *    - Discusses the role of the `start` method.
         *
         * 4. Creating and Showing a Stage:
         *    - Creating a new stage (or using the default "primary stage").
         *    - Demonstrates using `stage.show()` to display the stage.
         *
         * Layers of JavaFX GUI:
         * 1. Stage:
         *    - The top-level container, analogous to a window.
         *
         * 2. Scene:
         *    - A drawing surface for graphical content within a stage.
         *    - Similar to a JPanel in Swing.
         *
         * 3. Scene Graph:
         *    - A hierarchical tree of nodes.
         *    - Nodes: Components like buttons, text boxes, images.
         *    - Explains the tree structure: root node, branch nodes, and leaf nodes.
         *
         * Creating a Customized Stage:
         * 1. Clearing Default Content:
         *    - Delete unnecessary content in the main class.
         *
         * 2. Creating a Scene:
         *    - Create a `Scene` object, specifying a root node (e.g., Group) in the constructor.
         *    - Set the background color of the scene.
         *
         * 3. Setting Up the Scene:
         *    - Add the root node to the scene.
         *    - Set the scene for the stage using `stage.setScene(scene)`.
         *
         * 4. Customizing the Stage:
         *    - Set stage properties such as title, icon, width, height.
         *    - Change the icon in the top-left corner to a custom image.
         *    - Set stage position, making it non-resizable.
         *
         * 5. Fullscreen Mode:
         *    - Enable fullscreen using `stage.setFullScreen(true)`.
         *    - Customize exit hint and key combination for fullscreen mode.
         *
         * Conclusion:
         * - Summary of the discussed concepts.
         * - Encouragement to like, comment, and subscribe.
         * - Offer to share the code in the comments for viewers.
         *
         * Closing:
         * - Thanking the audience for watching.
         * - Reminder to like, comment, and subscribe.
         * - Signing off with a catchy outro.
         *
         * Launch method inherit from application class
         */






    }
}
