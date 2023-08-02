package Strategy;

public class DrawingContext {
    private DrawingTool tool;

    public void setTool(DrawingTool tool) {
        this.tool = tool;
    }

    public void draw() {
        tool.draw();
    }
}

