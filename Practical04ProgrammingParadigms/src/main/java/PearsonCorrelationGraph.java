import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.*;
import java.awt.*;

/**
 * Моя попытка реализовать корреляцию Пирсона в графике.
 */
public class PearsonCorrelationGraph extends JFrame {
    public PearsonCorrelationGraph(double[] array1, double[] array2) {
        super("Correlation Graph");
        JFreeChart chart = ChartFactory.createScatterPlot(
                "Correlation",
                "Array 1",
                "Array 2",
                createDataset(array1, array2)
        );
        ChartPanel panel = new ChartPanel(chart);
        setContentPane(panel);
    }

    private XYSeriesCollection createDataset(double[] array1, double[] array2) {
        XYSeries series = new XYSeries("Correlation");
        for (int i = 0; i < array1.length; i++) {
            series.add(array1[i], array2[i]);
        }
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series);
        return dataset;
    }

    public static void main(String[] args) {
        double[] data1 = {1, 2, 3, 4, 5};
        double[] data2 = {6, 7, 8, 9, 10};

        PearsonCorrelationGraph graph = new PearsonCorrelationGraph(data1, data2);
        graph.setSize(800, 400);
        graph.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        graph.setVisible(true);
    }
}
