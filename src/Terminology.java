/**
 * Created by Jacob on 30-03-2017.
 */
public class Terminology {

    /*
     * Difference between Swing and AWT:
     * AWT is a java interface to native system GUI code present in your OS. It will not work the same on every system.
     *
     * Swing is a more or less pure java GUI. It uses AWT to create an operation system window.
     */

    /*
     * Difference between component and container
      *
      * The component class is found under the AWT package. The container is a sub class to the component.
      * The component class defines a number of methods for handling events, changing window bounds, controlling fonts and color
      * and drawing components and their components.
      *
      * A container is a component that can accommodate other components and also other containers.
     */

    /*
     * Layouts
     * - Gridlayout
     * Pros: Place components nicely grid like layout.
     * Cons: If put directly into gridlayout elements will be stretched out to fit the cell.
     * - BorderLayout
     * Pros: You got 5 areas to place components: top, button, left, right, center.
     * Cons: All extra space is placed inside the center.
     * - BoxLayout
     * Pros: Elements can be placed nicely above each other.
     * Cons: Its respect the elements preferred size. You do not have much control over the elements.
     * - CardLayout
     * Pros: Its easy to change panel because we can use a combo box to change the panel for example.
     * Cons: Its not used to place components, only used to panels.
     * - FlowLayout
     * Pros: Simple layout...
     * Cons: No control over the components location, just placed on a row.
     *
     */

    /*
     * What are adapter classes used for in GUI?
     *
     * Adapter is a pattern that provides default (often empty) implementation of interface or abstract class.
     * For example MouseAdapter provides empty implementation of MouseListener interface.
     * It is useful because very often you do not really use all methods declared by interface,
     * so implementing the interface directly is very verbose.
     */

    /*
     * Difference between abstract and interface
     *
     * Choosing interfaces and abstract classes is not an either/or proposition.
     * If you need to change your design, make it an interface.
     * However, you may have abstract classes that provide some default behavior.
     * Abstract classes are excellent candidates inside of application frameworks.
     */
}
