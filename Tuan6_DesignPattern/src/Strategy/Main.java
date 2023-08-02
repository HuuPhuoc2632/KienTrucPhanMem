package Strategy;

public class Main {
    public static void main(String[] args) {
        DrawingContext drawingContext = new DrawingContext();

        // Sử dụng bút viết để vẽ
        drawingContext.setTool(new PenTool());
        drawingContext.draw();
        // Output: Using pen tool to draw.

        // Sử dụng bút chì để vẽ
        drawingContext.setTool(new PencilTool());
        drawingContext.draw();
        // Output: Using pencil tool to draw.
    }
}