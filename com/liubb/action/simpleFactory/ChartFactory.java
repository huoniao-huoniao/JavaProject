package JavaProject.com.liubb.action.simpleFactory;

public class ChartFactory {
    public static Chart getChart(String type) {
        Chart chart = null;
        if (type.equals("柱状图")) {
            System.out.println("初始化柱状图");
            chart = new HistogramChart();
        }
        if (type.equals("饼状图")) {
            System.out.println("初始化饼状图");
            chart = new PieChart();
        }
        if (type.equals("折线图")) {
            System.out.println("初始化折线图");
            chart = new LineChart();
        }
        return chart;
    }
}
