package designmodel.createmodel.simpleFactory;

public class Client {

    public static void main(String[] args) {
        Chart hChart = ChartFactory.getChart("柱状图");
        Chart lChart = ChartFactory.getChart("折线图");
        Chart PChart = ChartFactory.getChart("饼状图");
        hChart.display();
        lChart.display();
        PChart.display();
    }

}
